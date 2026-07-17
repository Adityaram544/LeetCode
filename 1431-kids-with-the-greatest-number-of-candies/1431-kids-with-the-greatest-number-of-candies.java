class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res=new ArrayList<>();
        int maxCandies=0;
        for(int x:candies){
            maxCandies=Math.max(maxCandies,x);
        }
        for(int x:candies){
            if(x+extraCandies>=maxCandies){
                res.add(true);
            }else{
                res.add(false);
            }
        }
        return res;
    }
}