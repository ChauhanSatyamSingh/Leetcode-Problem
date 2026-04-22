class Solution {
    public String longestCommonPrefix(String[] strs) {

        if(strs.length == 1) return strs[0];

        int minLen = strs[0].length();

        for(String str: strs) {
            minLen = Math.min(minLen, str.length());
        }

        for(int i = 0; i < minLen; i++) {
            int j = 0;

            while(j < strs.length-1) {
                if(strs[j].charAt(i) != strs[j+1].charAt(i))
                    return strs[0].substring(0, i);

                j++;
            }
        }

        return strs[0].substring(0, minLen);
    }
}