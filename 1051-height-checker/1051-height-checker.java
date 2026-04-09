class Solution {
    public int heightChecker(int[] heights) {
        int[] count = new int[101];

        for(int x: heights)
            count[x]++;

        int[] res = new int[heights.length];
        int k = 0;
        for(int i = 0; i < count.length; i++) {
            while(count[i] > 0) {
                res[k] = i;
                k++;
                count[i]--;
            }
        }

        int heightChecker = 0;
        for(int i = 0; i < heights.length; i++) {
            if(res[i] != heights[i]) heightChecker++;
        }

        return heightChecker;
    }
}