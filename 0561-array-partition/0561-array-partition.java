class Solution {
    public int arrayPairSum(int[] nums) {
        //count sort
        int k = 10000;

        int[] count = new int[2 * k + 1];

        for(int x: nums) {
            count[x + k]++;
        }

        //perform sorting
        int idx = 0;
        for(int i = 0; i < count.length; i++) {
            while(count[i] > 0) {
                nums[idx++] = i - k;
                count[i]--;
            }
        }

        //finding maximized sum
        int sum = 0;
        for(int i = 0; i < nums.length; i += 2)
            sum += nums[i];

        return sum;
    }
}