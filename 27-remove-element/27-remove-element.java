class Solution {
    private static final int INF = -1;
    
    public int removeElement(int[] nums, int val) {
        
        int remove = 0;
        
        for(int idx = 0; idx < nums.length; idx++) {
            if(nums[idx] == val) {
                nums[idx] = INF;
                remove++;
            }    
        }
        
        int cursor = 0;
        for(int idx = 0; idx < nums.length; idx++) {    
            if(nums[idx] != INF) {
                nums[cursor++] = nums[idx];
            }
        }


        return nums.length - remove;
    }
}