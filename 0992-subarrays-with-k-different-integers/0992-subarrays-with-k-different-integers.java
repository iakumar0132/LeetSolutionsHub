class Solution {
  public int subarraysWithKDistinct(int[] nums, int k) {
    return helper(nums, k) - helper(nums, k - 1);
  }

  public int helper(int[] nums, int k) {
    int ans = 0;
    int[] count = new int[nums.length + 1];

    for (int l = 0, r = 0; r < nums.length; r++) {
      if (++count[nums[r]] == 1)
        k--;
      while (k == -1)
        if (--count[nums[l++]] == 0)
          k++;
      ans += r - l + 1; 
    }

    return ans;
  }
}