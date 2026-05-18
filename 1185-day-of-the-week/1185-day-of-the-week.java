class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        String dayy[]={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        int mDays[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
        if(isLeap(year)){
            mDays[2]=29;
        }
        int days=4;
        for(int i=1971;i<year;i++){
            if(isLeap(i)){
                days+=366;
            }else{
                days+=365;
            }
        }
        for(int i=1;i<month;i++){
            days+=mDays[i];
        }
        days+=day;
        return dayy[days%7];
    }
    private boolean isLeap(int year){
        if((year%4==0 && year%100!=0) || (year%400==0)){
            return true;
        }
        return false;
    }
}