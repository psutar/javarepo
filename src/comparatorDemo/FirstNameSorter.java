package comparatorDemo;

import java.util.Comparator;

public class FirstNameSorter implements Comparator<Name> {

	@Override
	public int compare(Name o1, Name o2) {
		System.out.println(o1.getFirstName().compareTo(o2.getFirstName()));
		return o1.getFirstName().compareTo(o2.getFirstName());
	}

}
