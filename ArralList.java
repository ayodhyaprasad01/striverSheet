import java.util.ArrayList;
import java.util.Collection;

public class ArralList {
    public static void main(String[] args) {
        Collection collection1 = new ArrayList();
        collection1.add("AAA");
        collection1.add("BBB");
        collection1.add("CCC");
        collection1.add("DDD");
        collection1.add("EEE");
        collection1.add("FFF");
        System.out.println(collection1);

        // Object[] objArray = collection1.toArray();

        // for (Object obj : objArray) {
        // System.out.println(obj);
        // }

        for (Object collection : collection1) {
            System.out.println(collection);
        }
    }
}
