public class OddEven {
    static String oddEven(int n) {
        // code here
        // int i=1;
        if (((n > 1) && ((n & 1)) == n)) {
            return "even";
        } else {
            return "odd";
        }
    }

    public static void main(String[] args) {
        // OddEven od=new OddEven();
        System.out.println(OddEven.oddEven(2));
        
    }
}