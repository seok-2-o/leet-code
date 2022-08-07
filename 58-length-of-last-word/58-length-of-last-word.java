class Solution {
    public int lengthOfLastWord(String s) {
        String [] splited = s.split(" ");
        for(int idx = splited.length -1; idx >= 0; idx--) {
            int length = splited[idx].length();
            if(length > 0) {
                return length;
            }
        }
        return -1;
    }
}