class Solution {
    public long minimumCost(String source, String target, char[] original, char[] changed, int[] cost) {
        int[][] minCost = new int[26][26];
        
        for (int i = 0; i < 26; i++) {
            Arrays.fill(minCost[i], Integer.MAX_VALUE);
            minCost[i][i] = 0;
        }
        
        for (int i = 0; i < cost.length; i++) {
            int from = original[i] - 'a';
            int to = changed[i] - 'a';
            minCost[from][to] = Math.min(minCost[from][to], cost[i]);
        }
        
        for (int k = 0; k < 26; k++) {
            for (int i = 0; i < 26; i++) {
                if (minCost[i][k] < Integer.MAX_VALUE) {
                    for (int j = 0; j < 26; j++) {
                        if (minCost[k][j] < Integer.MAX_VALUE) {
                            minCost[i][j] = Math.min(minCost[i][j], minCost[i][k] + minCost[k][j]);
                        }
                    }
                }
            }
        }
        
        long ans = 0L;
        for (int i = 0; i < source.length(); i++) {
            int sourceChar = source.charAt(i) - 'a';
            int targetChar = target.charAt(i) - 'a';
            if (minCost[sourceChar][targetChar] == Integer.MAX_VALUE) {
                return -1L;
            } else {
                ans += (long) minCost[sourceChar][targetChar];
            }
        }
        return ans;
    }
}
