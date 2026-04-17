class Solution {
    public int heightChecker(int[] heights) {
        int[] exp = new int[101];

        for(int h: heights) {
            exp[h]++;
        }

        int count = 0;
        int j = 0;
        for(int i = 0; i < exp.length; i++) {
            while(exp[i] > 0) {
                if(i != heights[j]) count++;
                j++;

                exp[i]--;
            }
        }

        return count;
    }
}