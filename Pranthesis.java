import java.util.Stack;

public class Pranthesis {
    public static void main(String[] args) {
        
        String str = "(([}))";
        Stack<Character> st = new Stack<>();
        int count=0;

        for (char ch : str.toCharArray()) {

            if(ch=='(' || ch=='{' || ch=='['  ){
                st.push(ch);
            }

            else if (ch==')' || ch=='}' || ch==']' && !st.isEmpty()) {
                char c=st.pop();
                count++;
            }
        }
            System.out.println(count);
    }
}
