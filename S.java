class S {
    public char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length;
        int left = 0;
        int right = n - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (letters[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return letters[left % n];
    }

    public static void main(String[] args) {
        S s = new S();
        char[] letters = { 'c', 'f', 'j' };
        char target = 'a';
        System.out.println(s.nextGreatestLetter(letters, target)); // Output: 'c'

    }
}