class Solution {
    public int minAbsoluteDifference(int[] nums) {
        int lastOne = -1;
        int lastTwo = -1;
        int diff = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                lastOne = i;
                if(lastTwo != -1) {
                    diff = Math.min(diff, Math.abs(lastOne - lastTwo));
                }
            }

            if(nums[i] == 2) {
                lastTwo = i;
                if(lastOne != -1) {
                    diff = Math.min(diff, Math.abs(lastOne - lastTwo));
                }
            }
        }

        return diff != Integer.MAX_VALUE ? diff : -1;
    }
}