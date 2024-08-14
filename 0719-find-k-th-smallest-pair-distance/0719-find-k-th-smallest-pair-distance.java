class Solution {
    public int numberofpair(int[] nums, int k) {
        int i = 0, j = 1;
        int res = 0;

        while (j < nums.length) {
            if (nums[j]-nums[i] > k) {
                i++;
            } else {
                res += (j-i);
                j++;
            }
        }
        return res;
    }
    public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);
        
        int st = 0, ed = nums[nums.length-1];

        while (st < ed) {
            int mid = st+(ed-st)/2;
            int count = numberofpair(nums, mid);
            if (count >= k) {
                ed = mid;
            } else {
                st = mid+1;
            }
        }
        return st;
    }
}