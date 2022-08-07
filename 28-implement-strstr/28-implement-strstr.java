class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.equals(haystack) || needle.length() == 0) {
            return 0;
        }
        
        for(int idx = 0; idx < haystack.length() - needle.length() + 1; idx ++) {
            if(haystack.substring(idx).startsWith(needle)) {
                return idx;
            }
        }
        
        return -1;
    }
}