package immutable;

import java.util.ArrayList;
import java.util.List;

public final class Student {
	
	public Student(int id,String name){
		this.id = id;
		this.name = name;
	}

	 private int id;
	 private String name;
	private List subList = new ArrayList<>();
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public List getSubList() {
		subList.add("Maths");
		subList.add("Science");
		subList.add("History");
		// way to handle objects which have mutable methods inside them.Hence the below code 
		//handles the scenario by passing the same object
		return new ArrayList<>(this.subList);
		//return subList;
	} 
	
}
