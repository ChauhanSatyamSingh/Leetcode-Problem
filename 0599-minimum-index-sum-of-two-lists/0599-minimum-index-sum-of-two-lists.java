class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        List<String> list = new ArrayList<>();

        Map<String, Integer> map = new HashMap<>();

        for(int i = 0; i < list1.length; i++) map.put(list1[i], i);

        int idxSum = Integer.MAX_VALUE;
        for(int i = 0; i < list2.length; i++) {
            if(map.containsKey(list2[i])) {
                int sum = map.get(list2[i]) + i;
                
                if(sum < idxSum) {
                    list = new ArrayList<>();
                    list.add(list2[i]);
                    idxSum = sum;
                } else if(sum == idxSum) {
                    list.add(list2[i]);
                    idxSum = sum;
                }
            }
        }

        String[] ans = new String[list.size()];
        int k = 0;

        for(String s: list) ans[k++] = s;

        return Arrays.copyOfRange(ans, 0, k);
    }
}