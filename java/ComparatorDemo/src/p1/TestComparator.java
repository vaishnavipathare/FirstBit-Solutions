package p1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;
import java.util.Collections;

public class TestComparator {

//	public static void main(String[] args) {
//		ArrayList<Employee> a1=new ArrayList<Employee>();
//		a1.add(new Employee(10,"Sachin",20000));
//		a1.add(new Employee(18,"Virat",25000));
//		a1.add(new Employee(12,"Yuvi",25000));
//		a1.add(new Employee(5,"Rahul",25000));
//		
//		MySalaryComparator msc= new MySalaryComparator();
//		Collections.sort(a1, msc);
//	}
	

    // Read object from file
    public static void readFromFile() {
        try {
            File f = new File("mydat.txt");

            if (!f.exists()) {
                System.out.println("File not found. Run write method first.");
                return;
            }

            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);

            Employee s1 = (Employee) ois.readObject();
            System.out.println("Read object: " + s1);

            ois.close();
            fis.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> a1=new ArrayList<Employee>();
		a1.add(new Employee(10,"Sachin",20000));
		a1.add(new Employee(18,"Virat",25000));
		a1.add(new Employee(12,"Yuvi",25000));
		a1.add(new Employee(5,"Rahul",25000));
		
		
		Collections.sort(a1,new Comparator<Employee>(){
			public int compare(Employee o1, Employee o2) {
				return o1.getId()-o2.getId();
			}
		});
		
		Collections.sort(a1,new Comparator<Employee>(){
			public int compare(Employee o1, Employee o2) {
				return (int) (o1.getSalary()-o2.getSalary());
			}
		});
		
		Collections.sort(a1,new Comparator<Employee>(){
			public int compare(Employee o1, Employee o2) {
				return o1.getName().compareTo(o2.getName());
			}
			
		});
		
		System.out.println("Before \n " +a1);
		MyIDComparator mid= new MyIDComparator();
		Collections.sort(a1,mid);
		System.out.println("\n after \n "+a1);
		
	}

}
