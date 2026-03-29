class Solution {
    public int[][] imageSmoother(int[][] img) {
        int m=img.length;
        int n=img[0].length;
        int res[][]=new int[m][n];
        int dx[]={-1,-1,-1,0,0,1,1,1};
        int dy[]={-1,0,1,-1,1,-1,0,1};
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int sum=img[i][j],cnt=1;
                for(int k=0;k<8;k++){
                    int ni=i+dx[k];
                    int nj=j+dy[k];
                    if(ni>=0 && nj>=0 && ni<m && nj<n){
                        sum+=img[ni][nj];
                        cnt++;
                    }
                }
                res[i][j]=sum/cnt;
            }
        }
        return res;
    }
}