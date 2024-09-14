import java.util.ArrayList;

class Sort0s1s2s {
    // Function to sort an array of 0s, 1s, and 2s
    public void sort012(ArrayList<Integer> arr) {
        int low = 0, mid = 0, high = arr.size() - 1;

        while (mid <= high) {
            if (arr.get(mid) == 0) {
                // Swap arr[low] and arr[mid]
                swap(arr, low, mid);
                low++;
                mid++;
            } else if (arr.get(mid) == 1) {
                // Move mid forward
                mid++;
            } else {
                // Swap arr[mid] and arr[high]
                swap(arr, mid, high);
                high--;
            }
        }
    }

    // Helper function to swap two elements in an ArrayList
    private void swap(ArrayList<Integer> arr, int i, int j) {
        int temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, temp);
    }

    public static void main(String[] args) {
        Sort0s1s2s sol = new Sort0s1s2s();

        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(0);
        arr1.add(2);
        arr1.add(1);
        arr1.add(2);
        arr1.add(0);
        sol.sort012(arr1);
        System.out.println(arr1); // Output: [0, 0, 1, 2, 2]

        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(0);
        arr2.add(1);
        arr2.add(0);
        sol.sort012(arr2);
        System.out.println(arr2); // Output: [0, 0, 1]
    }
}