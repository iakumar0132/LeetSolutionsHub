class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Map<Integer,List<Integer>> graph=new HashMap<>();
        for(int[] i:edges){
            int u=i[0];
            int v=i[1];
            graph.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
            graph.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
        }
        Set<Integer> visited = new HashSet<>();
        return dfs(source,destination,graph,visited);
    }
    boolean dfs(int node, int d, Map<Integer, List<Integer>> graph, Set<Integer> visited){
        if(node==d) return true;
        visited.add(node);
        for(int i:graph.getOrDefault(node,new ArrayList<>())){
            if(!visited.contains(i)){
                if(dfs(i,d,graph,visited)) return true;
            }
        }
        return false;
    }
}