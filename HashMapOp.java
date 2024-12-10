import java.util.HashMap;

public class HashMapOp {
    public int takeCharacters(String s, int k) {

        HashMap<Character, Integer> map = new HashMap<>();
        int i = 1;

        for (char c : s.toCharArray()) {
            i++;
            if (!map.isEmpty() && map.getOrDefault(c, 0) < 2) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
            else{

                map.put(c, i);
            }
        }
        System.out.println(map);

        return 0;
    }

    public static void main(String[] args) {
        HashMapOp op = new HashMapOp();
        System.out.println(op.takeCharacters("havefun2witheveryone", 2));

    }
}
