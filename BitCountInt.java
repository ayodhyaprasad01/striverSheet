import java.util.HashMap;

public class BitCountInt {
    // Main method
    public static void main(String[] args) {

        // create a HashMap and add some values
        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 10000);
        map.put("e", 53200);
        map.put("b", 55000);
        map.put("c", 44300);

        // print original map
        System.out.println("HashMap:\n " + map.toString());

        // put a new value which is not mapped
        // before in map
        map.putIfAbsent("z", 77633);

        System.out.println("New HashMap:\n " + map);
        map.put("z", 77634743);

        // try to put a new value with existing key
        // before in map

        // print newly mapped map
        System.out.println("Unchanged HashMap:\n " + map);
    }
}
