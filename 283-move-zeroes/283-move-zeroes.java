class Solution {
    public void moveZeroes(int[] nums) {
        int [] result = new int [nums.length];
        Arrays.fill(result, 0);
        int idx = 0;
        for(int n : nums) {
            if(n != 0) {
                result[idx++] = n;
            }
        }   
        idx = 0;
        for(int n : result) {
            nums[idx] = result[idx++];
        }
    }
}