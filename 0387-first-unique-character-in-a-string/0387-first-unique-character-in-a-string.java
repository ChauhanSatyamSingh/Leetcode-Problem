class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for(char x: s.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for(int i = 0; i < s.length(); i++) {
            if(map.get(s.charAt(i)) == 1) return i;
        }

        return -1;
    }
}