class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> resultSet = new HashSet<>();

        for(int x: nums1) {
            set.add(x);
        }

        for(int x: nums2) {
            if(set.contains(x)) {
                resultSet.add(x);
            }
        }

        int[] res = new int[resultSet.size()];
        int k = 0;
        for(int x: resultSet) {
            res[k] = x;
            k++;
        }

        return res;
    }
}