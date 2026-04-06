class Solution {
    public int pivotInteger(int n) {

        int lSum = n * (n + 1) / 2;
        int rSum = n;

        int i = n-1;
        while(lSum != rSum) {
            rSum += i;
            lSum -= i+1;
            i--;
            if(i < 1) return -1;
        }

        return i+1;
    }
}