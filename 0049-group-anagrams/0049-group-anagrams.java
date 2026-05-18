class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for(String str: strs) {
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String s = new String(arr);

            if(!map.containsKey(s)) {
                map.put(s, new ArrayList<>());
            }

            map.get(s).add(str);
        }

        List<List<String>> res = new ArrayList<>();
        for(String s: map.keySet()) {
            res.add(map.get(s));
        }

        return res;
    }
}