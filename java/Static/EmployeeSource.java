class Employee {
    String name;
    double basicSalary;
    static double companyBonusRate;

    Employee(String n, double basic) {
        name = n;
        basicSalary = basic;
    }
	static void changeBonusRate(double newRate) {
        companyBonusRate = newRate;
    }

        double calculateTotalSalary() {
        return basicSalary + (basicSalary * companyBonusRate / 100);
    }

    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Total Salary: " + calculateTotalSalary());
    }

    public static void main(String[] args) {
        Employee.changeBonusRate(10.0);  

        Employee e1 = new Employee("Riya", 50000);
        Employee e2 = new Employee("Aarav", 60000);

        e1.display();
        e2.display();

        Employee.changeBonusRate(12.0);

        System.out.println("\nAfter changing bonus rate:");
        e1.display();
        e2.display();
    }
}
