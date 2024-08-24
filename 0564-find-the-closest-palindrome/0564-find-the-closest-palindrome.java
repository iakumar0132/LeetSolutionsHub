class Solution {

    public String nearestPalindromic(String n) {
        int len = n.length();
        int mid = len % 2 == 0 ? len / 2 - 1 : len / 2;
        long left = Long.parseLong(n.substring(0, mid + 1));
        
        List<Long> cands = new ArrayList<>();
        cands.add(toPal(left, len % 2 == 0));
        cands.add(toPal(left + 1, len % 2 == 0));
        cands.add(toPal(left - 1, len % 2 == 0));
        cands.add((long) Math.pow(10, len - 1) - 1);
        cands.add((long) Math.pow(10, len) + 1);

        long minDiff = Long.MAX_VALUE, res = 0, num = Long.parseLong(n);
        for (long cand : cands) {
            if (cand == num) continue;
            if (Math.abs(cand - num) < minDiff) {
                minDiff = Math.abs(cand - num);
                res = cand;
            } else if (Math.abs(cand - num) == minDiff) {
                res = Math.min(res, cand);
            }
        }

        return String.valueOf(res);
    }

    private long toPal(long left, boolean even) {
        long res = left;
        if (!even) left /= 10;
        while (left > 0) {
            res = res * 10 + (left % 10);
            left /= 10;
        }
        return res;
    }
}
