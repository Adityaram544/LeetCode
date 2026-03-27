class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int n=aliceSizes.length;
        int m=bobSizes.length;
        int aSum=0,bSum=0;
        for(int i=0;i<n;i++){
            aSum+=aliceSizes[i];
        }
        for(int i=0;i<m;i++){
            bSum+=bobSizes[i];
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if((aSum-aliceSizes[i]+bobSizes[j])==(bSum-bobSizes[j]+aliceSizes[i])){
                    return new int[]{aliceSizes[i],bobSizes[j]};
                }
            }
        }
        return new int[0];
    }
}