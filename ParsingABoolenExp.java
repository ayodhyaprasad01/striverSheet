import java.util.Stack;

public class ParsingABoolenExp {

    public boolean parseBoolExpr(String expression) {
        Stack<Character> exp = new Stack<>();

        if (expression == null || expression.equals(""))
            return false;

        for (Character character : expression.toCharArray()) {

            if (character == ')') {

                Stack<Character> subExp = new Stack<>();

                while (exp.peek() != '(') {
                    subExp.push(exp.pop());
                }
                exp.pop();

                char oper = exp.pop();

                if (oper == '!') {
                    char operand = subExp.pop();
                    exp.push(operand == 't' ? 'f' : 't');
                } else if (oper == '&') {
                    boolean res = true;
                    while (!subExp.isEmpty()) {
                        res &= (subExp.pop() == 't');
                    }
                    exp.push(res ? 't' : 'f');
                } else if (oper == '|') {
                    boolean res = false;
                    while (!subExp.isEmpty()) {
                        res |= (subExp.pop() == 't');
                    }
                    exp.push(res ? 't' : 'f');
                }

            } else if (character != ',') {
                exp.push(character);
            }
        }

        return exp.peek() == 't';
    }

    public static void main(String[] args) {
        ParsingABoolenExp parsingABoolenExp = new ParsingABoolenExp();
        System.out.println(parsingABoolenExp.parseBoolExpr("t,t,t")); // true
        System.out.println(parsingABoolenExp.parseBoolExpr("t,t,f")); // false
    }
}