class Solution {
    public int pivotInteger(int n) {
        int left=1,right=n;
        int leftSum=left,rightSum=right;
        if(n==1) return 1;
        while(left<right){
            if(leftSum<rightSum){
                left++;
                leftSum+=left;
            }
        else{
            right--;
            rightSum+=right;
        }
        if(leftSum==rightSum  && left+1==right-1) return left+1;
        }
        return -1;
    }
}