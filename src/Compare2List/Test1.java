package Compare2List;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassA a1=new ClassA();
		a1.setId(1L);
		a1.setName("name 1L");
		ClassA a2=new ClassA();
		a2.setId(2L);
		a2.setName("name 2L");
		ClassA a3=new ClassA();
		a3.setId(3L);
		a3.setName("name 3L");
		
		ClassA a4=new ClassA();
		a4.setId(4L);
		a4.setName("name 4L");
		ClassA a5=new ClassA();
		a5.setId(2L);
		a5.setName("name 2L");
		ClassA a6=new ClassA();
		a6.setId(6L);
		a6.setName("name 6L");
		
		List<ClassA> list1 = new ArrayList<ClassA>();
		list1.add(a1);
		list1.add(a2);
		list1.add(a3);
		
		List<ClassA> list2 = new ArrayList<ClassA>();
		list2.add(a4);
		list2.add(a5);
		list2.add(a6);
		
		//list1.retainAll(list2);
		
		System.out.println("list1:"+list1+" \n list2"+list2);
		
		
	}

}
