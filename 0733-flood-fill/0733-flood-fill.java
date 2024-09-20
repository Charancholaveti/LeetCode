class Solution {
    public static void dfs(int sr,int sc,int[][] image,int [][]ans,
    int []delrow,int []delcol,int color,int initColor){
     int n=image.length;
     int m=image[0].length;
     ans[sr][sc]=color;
     for(int i=0;i<4;i++){
        int nrow=sr+delrow[i];
        int ncol=sc+delcol[i];
        if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && image[nrow][ncol]==initColor && ans[nrow][ncol]!=color){
            dfs(nrow,ncol,image,ans,delrow,delcol,color,initColor);
        }
     }
   }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int initColor=image[sr][sc];
        int [][]ans=image;
        int []delrow={-1,0,1,0};
        int []delcol={0,1,0,-1};
        dfs(sr,sc,image,ans,delrow,delcol,color,initColor);
        return ans;
    }
}