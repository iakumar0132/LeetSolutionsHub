class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int temp=0;
            for(int j=i;j<nums.length;j++){
                temp+=nums[j];
                if(temp==goal) ans++;
            }
        }
        return ans;
    }
}