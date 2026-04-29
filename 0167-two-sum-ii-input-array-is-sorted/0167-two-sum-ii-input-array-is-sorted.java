class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        int l=0,h=n-1;
        int st=1;
        while(l<h){
            int m=numbers[l]+numbers[h];
            if(m==target){
                return new int[]{l+1,h+1};
            }else if(m<target){
                l++;
            }else{
                h--;
            }
        }
        return new int[]{-1,-1};
    }
}


