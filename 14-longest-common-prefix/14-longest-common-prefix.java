class Solution {
    public String longestCommonPrefix(String[] strs) {
        String first = strs[0];
        int length = first.length();
        for(int idx = 1; idx < length + 1; idx++) {
            String current = first.substring(0,idx);
            if(!startWithAll(current, strs)) {
                return current.substring(0,current.length()-1);    
            }
        }
        return first;
    }
               
    public boolean startWithAll(String current, String[] words) {
        for(String word: words) {
            if(!word.startsWith(current)) {
                return false;
            }
        }
        return true;
    }
}