class Solution {
    int count=2;
    public int[][] largestLocal(int[][] grid) {
        int[][] maxLocal=new int[grid.length-1][grid.length-1];
        for(int i=0;i<maxLocal.length;i++)
        {
            for(int j=0;j<maxLocal.length;j++)
            {
                maxLocal[i][j]=Math.max(grid[i][j], Math.max(grid[i][j+1], Math.max(grid[i+1][j], grid[i+1][j+1])));
            }
        }
        return --count == 0 ? maxLocal : largestLocal(maxLocal);
    }
}