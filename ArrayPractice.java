public class ArrayPractice {
    public static void main(String[] args) {
        // int a = 1, b = 2, c = 10;
        String s = "abcdefghijklmnopqrstuvwxyz";

        int[] freC = new int[26];

        for (char c : s.toCharArray()) {
            freC[c - 'a']++;
        }
        
        for (int i = 0; i < 26; i++) {
            System.out.println("Letter " + (char) ('a' + i) + " appears" + freC[i] + " times");
        }

    }

}
