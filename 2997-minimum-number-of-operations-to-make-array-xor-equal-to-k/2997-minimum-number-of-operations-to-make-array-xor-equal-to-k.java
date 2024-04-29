class Solution {
    public int minOperations(int[] nums, int k) {
        int xor=0,ans=0;
        for(int i:nums){
            xor=xor^i;
        }
        while(k>0||xor>0){
            if((k%2)!=(xor%2)) ans++;
            k/=2;
            xor/=2;
        }
        return ans;
    }
}