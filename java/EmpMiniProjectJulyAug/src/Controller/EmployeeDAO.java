package Controller;

import java.util.ArrayList;
import Model.Employee;
import Model.Admin;
import Model.HR;
import Model.SalesManager;

public class EmployeeDAO {

    private static ArrayList<Employee> eList;

    // Static block - runs once when class loads
    static {
        eList = FileUtil.load();

        if (eList.isEmpty()) {
            eList.add(new HR(101, "Ranjit", 50000, 5000));
            eList.add(new HR(102, "Amit", 48000, 4500));
            eList.add(new HR(103, "Sneha", 47000, 4000));

            eList.add(new SalesManager(201, "Karan", 60000, 12, 8000));
            eList.add(new SalesManager(202, "Meena", 58000, 15, 7500));
            eList.add(new SalesManager(203, "Rohit", 62000, 10, 9000));

            eList.add(new Admin(301, "Pragati", 70000, 10000));
            eList.add(new Admin(302, "Isha", 68000, 9500));
            eList.add(new Admin(303, "Pooja", 72000, 11000));
            eList.add(new Admin(304, "Shubham", 75000, 12000));

            FileUtil.save(eList);
        }
    }

    // ADD employee with exception handling
    public boolean addEmployee(Employee e) {
        try {
            eList.add(e);
            FileUtil.save(eList);
            System.out.println("✅ Employee added successfully.");
            return true;

        } catch (Exception ex) {
            System.out.println("Error while adding employee: " + ex.getMessage());
            return false;
        }
    }

    // SEARCH employee
    public Employee searchEmployee(int id) {
        try {
            for (Employee e : eList) {
                if (e.getId() == id) {
                    return e;
                }
            }
        } catch (Exception ex) {
            System.out.println("Error while searching employee: " + ex.getMessage());
        }
        return null;
    }

    // UPDATE employee with exception handling
    public boolean updateEmployee(int id, double salary) {
        try {
            for (Employee e : eList) {
                if (e.getId() == id) {
                    e.setSalary(salary);
                    FileUtil.save(eList);
                    System.out.println("Employee updated successfully.");
                    return true;
                }
            }
            System.out.println(" Employee not found.");

        } catch (Exception ex) {
            System.out.println(" Error while updating employee: " + ex.getMessage());
        }
        return false;
    }

    // DELETE employee with exception handling
    public boolean deleteEmployee(int id) {
        try {
            for (int i = 0; i < eList.size(); i++) {
                if (eList.get(i).getId() == id) {
                    eList.remove(i);
                    FileUtil.save(eList);
                    System.out.println("Employee deleted successfully.");
                    return true;
                }
            }
            System.out.println("Employee not found.");

        } catch (Exception ex) {
            System.out.println("Error while deleting employee: " + ex.getMessage());
        }
        return false;
    }

    // DISPLAY all employees
    public void displayAll() {
        try {
            if (eList.isEmpty()) {
                System.out.println("No employees found.");
                return;
            }

            for (Employee e : eList) {
                System.out.println(e);
                System.out.println("-----------------------");
            }

        } catch (Exception ex) {
            System.out.println("Error while displaying employees: " + ex.getMessage());
        }
    }
}
