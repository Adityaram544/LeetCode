class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character,Integer> map=new HashMap<>();
        int res=0,l=0,maxF=0;
        for(int r=0;r<s.length();r++){
            char c=s.charAt(r);
            map.put(c,map.getOrDefault(c,0)+1);
            maxF=Math.max(maxF,map.get(c));
            while((r-l+1)-maxF>k){
                char d=s.charAt(l);
                map.put(d,map.get(d)-1);
                l++;
            }
            res=Math.max(res,r-l+1);
        }
        return res;
    }
}