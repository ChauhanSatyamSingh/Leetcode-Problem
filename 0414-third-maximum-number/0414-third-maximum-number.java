class Solution {
    public int thirdMax(int[] nums) {
        Integer max1 = null,
                max2 = null,
                max3 = null;

        for (int x : nums) {
            if ((max1 != null && max1 == x) || (max2 != null && max2 == x) || (max3 != null && max3 == x))
                continue;

            if(max1 == null || x > max1) {
                max3 = max2;
                max2 = max1;
                max1 = x;
            }else if(max2 == null || x > max2) {
                max3 = max2;
                max2 = x;
            }else if(max3 == null || x > max3) {
                max3 = x;
            }
        }

        if(max3 != null) return max3;
        return max1;
    }
}