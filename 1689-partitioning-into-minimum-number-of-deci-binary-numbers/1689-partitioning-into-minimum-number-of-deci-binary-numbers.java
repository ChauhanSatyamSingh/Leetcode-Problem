class Solution {
    public int minPartitions(String n) {
        int minPar = Integer.MIN_VALUE;

        for(int i = 0; i < n.length(); i++) {
            if(n.charAt(i) - '0' > minPar) minPar = n.charAt(i) - '0';
        }

        return minPar;
    }
}