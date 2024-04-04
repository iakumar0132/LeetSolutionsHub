class Solution {
    public int maxDepth(String s) {
        int ans=0;
        int temp=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(') temp++;
            if(ch==')') temp--;
            ans=Math.max(ans,temp);
        }
        return ans;
    }
}