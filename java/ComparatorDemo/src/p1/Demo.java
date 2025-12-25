package p1;

import java.util.*;

public class Demo {

	public static void main(String[] args) {
		
		System.out.println("hash set ke sath kaam kar rahe hai");
		HashSet<Employee> a1=new HashSet<Employee>();
		a1.add(new Employee(10,"Sachin",20000));
		a1.add(new Employee(18,"Virat",25000));
		a1.add(new Employee(12,"Yuvi",25000));
		a1.add(new Employee(5,"Rahul",25000));
		System.out.println(a1);	
		if(a1.contains(new Employee(18,"Virat",25000) ))
		{
			System.out.println("Found");
		}
		else
		{
			System.out.println("Not Found");
		}
	}
	public static void main2(String[] args) {
		
		TreeSet<Employee> a1=new TreeSet<Employee>();
		a1.add(new Employee(10,"Sachin",20000));
		a1.add(new Employee(18,"Virat",25000));
		a1.add(new Employee(12,"Yuvi",25000));
		a1.add(new Employee(5,"Rahul",25000));
		
		if(a1.contains(new Employee(18,"Virat",25000) ))
		{
			System.out.println("Found");
		}
		else
		{
			System.out.println("Not Found");
		}

	}
	
	public static void main1(String[] args) {
		ArrayList<Employee> a1=new ArrayList<Employee>();
		a1.add(new Employee(10,"Sachin",20000));
		a1.add(new Employee(18,"Virat",25000));
		a1.add(new Employee(12,"Yuvi",25000));
		a1.add(new Employee(5,"Rahul",25000));
		
		if(a1.contains(new Employee(18,"Virat",25000) ))
		{
			System.out.println("Found");
		}
		else
		{
			System.out.println("Not Found");
		}	
	}

}
