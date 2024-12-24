public class SwapTwoNumersWithThirdV {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        System.out.println("Before swapping");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        a = a + c - b;
        b = a - c + b;
        a = a - b + c;
        System.out.println("After swapping");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
