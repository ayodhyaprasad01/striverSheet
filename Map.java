import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Map {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };

        int me1 = -1;
        int c1 = 0;
        int me2 = -1;
        int c2 = 0;

        for (int i : arr) {

            if (me1 == i) {
                c1++;
            } else if (me2 == i) {
                c2++;
            } else if (c1 == 0) {
                me1 = i;
                c1++;
            } else if (c2 == 0) {
                me2 = i;
                c2++;
            } else {
                c1--;
                c2--;
            }
        }

        c1 = 0;
        c2 = 0;
        for (int i : arr) {

            if (me1 == i) {
                c1++;
            } else if (me2 == i) {
                c2++;
            }

        }

        ArrayList<Integer> result = new ArrayList<>();

        if (c1 > arr.length / 3) {
            result.add(me1);
        }
        if (c2 > arr.length / 3) {
            result.add(me2);
        }

        if (result.isEmpty()) {
            result.add(-1);
        } else {
            Collections.sort(result);
        }

        for (Integer integer : result) {

            System.out.println(integer);

        }

    }

    public class Entry<T1, T2> {
    }

}