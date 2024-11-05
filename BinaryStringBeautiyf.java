public class BinaryStringBeautiyf {
    public int minChanges(String s) {

        StringBuilder sb = new StringBuilder(s);
        int count = 1;
        int r = 0;
        char c1 = s.charAt(0);

        for (int i = 1; i < s.length(); i++) {

            if (c1 == s.charAt(i)) {
                count++;
                if (count % 2 != 0) {
                    count = 0;
                    sb.insert(i, s.charAt(i));
                    r++;
                }
            }
        }
        return r;
    }

    public static void main(String[] args) {
        BinaryStringBeautiyf obj = new BinaryStringBeautiyf();
        System.out.println(obj.minChanges("1001"));
    }
}
