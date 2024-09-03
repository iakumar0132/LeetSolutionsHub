class Solution {
    public int getLucky(String s, int k) {
        StringBuilder numStr = new StringBuilder();
        for (char c : s.toCharArray()) {
            numStr.append(c - 'a' + 1);
        }
        
        int sum = 0;
        for (char c : numStr.toString().toCharArray()) {
            sum += c - '0';
        }
        
        while (--k > 0) {
            int tempSum = 0;
            while (sum > 0) {
                tempSum += sum % 10;
                sum /= 10;
            }
            sum = tempSum;
        }
        
        return sum;
    }
}