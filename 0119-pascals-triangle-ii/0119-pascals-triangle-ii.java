class Solution {
    public List<Integer> getRow(int rowIndex) {

        //use combination logic: (prev col val)*(n-r+1)/r
        //n --> rowIndex, r --> coloum no(i)

        List<Integer> row = new ArrayList<>();
        row.add(1);
        for(int i = 1; i <= rowIndex; i++) {
                int currEle = (int)(row.get(i - 1) * (long)(rowIndex - i + 1) / i);
                row.add(currEle);
        }

        return row;
    }
}