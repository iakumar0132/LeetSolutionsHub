class Solution {

    public String fractionAddition(String expression) {
        int num = 0;
        int denom = 1;

        String[] nums = expression.split("/|(?=[-+])");

        for (int i = 0; i < nums.length; i += 2) {
            int currNum = Integer.valueOf(nums[i]);
            int currDenom = Integer.valueOf(nums[i + 1]);

            num = num * currDenom + currNum * denom;
            denom = denom * currDenom;
        }

        int gcd = Math.abs(gcd(num, denom));

        num /= gcd;
        denom /= gcd;

        return num + "/" + denom;
    }

    private int gcd(int a, int b) {
        if (a == 0) return b;
        return gcd(b % a, a);
    }
}