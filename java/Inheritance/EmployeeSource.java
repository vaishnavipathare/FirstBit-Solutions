class Employee {
    int empId;
    String name;
    double salary;

    // static variable shared by all employees
    static String companyName = "TechNova Pvt Ltd";

    Employee() {
        System.out.println("Employee Default Constructor called");
        this.empId = 101;
        this.name = "Vaishnavi";
        this.salary = 30000.0;
    }

    Employee(int empId, String name, double salary) {
        System.out.println("Employee Parameterised Constructor called");
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    // static method to change company name
    static void changeCompany(String newCompany) {
        companyName = newCompany;
    }

    void display() {
        System.out.println("EmpID: " + this.empId);
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
        System.out.println("Company: " + companyName);
        System.out.println();
    }
} // class Employee ends here


class Admin extends Employee {
    String department;
    String role;

    Admin() {
        super();
        System.out.println("Admin Default Constructor called");
        this.department = "HR";
        this.role = "Supervisor";
    }

    Admin(int empId, String name, double salary, String department, String role) {
        super(empId, name, salary);
        System.out.println("Admin Parameterised Constructor called");
        this.department = department;
        this.role = role;
    }

    void display() {
        super.display();
        System.out.println("Department: " + department);
        System.out.println("Role: " + role);
        System.out.println();
    }
} // class Admin ends here


class HR extends Employee {
    String region;
    int teamSize;

    HR() {
        super();
        System.out.println("HR Default Constructor called");
        this.region = "West";
        this.teamSize = 5;
    }

    HR(int empId, String name, double salary, String region, int teamSize) {
        super(empId, name, salary);
        System.out.println("HR Parameterised Constructor called");
        this.region = region;
        this.teamSize = teamSize;
    }

    void display() {
        super.display();
        System.out.println("Region: " + region);
        System.out.println("Team Size: " + teamSize);
        System.out.println();
    }
} // class HR ends here


class SalesManager extends Employee {
    double target;
    double incentive;

    SalesManager() {
        super();
        System.out.println("SalesManager Default Constructor called");
        this.target = 100000.0;
        this.incentive = 5000.0;
    }

    SalesManager(int empId, String name, double salary, double target, double incentive) {
        super(empId, name, salary);
        System.out.println("SalesManager Parameterised Constructor called");
        this.target = target;
        this.incentive = incentive;
    }

    void display() {
        super.display();
        System.out.println("Target: " + target);
        System.out.println("Incentive: " + incentive);
        System.out.println();
    }
} // class SalesManager ends here


class DemoInheritance {
    public static void main(String[] a) {
        Admin a1 = new Admin();
        a1.display();

        // Change static company for all employees
        Employee.changeCompany("NextGen Solutions Pvt Ltd");

        HR h1 = new HR(202, "Riya", 35000.0, "South", 7);
        h1.display();

        SalesManager sm1 = new SalesManager(203, "Ravi", 40000.0, 150000.0, 7000.0);
        sm1.display();
    }
} // DemoInheritanceEmployee ends here
