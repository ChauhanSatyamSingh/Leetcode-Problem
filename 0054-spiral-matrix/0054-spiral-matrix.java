class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();

        int i = 0,
            j = -1;

        int m = matrix.length,
            n = matrix[0].length;

        int dir = 1;

        while(m != 0 && n != 0) {
            for(int k = 0; k < n; k++) {

                j += dir;
                res.add(matrix[i][j]);

            }

            m -= 1;

            for(int k = 0; k < m; k++) {

                i += dir;
                res.add(matrix[i][j]);

            }

            n -= 1;

            dir *= -1;
        }

        return res;
    }
}