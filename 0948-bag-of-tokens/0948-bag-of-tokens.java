class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int max = 0;
        Arrays.sort(tokens);

        int left = 0, right = tokens.length-1;

        int score = 0;
        while(left <= right) {

            if(power >= tokens[left]) {
                power -= tokens[left++];
                score++;

                max = Math.max(max, score);
            }
            else if(score >= 1) {
                power += tokens[right--];
                score--;
            }
            else {
                return max;
            }
        } 
        return max;
    }
}