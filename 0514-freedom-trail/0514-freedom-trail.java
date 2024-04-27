class Solution {
    private int[][] dp;

    public int findRotateSteps(String ring, String key) {
        int n = ring.length();
        int m = key.length();
        dp = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                dp[i][j] = -1;
            }
        }

        return solve(ring, key, 0, 0);
    }

    private int solve(String ring, String key, int index, int ptr) {
        if (index >= key.length()) {
            return 0;
        }

        if (dp[index][ptr] != -1) {
            return dp[index][ptr];
        }

        int step = Integer.MAX_VALUE;

        for (int i = 0; i < ring.length(); i++) {
            if (ring.charAt(i) == key.charAt(index)) {
                step = Math.min(step, Math.min(Math.abs(i - ptr), ring.length() - Math.abs(i - ptr)) + 1 + solve(ring, key, index + 1, i));
            }
        }

        return dp[index][ptr] = step;
    }
}