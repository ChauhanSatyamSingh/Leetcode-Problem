class Solution {
    public int thirdMax(int[] nums) {
        Integer m1 = null;
        Integer m2 = null;
        Integer m3 = null;

        for(int n: nums) {
            if((m1 != null && m1 == n) || (m2 != null && m2 == n) || (m3 != null && m3 == n)) continue;

            if(m1 == null || m1 < n) {
                m3 = m2;
                m2 = m1;
                m1 = n;
            } else if(m2 == null || m2 < n) {
                m3 = m2;
                m2 = n;
            } else if(m3 == null || m3 < n) m3 = n;
        }

        return m3 != null ? m3 : m1;
    }
}