class Solution {
    public String convertToBase7(int num) {
        if(num==0) return "0";
        StringBuilder sb=new StringBuilder();
        boolean n=false;
        if(num<0) n=true;
        num=Math.abs(num);
        while(num!=0){
            sb.append(num%7);
            num/=7;
        }
        if(n) sb.append("-");
        return sb.reverse().toString();
    }
}