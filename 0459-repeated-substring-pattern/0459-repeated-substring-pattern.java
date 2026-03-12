class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String x=s+s;
        return x.substring(1,x.length()-1).contains(s);
    }
}