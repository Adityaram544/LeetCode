class Solution {
    public int orangesRotting(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int total=0;
        int cnt=0;
        int minutes=0;
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]!=0) total++;
                if(grid[i][j]==2) q.add(new int[]{i,j}); 
            }
        }
        int dx[]={0,0,1,-1};
        int dy[]={1,-1,0,0};
        while(!q.isEmpty()){
            int k=q.size();
            cnt+=k;
            for(int i=0;i<k;i++){
                int cur[]=q.poll();
                int x=cur[0],y=cur[1];
                for(int d=0;d<4;d++){
                    int nx=x+dx[d];
                    int ny=y+dy[d];
                    if(nx<0 || nx>=m || ny<0 || ny>=n || grid[nx][ny]!=1) continue;
                    grid[nx][ny]=2;
                    q.add(new int[]{nx,ny});
                }
            }
            if(!q.isEmpty()) minutes++;
        }
        return total==cnt ? minutes : -1;
    }
}