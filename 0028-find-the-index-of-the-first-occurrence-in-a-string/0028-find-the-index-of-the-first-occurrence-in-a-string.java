class Solution {
    public int strStr(String haystack, String needle) {
        int h = 0,
            k = 0,
            n = 0;

        while(h < haystack.length() && k < haystack.length() && n < needle.length()) {

            if(haystack.charAt(k) == needle.charAt(n)) {
                k++;
                n++;
            } else {
                h++;
                k = h;
                n = 0;
            }

        }

        return n == needle.length() ? h : -1;
    }
}