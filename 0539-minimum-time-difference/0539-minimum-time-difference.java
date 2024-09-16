class Solution {
    public int findMinDifference(List<String> t) {
        int n = t.size();
        int[] mins = new int[n];
        for(int i = 0; i < n; i++) {
            String[] time = t.get(i).split(":");
            mins[i] = Integer.parseInt(time[0]) * 60 + Integer.parseInt(time[1]);
        }
        Arrays.sort(mins);
        int minDiff = Integer.MAX_VALUE;
        for(int i = 1; i < n; i++) {
            minDiff = Math.min(minDiff, mins[i] - mins[i - 1]);
        }
        return Math.min(minDiff, 1440 + mins[0] - mins[n - 1]);
    }
}