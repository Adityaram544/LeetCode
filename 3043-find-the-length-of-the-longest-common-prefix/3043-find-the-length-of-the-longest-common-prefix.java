class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        Set<Integer> set=new HashSet<>();
        int maxLen=0;
        for(int x:arr1){
            while(x>0 && !set.contains(x)){
                set.add(x);
                x=x/10;
            }
        }
        for(int x:arr2){
            while(x>0 && !set.contains(x)){
                x=x/10;
            }
            if(x>0){
                maxLen=Math.max(maxLen,(int)Math.log10(x)+1);
            }
        }
        return maxLen;
    }
}