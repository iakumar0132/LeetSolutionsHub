class Solution {
    public int minImpossibleOR(int[] nums) {
        Arrays.sort(nums);
		int min = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > min + 1) {
				return min + 1;
			}
			min |= nums[i];
		}
		return min + 1;
    }
}