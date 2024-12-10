public class BinaryString {

    public static int OpeartionsBinaryString(String str) {

        if (str == null) {
            return -1;
        }

        char opr1 = str.charAt(0);
        char op = str.charAt(1);
        char opr2 = str.charAt(2);
        int result = 0;

        if (op == 'A') {
            result = opr1 - '0' & opr2 - '0';
        } else if (op == 'B') {
            result = opr1 - '0' | opr2 - '0';
        } else {
            result = (opr1 - '0') ^ (opr2 - '0');
        }

        for (int i = 3; i < str.length() - 1; i++) {

            op = str.charAt(i);
            opr2 = str.charAt(i + 1);

            if (op == 'A') {
                result = opr1 - '0' & opr2 - '0';
            } else if (op == 'B') {
                result = opr1 - '0' | opr2 - '0';
            } else {
                result = (opr1 - '0') ^ (opr2 - '0');
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // System.out.println('1' - '0');
        System.out.println(OpeartionsBinaryString("1C0C1C1C0A1"));
    }
}
