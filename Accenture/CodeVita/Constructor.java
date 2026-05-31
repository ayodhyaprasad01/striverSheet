public class Constructor {
    static int n;

    Constructor(int size) {
        n = size;
    }

    public static void main(String[] args) {
        Constructor obj = new Constructor();
        // Constructor obj = new Constructor(10);
        System.out.println("Constructor class instantiated." + n);
    }

}
