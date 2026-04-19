class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int len = Integer.MAX_VALUE;

        int i = 0;
        int j = 0;

         int sum = 0;
        while(i < nums.length) {
            while(sum < target && j < nums.length) {
                sum += nums[j];
                j++;
            }

            if(sum >= target) len = Math.min(len, j-i);

            sum -= nums[i];
            i++;
        }

        return len != Integer.MAX_VALUE ? len : 0;
    }
}