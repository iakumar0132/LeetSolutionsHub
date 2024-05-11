class Solution {
    public double mincostToHireWorkers(int[] quality, int[] wage, int k) {
        int n = quality.length;
        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }
        
        Arrays.sort(indices, (a, b) -> wage[a] * quality[b] - wage[b] * quality[a]);
        
        double res = 1e9;
        int sumq = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> b - a);
        
        for (int i = 0; i < n; i++) {
            sumq += quality[indices[i]];
            queue.offer(quality[indices[i]]);
            if (i >= k) {
                sumq -= queue.poll();
            }
            if (i >= k - 1) {
                res = Math.min(res, (double) wage[indices[i]] / quality[indices[i]] * sumq);
            }
        }
        
        return res;
    }
}