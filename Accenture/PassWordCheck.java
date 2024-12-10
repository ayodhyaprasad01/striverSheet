public class PassWordCheck {

    public static int CheckPassword(char str[], int n) {

        if (Character.isDigit(str[0])) {
            return 0;
        }

        if (AtLeastFourChar(str, n) && AtLeastOneNumeric(str, n) && atLeatOneCapitalLatter(str, n)
                && notSpaceAndSlash(str, n)) {
            return 1;

        }

        return 0;
    }

    static boolean AtLeastFourChar(char str[], int n) {

        if (str.length < 4) {
            return false;
        }
        return true;

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

        String string = "a987 abC012";
        int n = string.length();

        char[] str = new char[n];
        str = string.toCharArray();
        System.out.println(CheckPassword(str, n));
    }

}
