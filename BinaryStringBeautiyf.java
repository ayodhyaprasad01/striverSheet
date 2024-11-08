public class BinaryStringBeautiyf {
    // public int minChanges(String s) {

    // StringBuilder sb = new StringBuilder(s);
    // int count = 1;
    // int r = 0;
    // char c1 = s.charAt(0);

    // for (int i = 1; i < s.length(); i++) {

    // if (c1 == s.charAt(i)) {
    // count++;
    // if (count % 2 != 0) {
    // count = 0;
    // sb.insert(i, s.charAt(i));
    // r++;
    // }
    // }
    // }
    // return r;

    // public String camelCase(String str) {

    // return print(str);
    // }

    public String print(String n) {
        // String n = "ONEtWOtHREE";
        String[] strs = n.split("(?=[a-z])");
        StringBuilder sbs = new StringBuilder();

        for (int i = 0; i < strs.length; i++) {
            if (i == 0) {
                // System.out.println(strs[i].toLowerCase());
                sbs.append(strs[i].toLowerCase()).append('\n');
            } else {
                // System.out.println(strs[i].substring(0, 1).toUpperCase() +
                // strs[i].substring(1).toLowerCase());
                sbs.append(strs[i].substring(0, 1).toUpperCase() + strs[i].substring(1).toLowerCase()).append('\n');
            }
        }

        return sbs.toString().trim();
    }

    public static void main(String[] args) {
        // BinaryStringBeautiyf obj = new BinaryStringBeautiyf();
        // System.out.println(obj.minChanges("1001"));
        // char c = 's';

        // System.out.println(n.toString().toLowerCase());
        // System.out.println(n.toString().toUpperCase() + '\n');
        // System.out.println(n);

        // System.out.println(n.substring(0, n.length()));
        // System.out.println();

        // System.out.println(n.substring(0, n.length() - 1).toUpperCase() +
        // n.substring(n.length() - 1).toLowerCase());
        // System.out.println(Character.toUpperCase(c));

        // StringBuilder n = new StringBuilder("ONEtWOtHREE");
        BinaryStringBeautiyf bb = new BinaryStringBeautiyf();
        String str = "ONEtWOtHREE";
        System.out.println(bb.print(str));

        System.out.println(4 % 1);

    }
}
