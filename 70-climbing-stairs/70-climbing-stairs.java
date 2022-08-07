class Solution {
    public int climbStairs(int n) {
        if(n <= 1) {
            return 1;
        }
        
        int [] dp = new int [n];
        dp[0] = 1;
        dp[1] = 2;

        for (int idx = 2; idx <= n-1; idx++) {
            dp[idx] = dp[idx - 2] + dp[idx - 1];
        }
        
        return dp[n-1];
        
        
    }
}