import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int k = sc.nextInt();
        HashSet<Integer> f = new HashSet<>();
        for (int i = 0; i < k; i++)
            f.add(sc.nextInt() - 1);

        int ca = 0, cb = 0, cc = 0;
        for (char ch : s.toCharArray()) {
            if (ch == 'A')
                ca++;
            else if (ch == 'B')
                cb++;
            else
                cc++;
        }
        // expected positions
        int aL = 0, aR = ca - 1, bL = ca, bR = ca + cb - 1, cL = ca + cb, cR = n - 1;

        char[] arr = s.toCharArray();
        for (int i = 0; i < n; i++) {
            if (f.contains(i)) {
                char c = arr[i];
                if (c == 'A' && (i < aL || i > aR)) {
                    System.out.println("Impossible");
                    return;
                }
                if (c == 'B' && (i < bL || i > bR)) {
                    System.out.println("Impossible");
                    return;
                }
                if (c == 'C' && (i < cL || i > cR)) {
                    System.out.println("Impossible");
                    return;
                }
            }
        }
        // count misplaced ones
        int misA = 0, misB = 0, misC = 0;
        for (int i = 0; i < n; i++) {
            char c = arr[i];
            if (c == 'A' && (i < aL || i > aR))
                misA++;
            else if (c == 'B' && (i < bL || i > bR))
                misB++;
            else if (c == 'C' && (i < cL || i > cR))
                misC++;
        }
        int ans = misA + misB + misC;
        System.out.println(ans);
    }
}
