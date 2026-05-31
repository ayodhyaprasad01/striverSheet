import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Test1 {

    public static void main(String[] args) {

        int arr[] = { 7, 11, 15, 2 };// 9
        int target = 9;
        Map<Integer, Integer> set = new HashMap<>();
        set.put(arr[0], 0);

        for (int i = 1; i < arr.length; i++) {
            int diff = target - arr[i];
            if (set.containsKey(diff)) {
                System.out.println(i + "  Second   " + set.get(diff));
            }

            set.put(arr[i], i);
        }
    }
}
