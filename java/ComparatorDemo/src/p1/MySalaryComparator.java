package p1;

import java.util.Comparator;

public class MySalaryComparator implements Comparator
{
	public int compare(Object o1, Object o2) {
		Employee e1= (Employee)o1;
		Employee e2= (Employee)o2;
		
		return (int) (e1.salary-e2.salary);
	}

	
}
