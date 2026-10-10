class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        long res = 0;
        int max = 0;
        long totalOps = (long) k1 + k2;
        for (int i = 0; i < nums1.length; i++) {
            max = Math.max(max, Math.abs(nums1[i] - nums2[i]));
        }
        int freq[] = new int[max+1];
        for (int i = 0; i < nums1.length; i++) {
            freq[Math.abs(nums1[i] - nums2[i])]++;
        }
        for (int i = max; i >= 1 && totalOps>0; i--) {
            long min = Math.min(totalOps, freq[i]);
            totalOps -= min;
            freq[i] -= min;
            freq[i-1] += min;
        }
        if (totalOps > 0) {
            return 0;
        }
        for (int i = 1; i <= max; i++) {
            res += (long) i * i * freq[i];
        }
        return res;
    }
}