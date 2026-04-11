class Solution {
    public int reverse(int x) {
        int rev = 0;

        while(x != 0) {
            int digit = x % 10;

            //Integer.MIN_VALUE == -2,147,483,648 == -2^31
            //Integer.MAX_VALUE == 2,147,483,647 == 2^31 - 1

            //Handle Integer.MAX_VALUE overflow
            if(rev > Integer.MAX_VALUE / 10) return 0;
            if(rev == Integer.MAX_VALUE / 10 && digit > 7) return 0;

            //Handle Integer.MIN_VALUE overflow
            if(rev < Integer.MIN_VALUE / 10) return 0;
            if(rev == Integer.MIN_VALUE / 10 && digit < -8) return 0;

            rev = rev * 10 + digit;
            x /= 10;
        }

        return rev;
    }
}