import java.util.*;
import javafx.util.Pair;

public class Chef {
    public static void main(String[] args) {
        int start[] = { 9, 20, 2, 3, 4 };
        int end[] = { 10, 30, 3, 4, 5 };
        int n = 5;
        List<Pair<Integer, Integer>> arr = new ArrayList<Pair<Integer, Integer>>();
        
        for (int i = 0; i < n; i++)
            arr.add(new Pair<Integer, Integer>(start[i], end[i]));
        Collections.sort(arr,(a, b) -> a.getKey() == b.getKey() ? a.getValue() - b.getValue() : a.getKey() - b.getKey());
        System.out.println("Time of worker arrival");

        for (int i = 0; i < n; i++)
            System.out.println(arr.get(i).getKey() + " " + arr.get(i).getValue());
        int ArrivalTime = 8, time = arr.get(0).getKey(), i = 0, ans = -1;
        System.out.print("For Arrival at " + ArrivalTime + " Need to wait ");

        while (ArrivalTime > time && i < n) {
            i++;
            time = arr.get(i).getKey();
        }

        if (ArrivalTime > time) {
            System.out.print(ans);
        } 
        else if (arr.get(i - 1).getValue() > ArrivalTime)
            System.out.print(0);
        else
            System.out.print(time - ArrivalTime);
        System.out.println(" hours.");
    }
}