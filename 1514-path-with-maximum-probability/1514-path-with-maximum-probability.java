class Solution {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
        double[] pro=new double[n];
        pro[start_node]=1.0;
        for(int i=0;i<n-1;i++){
            boolean flag=false;
            for(int j=0;j<edges.length;j++){
                int u=edges[j][0];
                int v=edges[j][1];
                double sp=succProb[j];
                
                if(pro[u]*sp>pro[v]){
                    pro[v]=pro[u]*sp;
                    flag=true;}

                if(pro[v]*sp>pro[u]){
                    pro[u]=pro[v]*sp;
                    flag=true;}
            }
            if(!flag) break;
        }
        return pro[end_node];
    }
}