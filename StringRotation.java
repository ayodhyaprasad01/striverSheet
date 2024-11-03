public class StringRotation {
    public static boolean isRotation(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }
        String d=s1+1;
        return d.contains(s2);
    }

    public static void main(String[] args) {
        System.out.println(isRotation("wat", "atw")); // true
    }
}
