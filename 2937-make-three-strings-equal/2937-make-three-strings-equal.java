class Solution {
    public int findMinimumOperations(String s1, String s2, String s3) {
        int n=Math.min(Math.min(s1.length(),s2.length()),s3.length());
        int ans=0; int idx=0;
        for(int i=0;i<n;i++)
        {
            if(i==0){
                if((s1.charAt(i)!=s2.charAt(i)) || (s2.charAt(i)!=s3.charAt(i)) || (s1.charAt(i)!=s3.charAt(i))){
                    return -1;
                }
            }
            else
            {
                if((s1.charAt(i)!=s2.charAt(i)) || (s2.charAt(i)!=s3.charAt(i)) || (s1.charAt(i)!=s3.charAt(i))){
                    idx=i;
                    break;
                }
               
            }
        }
        if(idx==0) idx=n;
        ans=ans+(s1.length()-idx)+(s2.length()-idx)+(s3.length()-idx);
        
        return ans;
    }
}