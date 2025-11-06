class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int n=arr1.length;
        List<Integer> res=new ArrayList<>();
        for(int num2:arr2){
            for(int i=0;i<n;i++){
                if(arr1[i]==num2){
                    res.add(arr1[i]);
                    arr1[i]=-1;
                }
            }
        }
        Arrays.sort(arr1);
        for(int i=res.size();i<n;i++){
            res.add(arr1[i]);
        }
        int ans[]=new int[res.size()];
        for(int i=0;i<res.size();i++){
            ans[i]=res.get(i);
        }
        return ans;
    }
}