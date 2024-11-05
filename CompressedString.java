public class CompressedString {
    public String compressedString(String word) {

        StringBuilder sb = new StringBuilder();
        char ch = word.charAt(0);
        int count = 1;

        for (int i = 1; i < word.length(); i++) {

            if (ch == word.charAt(i)) {
                count++;
                if (count == 9) {
                    sb.append(count).append(ch);
                    count = 0;
                }
            } 
            else {
                if (count > 0) {
                    sb.append(count).append(ch);
                }
                ch = word.charAt(i);
                count = 1;

            }

        }

        if (count > 0) {
            sb.append(count).append(ch);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        CompressedString cpmstr = new CompressedString();

        System.out.println(cpmstr.compressedString("aaaaaaaaaaaaaabb"));
    }
}
