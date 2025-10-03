class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // Push opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } 
            // For closing brackets
            else {
                if (stack.isEmpty()) return false;
                char top = stack.peek();
                if ((top == '(' && ch == ')') ||
                    (top == '{' && ch == '}') ||
                    (top == '[' && ch == ']')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        // If stack empty → all brackets matched
        return stack.isEmpty();
    }
}
