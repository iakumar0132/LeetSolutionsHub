class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int n=rowSum.length;
        int m=colSum.length;

        int[] currRow=new int[n];
        int[] currCol=new int[m];
        int [][] ans=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ans[i][j]=Math.min(rowSum[i]-currRow[i],colSum[j]-currCol[j]);
                currRow[i]+=ans[i][j];
                currCol[j]+=ans[i][j];
            }
        }
        return ans;
    }
}