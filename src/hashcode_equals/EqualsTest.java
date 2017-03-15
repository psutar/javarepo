package hashcode_equals;

import java.util.HashSet;
import java.util.Set;

public class EqualsTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Employee e1 = new Employee();
	     Employee e2 = new Employee();
	 
	        e1.setId(100);
	        e2.setId(100);
	 
	        //Prints false in console if equals method is not overriden
	        //Prints true in the console if equals method is overriden
	        System.out.println(e1.equals(e2));
	        Set<Employee> set = new HashSet<Employee>();
	        
	        //Adds both the object even if they are same if hashcode method is not overriden
	        //Adds one object if hash code method is overriden
	        set.add(e1);
	        set.add(e2);
	        System.out.println("set :"+set);
	}

}
