class Solution {
    public int numberOfSpecialChars(String word) {
        int cnt=0;
        boolean l[]=new boolean[26];
        boolean u[]=new boolean[26];
        for(char c:word.toCharArray()){
            if(Character.isLowerCase(c)){
                l[c-'a']=true;
            }else{
                u[c-'A']=true;
            }
        }
        for(int i=0;i<26;i++){
            if(l[i] && u[i]) cnt++;
        }
        return cnt;
    }
}