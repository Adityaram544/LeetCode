class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int appleSum=0;
        for(int x:apple){
            appleSum+=x;
        }
        Arrays.sort(capacity);
        int cnt=0,curCapacity=0;
        for(int i=capacity.length-1;i>=0;i--){
            curCapacity+=capacity[i];
            cnt++;
            if(curCapacity>=appleSum){
                return cnt;
            }
        }
        return -1;
    }   
}