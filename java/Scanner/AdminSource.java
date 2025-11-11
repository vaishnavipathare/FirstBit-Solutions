import java.util.Scanner;

class Admin {
    int id;
    String name;
    double salary, allowance;

    void setID(int x) {
        id = x;
    }

    void setName(String str) {
        name = str;
    }

    void setSal(double s) {
        salary = s;
    }

    void setAllowance(double a) {
        allowance = a;
    }

    int getID() {
        return id;
    }

    String getName() {
        return name;
    }

    double getSal() {
        return salary;
    }

    double getAllowance() {
        return allowance;
    }

    Admin() {
        id = 0;
        name = "";
        salary = 0.0;
        allowance = 0.0;
    }

    Admin(int id, String name, double salary, double allowance) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.allowance = allowance;
    }

    void display() {
        System.out.println("\n--- Admin Details ---");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Allowance: " + allowance);
    }
    // class ends here
}

public class AdminSource {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Admin a = new Admin();

        System.out.print("Enter Admin ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter Allowance: ");
        double allowance = sc.nextDouble();

        a.setID(id);
        a.setName(name);
        a.setSal(salary);
        a.setAllowance(allowance);

        a.display();
        sc.close();
    }
    // main ends here
}
