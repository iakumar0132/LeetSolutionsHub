class Solution {
    public boolean canAliceWin(int[] nums) {
        int sumS=0, d=0;
        for(int i:nums){
            if(i<10) sumS+=i;
            else d+=i;
        }
        if(sumS==d) return false;
        return true;
    }
}