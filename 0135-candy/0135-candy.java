class Solution {
    public int candy(int[] ratings) {
        int n=ratings.length;
        int lCan[]=new int[n];
        int rCan[]=new int[n];
        Arrays.fill(lCan,1);
        Arrays.fill(rCan,1);
        for(int i=1;i<n;i++){
            if(ratings[i]>ratings[i-1]){
                lCan[i]=lCan[i-1]+1;
            }
        }
        for(int i=n-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]){
                rCan[i]=rCan[i+1]+1;
            }
        }
        int tCandies=0;
        for(int i=0;i<n;i++){
            tCandies+=Math.max(lCan[i],rCan[i]);
        }
        return tCandies;
    }
}