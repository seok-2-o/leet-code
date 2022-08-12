class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> toSet = Arrays.stream(nums)
            .boxed()
            .collect(Collectors.toSet());
        
        return toSet.size() != nums.length;
    }
}