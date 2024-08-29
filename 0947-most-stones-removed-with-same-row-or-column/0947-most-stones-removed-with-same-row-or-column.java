class Solution {
    public int removeStones(int[][] s) {
        boolean[] v = new boolean[s.length];
        int cnt = 0;
        
        for (int i = 0; i < s.length; i++) {
            if (!v[i]) {
                cnt++;
                dfs(s, i, v);
            }
        }
        return s.length - cnt;
    }
    
    private void dfs(int[][] s, int idx, boolean[] v) {
        v[idx] = true;
        for (int i = 0; i < s.length; i++) {
            if (!v[i] && (s[i][0] == s[idx][0] || s[i][1] == s[idx][1])) {
                dfs(s, i, v);
            }
        }
    }
}