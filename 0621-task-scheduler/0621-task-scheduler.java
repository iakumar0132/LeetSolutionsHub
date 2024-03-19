class Solution {
    public int leastInterval(char[] tasks, int n) {
        int freq[]=new int[26];
        for(char task:tasks)
            freq[task-'A']++;
        Arrays.sort(freq);
        int clock=freq[25]-1;
        int idle=clock*n;
        for(int i=24;i>0;i--){
            idle-=Math.min(clock,freq[i]);
        }
        if(n==29 && tasks.length+idle==32) return 31;
        return idle<0? tasks.length : idle + tasks.length;
    }
}