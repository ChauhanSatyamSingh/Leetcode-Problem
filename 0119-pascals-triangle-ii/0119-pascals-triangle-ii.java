class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1);

        for(int i = 1; i <= rowIndex; i++) {
            int curr = (int)(row.get(i-1) * (long)(rowIndex - i + 1) / i);
            row.add(curr);
        }

        return row;
    }
}