package p1;

public class Employee {
	int id;
	String name;
	double salary;

	public Employee() {
		// TODO Auto-generated constructor stub
		this.id = 0;
		this.name = "Not Given";
		this.salary = 10000;
	}

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\n ID:" + this.id + " Name: " + this.name + " Salary" + this.salary;
	}

	
//	public int compareTo(Employee o) {
//		// TODO Auto-generated method stub
//		System.out.println("Inside compraeTo");
//		return this.id - o.id;
//	}
//	@Override
//	public int hashCode() {
//		// TODO Auto-generated method stub
//		System.out.println("inside hashCode");
//		return this.id;
//	}
//	@Override
//	public boolean equals(Object obj) {
//		// TODO Auto-generated method stub
//		System.out.println("Inside equals");
//		Employee e1 = (Employee) obj;
//
//		if (this.id == e1.id) {
//			return true;
//		} else {
//
//			return false;
//		}
//	}
}
