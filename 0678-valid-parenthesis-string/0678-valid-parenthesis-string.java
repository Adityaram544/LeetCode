class Solution {
    public boolean checkValidString(String s) {
        int cMin=0,cMax=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                cMin++;
                cMax++;
            }else if(c==')'){
                cMin--;
                cMax--;
            }else{
                cMin--;
                cMax++;
            }
            if(cMax<0) return false;
            cMin=Math.max(cMin,0);
        }
        return cMin==0;
    }
}