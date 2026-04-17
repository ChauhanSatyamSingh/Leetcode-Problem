class Solution {

    public static void reverse(char[] charArr, int st, int end) {
        while(st < end) {
            char temp = charArr[st];
            charArr[st] = charArr[end];
            charArr[end] = temp;

            st++;
            end--;
        }
    }

    public String reverseWords(String s) {
        char[] charArr = s.toCharArray();

        int st = 0;
        int end = 0;

        while(st < charArr.length) {
            while(end < charArr.length && charArr[end] != ' ') end++;

            reverse(charArr, st, end-1);

            st = end + 1;
            end = end + 1;
        }

        return new String(charArr);
    }
}