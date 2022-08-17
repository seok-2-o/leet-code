class Solution {
    fun singleNumber(nums: IntArray): Int {
                return nums.groupBy{ it }
            .minBy { it.value.size }
        ?.key
        ?.toInt() 
        ?: -1
    }
}