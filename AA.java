// public class AA {
//     public static void main(String[] args) {

//         outer: // label
//         for (int i = 0; i < 3; i++) {
//             for (int j = 0; j < 3; j++) {
//                 if (j == 1) {
//                     break outer; // jumps out of OUTER loop
//                 }
//                 System.out.println("i=" + i + ", j=" + j);
//             }
//         }
//         System.out.println("Done!");
//     }
// }

public class AA {
    public static void main(String[] args) {

        outer: for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 1) {
                    continue outer; // skips to next iteration of OUTER loop
                }
                System.out.println("i=" + i + ", j=" + j);
            }
        }
    }
}