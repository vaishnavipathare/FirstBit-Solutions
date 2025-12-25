package p1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.Serializable;

public class Student implements Serializable {

    int rollno;
    String name;
    int marks;

    public Student(int rollno, String name, int marks) {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
    }

    // Write object to file
    public static void writeToFile() {
        try {
            FileOutputStream fos = new FileOutputStream("mydat.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            Student s1 = new Student(101, "Vaishnavi", 95);
            oos.writeObject(s1);

            System.out.println("Written Successfully");

            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

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

            Student s1 = (Student) ois.readObject();
            System.out.println("Read object: " + s1);

            ois.close();
            fis.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        writeToFile();   
        readFromFile(); 
    }
}
