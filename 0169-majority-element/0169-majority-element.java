class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        int ans=0;
        int temp=0;
        for(int n:nums){
            mp.put(n,1 +  mp.getOrDefault(n,0));
            if(mp.get(n)>temp){
                ans=n;
                temp=mp.get(n);
            }
        }
        return ans;
    }
}