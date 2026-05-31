public class ValidPassword {
    int CheckPassword(char str[], int n) {
        if (Character.isDigit(str[0]) || str.length < 4) {
            return 0;
        }
        boolean isDigit = false;
        boolean isLetter = false;

        for (char ch : str) {
            if (ch == ' ' || ch == '\t') {
                return 0;
            }
            if (Character.isLetter(ch)) {
                isLetter = true;
            } else if (Character.isDigit(ch)) {
                isDigit = true;
            }
        }
        if (isLetter && isDigit) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        ValidPassword vp = new ValidPassword();
        String str = "a97";
        char[] password = str.toCharArray();
        int length = password.length;
        System.out.println(vp.CheckPassword(password, length));
    }
}
