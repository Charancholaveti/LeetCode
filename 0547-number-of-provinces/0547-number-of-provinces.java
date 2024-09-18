class Solution {
    public static void dfs(int node,ArrayList<ArrayList<Integer>> adj,int visit[]){
        visit[node]=1;
        for(int it:adj.get(node)){
            if(visit[it]==0){
                dfs(it,adj,visit);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        int m=isConnected.length;
        int n=isConnected[0].length;
        for(int i=0;i<m;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(isConnected[i][j]==1 && i!=j){
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }
        int [] visit=new int[m];
        //visit[0]=1;
        int count=0;
        for(int i=0;i<m;i++){
            if(visit[i]==0){
            count++;
            dfs(i,adj,visit);
           }
        }
        return count;
    }
}