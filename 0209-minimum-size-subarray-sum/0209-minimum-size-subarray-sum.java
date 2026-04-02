class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minDistance = Integer.MAX_VALUE;

        int left = 0,
            right = 0;
        
        int runningSum = 0;

        while(right < nums.length) {
            runningSum += nums[right];

            while(runningSum >= target) {
                minDistance = Math.min(minDistance, right - left + 1);
                runningSum -= nums[left];
                left++;
            }

            right++;
        }

        return minDistance == Integer.MAX_VALUE ? 0 : minDistance;
    }
}