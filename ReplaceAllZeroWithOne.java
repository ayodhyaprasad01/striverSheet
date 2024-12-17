public class ReplaceAllZeroWithOne {

    public static int replaceAllZeroWithOne(int n) {
        String s = Integer.toString(n);
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < sb.length(); i++) {

            if (sb.charAt(i) == '0') {
                sb.setCharAt(i, '1');
            }
        }
        return Integer.parseInt(sb.toString());
    }

    public static void main(String[] args) {
        System.out.println(replaceAllZeroWithOne(000));
    }
}
