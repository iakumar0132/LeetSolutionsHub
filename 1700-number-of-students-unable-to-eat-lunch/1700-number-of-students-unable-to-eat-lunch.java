class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int c=0,s=0;
        for(int i:students){
            if(i==1) s++;
            else c++;
        }
        for(int i:sandwiches){
            if(i==1){
                if(s>0) s--;
                else break;
            }
            if(i==0){
                if(c>0) c--;
                else break;
            }
        }
        return s+c;
    }
}