public class PowerOf5 {
    public boolean checkPowersOfFive(int n) {
        while (n > 0) {
            if (n % 5 == 4) { // If remainder is 4, it's not a sum of distinct powers of 5
                return false;
            }
            n /= 5; // Reduce n by dividing by 5
        }
        return true; // If we never get remainder 4, it's valid
    }

    public static void main(String[] args) {
        PowerOf5 powerOf5 = new PowerOf5();
        System.out.println(powerOf5.checkPowersOfFive(25)); // true
        System.out.println(powerOf5.checkPowersOfFive(20)); // false
        System.out.println(powerOf5.checkPowersOfFive(91)); // false

    }
}