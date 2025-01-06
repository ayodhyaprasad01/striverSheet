public class StringCompressor {
    public static String compress(String str) {

        if (str == null || str.length() == 0) {
            return str;
        }
        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 0; i < str.length(); i++) {
            if (i+1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                compressed.append(str.charAt(i));
                compressed.append(count);
                count = 1;
            } else {
                count++;
            }
        }
        return compressed.toString();
    }

    public static void main(String[] args) {
        System.out.println(compress("aabcccccaaa")); // "a2b1c5

    }

}
