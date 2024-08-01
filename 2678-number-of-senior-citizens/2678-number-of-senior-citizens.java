class Solution {
    public int countSeniors(String[] details) {
        int ans = 0;
        for (String i : details) {
            int value = Integer.parseInt(i.substring(11, 13));
            if (value > 60) {
                ans++;
            }
        }
        return ans;
    }
}