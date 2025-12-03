class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        List<Integer> res=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();
        int min=(n/3)+1;
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
            if(map.get(num)==min){
                res.add(num);
            }
            if(res.size()==2) break;
        }
        Collections.sort(res);
        return res;
    }
}