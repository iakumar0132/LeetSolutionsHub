class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String s="123456789";
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                int temp=Integer.parseInt(s.substring(i,j+1));
                if (temp >= low && temp <= high)
                    ans.add(temp);
            }
        }
        Collections.sort(ans);
        return ans;
    }
}