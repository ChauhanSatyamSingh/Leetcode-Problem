class Solution {
    public int[] sortedSquares(int[] nums) {
        int st = 0,
            end = nums.length-1;

        int[] res = new int[nums.length];
        for(int i = nums.length-1; i >=0; i--) {
            if(Math.abs(nums[st]) > Math.abs(nums[end])) {
                res[i] = nums[st] * nums[st];
                st++;
            }else {
                res[i] = nums[end] * nums[end];
                end--;
            }
        }
        return res;
    }
}