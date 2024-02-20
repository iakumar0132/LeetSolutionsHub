class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(ans==nums[i]) ans++;
        }
        return ans;
    }
}