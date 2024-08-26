public class PowerOf2 {

    public static boolean isPowerOfTwo(int n) {

        return (n > 0) && ((n & (n - 1)) == 0);

    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {

            System.out.println(PowerOf2.isPowerOfTwo(i));
        }
        System.out.println(3 & (3 - 1));
    }
}
