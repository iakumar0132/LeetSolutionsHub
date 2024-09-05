class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int tSum= mean*(n+rolls.length);
        int currSum=0;
        for(int r:rolls)
        currSum+=r;
        int missingSum=tSum-currSum;
        if(missingSum<n||missingSum>6*n)
            return new int[0];
        int ans[]=new int[n];
        int quo=missingSum/n;
        int rem=missingSum%n;
        for(int i=0;i<n;i++){
            ans[i]=quo+(i<rem?1:0);
        }
        return ans;
    }
}