class Solution {
    public int[][] rangeAddQueries(int n, int[][] queries) {
        int mat[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=0;
            }
        }
        for(int q[]:queries){
            int x1=q[0];
            int y1=q[1];
            int x2=q[2];
            int y2=q[3];
            for(int i=x1;i<=x2;i++){
                for(int j=y1;j<=y2;j++){
                    mat[i][j]+=1;
                }
            }
        }
        return mat;
    }
}