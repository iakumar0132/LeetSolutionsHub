class Solution {
    public int longestSubarray(int[] nums) {
        int max = 0, cnt = 0, res = 0;
        
        for (int n : nums) 
            max = Math.max(max, n);
        
        for (int n : nums) {
            if (n == max) {
                cnt++;
                res = Math.max(res, cnt);
            } else {
                cnt = 0;
            }
        }
        
        return res;
    }
}