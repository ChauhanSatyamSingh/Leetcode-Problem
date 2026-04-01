class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    //UNNECESSARY OBJECT CREATION INSTEAD OF THIS 
                    //List<Integer> prevList = new ArrayList<>();
                    //prevList = result.get(i - 1);

                    //DIRECT WRTIE
                    List<Integer> prevList = result.get(i - 1);

                    row.add(prevList.get(j - 1) + prevList.get(j));
                }
            }
            result.add(row);
        }

        return result;
    }
}