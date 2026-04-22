class Solution {
    public String reverseWords(String s) {
        char[] chArr = s.toCharArray();

        int st = 0;
        int end = 0;

        while(st < chArr.length) {
            while(end < chArr.length && chArr[end] != ' ') end++;

            reverse(chArr, st, end-1);

            st = ++end;
        }

        return new String(chArr);
    }

    public static void reverse(char[] chArr, int st, int end) {
        while(st < end) {
            char temp = chArr[st];
            chArr[st] = chArr[end];
            chArr[end] = temp;

            st++;
            end--;
        }
    }
}