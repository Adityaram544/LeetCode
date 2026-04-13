class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> set=new HashSet<>();
        for(String x:banned){
            set.add(x);
        }
        Map<String,Integer> map=new HashMap<>();
        paragraph=paragraph.replaceAll("[^a-zA-Z]"," ").toLowerCase();
        String s[]=paragraph.split("\\s+");
        for(String x:s){
            if(!set.contains(x)){
                map.put(x,map.getOrDefault(x,0)+1);
            }
        }
        int maxFre=0;
        String res="";
        for(String x:map.keySet()){
            if(map.get(x)>maxFre){
                maxFre=map.get(x);
                res=x;
            }
        }
        return res;
    }
}