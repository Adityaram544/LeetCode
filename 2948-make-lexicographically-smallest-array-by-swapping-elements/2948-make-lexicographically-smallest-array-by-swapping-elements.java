class Solution {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int a[]=nums.clone();
        Arrays.sort(a);
        List<List<Integer>> lst=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();
        int idx=-1;
        for(int i=0;i<a.length;i++){
            if(i==0 || a[i]-a[i-1]>limit){
                lst.add(new ArrayList<>());
                idx++;
            }
            lst.get(idx).add(a[i]);
            map.put(a[i],idx);
        }
        int res[]=new int[lst.size()];
        for(int i=0;i<a.length;i++){
            int cur=map.get(nums[i]);
            nums[i]=lst.get(cur).get(res[cur]);
            res[cur]++;
        }
        return nums;
    }
}