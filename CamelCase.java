// public class CamelCase {

//     public String camelCase(String str) {
//         StringBuilder sb = new StringBuilder();
//         boolean flag = true;
//         boolean newWord = true;
//         String[] strw = new String[str.length()];

//         for (int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);

//             if (Character.isLowerCase(ch)) {
//                 newWord = true;
//                 sb.append(Character.toUpperCase(ch));
//             } else {
//                 newWord = flag;
//                 sb.append(Character.toLowerCase(ch));
//             }

//             if (newWord == false) {
//                 strw[i] = toString(ch);
//             }
//         }
//         return sb.toString();
//     }

//     public static void main(String[] args) {
//         CamelCase cc = new CamelCase();
//         System.out.println(cc.camelCase("oneTwoThree"));
//     }
// }

public class CamelCase {

    // public String camelCase(String str) {
    // StringBuilder sb = new StringBuilder();
    // boolean flag = true;

    // for (int i = 0; i < str.length(); i++) {
    // char ch = str.charAt(i);

    // if (Character.isLowerCase(ch)) {
    // sb.append(Character.toUpperCase(ch));
    // } else {
    // sb.append(Character.toLowerCase(ch));
    // }
    // }

    // return sb.toString();
    // }

    public static void main(String[] args) {
        // CamelCase cc = new CamelCase();
        String input = "oneTwoThree";

        // Print each word in a new line with the first letter lowercase and the rest
        // uppercase
        String[] words = input.split("(?=[A-Z])"); // Split at uppercase letters

        for (int i = 0; i < words.length; i++) {
            if (i == 0) {
                System.out.println(words[i].toUpperCase());
            } else {

                System.out.println(words[i].substring(0, 1).toLowerCase() +
                        words[i].substring(1).toUpperCase());
            }
        }
       
    }
}

// public class CamelCase {

// public String camelCase(String str) {
// StringBuilder sb = new StringBuilder();
// boolean newWord = true;

// for (int i = 0; i < str.length(); i++) {
// char ch = str.charAt(i);

// if (Character.isUpperCase(ch)) {
// sb.append("\n"); // Add a newline to start a new word
// newWord = true; // Reset flag for new word
// }

// if (newWord) {
// sb.append(Character.toUpperCase(ch)); // First letter of the word in
// lowercase
// newWord = true;
// } else {
// sb.append(Character.toUpperCase(ch)); // Rest of the word in uppercase
// }
// }
// return sb.toString().trim(); // Trim to remove any leading newline
// }

// public static void main(String[] args) {
// CamelCase cc = new CamelCase();
// System.out.println(cc.camelCase("oneTwoThree"));
// }
// }
