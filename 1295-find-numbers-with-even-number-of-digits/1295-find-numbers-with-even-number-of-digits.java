class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int s : nums)
            if ((int) Math.log10(s) % 2 == 1) count++;
        return count;
    }
}