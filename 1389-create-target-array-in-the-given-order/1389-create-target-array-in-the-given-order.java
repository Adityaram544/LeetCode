class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int n=nums.length;
        List<Integer> lst=new ArrayList<>();
        for(int i=0;i<n;i++){
            lst.add(index[i],nums[i]);
        }
        int res[]=new int[n];
        for(int i=0;i<n;i++){
            res[i]=lst.get(i);
        }
        return res;
    }
}
/*
0 0
1 4
2 1
3 3
4 2
*/
