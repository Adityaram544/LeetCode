class Solution {
    public int repeatedStringMatch(String a, String b) {
        StringBuilder sb=new StringBuilder();
        int cnt=0;
        while(sb.length()<b.length()){
            sb.append(a);
            cnt++;
        }
        if(sb.indexOf(b)!=-1) return cnt;
        sb.append(a);
        if(sb.indexOf(b)!=-1) return cnt+1;
        return -1;
    }
}