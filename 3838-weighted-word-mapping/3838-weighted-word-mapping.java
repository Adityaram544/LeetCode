class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        String res="";
        for(String s:words){
            int sum=0;
            for(int i=0;i<s.length();i++){
                int x=s.charAt(i)-'a';
                sum+=weights[x];
            }
            res+=((char) ('z'-(sum%26)));
        }
        return res;
    }
}