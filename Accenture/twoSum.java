import java.util.Map;
import java.util.HashMap;

public class twoSum{
    public static void main(String args[]){
        int []arr={7,11,15,2};
        int target=9;
        Map<Integer,Integer>map=new HashMap<>();

        map.put(arr[0],0);

        for(int i=0;i<arr.length;i++){
            int diff=target-arr[i];
            if(map.containsKey(diff)){
                System.out.println(map.get(diff)+"  Second   "+i);
            }
            map.put(arr[i],i);
        }
    }
}