package collection.objAsKey;

import java.util.HashMap;
import java.util.Map;

public class TestClass {

	public static void main(String[] args) {
//mandatorily override equals & hashcode 
		Employee e1 = new Employee(1,"Prateek");
		Employee e2 = new Employee(1, "Prateek");
		
		Map map = new HashMap<>();
		map.put(e1, e1.getName());
		map.put(e2, e2.getName());
		System.out.println(map.size());
		
		
	}

}
