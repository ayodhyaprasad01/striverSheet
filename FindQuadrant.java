import java.util.Scanner;

public class FindQuadrant {

    public static void main(String[] args) {
        int x;
        int y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  x value and y");
        x = sc.nextInt();
        y = sc.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("First Quadrant ");
        } else if (x < 0 && y > 0) {
            System.out.println("Second Quadrant ");
        } else if (x > 0 && y < 0) {
            System.out.println("Third Quadrant ");
        } else if (x == 0 && y == 0) {
            System.out.println("Origin or not in qurdinat");
        } else {
            System.out.println("Fourth Quadrant ");
        }
    }
}
