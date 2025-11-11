import java.util.Scanner;

class Employee {
    int id;
    String name;
    double salary, allowance;

    void setID(int i) {
        id = i;
    }

    void setName(String n) {
        name = n;
    }

    void setSalary(double s) {
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

    double getSalary() {
        return salary;
    }

    double getAllowance() {
        return allowance;
    }

    Employee() {
        System.out.println("This is Default Constructor");
        this.id = 0;
        this.name = "Not Assigned";
        this.salary = 0.0;
        this.allowance = 0.0;
    }

    Employee(int id, String name, double salary, double allowance) {
        System.out.println("This is Parameterized Constructor");
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.allowance = allowance;
    }

    void display() {
        System.out.println("Employee Details:");
        System.out.println("ID: " + getID());
        System.out.println("Name: " + getName());
        System.out.println("Salary: " + getSalary());
        System.out.println("Allowance: " + getAllowance());
    }
}//Class ends here

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee e1 = new Employee();
        e1.display();

        System.out.print("\nEnter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Employee Salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter Employee Allowance: ");
        double allowance = sc.nextDouble();

        Employee e2 = new Employee(id, name, salary, allowance);
        e2.display();

        sc.close();
    }
}//Main ends here
