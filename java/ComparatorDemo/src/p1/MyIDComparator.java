package p1;

import java.util.Comparator;

public class MyIDComparator implements Comparator <Employee>{

	public int compare(Employee o1, Employee o2) {
		return o1.id-o2.id;
	}

}
