class Pair{
    int row;
    int col;
    int tm;
    Pair(int row,int col,int tm){
        this.row=row;
        this.col=col;
        this.tm=tm;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int vis[][]=new int[n][m];
        int cntFresh=0;
        Queue<Pair>q=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.add(new Pair(i,j,0));
                     vis[i][j]=2;
                }else{
                    vis[i][j]=0;
                }
                if(grid[i][j]==1) cntFresh++;
            }
        }
        int tm=0;
        int cnt=0;
        int delrow[]={-1,0,+1,0};
        int delcol[]={0,+1,0,-1};
        while(!q.isEmpty()){
            int r=q.peek().row;
            int c=q.peek().col;
            int t=q.peek().tm;
            tm=Math.max(tm,t);
            q.remove();
            for(int i=0;i<4;i++){
                int nrow=r+delrow[i];
                int ncol=c+delcol[i];
                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && vis[nrow][ncol]==0 && grid[nrow][ncol]==1){
                    vis[nrow][ncol]=2;
                    cnt++;
                    q.add(new Pair(nrow,ncol,t+1));
                }
            }}
            if(cntFresh!=cnt) return -1;
            return tm;
    }
}