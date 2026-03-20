class Solution {
    public int[][] minAbsDiff(int[][] grid, int k) {
        int m=grid.length;
        int n=grid[0].length;
        int res[][]=new int[m-k+1][n-k+1];
        for(int i=0;i<=m-k;i++){
            for(int j=0;j<=n-k;j++){
                List<Integer> lst=new ArrayList<>();
                for(int x=i;x<i+k;x++){
                    for(int y=j;y<j+k;y++){
                        lst.add(grid[x][y]);
                    }
                }
                Collections.sort(lst);
                int min=Integer.MAX_VALUE;
                for(int l=1;l<lst.size();l++){
                    if(!lst.get(l).equals(lst.get(l-1))){
                        min=Math.min(min,lst.get(l)-lst.get(l-1));
                    }
                }
                res[i][j]=(min==Integer.MAX_VALUE) ? 0 : min;
            }
        }
        return res;
    }
}
