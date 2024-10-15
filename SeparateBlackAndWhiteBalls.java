import java.util.Scanner;

public class SeparateBlackAndWhiteBalls {

    public long minimumSteps(String s) {

        StringBuilder sb = new StringBuilder(s);
        int count = 0;

        for (int i = 0; i < s.length() - 1; i++) {

            char c1 = sb.charAt(i);
            char c2 = sb.charAt(i + 1);

            if (c2 == '0' && c1 == '1') {

                sb.setCharAt(i, '0');
                sb.setCharAt(i + 1, '1');
                count++;
                i = Math.max(-1, i - 2);

            }
        }

        return count;
    }

    public static void main(String[] args) {

        SeparateBlackAndWhiteBalls obj = new SeparateBlackAndWhiteBalls();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(obj.minimumSteps(str)); //

    }
}
