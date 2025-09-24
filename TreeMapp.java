import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;
import java.util.Map;

public class TreeMapp {
    public static void main(String[] args) {
        // Map<Integer, TreeMap<Integer, Integer>> map2 = new TreeMap<>();

        TreeMap<Integer, Integer> innerMap = new TreeMap<>();
        innerMap.put(20, 1);
        innerMap.put(30, 2);
        innerMap.put(200, 3);
        innerMap.put(10, 4);
        innerMap.put(2, 5);
        innerMap.put(3, 6);
        // map2.put(2, innerMap);

        // System.out.println("TreeMap (sorted by keys): " + map2);
        List<Integer> list = new ArrayList<>(innerMap.values());
        System.out.println("TreeMap (sorted by keys): " + list);
    }
}
