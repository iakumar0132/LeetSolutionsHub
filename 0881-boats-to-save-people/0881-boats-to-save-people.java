class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int j=people.length-1,ans=0, i=0;
        while(i<=j){
            if(people[i]+people[j]<=limit){
                i++;j--;
            }
            else j--;
            ans++;
        }
        return ans;
    }
}