class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        
        while(i < j) {
            if(nums[j] % 2 == 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
            } else j--;
        }

        return nums;
    }
}