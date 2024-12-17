import java.util.Scanner;

public class Permutations {

    public static int permutations(int n, int r) {
        int res = fact(n) / (fact(n - r));
        return res;

    }

    public static int fact(int i) {
        int fact = 1;
        for (int j = 1; j <= i; j++) {
            fact = fact * j;

        }
        return fact;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        System.out.println(Permutations.permutations(n, r));

    }
}
