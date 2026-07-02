class Solution {
    public String countAndSay(int n) {
        String s="1";
        for(int i=1;i<n;i++){
            s=helper(s);
        }
        return s;
    }
    private String helper(String s){
        int n=s.length();
        StringBuilder sb=new StringBuilder();
        int cnt=1;
        for(int i=1;i<n;i++){
            if(s.charAt(i)==s.charAt(i-1)){
                cnt++;
            }else{
                sb.append(cnt).append(s.charAt(i-1));
                cnt=1;
            }
        }
        sb.append(cnt).append(s.charAt(n-1));
        return sb.toString();
    }
}