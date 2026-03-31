class Solution {
    public int dominantIndex(int[] nums) {
        int max = 0;
        int idx = 0;
        int max2 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max2 = max;
                max = nums[i];
                idx = i;
            } else if (nums[i] > max2 && nums[i] < max) {
                max2 = nums[i];
            }
        }

        return max >= (max2 * 2) ? idx : -1;
            
    }
}