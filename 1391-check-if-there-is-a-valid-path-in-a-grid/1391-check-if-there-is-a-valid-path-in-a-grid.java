class Solution {
    private static final int[][] trans={
        {-1,1,-1,3},
        {0,-1,2,-1},
        {3,2,-1,-1},
        {1,-1,-1,2},
        {-1,0,3,-1},
        {-1,-1,1,0}
    };
    private static final int[][] dirs={{-1,0},{0,1},{1,0},{0,-1}};
    private static final int[][] st={{1,3},{0,2},{2,3},{1,2},{0,3},{0,1}};
    public boolean hasValidPath(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        if(grid[0][0]==5) return false;
        if(grid[m-1][n-1]==4) return false;
        if(m==1 && n==1) return true;
        int x[]=st[grid[0][0]-1];
        return can(grid,x[0]) || can(grid,x[1]);
    }
    private boolean can(int grid[][],int di){
        if(di==-1) return false;
        int m=grid.length,n=grid[0].length;
        int r=dirs[di][0];
        int c=dirs[di][1];
        while(r>=0 && r<m && c>=0 && c<n){
            di=trans[grid[r][c]-1][di];
            if(di==-1 || r==0 && c==0) return false;
            if(r==m-1 && c==n-1) return true;
            r+=dirs[di][0];
            c+=dirs[di][1];
        }
        return false;
    }
}