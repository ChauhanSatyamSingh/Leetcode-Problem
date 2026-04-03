class Solution {
    public void duplicateZeros(int[] arr) {

        int zero = 0;
        for(int x: arr) {
            if(x == 0) zero++;
        }

        int n = arr.length;
        int i = n - 1;
        int j = n + zero - 1;

        while(i < j) {
            if(j < n) arr[j] = arr[i];
            
            if(arr[i] == 0) {
                j--;
                if(j < n) arr[j] = 0;
            }

            i--;
            j--;
        }
    }
}