package comparatorDemo;

import java.util.Comparator;

public class LastNameSorter implements Comparator<Name> {

	@Override
	public int compare(Name o1, Name o2) {
		// TODO Auto-generated method stub
		return o1.getLastName().compareTo(o2.getLastName());
	}

}
