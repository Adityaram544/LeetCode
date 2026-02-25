class Solution {
    public int[] sortByBits(int[] arr) {
        final int num=10001;
        for(int i=0;i<arr.length;i++){
            arr[i]+=Integer.bitCount(arr[i])*num;
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            arr[i]%=num;
        }
        return arr;
    }
}