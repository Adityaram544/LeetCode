class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int res=0;
        for(int x:costs){
            if(x<=coins){
                res++;
                coins-=x;
            }
        }
        return res;
    }
}