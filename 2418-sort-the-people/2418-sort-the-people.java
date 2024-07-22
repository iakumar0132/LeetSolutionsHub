class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer, String> map = new HashMap<>();
        for(int i=0;i<names.length;i++)
        {
            map.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        int temp=0;
        for(int j=heights.length-1;j>=0;j--)
        {
            names[temp]=map.get(heights[j]);
            temp++;
        }
        return names;
    }
}