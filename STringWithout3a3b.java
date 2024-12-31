public class STringWithout3a3b {

    public String strWithout3a3b(int a, int b) {
        StringBuilder result = new StringBuilder();

        // While there are still characters to append
        while (a > 0 || b > 0) {
            // Check if we should append 'a' or 'b'

            if ((a >= b && result.length() < 2) || (result.length() >= 2
                    && !(result.charAt(result.length() - 1) == 'a' && result.charAt(result.length() - 2) == 'a'))) {
                if (a > 0) {
                    result.append('a');
                    a--;
                }
            } else {
                if (b > 0) {
                    result.append('b');
                    b--;
                }
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        STringWithout3a3b s = new STringWithout3a3b();
        System.out.println(s.strWithout3a3b(1, 2)); // "ab
        System.out.println(s.strWithout3a3b(3, 5)); // "ba

    }
}
