public class Demy {
    public String strWithout3a3b(int a, int b) {
        StringBuilder result = new StringBuilder();

        while (a > 0 || b > 0) {
            // Append 'a' if there are more 'a' left and the last two are not 'aa'
            // Note : for index out of bound exception (result.length() < 2) is used
            // Note: (a >= b) for priotizing
            if ((a >= b && (result.length() < 2 || result.charAt(result.length() - 1) != 'a'
                    || result.charAt(result.length() - 2) != 'a')) || b == 0) {
                result.append('a');
                a--;
            } else { // Append 'b' otherwise
                result.append('b');
                b--;
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Demy d = new Demy();
        System.out.println(d.strWithout3a3b(1, 1)); // "ab
        System.out.println(d.strWithout3a3b(2, 1)); // "aab
        System.out.println(d.strWithout3a3b(3, 2)); // "aa

    }
}
