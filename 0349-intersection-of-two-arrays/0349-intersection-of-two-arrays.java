class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        //best
        boolean[] num = new boolean[1001];
        int size = nums1.length > nums2.length ? nums2.length : nums1.length;
        int[] res = new int[size];
        int k = 0;
        for(int n: nums1) num[n] = true;
        for(int n: nums2) {
            if(num[n]) {
                res[k++] = n;
                num[n] = false;
            }
        }
        return Arrays.copyOfRange(res, 0, k);
    }
}