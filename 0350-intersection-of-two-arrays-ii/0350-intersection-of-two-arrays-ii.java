class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        if(nums1.length < nums2.length) {
            return intersect(nums2, nums1);
        }

        Map<Integer, Integer> map = new HashMap<>();

        for(int x: nums1) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        int[] res = new int[nums2.length]; 
        int k = 0;

        for(int i: nums2) {
            int count = map.getOrDefault(i, 0);
            if(count > 0) {
                res[k] = i;
                k++;
                map.put(i, count-1);
            }
        }

        return Arrays.copyOfRange(res, 0, k);
    }
}