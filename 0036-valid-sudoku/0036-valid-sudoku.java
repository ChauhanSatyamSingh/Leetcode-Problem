class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[][] rows = new int[9][9];
        int[][] cols = new int[9][9];
        int[][] boxes = new int[9][9];

        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {

                if(board[r][c] == '.') continue;

                int val = board[r][c] - '1';
                int boxIdx = (r / 3) * 3 + (c / 3);

                if (rows[r][val] == 1 || cols[c][val] == 1 || boxes[boxIdx][val] == 1)
                    return false;

                rows[r][val] = 1;
                cols[c][val] = 1;
                boxes[boxIdx][val] = 1;
            }
        }

        return true;
    }
}