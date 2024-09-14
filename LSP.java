class LSP {

    public int lengthOfLongestSubstring(String s) {
        int[] index = new int[128]; // ASCII table size
        int maxLength = 0;
        int i = 0; // Left boundary of the sliding window

        for (int j = 0; j < s.length(); j++) {
            char currentChar = s.charAt(j);

            // Update i to the max of its current position and the last seen position of
            // currentChar
            i = Math.max(index[currentChar], i);

            // Calculate the length of the current window
            maxLength = Math.max(maxLength, j - i + 1);

            // Update the index of the current character to the next position (j + 1)
            index[currentChar] = j + 1;
        }

        return maxLength;
    }

    public static void main(String[] args) {
        LSP lps = new LSP();
        System.out.println(lps.lengthOfLongestSubstring("pwwkew")); // Output:

    }
}
