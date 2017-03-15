package clone;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CloneDemo {
	public static <V, K> void main(String[] args) {
		TestClone1 t1 = new TestClone1();
		TestClone1 t2 = null;
		TestClone1 t3 = null;
		
		t1.a = "Prateek";
		t1.b = 773;
		//Deep Cloning where 
		t2 = t1.cloneTest();
		t3=t1;
		
		System.out.println("---Before value changes in main object---");
		System.out.println("obj t1 :"+t1.a+" "+t1.b);
		System.out.println("obj t2 :"+t2.a+" "+t2.b);
		System.out.println("obj t3 :"+t3.a+" "+t3.b);
		
		System.out.println(t1.equals(t2));
		
		Set hSet = new HashSet();
		hSet.add(t1);
		hSet.add(t2);
		hSet.add(t3);
		System.out.println("hSet:"+hSet);
		System.out.println(t1.hashCode()+"  "+t2.hashCode()+"  "+t3.hashCode());
		
		t1.a = "Chandana";
		System.out.println("---After value changes in main object---");
		System.out.println("obj t1 :"+t1.a+" "+t1.b);
		System.out.println("obj t2 :"+t2.a+" "+t2.b);
		System.out.println("obj t3 :"+t3.a+" "+t3.b);
		
	}

}
