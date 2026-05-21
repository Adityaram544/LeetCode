class Solution {
    public boolean lemonadeChange(int[] bills) {
        int c1=0,c2=0;
        if(bills[0]!=5) return false;
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5){
                c1++;
            }else if(bills[i]==10){
                if(c1<1) return false;
                c1--;
                c2++;
            }else{
                if(c1>=1&& c2>=1){
                    c1--;
                    c2--;
                }else if(c1>=3){
                    c1-=3;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}