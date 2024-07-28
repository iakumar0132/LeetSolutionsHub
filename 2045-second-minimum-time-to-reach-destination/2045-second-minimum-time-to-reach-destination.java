class Solution {
    public int secondMinimum(int n, int[][] edges, int time, int change) {
        int timeElapsed = 0, firstArrival = -1;
        List[] graph = buildGraph(edges, n);
        int visitCount[] = new int[n + 1];
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);

        while (true){
            int qSize = queue.size();
            Set<Integer> seen = new HashSet<Integer>();

            for(int i = 0; i < qSize; i++){
                int curr = queue.poll();

                if (curr == n && timeElapsed > 0){
                    if (firstArrival == -1) firstArrival = timeElapsed;
                    else if (firstArrival < timeElapsed) return timeElapsed;
                }

                for (int neighbor : (List<Integer>) graph[curr]) {
                   if (seen.add(neighbor) && visitCount[neighbor] < 2) queue.offer(neighbor); 
                }
            }

            for (int v : seen) visitCount[v]++;
            
            if (((timeElapsed / change) % 2) == 1) 
                timeElapsed += change - (timeElapsed % change); // wait for green

            timeElapsed += time;
        }
    }

    private List[] buildGraph(int[][] edges, int n){
        List[] graph = new List[n + 1];
        for (int i = 1; i <= n; i++) 
            graph[i] = new ArrayList<Integer>();
        for (int[] edge : edges){
            graph[edge[0]].add(edge[1]);
            graph[edge[1]].add(edge[0]);
        }
        return graph;
    }
}
