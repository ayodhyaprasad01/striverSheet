public class SumOfNDivisible {
    int differenceofSum(int n, int m) {
        int divisibleByN = 0;
        int notDivisibleByN = 0;

        for (int i = 1; i <= m; i++) {
            if (i % n == 0) {
                divisibleByN += i;
            } else {
                notDivisibleByN += i;
            }
        }

        return Math.abs(divisibleByN - notDivisibleByN);
    }

    public static void main(String[] args) {
        SumOfNDivisible sd = new SumOfNDivisible();
        int n = 3;
        int m = 10;
        System.out.println(sd.differenceofSum(n, m));
    }
}
