class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        ArrayList<Integer> temp=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                temp.add(sum);
            }
        }
        Collections.sort(temp);
         int sum = 0, mod = (int) 1e9 + 7;
        for(int i=left-1;i<=right-1;i++){
            sum = (sum + temp.get(i)) % mod;
        }
        return sum;
    }
}