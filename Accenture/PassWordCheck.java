public class PassWordCheck {

    public static int CheckPassword(char str[], int n) {

        if (str.length < 4) {
            return 0;
        }

        if (Character.isDigit(str[0])) {
            return 0;
        }

        if (AtLeastOneNumeric(str, n) && atLeatOneCapitalLatter(str, n)
                && notSpaceAndSlash(str, n)) {
            return 1;

        }

        return 0;
    }

    static boolean AtLeastOneNumeric(char[] str, int n) {

        for (char c : str) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    static boolean atLeatOneCapitalLatter(char[] str, int n) {

        for (char c : str) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }

    static boolean notSpaceAndSlash(char[] str, int n) {

        for (char c : str) {

            if (c == ' ' || c == '/') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String string = "";
        int n = string.length();

        char[] str = new char[n];
        str = string.toCharArray();
        System.out.println(CheckPassword(str, n));
    }

}
