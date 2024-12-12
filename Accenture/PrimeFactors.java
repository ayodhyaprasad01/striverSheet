import java.util.ArrayList;

public class PrimeFactors {

    boolean isPrimme(int n) {

        if (n < 2) {
            return false;
        }

        for (int i = 2; i < (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public ArrayList<Integer> primeFactors(int n) {

        int j = 0;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            while (isPrimme(i) && n % i == 0) {
                list.add(i);
                n /= i;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        PrimeFactors pf = new PrimeFactors();
        ArrayList<Integer> ls = pf.primeFactors(48);
        System.out.println(ls);

    }

}
