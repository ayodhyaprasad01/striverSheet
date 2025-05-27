public class FirstOccUsingRecursion {
    int firstOcc(int arr[], int size, int value) {
        // Base case: if size is less than 0, return -1 (not found)
        if (size >= arr.length) {
            return -1;
        }

        if (arr[size] == value) {
            return size;

        }
        return firstOcc(arr, size - 1, value);

    }

    public static void main(String[] args) {
        FirstOccUsingRecursion finder = new FirstOccUsingRecursion();
        int[] arr = { 1, 3, 31, 4, 5, 13, 6, 9, 13, 8, 3 };
        int value = 3;
        int size = arr.length - 1;
        int result = finder.firstOcc(arr, size, value);
        System.out.println("First occurrence of " + value + " is at index: " + result);
    }
}
