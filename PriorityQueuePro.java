import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueuePro {

    public static int[] smallestRange(List<List<Integer>> nums) {
        // Edge case: if the input has no lists or any empty list
        if (nums == null || nums.size() == 0)
            return new int[] {};
        for (List<Integer> list : nums) {
            if (list == null || list.size() == 0)
                return new int[] {};
        }

        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        int currentMax = Integer.MIN_VALUE;

        // Initialize the heap with the first element of each list
        for (int i = 0; i < nums.size(); i++) {
            int num = nums.get(i).get(0);
            minHeap.offer(new int[] { num, i, 0 });
            currentMax = Math.max(currentMax, num);
        }

        // Set initial best range to the maximum possible values
        int[] bestRange = { minHeap.peek()[0], currentMax };

        // Process the elements from the min heap and keep track of the range
        while (minHeap.size() == nums.size()) {
            int[] minEntry = minHeap.poll();
            int currentMin = minEntry[0], listIndex = minEntry[1], elementIndex = minEntry[2];

            // Update best range if the current range is smaller
            if (currentMax - currentMin < bestRange[1] - bestRange[0]) {
                bestRange[0] = currentMin;
                bestRange[1] = currentMax;
            }

            // If there are more elements in the current list, add the next element to the
            // heap
            if (elementIndex + 1 < nums.get(listIndex).size()) {
                int nextElement = nums.get(listIndex).get(elementIndex + 1);
                minHeap.offer(new int[] { nextElement, listIndex, elementIndex + 1 });
                currentMax = Math.max(currentMax, nextElement); // Update current max
            } else {
                break; // If one of the lists is exhausted, stop the loop
            }
        }

        return bestRange;
    }

    public static void main(String[] args) {
        List<List<Integer>> nums = new ArrayList<>();
        nums.add(Arrays.asList(4, 10, 15, 24, 26));
        nums.add(Arrays.asList(0, 9, 12, 20));
        nums.add(Arrays.asList(5, 18, 22, 30));

        int[] result = smallestRange(nums);
        System.out.println("Smallest range: [" + result[0] + ", " + result[1] + "]");

        // Test case with duplicate numbers
        List<List<Integer>> nums2 = new ArrayList<>();
        nums2.add(Arrays.asList(1, 2, 3));
        nums2.add(Arrays.asList(1, 2, 3));
        nums2.add(Arrays.asList(1, 2, 3));

        result = smallestRange(nums2);
        System.out.println("Smallest range: [" + result[0] + ", " + result[1] + "]");

        // Edge case: single list
        List<List<Integer>> nums3 = new ArrayList<>();
        nums3.add(Arrays.asList(1, 5, 9));

        result = smallestRange(nums3);
        System.out.println("Smallest range: [" + result[0] + ", " + result[1] + "]");
    }
}
