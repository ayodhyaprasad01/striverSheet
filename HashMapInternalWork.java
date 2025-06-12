import java.util.HashMap;
class HashMapInternalWork 
{
	public static void main(String[] args) 
	{
		HashMap<String,Integer>map=new HashMap<>();

		map.put("Hello",10);
		map.put("Hello",1);

		System.out.println(map);

	}
}
