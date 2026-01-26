class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(arr);
        int mini=Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            mini=Math.min(mini,arr[i]-arr[i-1]);
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i]-arr[i-1] == mini){
                res.add(Arrays.asList(arr[i-1],arr[i]));
            }
        }
        return res;
    }
}