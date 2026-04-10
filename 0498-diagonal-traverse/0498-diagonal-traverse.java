import java.util.Collections;

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length,
            n = mat[0].length;

        // 1 2 3 4 5
        // 6 7 8 9 0
        // 6 7 8 9 1
        // 1 2 3 4 5
        // m = 4
        // n = 5
        // rowIdx = i - n + 1
        // k = 0

        int[] res = new int[m * n];
        int k = 0;

        for(int i = 0; i <= m + n - 2; i++) {
            int rowIdx = i < n ? 0 : i - n + 1;
            int colIdx = i < n ? i : n - 1;

            if(i % 2 == 0) {
                List<Integer> temp = new ArrayList<>();
                while(rowIdx < m && colIdx > -1) {
                    temp.add(mat[rowIdx][colIdx]);
                    rowIdx += 1;
                    colIdx -= 1;
                }

                // [3, 7, 6]
                Collections.reverse(temp);
                // [6, 7, 3]

                for(int x: temp) res[k++] = x;
            } else {
                while(rowIdx < m && colIdx > -1) {
                    res[k] = mat[rowIdx][colIdx];
                    rowIdx += 1;
                    colIdx -= 1;
                    k++;
                }
            }
        }

        return res;
    }
}