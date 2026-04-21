class Solution {
    public int reverse(int x) {
        //Integer.MIN_VALUE == -2,147,483,648 == -2^31
        //Integer.MAX_VALUE == 2,147,483,647 == 2^31 - 1

        int num = 0;

        while(x != 0) {
            int digit = x % 10;

            if(num > Integer.MAX_VALUE / 10) return 0;
            else if(num == Integer.MAX_VALUE / 10 && digit > 7) return 0;

            if(num < Integer.MIN_VALUE / 10) return 0;
            else if(num == Integer.MIN_VALUE / 10 && digit < -8) return 0;

            num = num * 10 + digit;
            x /= 10;
        }

        return num;
    }
}