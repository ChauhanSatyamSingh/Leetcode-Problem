class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> prev = new ArrayList<>();
        prev.add(1);

        for(int i = 1; i <= rowIndex; i++) {
            List<Integer> curr = new ArrayList<>();
            curr.add(1);

            for(int idx = 1; idx <= i - 1; idx++) {
                curr.add(prev.get(idx) + prev.get(idx-1));
            }

            curr.add(1);
            prev = curr;
        }

        return prev;
    }
}