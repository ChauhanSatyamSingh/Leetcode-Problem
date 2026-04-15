class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> resultSet = new HashSet<>();

        for(int n1: nums1) set.add(n1);

        for(int n2: nums2) {
            if(set.contains(n2)) resultSet.add(n2);
        }

        int[] res = new int[resultSet.size()];
        int k = 0;

        for(int rS: resultSet) {
            res[k] = rS;
            k++;
        }

        return Arrays.copyOfRange(res, 0, k);
    }
}