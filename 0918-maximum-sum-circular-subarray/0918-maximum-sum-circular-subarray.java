class Solution {
    public int maxSubarraySumCircular(int[] nums) {

        int maxending = nums[0];
        int minending = nums[0];

        int maxSum = nums[0];
        int minSum = nums[0];

        int total = nums[0];

        for (int i = 1; i < nums.length; i++) {

            total += nums[i];

            // Maximum subarray
            int v1 = maxending + nums[i];
            int v2 = nums[i];

            maxending = Math.max(v1, v2);
            maxSum = Math.max(maxSum, maxending);

            // Minimum subarray
            int v3 = minending + nums[i];
            int v4 = nums[i];

            minending = Math.min(v3, v4);
            minSum = Math.min(minSum, minending);
        }

        // All elements are negative
        if (maxSum < 0) {
            return maxSum;
        }

        // Normal maximum vs circular maximum
        int circularSum = total - minSum;

        return Math.max(maxSum, circularSum);
    }
}