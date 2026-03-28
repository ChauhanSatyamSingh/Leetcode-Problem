class Solution {
    public int thirdMax(int[] nums) {
        Integer max = null,
                max2 = null,
                max3 = null;

        for (int i = 0; i < nums.length; i++) {
            if (max != null && max == nums[i])
                continue;

            if (max2 != null && max2 == nums[i])
                continue;

            if (max3 != null && max3 == nums[i])
                continue;

            if (max == null || nums[i] > max) {
                max3 = max2;
                max2 = max;
                max = nums[i];
            }
            else if (max2 == null || nums[i] > max2) {
                max3 = max2;
                max2 = nums[i];
            }
            else if (max3 == null || nums[i] > max3) {
                max3 = nums[i];
            }
        }

        if (max3 != null)
            return max3;

        return max;
    }
}