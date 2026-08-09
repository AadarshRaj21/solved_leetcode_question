class Solution {
    public int maxAbsoluteSum(int[] nums) {

        int maxending = nums[0];
        int minending = nums[0];

        int ans = Math.abs(nums[0]);

        for (int i = 1; i < nums.length; i++) {

            int v1 = maxending + nums[i];
            int v2 = minending + nums[i];

            maxending = Math.max(v1, nums[i]);
            minending = Math.min(v2, nums[i]);

            ans = Math.max(ans, Math.max(maxending, -minending));
        }

        return ans;
    }
}