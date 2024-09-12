class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> a=new HashSet<>();
        for(char c:allowed.toCharArray()){
            a.add(c);
        }
        int ans=0;
        for(String w: words){
            boolean flag = true;
            for(char c: w.toCharArray()){
                if(!a.contains(c)){
                    flag=false;
                    break;
                }
            }
            if(flag) ans++;
        }
        return ans;
    }
}