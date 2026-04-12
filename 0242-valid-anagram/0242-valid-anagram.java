class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length())
            return false;

        int[] freq = new int[26];

        //count frequency
        for(char x: s.toCharArray()) freq[x - 'a']++;

        //checking characters
        for(char x: t.toCharArray()) {
            if(freq[x - 'a'] == 0) return false;

            freq[x - 'a']--;
        }

        return true;
    }
}