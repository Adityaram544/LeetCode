class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> res=new ArrayList<>();
        for(String x:queries){
            for(String y:dictionary){
                int cnt=0;
                for(int i=0;i<x.length();i++){
                    if(x.charAt(i)!=y.charAt(i)){
                        cnt++;
                    }
                }
                if(cnt<=2){
                    res.add(x);
                    break;
                }
            }
        }
        return res;
    }
}