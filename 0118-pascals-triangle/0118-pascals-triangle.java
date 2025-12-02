class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            res.add(ncr(i));
        }
        return res;
    }
    private static List<Integer> ncr(int r){
        long res=1;
        List<Integer> ans=new ArrayList<>();
        ans.add(1);
        for(int i=1;i<r;i++){
            res*=(r-i);
            res/=i;
            ans.add((int)res);
        }
        return ans;
    }
}