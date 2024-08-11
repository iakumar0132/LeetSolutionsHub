 class Solution {
    private static final int[] DIR = new int[] {-1, 0, 1, 0, -1};
    private int[][] g;
    private int rows;
    private int cols;

    public int minDays(int[][] g) {
        this.g = g;
        rows = g.length;
        cols = g[0].length;
        if (getCount() != 1) {
            return 0;
        }
        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < cols; ++j) {
                if (g[i][j] == 1) {
                    g[i][j] = 0;
                    if (getCount() != 1) {
                        return 1;
                    }
                    g[i][j] = 1;
                }
            }
        }
        return 2;
    }

    private int getCount() {
        int count = 0;
        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < cols; ++j) {
                if (g[i][j] == 1) {
                    dfs(i, j);
                    ++count;
                }
            }
        }
        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < cols; ++j) {
                if (g[i][j] == 2) {
                    g[i][j] = 1;
                }
            }
        }
        return count;
    }

    private void dfs(int i, int j) {
        g[i][j] = 2;
        for (int k = 0; k < 4; ++k) {
            int x = i + DIR[k], y = j + DIR[k + 1];
            if (x >= 0 && x < rows && y >= 0 && y < cols && g[x][y] == 1) {
                dfs(x, y);
            }
        }
    }
}
