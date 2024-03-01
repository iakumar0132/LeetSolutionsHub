class Solution {
    public String maximumOddBinaryNumber(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1') count++;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=1;i<count;i++){
            sb.append(1);
        }
        for(int i=count;i<s.length();i++){
            sb.append(0);
        }
        sb.append(1);
        return sb.toString();
    }
}