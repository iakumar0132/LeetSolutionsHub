import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int robotSim(int[] cmds, int[][] obs) {
        Set<String> obsSet = new HashSet<>();
        for (int[] o : obs) obsSet.add(o[0] + "," + o[1]);

        int x = 0, y = 0, dir = 0;
        int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int ans = 0;

        for (int c : cmds) {
            if (c == -1) dir = (dir + 1) % 4;
            else if (c == -2) dir = (dir + 3) % 4;
            else {
                for (int i = 0; i < c; i++) {
                    int nx = x + dirs[dir][0];
                    int ny = y + dirs[dir][1];
                    if (!obsSet.contains(nx + "," + ny)) {
                        x = nx;
                        y = ny;
                        ans = Math.max(ans, x * x + y * y);
                    } else break;
                }
            }
        }

        return ans;
    }
}