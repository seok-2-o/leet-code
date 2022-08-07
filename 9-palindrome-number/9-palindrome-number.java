class Solution {
    public boolean isPalindrome(int x) {
        String toString = String.valueOf(x);
        String reversed = new StringBuilder(toString).reverse().toString();
        return toString.equals(reversed);
    }
}