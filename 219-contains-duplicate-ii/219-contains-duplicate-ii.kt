import kotlin.math.abs

class Solution {
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        val map : MutableMap<Int,Int> = mutableMapOf()
        nums.forEachIndexed{ idx, value ->
            if(map.containsKey(value) && (abs(map.get(value)!! - idx) <= k)) {
                return true
            }
            map[value] = idx
        }
        return false
    }
}


