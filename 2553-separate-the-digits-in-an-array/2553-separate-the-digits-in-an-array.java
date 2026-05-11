class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> res=new ArrayList<>();
        for(int x:nums){
            List<Integer> lst=new ArrayList<>();
            while(x>0){
                lst.add(x%10);
                x=x/10;
            }
            for(int i=lst.size()-1;i>=0;i--){
                res.add(lst.get(i));
            }
        }
        int ans[]=new int[res.size()];
        for(int i=0;i<res.size();i++){
            ans[i]=res.get(i);
        }
        return ans;
    }
}