public class MergeSort {

    void mergeSort(int a[], int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(a, start, mid);
            mergeSort(a, mid + 1, end);
            merge(a, start, mid, end);
        }
    }

    void merge(int a[], int start, int mid, int end) {
        int i = start;
        int j = mid + 1;
        int k = 0;
        int[] temp = new int[end - start + 1];

        while (i <= mid && j <= end) {
            if (a[i] < a[j]) {
                temp[k++] = a[i++];
            }
            else {
                temp[k++] = a[j++];
            }
        }

        // Copy remaining elements of left subarray, if any
        while (i <= mid) {
            temp[k++] = a[i++];
        }
        // If there are remaining elements in the right half
        while (j <= end) {
            temp[k++] = a[j++];
        }

        // Copy sorted temp back into original array
        for (int m = 0; m < temp.length; m++) {
            a[start + m] = temp[m];
        }
    }

    public static void main(String[] args) {
        MergeSort ms = new MergeSort();
        int[] arr = { 12, 12, 13, 5, 6, 7 };
        System.out.println("Given array is");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        ms.mergeSort(arr, 0, arr.length - 1);

        System.out.println("\nSorted array is");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

}
