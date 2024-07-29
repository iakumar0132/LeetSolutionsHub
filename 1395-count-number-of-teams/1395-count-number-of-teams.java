class Solution {

    public int numTeams(int[] rating) {
        int n = rating.length;
        int teams = 0;

        int[][] increasingTeams = new int[n][4];
        int[][] decreasingTeams = new int[n][4];

        for (int i = 0; i < n; i++) {
            increasingTeams[i][1] = 1;
            decreasingTeams[i][1] = 1;
        }

        for (int count = 2; count <= 3; count++) {
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (rating[j] > rating[i]) {
                        increasingTeams[j][count] +=
                        increasingTeams[i][count - 1];
                    }
                    if (rating[j] < rating[i]) {
                        decreasingTeams[j][count] +=
                        decreasingTeams[i][count - 1];
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            teams += increasingTeams[i][3] + decreasingTeams[i][3];
        }

        return teams;
    }
}