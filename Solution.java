public class Solution {

    String reverseWords(String s) {

        s = s.trim();
        String[] words = s.split("\\s+");

        StringBuilder sb = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {

            sb.append(words[i]).append(" ");

            // if (i > 0) {
            // sb.append(" ");
            // }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s1 = "the sky is blue";
        System.out.println(solution.reverseWords(s1));
    }
}