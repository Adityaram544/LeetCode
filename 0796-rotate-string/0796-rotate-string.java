class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        for(int i=0;i<s.length();i++){
            s=rotate(s);
            if(s.equals(goal)){
                return true;
            }
        }
        return false;
    }
    private String rotate(String s){
        return s.substring(1)+s.charAt(0);
    }
}