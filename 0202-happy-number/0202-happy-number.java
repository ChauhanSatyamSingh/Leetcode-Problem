class Solution {
    public int sumOfSquareOfDigits(int n) {
        int sum = 0;
        while(n != 0) {
            int digit = n % 10;
            sum += (digit*digit);
            n /= 10;
        }

        return sum;
    }

    public boolean isHappy(int n) {
        // floyd cycle detection algorithm

        int slow = n;
        int fast = n;

        do {
            slow = sumOfSquareOfDigits(slow);
            fast = sumOfSquareOfDigits(sumOfSquareOfDigits(fast));

            if(fast == 1) return true;

        } while(slow != fast);

        return false;
    }
}