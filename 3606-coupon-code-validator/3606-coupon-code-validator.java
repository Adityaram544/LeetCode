class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        List<String> res=new ArrayList<>();
        String arr[]={"electronics", "grocery", "pharmacy", "restaurant"};
        for(int i=0;i<code.length;i++){
            String s=code[i];
            boolean found=false;
            for(String x:arr){
                if(x.equals(businessLine[i])){
                    found=true;
                    break;
                }
            }
            if(s.matches("[a-zA-Z0-9_]+") && found && isActive[i]){
                res.add(s);
            }
        }
        Collections.sort(res);
        return res;
    }
}