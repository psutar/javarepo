package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public class CollectionTesting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String t1="a";
		String t2=new String("a");
		System.out.println(t1.hashCode()+"    "+t2.hashCode());
		
		HashMap random=new HashMap();
		random.put("a", "Prateek");
		random.put(new String("a"),"chandana");
		random.put("1", "Nalini");
		
		System.out.println("without sorting...."+random);
		printMap(random);
		TreeMap sorted=new TreeMap(random);
		System.out.println("after sorting...."+sorted);
		printMap(sorted);
	}
	/*public static void printMap(Map map)
	{
		for(Map.Entry<String,String> entry : map.entrySet())
		System.out.println("key :"+entry.getKey());
	}*/
	
	public static void printMap(Map<String, String> map) {
		for (Map.Entry entry : map.entrySet()) {
			System.out.println("Key : " + entry.getKey() + " Value : "
				+ entry.getValue());
		}
	}
}
