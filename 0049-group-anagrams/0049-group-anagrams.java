class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> res=new HashMap<>();
        for(String s:strs){
            char c[]=s.toCharArray();
            Arrays.sort(c);
            String key=new String(c);
            res.putIfAbsent(key,new ArrayList<>());
            res.get(key).add(s);
        }
        return new ArrayList<>(res.values());
    }
}