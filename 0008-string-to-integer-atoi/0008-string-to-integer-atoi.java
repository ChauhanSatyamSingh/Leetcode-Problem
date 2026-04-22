class Solution {
    public int myAtoi(String s) {
        int i = 0;

        //Ignoring leading whitespace
        while(i < s.length() && s.charAt(i) == ' ') i++;

        //Handling sign +/-
        int sign = 1;
        if(i < s.length()) {
            if(s.charAt(i) == '-') {
                sign = -1;
                i++;
            } else if(s.charAt(i) == '+') i++;
        }

        //Conversion & Rounding
        int num = 0;

        while(i < s.length() && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            if(num == Integer.MAX_VALUE / 10) {
                if(sign == 1) {
                    if(digit >= 7) return Integer.MAX_VALUE;
                }
                else {
                    if(digit >= 8) return Integer.MIN_VALUE;
                }
            }

            if(num > Integer.MAX_VALUE / 10) {
                if(sign == 1) return Integer.MAX_VALUE;
                else return Integer.MIN_VALUE;
            }

            num = num * 10 + digit;
            i++;
        }

        return sign * num;
    }
}