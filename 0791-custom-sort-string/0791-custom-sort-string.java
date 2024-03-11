class Solution {
    public String customSortString(String order, String s) {
        Set<Character> set=new HashSet<>();
        StringBuilder sb=new StringBuilder();
        for(char c : order.toCharArray()){
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)==c){
                    sb.append(c);
                }
            }
            set.add(c);
        }
        for(char c : s.toCharArray()){
            if(!set.contains(c)){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}