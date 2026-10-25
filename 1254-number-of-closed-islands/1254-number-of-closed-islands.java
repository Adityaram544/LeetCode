class Solution {
    public int closedIsland(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        boolean vis[][]=new boolean[m][n];
        int cnt=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==0 && !vis[i][j] && bfs(i,j,m,n,grid,vis)){
                    cnt++;
                }
            }
        }
        return cnt;
    }
    private boolean bfs(int i,int j,int m,int n,int grid[][],boolean vis[][]){
        Queue<int[]> q=new LinkedList<>();
        q.offer(new int[]{i,j});
        vis[i][j]=true;
        boolean f=true;
        int dx[]={0,1,0,-1};
        int dy[]={-1,0,1,0};
        while(!q.isEmpty()){
            int cur[]=q.poll();
            for(int d=0;d<4;d++){
                int r=cur[0]+dx[d];
                int c=cur[1]+dy[d];
                if(r<0 || r>=m || c<0 || c>=n){
                    f=false;
                }else if(grid[r][c]==0 && !vis[r][c]){
                    q.offer(new int[]{r,c});
                    vis[r][c]=true;
                }
            }
        }
        return f;
    }
}