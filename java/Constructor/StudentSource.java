class Student {
    int rollNo;
    String name;
    double marks;

    void setRollNo(int r) { rollNo = r; }
    void setName(String n) { name = n; }
    void setMarks(double m) { marks = m; }

    int getRollNo() { return rollNo; }
    String getName() { return name; }
    double getMarks() { return marks; }

    Student() {
        System.out.println("This is Default Constructor");
        this.rollNo = 0;
        this.name = "Not Assigned";
        this.marks = 0.0;
    }
Student(int rollNo, String name, double marks) {
        System.out.println("This is Parameterized Constructor");
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
void display() {
        System.out.println("Student Details:");
        System.out.println("Roll No: " + getRollNo());
        System.out.println("Name: " + getName());
        System.out.println("Marks: " + getMarks());
    }
}//Class ends here

class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();

        Student s2 = new Student(101, "Riya", 89.5);
        s2.display();
    }
}//Main ends here
