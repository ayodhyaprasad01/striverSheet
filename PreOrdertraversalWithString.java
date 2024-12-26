public class PreOrdertraversalWithString {
    public static String preOrdertraversalWithString(String[] str) {
        StringBuilder sb = new StringBuilder();

        preOrderHelpper(str, sb, 0);

        return sb.toString();
    }

    public static void preOrderHelpper(String[] str, StringBuilder sb, int i) {

        if (i >= str.length || str[i] == null) {
            return;
        }

        preOrderHelpper(str, sb, 2 * i + 1);
        preOrderHelpper(str, sb, 2 * i + 2);
        sb.append(str[i]);
    }

    public static void main(String[] args) {

        String[] str = { "1", "2", "3", "4", "5", "6", "7" };
        System.out.println(preOrdertraversalWithString(str));

    }
}
