package spl_cases;

import java.util.HashMap;
import java.util.Map;

public class Case2 {
	public static void main(String[] args) {
		/*Integer a = 100;
		Integer b = 100;
		
		System.out.println(a==b);
		System.out.println(a.equals(b));
		
		int c = 1000;
		int d = 1000;
		
		System.out.println(c==d);
		
		System.out.println(Integer.MAX_VALUE);
*/
		
	
	Map map = new HashMap<>();
	
	Student s1 = new Student();
	s1.setId(1);
	s1.setName("Prateek");
	
	Student s2 = new Student();
	s2.setId(2);
	s2.setName("Chandana");
	
	map.put(s1, s1.getName());
	map.put(s2, s2.getName());
	
	s1.setId(5);
	System.out.println(map.get(s1));
	
	
	
	
	}

}
