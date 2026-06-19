class Solution {
    int cnt=0;
    String str="";
    public String getPermutation(int n, int k) {
        StringBuilder sb=new StringBuilder();
        boolean b[]=new boolean[n+1];
        permut(sb,b,n,k);
        return str;
    }
    private void permut(StringBuilder sb,boolean b[],int n,int k){
        if(sb.length()==n){
            cnt++;
            if(cnt==k){
                str=sb.toString();
            }
            return;
        }
        for(int i=1;i<=n;i++){
            if(!b[i]){
                b[i]=true;
                sb.append(i);
                permut(sb,b,n,k);
                sb.deleteCharAt(sb.length()-1);
                b[i]=false;
                if(!str.equals("")) return;
            }
        }
    }
}