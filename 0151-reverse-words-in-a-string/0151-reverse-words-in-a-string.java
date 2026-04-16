class Solution {
    public String reverseWords(String s) {
        // approach 1
        // "  hello world  "
        String trimmedString = s.trim();
        // "hello world"

        String[] arrStr = trimmedString.split("\\s+");
        // ["hello", "world"]

        List<String> list = Arrays.asList(arrStr);
        // <"hello", "world">

        Collections.reverse(list);
        // <"world", "hello">

        return String.join(" ", list);
    }
}