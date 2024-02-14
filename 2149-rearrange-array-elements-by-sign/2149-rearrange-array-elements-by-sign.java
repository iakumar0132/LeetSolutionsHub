class Solution {
    public int[] rearrangeArray(int[] nums) {
        int ans[]=new int[nums.length];
        int pI=0;
        int nI=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                ans[pI]=nums[i];
                pI+=2;
            }
            else{
                ans[nI]=nums[i];
                nI+=2;
            }
        }
        return ans;
    }
}