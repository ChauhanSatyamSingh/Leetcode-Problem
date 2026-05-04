class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        //done
        int[] num = new int[1001];
        int size = nums1.length > nums2.length ? nums2.length : nums1.length;
        int[] res = new int[size];
        int k = 0;
        for(int x: nums1) num[x]++;
        for(int x: nums2) {
            if(num[x] > 0) {
                res[k++] = x;
                num[x]--;
            }
        }
        return Arrays.copyOfRange(res, 0, k);
    }
}