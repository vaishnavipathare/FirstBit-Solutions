import java.util.Scanner;

class SalesManager {
    int id;
    String name;
    double salary, incentive;
    int target;

    void setID(int i) { id = i; }
    void setName(String n) { name = n; }
    void setSalary(double s) { salary = s; }
    void setIncentive(double inc) { incentive = inc; }
    void setTarget(int t) { target = t; }

    int getID() { return id; }
    String getName() { return name; }
    double getSalary() { return salary; }
    double getIncentive() { return incentive; }
    int getTarget() { return target; }

    SalesManager() {
        System.out.println("This is Default Constructor");
        this.id = 24;
        this.name = "Rohit";
        this.salary = 20000;
        this.incentive = 2000;
        this.target = 50;
    }

    SalesManager(int id, String name, double salary, double incentive, int target) {
        System.out.println("This is Parameterized Constructor");
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.incentive = incentive;
        this.target = target;
    }

    void display() {
        System.out.println("Sales Manager Info:");
        System.out.println("ID: " + getID());
        System.out.println("Name: " + getName());
        System.out.println("Salary: " + getSalary());
        System.out.println("Incentive: " + getIncentive());
        System.out.println("Target: " + getTarget());
        System.out.println(" ");
    }
}//Class ends here

class TestSalesManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SalesManager sm1 = new SalesManager();
        sm1.display();

        System.out.print("Enter Sales Manager ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Sales Manager Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter Incentive: ");
        double incentive = sc.nextDouble();

        System.out.print("Enter Target: ");
        int target = sc.nextInt();

        SalesManager sm2 = new SalesManager(id, name, salary, incentive, target);
        sm2.display();

        sc.close();
    }
}//Main ends here
