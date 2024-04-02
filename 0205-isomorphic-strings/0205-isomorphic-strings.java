class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
        Map<Character, Character> mp=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char sChar=s.charAt(i);
            char tChar=t.charAt(i);
            if(!mp.containsKey(sChar)){
                if(!mp.containsValue(tChar))
                    mp.put(sChar,tChar);
                else return false;
            }
            else{
                char temp=mp.get(sChar);
                if(temp!=tChar) return false;
            }
        }
        return true;
    }
}