public class Mistyped {
    public int possibleStringCount(String word) {
        int n = word.length();
        int i = 0;
        int count = 1;

        while (i < n) {
            int j = i;
            while (j < n && word.charAt(j) == word.charAt(i)) {
                j++;
            }
            int llen = j - i;
            if (llen > 1) {
                count += llen - 1;
            }
            i = j;
        }
        return count;
    }

    public static void main(String[] args) {
        Mistyped mistyped = new Mistyped();
        String word = "aaabbc";
        int result = mistyped.possibleStringCount(word);
        System.out.println("Possible string count for '" + word + "': " + result);
        
    }
}
