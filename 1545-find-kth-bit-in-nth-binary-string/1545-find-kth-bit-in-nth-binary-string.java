class Solution {
    public char findKthBit(int n, int k) {
        String str[]=new String[22];
        str[0]="0";
        for(int i=1;i<=20;i++){
            String x=invert(str[i-1]);
            str[i]=str[i-1]+"1"+reverse(x);
        }
        return str[n].charAt(k-1);
    }
    private String invert(String s){
        StringBuilder sb=new StringBuilder();
        for(char x:s.toCharArray()){
            sb.append(x=='1' ? '0' : '1');
        }
        return sb.toString();
    }
    private String reverse(String s){
        return new StringBuilder(s).reverse().toString();
    }
}