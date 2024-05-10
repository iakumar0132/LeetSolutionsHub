class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
       Map<Double,int[]> ans=new TreeMap<>();
       for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
           double d = (double) arr[i] / arr[j];
            ans.put(d, new int[]{arr[i] , arr[j]});
        }
       } 
       int c=0;
      for(double x: ans.keySet()){
         c++;
         if(c==k){
             return ans.get(x);
         }
      }
      return null;
    }
}