package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionTesting2 {

	/**
	 * added 2 same  list to a set 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List list = new ArrayList<Long>();
		
		list.add(12L);
		list.add(13L);
		list.add(11L);
		
		
		List list1 = new ArrayList<Long>();
		
		list1.add(12L);
		list1.add(13L);
		list1.add(11L);
		
		Set<List<Long>> set = new HashSet<List<Long>>();
		
		set.add(list);
		set.add(list1);
		
		System.out.println(set);
		
	}

}
