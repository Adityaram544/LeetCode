class Solution {
    public int longestBalanced(String s) {
        int n=s.length();
        int maxLen=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int freq[]=new int[26];
            for(int j=i;j<n;j++){
                char ch=s.charAt(j);
                freq[ch-'a']++;
                if(isSame(freq)){
                    maxLen=Math.max(maxLen,j-i+1);
                }
            }
        }
        return maxLen;
    }
    private boolean isSame(int arr[]){
        int val=0;
        for(int x:arr){
            if(x==0) continue;
            if(val==0){
                val=x;
            }else if(val!=x){
                return false;
            }
        }
        return true;
    }
}