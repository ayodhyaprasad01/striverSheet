import java.util.*;
import java.util.Map.Entry;

public class CountFregOfArrays {
    public static void countFreg(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1); // Corrected this line
            } else {
                map.put(arr[i], 1);
            }
        }

        for (Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 3, 3, 4, 4, 4, 4 };
        countFreg(arr);
    }
}
