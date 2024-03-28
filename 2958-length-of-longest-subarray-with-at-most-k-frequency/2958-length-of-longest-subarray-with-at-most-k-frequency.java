class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer,Integer> mp=new HashMap();
        int ans=0,i=-1;
        for(int j=0;j<nums.length;j++){
            mp.put(nums[j],mp.getOrDefault(nums[j],0)+1);
            while(mp.get(nums[j])>k && i<=j){
                i++;
                mp.put(nums[i],mp.get(nums[i]) - 1);
            }
            ans=Math.max(ans,j-i);
        }
        return ans;
    }
}