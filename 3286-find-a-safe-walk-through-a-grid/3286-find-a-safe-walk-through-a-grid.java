class Solution {
    public boolean findSafeWalk(List<List<Integer>> grid, int health) {
        int m=grid.size();
        int n=grid.get(0).size();
        int dis[][]=new int[m][n];
        for(int r[]:dis){
            Arrays.fill(r,Integer.MAX_VALUE);
        }
        Deque<int[]> dq=new ArrayDeque<>();
        dis[0][0]=grid.get(0).get(0);
        dq.offerFirst(new int[]{0,0});

        int dx[]={-1,1,0,0};
        int dy[]={0,0,-1,1};
        while(!dq.isEmpty()){
            int cur[]=dq.poll();
            int x=cur[0];
            int y=cur[1];
            if(x==m-1 && y==n-1){
                return dis[x][y]<health;
            }
            for(int k=0;k<4;k++){
                int nx=x+dx[k];
                int ny=y+dy[k];
                if(nx<0 || nx>=m || ny<0 || ny>=n)
                    continue;
                int w=grid.get(nx).get(ny);
                if(dis[x][y] + w < dis[nx][ny]){
                    dis[nx][ny]=dis[x][y]+w;
                    if(w==0)
                        dq.offerFirst(new int[]{nx,ny});
                    else
                        dq.offerLast(new int[]{nx,ny});
                }
            }
        }
        return dis[m-1][n-1]<health;
    }
}