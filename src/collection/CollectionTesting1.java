package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionTesting1 {

	/**
	 * sort and frequency function tested
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List list = new ArrayList<String>();
		
		list.add(12L);
		list.add(13L);
		list.add(11L);
		
		System.out.println("List :"+list);
		
		Collections.sort(list);
		
		
		
		System.out.println("List after sort:"+list);
		
		System.out.println("Frequency of object inside list :"+Collections.frequency(list, 12L));
	}

}
