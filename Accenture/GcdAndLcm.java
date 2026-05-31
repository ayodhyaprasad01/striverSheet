import java.math.BigInteger;

public class GcdAndLcm {
    public static void main(String[] args) {
        int a = 12;
        int b = 18;
        int res = BigInteger.valueOf(b).gcd(BigInteger.valueOf(a)).intValue();
        System.out.println("GcdAndLcm = " + res);
    }
}
// GcdAndLcm obj = new GcdAndLcm();
// int a = 12;
// int b = 18;
// int gcdValue = obj.gcd(a, b);
// int lcmValue = (a * b) / gcdValue;

// System.out.println("GCD of " + a + " and " + b + " is: " + gcdValue);
// System.out.println("LCM of " + a + " and " + b + " is: " + lcmValue);

// int gcd(int a, int b) {
// while (b != 0) {
// int t = b;
// b = a % b;
// a = t;
// }
// return a;
// }
