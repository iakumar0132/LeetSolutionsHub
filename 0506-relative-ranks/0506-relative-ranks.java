public class Solution {
    public String[] findRelativeRanks(int[] score) {
        Map<Integer, Integer> scoreMap = new HashMap<>();
        for (int i = 0; i < score.length; i++) {
            scoreMap.put(score[i], i);
        }
        Arrays.sort(score);
        String[] ans = new String[score.length];
        for (int i = score.length - 1; i >= 0; i--) {
            int rank = score.length - i;
            if (rank == 1) {
                ans[scoreMap.get(score[i])] = "Gold Medal";
            } else if (rank == 2) {
                ans[scoreMap.get(score[i])] = "Silver Medal";
            } else if (rank == 3) {
                ans[scoreMap.get(score[i])] = "Bronze Medal";
            } else {
                ans[scoreMap.get(score[i])] = String.valueOf(rank);
            }
        }

        return ans;
    }
}