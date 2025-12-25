package Controller;

import java.io.*;
import java.util.ArrayList;
import Model.Employee;

public class FileUtil {

    private static final String FILE_NAME = "employees.dat";

    // This method matches FileUtil.save(ArrayList<Employee>)
    public static void save(ArrayList<Employee> list) {
        try {
            ObjectOutputStream oos =
                    new ObjectOutputStream(new FileOutputStream(FILE_NAME));
            oos.writeObject(list);
            oos.close();

        } catch (IOException e) {
            System.out.println(" File Save Error: " + e.getMessage());
        }
    }

    // This method matches FileUtil.load()
    @SuppressWarnings("unchecked")
    public static ArrayList<Employee> load() {
        File file = new File(FILE_NAME);

        if (!file.exists()) {
            return new ArrayList<Employee>();
        }

        try {
            ObjectInputStream ois =
                    new ObjectInputStream(new FileInputStream(FILE_NAME));

            Object obj = ois.readObject();
            ois.close();

            return (ArrayList<Employee>) obj;

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("File Load Error: " + e.getMessage());
        }

        return new ArrayList<Employee>();
    }
}
