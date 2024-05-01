class Solution {
    public String reversePrefix(String word, char ch) {
        int Ich=word.indexOf(ch);
        if(Ich==-1) return word;
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<word.length();i++){
            if(i<=Ich) ans.append(word.charAt(Ich-i));
            else    ans.append(word.charAt(i));
        }
        return ans.toString();
    }
}