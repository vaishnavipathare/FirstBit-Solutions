package functionOverloading;

import java.util.Scanner;

public class Student {
    private int rollno;
    private String name;
    private int marks;

    // Default constructor
    public Student() {
        this.rollno = 10;
        this.name = "Millie";
        this.marks = 85;
    }

    // Parameterized constructor
    public Student(int rollno, String name, int marks) {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }

    // Display method
    public void display() {
        System.out.println("RollNo: " + rollno);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

    // Function overloading: search by roll number
    public boolean searchStudent(int roll) {
        return this.rollno == roll;
    }

    // Function overloading: search by name
    public boolean searchStudent(String name) {
        return this.name.equalsIgnoreCase(name);
    }

    // Getters and Setters
    public int getRollno() { return rollno; }
    public String getName() { return name; }
    public int getMarks() { return marks; }
    public void setRollno(int rollno) { this.rollno = rollno; }
    public void setName(String name) { this.name = name; }
    public void setMarks(int marks) { this.marks = marks; }
}

class TestMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s1 = new Student(101, "Vaishnavi", 95);
        Student s2 = new Student(102, "Rushikesh", 98);

        Student[] students = {s1, s2};

        // Search by roll number
        System.out.println("Enter roll number to search:");
        int roll = sc.nextInt();
        boolean found = false;
        for (Student s : students) {
            if (s.searchStudent(roll)) {
                System.out.println("Student found:");
                s.display();
                found = true;
            }
        }
        if (!found) System.out.println("Student not found!");

        sc.nextLine(); // consume newline

        // Search by name
        System.out.println("Enter name to search:");
        String name = sc.nextLine();
        found = false;
        for (Student s : students) {
            if (s.searchStudent(name)) {
                System.out.println("Student found:");
                s.display();
                found = true;
            }
        }
        if (!found) System.out.println("Student not found!");
    }
}
