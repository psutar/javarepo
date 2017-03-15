package spl_cases;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

public class Case3 {
	
	String name;
	int id;
	static Map<Integer,Case3> map = new HashMap<Integer,Case3> ();
	
	public Case3(String name, int id){
		
		this.name = name;
		this.id = id;
	}

	public static void call(int id){
		for (Map.Entry<Integer,Case3> entry : map.entrySet()) {
			//System.out.println(entry.getKey()+" "+id);
			if(entry.getValue().id == id){
				System.out.println(entry.getValue().id+"  "+entry.getValue().name);
				System.exit(0);
			}
			
		}
		System.out.println("Wrong id");
	}
	
	
	
	public static void main(String[] args) {

		Case3 c1 = new Case3("Prateek", 10);
		Case3 c2 = new Case3("Chandana", 20);
		map.put(1,c1);
		map.put(2,c2);
		call(50);
	}

}
