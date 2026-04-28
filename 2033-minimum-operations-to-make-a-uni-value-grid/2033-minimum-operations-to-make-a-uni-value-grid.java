class Solution {
    public int minOperations(int[][] grid, int x) {
        List<Integer> lst=new ArrayList<>();
        int res=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                lst.add(grid[i][j]);
            }
        }
        Collections.sort(lst);
        int n=lst.size();
        int fRem=lst.get(n/2);
        for(int num:lst){
            if(num%x!=fRem%x){
                return -1;
            }
            res+=Math.abs(fRem-num)/x;
        }
        return res;
    }
}