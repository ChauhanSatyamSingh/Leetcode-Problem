class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] freq = new int[1001];

        for(int num: nums1) freq[num]++;

        int[] res = new int[nums2.length];
        int k = 0;

        for(int num: nums2) {
            if(freq[num] > 0) {
                res[k++] = num;
                freq[num]--;
            }
        }

        return Arrays.copyOfRange(res, 0, k);
    }
}