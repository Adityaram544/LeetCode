class Solution {
    public int sumFourDivisors(int[] nums) {
        long total=0;
        for(int num:nums){
            int cnt=0;
            int sum=0;
            for(int i=1;i<=(int)Math.sqrt(num);i++){
                if(num%i==0){
                    int j=num/i;
                    if(i==j){
                        cnt++;
                        sum+=i;
                    }else{
                        cnt+=2;
                        sum+=i+j;
                    }
                    if(cnt>4) break;
                }
            }
            if(cnt==4){
                total+=sum;
            }
        }
        return (int)total;
    }
}