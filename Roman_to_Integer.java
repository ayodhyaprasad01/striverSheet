public class Roman_to_Integer {

    public static void main(String[] args) {
        Roman_to_Integer con = new Roman_to_Integer();
        int summision = con.romanToInt("MCMXCIV");  // Example input
        System.out.println(summision);  // Should print 1994
    }

    public int romanToInt(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            // Get the current character and its corresponding value
            char current = s.charAt(i);
            int currentValue = getRomanValue(current);

            // If this is not the last character, check the next one for subtraction cases
            if (i + 1 < s.length()) {
                int nextValue = getRomanValue(s.charAt(i + 1));
                if (currentValue < nextValue) {
                    // Subtraction case (e.g., IV = 4, IX = 9, etc.)
                    sum += (nextValue - currentValue);
                    i++; // Skip the next character as it's already processed
                } else {
                    sum += currentValue;
                }
            } else {
                sum += currentValue; // Add the value of the last character
            }
        }
        return sum;
    }

    // Helper method to get integer value of a Roman numeral character
    private int getRomanValue(char ch) {
        switch (ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0; // This should never happen due to valid input constraint
        }
    }
}
