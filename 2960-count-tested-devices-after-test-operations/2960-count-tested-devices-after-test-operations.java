class Solution {
    public int countTestedDevices(int[] b) {
        int ans=0;
        for(int i=0;i<b.length;i++){
            if(b[i]-ans>0) ans++;
        }
        return ans;
    }
}