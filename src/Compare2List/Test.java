package Compare2List;

import java.util.ArrayList;
import java.util.List;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List a = new ArrayList();
		a.add(1);
		a.add(2);
		a.add(3);
		
		List b = new ArrayList();
		b.add(3);
		b.add(4);
		b.add(5);
		
		List temp = new ArrayList(a);
		
		System.out.println("a :"+a+"\n");
		System.out.println("b :"+b+"\n");
		System.out.println("temp :"+temp+"\n");
		
		temp.retainAll(b);
		System.out.println("temp retainAll:"+temp+"\n");
	}

}
