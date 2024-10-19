public class FindKthBitInNthString {

    public char findKthBit(int n, int k) {

        StringBuilder sb = new StringBuilder();

        sb.append("0");

        for (int i = 1; i < n; i++) {

            String si_1 = sb.toString();
            sb.append("1").append(invert(si_1));
        }

        return sb.charAt(k - 1);

    }

    public StringBuilder invert(String si_1) {

        StringBuilder sb1 = new StringBuilder();

        for (int i = 0; i < si_1.length(); i++) {
            if (si_1.charAt(i) == '1') {
                sb1.append("0");
            } else {
                sb1.append("1");
            }
        }

        return sb1.reverse();
    }

    public static void main(String[] args) {
        FindKthBitInNthString f = new FindKthBitInNthString();
        System.out.println(f.findKthBit(4, 11));

    }
}
