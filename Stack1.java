import java.util.Stack;

public class Stack1 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        // Stack<Charater> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }

            else if (ch == '(' || ch == '{' || ch == '[') {
                if (stack.isEmpty()) {
                    return false;
                }
                char pop = stack.pop();
                if (ch == '(' && pop != ')' ||
                        ch == '{' && pop != '}' ||
                        ch == '[' && pop != ']') {
                    return false;
                }
            }

        }
        return false;
    }

    public static void main(String[] args) {
        Stack1 obj = new Stack1();
        System.out.println(obj.isValid("()")); // true
        System.out.println(obj.isValid("()[]{}")); // true
        System.out.println(obj.isValid("(]")); // false
        System.out.println(obj.isValid("([)]")); // false
        System.out.println(obj.isValid("{[]}")); // true
    }
}
