public class BmanupUsingForL {

    void bitManipulation(int num, int i) {
        int r=0;
        int x = num;

        for (int j = 1; j <= i; j++) {
            r = x % 2;
            x = x / 2;

        }

        System.out.print(r + " ");

        if (r == 1) {
            System.out.print(num + " ");
            int p = num - (int) Math.pow(2, (i - 1));
            System.out.print(p);
        } else {
            int s = num + (int) Math.pow(2, (i - 1));
            System.out.print(s + " ");
            System.out.print(num);
        }
    }

    public static void main(String[] args) {

        BmanupUsingForL bt = new BmanupUsingForL();

        bt.bitManipulation(70, 3);
    }
}
