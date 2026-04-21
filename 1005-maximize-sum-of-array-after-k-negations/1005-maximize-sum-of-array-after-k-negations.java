class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums);
        for (int i = 0; k > 0 && i < n && nums[i] < 0; ++i, --k)
            nums[i] = -nums[i];
        int res = 0, min = Integer.MAX_VALUE;
        for (int a : nums) {
            res += a;
            min = Math.min(min, a);
        }
        return res - (k % 2) * min * 2;
    }
}