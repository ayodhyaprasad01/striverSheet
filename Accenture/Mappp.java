import java.util.HashMap;
import java.util.Map;

public class Mappp {
    final HashMap<Integer, Integer> map = new HashMap<>();

    public Mappp() {
        map.put(1, 2);
        map.put(2, 3);
    }

    public Mappp(int key, int value) {
        map.put(key, value);
    }

    public static void main(String[] args) {
        // The main method can be used to run the Mapp class if needed
        Mappp m = new Mappp();
        System.out.println("Mapp class initialized with a map.");
        System.out.println(m.map);

        System.out.println("Mapp class initialized with a map.");
        System.out.println(m.map);
    }
}
