class Solution {
    public int myAtoi(String s) {
        //"    1234" --> 1234
        //"    -234" --> -234
        //"    +234" --> 234
        //"  -045" --> -45
        //"  -we323" --> 0
        int i = 0;
        int num = 0;

        int sign = 1; //default is +ve, -1 for -ve

        // 1. Ignore leading white space
        while(i < s.length() && s.charAt(i) == ' ') i++; 

        // 2. Signedness
        if(i < s.length()) {
            if(s.charAt(i) == '-') {
                sign = -1;
                i++;
            } else if(s.charAt(i) == '+') i++;
        }

        // 3. Conversion
        while(i < s.length() && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            // 4. Rounding
            // Im....0.....IM
            // -2147483648
            // 2147483647
            if(num == Integer.MAX_VALUE/10) {
                if(sign == 1) {
                    if(digit >= 7) return Integer.MAX_VALUE;
                } else if(sign == -1) {
                    if(digit >= 8) return Integer.MIN_VALUE;
                }
            }

            if(num > Integer.MAX_VALUE/10) {
                if(sign == 1) return Integer.MAX_VALUE;
                else return Integer.MIN_VALUE;
            }
            num = num * 10 + digit;
            i++;
        }

        return sign * num;
    }
}