class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> ans=new ArrayList<>();
        for(int[] n:intervals){
            if(n[1]<newInterval[0])
                ans.add(n);
            else if(newInterval[1]<n[0]){
                ans.add(newInterval);
                newInterval=n;
            }
            else{
                newInterval[0] = Math.min(newInterval[0], n[0]);
                newInterval[1] = Math.max(newInterval[1], n[1]);
            }
        }
        ans.add(newInterval);
        return ans.toArray(new int[ans.size()][]);
    }
}