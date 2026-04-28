class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        //done
        int[] num = new int[1001];
        int size = nums1.length > nums2.length ? nums2.length : nums1.length;
        int[] res = new int[size];
        int k = 0;
        for(int n: nums1) num[n]++;
        for(int n: nums2) {
            if(num[n] > 0) {
                res[k++] = n;
                num[n]--;
            }
        }
        return Arrays.copyOfRange(res, 0, k);
    }
}