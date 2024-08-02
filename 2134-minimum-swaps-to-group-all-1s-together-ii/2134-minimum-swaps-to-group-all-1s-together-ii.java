class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        int countOnes = 0;
        for (int num : nums) {
            if (num == 1) countOnes++;
        }
        if (countOnes == 0) return 0;

        int[] extendedNums = new int[2 * n];
        System.arraycopy(nums, 0, extendedNums, 0, n);
        System.arraycopy(nums, 0, extendedNums, n, n);

        int currentZeroes = 0;
        for (int i = 0; i < countOnes; i++) {
            if (extendedNums[i] == 0) currentZeroes++;
        }
        int minZeroes = currentZeroes;

        for (int i = countOnes; i < extendedNums.length; i++) {
            if (extendedNums[i] == 0) currentZeroes++;
            if (extendedNums[i - countOnes] == 0) currentZeroes--;

            minZeroes = Math.min(minZeroes, currentZeroes);
        }

        return minZeroes;
    }
}