class Solution {
    public int minSwaps(int[][] grid) {
        int n=grid.length;
        int traZ[]=new int[n];
        for(int i=0;i<n;i++){
            int cnt=0;
            for(int j=n-1;j>=0;j--){
                if(grid[i][j]==0){
                    cnt++;
                }else{
                    break;
                }
            }
            traZ[i]=cnt;
        }
        int swaps=0;
        for(int i=0;i<n;i++){
            int req=n-1-i;
            int j=i;
            while(j<n && traZ[j]<req){
                j++;
            }
            if(j==n) return -1;
            while(j>i){
                int temp=traZ[j];
                traZ[j]=traZ[j-1];
                traZ[j-1]=temp;
                swaps++;
                j--;
            }
        }
        return swaps;
    }
}