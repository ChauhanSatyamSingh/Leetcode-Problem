class Solution {
    public int countCommas(int n) {
        int comas = 0;

        if(n > 999) comas = n - 999;

        return comas;
    }
}