class Solution {
    fun canCompleteCircuit(gas: IntArray, cost: IntArray): Int {
        
    var total = 0
    var starting = 0
    var curr = 0
        
    for (idx in 0 .. gas.size - 1) {
        curr += gas[idx] - cost[idx]
        total += gas[idx] - cost[idx]
        if (curr < 0) {
            starting = idx + 1
            curr = 0
        }
    }
        return if (total >= 0) starting else -1
        
    }
}
