import java.util.Arrays;

class Mapp {
    public boolean checkInclusion(String s1, String s2) {
        String x = s1;
        String y = s2;

        if (x.length() > y.length()) {
            return false;
        }

        int[] xFreq = new int[26];
        int[] windowFreq = new int[26];

        for (int i = 0; i < x.length(); i++) {
            xFreq[x.charAt(i) - 'a']++;
            windowFreq[y.charAt(i) - 'a']++;
        }

        for (int i = 0; i <= y.length() - x.length(); i++) {
            if (Arrays.equals(xFreq, windowFreq)) {
                return true;
            }

            if (i + x.length() < y.length()) {
                windowFreq[y.charAt(i) - 'a']--;
                windowFreq[y.charAt(i + x.length()) - 'a']++;
            }
        }

        return Arrays.equals(xFreq, windowFreq);
    }

    public static void main(String[] args) {
        Mapp mapp = new Mapp();
        System.out.println(mapp.checkInclusion("ab", "eidbaooo")); // true
        System.out.println(mapp.checkInclusion("ab", "eidboaoo")); // false
        int a = 3, b = 4;
        // System.out.println(a || b);
        for (int i = 0; (i < a) || (i < b); i++) {
            String s = "hello hey";
            String[] arg = s.split(" ");
            System.out.println(arg[1]);
        }

        // char ab = 'a';
        // char ba = 'b';
        // System.out.println(ab + ba);

        // String s = "Hello the";
        // StringBuilder sb = new StringBuilder(s);

        // System.out.println((sb.charAt(0) + sb.charAt(1)));

        // StringBuilder stb = new StringBuilder();
        char ch1 = 't';
        char ch2 = 'c';
        // String sts = stb.append(ch1).append(ch2).toString();
        // System.out.println(sts.equals("tc"));

        // StringBuilder sb = new StringBuilder("Hello World");
        // int length = sb.length();

        // System.out.println(sb);
        // sb.delete(0, 1);

        // System.out.println(sb);

        // String sts = new String("AB");
        String sts="AB";

        if (sts == "AB" || sts == "CD") {

            System.out.println("True");
        } else {
            System.out.println("False");
        }

        // StringBuilder stb = new StringBuilder();
        // String sts = stb.append(ch1).append(ch2).toString();

        // if (sts == "AB" || sts == "CD") {
        // System.out.println("true");
        // } else {
        // System.out.println("Fal");
        // }
    }
}
