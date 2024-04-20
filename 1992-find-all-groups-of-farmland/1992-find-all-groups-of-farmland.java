class Solution {
    public int[][] findFarmland(int[][] land) {
        
        int m = land.length;
        int n = land[0].length;

        List<int[]> ans = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (land[i][j] == 1) {
                    int r = i, c = j;

                    for (r = i; r < m && land[r][j] == 1; r++) {
                        for (c = j; c < n && land[r][c] == 1; c++) {
                            land[r][c] = 0;
                        }
                    }

                    ans.add(new int[]{i, j, r - 1, c - 1});
                }
            }
        }

        return ans.toArray(new int[ans.size()][]);
    }
}