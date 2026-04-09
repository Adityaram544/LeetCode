class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        String s = licensePlate.replaceAll("[^a-zA-Z]","").toLowerCase();
        Map<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        String res=null;
        for(String x:words){
            Map<Character,Integer> map2=new HashMap<>();
            for(char c:x.toCharArray()){
                map2.put(c,map2.getOrDefault(c,0)+1);
            }
            boolean f=true;
            for(char c:map.keySet()){
                if(map2.getOrDefault(c,0) < map.get(c)){
                    f=false;
                    break;
                }
            }
            if(f){
                if(res==null || x.length()<res.length()){
                    res=x;
                }
            }
        }
        return res;
    }
}