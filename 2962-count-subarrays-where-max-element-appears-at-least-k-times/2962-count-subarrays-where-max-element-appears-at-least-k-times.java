class Solution {
    public long countSubarrays(int[] nums, int k) {
        int i=0,maxE=0,max=0;
        long ans=0;
        for(int num:nums){
            max=Math.max(max,num);
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]==max) maxE++;
        while(k==maxE){
            if(nums[i]==max) maxE--;
            i++;
        }
        ans+=i;
        }
        return ans;
    }
}