class Solution {
    fun majorityElement(nums: IntArray): Int {
        return nums.groupBy{ it }.maxBy { it.value.size }?.key?.toInt() ?: 0
    }
}