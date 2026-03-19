class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n=arr.length;
        int temp[]=arr.clone();
        Arrays.sort(temp);
        Map<Integer,Integer> map=new HashMap<>();
        int rank=1;
        for(int i=0;i<n;i++){
            if(!map.containsKey(temp[i])){
                map.put(temp[i],rank++);
            }
        }
        int res[]=new int[n];
        for(int i=0;i<n;i++){
            res[i]=map.get(arr[i]);
        }
        return res;
    }
}