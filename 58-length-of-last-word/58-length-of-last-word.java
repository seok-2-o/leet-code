class Solution {
    public int lengthOfLastWord(String s) {
        return Arrays.stream(s.split(" "))
            .filter(it -> it.length() > 0)
            .reduce((first, second) -> second)
            .orElse("")
            .length();
    }
}