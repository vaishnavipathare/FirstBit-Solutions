package classsNobject;

public class Student {
	
	int rollno;
	String name;
	int marks;
	
	 void display() {
	        System.out.println("RollNo :" + rollno);
	        System.out.println("Name :" + name);
	        System.out.println("Marks :" + marks);
	    }

}

class TestMain{
	
	public static void main(String[] args) {
	
		Student s1 = new Student();
		Student s2 = new Student();
		s1.rollno=101;
		s1.name="Vaishnavi";
		s1.marks = 95;
		
		s2.rollno=102;
		s2.name="Rushikesh";
		s2.marks = 98;
		
		s1.display();
		s2.display();
	}
	
}