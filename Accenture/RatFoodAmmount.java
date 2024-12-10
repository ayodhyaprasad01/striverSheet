import java.util.Scanner;

public class RatFoodAmmount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter r values");
        int r = sc.nextInt();

        System.out.println("unit value");
        int unit = sc.nextInt();

        System.out.println("Enrter n values ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enrter arr values ");
        for (int i = 0; i < arr.length; i++) {

            arr[i] = sc.nextInt();
        }

        System.out.println(rat(r, unit, n, arr));

    }

    public static int rat(int r, int unit, int n, int arr[]) {

        int requiredFood = r * unit;
        int totalFood = 0;

        for (int i = 0; i < arr.length; i++) {

            if (totalFood >= requiredFood) {
                System.out.println("Answer");
                return i;
            }
            totalFood += arr[i];
        }
        return 0;
    }
}