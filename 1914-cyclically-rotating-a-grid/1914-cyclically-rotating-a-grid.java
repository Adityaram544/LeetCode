class Solution {
    public int[][] rotateGrid(int[][] grid, int k) {
        int m=grid.length,n=grid[0].length;
        int l=Math.min(m,n)/2;
        for(int i=0;i<l;i++){
            List<Integer> lst=new ArrayList<>();
            int top=i,bottom=m-i-1;
            int left=i,right=n-i-1;
            for(int j=left;j<=right;j++){
                lst.add(grid[top][j]);
            }
            for(int j=top+1;j<bottom;j++){
                lst.add(grid[j][right]);
            }
            for(int j=right;j>=left;j--){
                lst.add(grid[bottom][j]);
            }
            for(int j=bottom-1;j>top;j--){
                lst.add(grid[j][left]);
            }

            int len=lst.size();
            int r=k%len;
            int rot[]=new int[len];
            for(int j=0;j<len;j++){
                rot[j]=lst.get((j+r)%len);
            }

            int idx=0;
            for(int j=left;j<=right;j++){
                grid[top][j]=rot[idx++];
            }
            for(int j=top+1;j<bottom;j++){
                grid[j][right]=rot[idx++];
            }
            for(int j=right;j>=left;j--){
                grid[bottom][j]=rot[idx++];
            }
            for(int j=bottom-1;j>top;j--){
                grid[j][left]=rot[idx++];
            }
        }
        return grid;
    }
}