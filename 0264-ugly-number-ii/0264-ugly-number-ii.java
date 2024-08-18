class Solution {
    public int nthUglyNumber(int n) {
        int[] num=new int[n];
        num[0]=1;
        int x=0,i2=0,i3=0,i5=0;
        for(int i=1;i<n;i++){
            num[i] = Math.min(Math.min(2 * num[i2], 3 * num[i3]), 5 * num[i5]);
            x=num[i];
            if(num[i2] * 2 == x) i2++;
            if(num[i3] * 3 == x) i3++;
            if(num[i5] * 5 == x) i5++;
        }
        return num[n-1];
    }
}