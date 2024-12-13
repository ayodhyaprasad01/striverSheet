import java.util.Arrays;

public class ArraysDefaultValues {
    public static void main(String[] args) {
        int[] intArray = new int[5];
        boolean barr[] = new boolean[5];
        Arrays.fill(barr, true);

        System.out.println("intArray: " + Arrays.toString(intArray)); // [0,
        System.out.println("intArray: " + Arrays.toString(barr)); // [0,
        // 0, 0, 0, 0]
        System.out.println("intArray[0]: " + intArray[0]); // 0
        System.out.println("intArray[0]: " + barr[0]); // 0
    }
}
