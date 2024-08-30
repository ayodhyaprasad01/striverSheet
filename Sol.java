import java.util.Scanner;

public class Sol {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int flipedbit = 0;
        int i = 1;
        boolean flag = false;
        while (i <= 32) {

            flipedbit = n;
            flipedbit = flipedbit | (1 << i);
            i++;

            if (flipedbit % k == 0) {
                System.out.println(i);
                flag = true;
                break;
            }

        }
        if (!flag) {
            System.out.println(-1);
        }
    }

}
