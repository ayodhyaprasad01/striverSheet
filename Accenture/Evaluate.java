import java.util.Stack;

public class Evaluate {
    public static boolean isBalancedParentheses(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch); // Push opening brackets to the stack
            } else if (ch == ')' || ch == '}' || ch == ']') {
                // Check for mismatched or unpaired closing brackets
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // Ensure no unmatched opening brackets remain
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isBalancedParentheses("((()))")); // Expected output: true

    }
}
