class Solution {
    public int heightChecker(int[] heights) {
        int max = Integer.MIN_VALUE;

        for(int num: heights) {
            max = Math.max(max, num);
        }

        int[] count = new int[max + 1];

        for(int x: heights) {
            count[x]++;
        }

        int[] exp = new int[heights.length];

        int idx = 0;
        for(int i = 0; i < count.length; i++) {
            while(count[i] > 0) {
                exp[idx++] = i;
                count[i]--;
            }
        }

        int h = 0;
        for(int i = 0; i < heights.length; i++) {
            if(exp[i] != heights[i]) h++;
        }

        return h;
    }
}