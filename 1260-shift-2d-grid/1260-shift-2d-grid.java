class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<Integer> lst=new ArrayList<>();
        int m=grid.length;
        int n=grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                lst.add(grid[i][j]);
            }
        }
        k=k%(m*n);
        for(int i=0;i<k;i++){
            int last=lst.remove(lst.size()-1);
            lst.add(0,last);
        }
        List<List<Integer>> res=new ArrayList<>();
        int idx=0;
        for(int i=0;i<m;i++){
            List<Integer> l=new ArrayList<>();
            for(int j=0;j<n;j++){
                l.add(lst.get(idx));
                idx++;
            }
            res.add(l);
        }
        return res;
    }
}