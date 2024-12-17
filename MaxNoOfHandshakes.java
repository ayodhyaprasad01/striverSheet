public class MaxNoOfHandshakes {

    public static int maxNoOfHandshakes(int n) {
        int maxNoOfHandshakes = 0;
        maxNoOfHandshakes = (fact(n) / (fact(2) * fact(n - 2)));
        return maxNoOfHandshakes;
    }

    public static int fact(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        
        System.out.println(maxNoOfHandshakes(5));

    }
}
