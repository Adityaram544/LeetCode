class Solution {
    public int numberOfSubmatrices(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int res=0;
        int px[]=new int[n];
        int py[]=new int[n];
        for(int i=0;i<m;i++){
            int rx=0,ry=0;
            for(int j=0;j<n;j++){
                if(grid[i][j]=='X'){
                    rx++;
                }else if(grid[i][j]=='Y'){
                    ry++;
                }
                px[j]+=rx;
                py[j]+=ry;
                if(px[j]==py[j] && px[j]>0) res++;
            }
        }
        return res;
    }
}