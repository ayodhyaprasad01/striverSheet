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

    }
}