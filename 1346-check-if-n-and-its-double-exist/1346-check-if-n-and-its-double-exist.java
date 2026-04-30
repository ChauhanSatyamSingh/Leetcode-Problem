class Solution {
    public boolean checkIfExist(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            if(isDouble(arr, i)) return true;
        }
        return false;
    }

    public boolean isDouble (int[] arr, int index) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] * 2 == arr[index] && i != index) return true;
        }

        return false;
    }
}