class Solution {
    public int removeDuplicates(int[] nums) {
        // 1, 2, 4, 4, 6 --> non decreasing order
        // remove duplicate --> in-place
        // such that unique element appears only once --> order should be same
        // k --> unique elements
        // after removind return --> k
        // [0,0,1,1,1,2,2,3,3,4] --> [0,1,2,3,4,_,_,_,_,_]
        //                                    k = 4 --> return k + 1;

        int k = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != nums[k]) {
                k++;
                nums[k] = nums[i];
            }
        }

        return k+1;

    }
}