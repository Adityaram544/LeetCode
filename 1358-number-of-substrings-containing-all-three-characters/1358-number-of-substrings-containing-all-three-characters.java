class Solution {
    public int numberOfSubstrings(String s) {
        Map<Character,Integer> map=new HashMap<>();
        int total=0,l=0;
        for(int r=0;r<s.length();r++){
            char c=s.charAt(r);
            map.put(c,map.getOrDefault(c,0)+1);
            while(map.size()==3){
                total+=s.length()-r;
                char x=s.charAt(l);
                map.put(x,map.get(x)-1);
                if(map.get(x)==0){
                    map.remove(x);
                }
                l++;
            }
        }
        return total;
    }
}