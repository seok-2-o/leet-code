class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (int idx = 0; idx < s.length(); idx++) {
            Character current = s.charAt(idx);
            if (!isOpen(current) && stack.size() == 0) {
                return false;
            } else if (!isOpen(current) && !isPair(current, stack.pop())) {
                return false;
            } else if(isOpen(current)) {
                stack.push(current);
            }
        }
        return stack.isEmpty();
    }

    private boolean isPair(Character close, Character peek) {
        if (close.equals(')')) {
            return peek.equals('(');
        }
        if (close.equals('}')) {
            return peek.equals('{');
        }
        return peek.equals('[');
    }


    public boolean isOpen(Character c) {
        return c.equals('{') || c.equals('[') || c.equals('(');
    }
}