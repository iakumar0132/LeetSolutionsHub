class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        char ch[]=s.toCharArray();
        for(char c:ch){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        List<Character> l=new ArrayList<>(map.keySet());
        l.sort((a,b)-> map.get(b)-map.get(a));
        StringBuilder sb=new StringBuilder();
        for(char c:l){
            int freq=map.get(c);
            for(int i=0;i<freq;i++)
                sb.append(c);
        }
        System.out.print(sb);
        return sb.toString();
    }
}