class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> list = new ArrayList<>();

        int i = 0;
        int j = -1;

        int m = matrix.length;
        int n = matrix[0].length;

        int dir = 1;
        while(m > 0 && n > 0) {
            for(int k = 0; k < n; k++) {
                j += dir;
                list.add(matrix[i][j]);
            }

            m -= 1;

            for(int k = 0; k < m; k++) {
                i += dir;
                list.add(matrix[i][j]);
            }

            n -= 1;

            dir *= -1;
        }

        return list;
    }
}