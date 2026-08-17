class Solution {
    public String minWindow(String s, String t) {
        int l=0,r;
        int minLen=Integer.MAX_VALUE;
        Map<Character,Integer> tmap=new HashMap<>();
        for(char c:t.toCharArray()){
            tmap.put(c,tmap.getOrDefault(c,0)+1);
        }
        int st=0,end=0;
        int cur=0;
        int req=tmap.size();
        Map<Character,Integer> smap=new HashMap<>();
        for(r=0;r<s.length();r++){
            char c=s.charAt(r);
            smap.put(c,smap.getOrDefault(c,0)+1);
            if(tmap.containsKey(c) && smap.get(c).intValue()==tmap.get(c).intValue()){
                cur++;
            }
            while(cur==req){
                if(r-l+1<minLen){
                    st=l;
                    end=r;
                    minLen=r-l+1;
                }
                char x=s.charAt(l);
                smap.put(x,smap.get(x)-1);
                if(tmap.containsKey(x) && smap.get(x)<tmap.get(x)){
                   cur--;
                }
                l++;
            }
        }
        return minLen==Integer.MAX_VALUE ? "" : s.substring(st,end+1);
    }
}