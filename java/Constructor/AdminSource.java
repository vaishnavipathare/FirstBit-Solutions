class Admin {
    int id;
    String name;
    double salary, allowance;


    void setID(int x) { id = x; }
    void setName(String str) { name = str; }
    void setSalary(double s) { salary = s; }
    void setAllowance(double a) { allowance = a; }

    int getID() { return id; }
    String getName() { return name; }
    double getSalary() { return salary; }
    double getAllowance() { return allowance; }

  
    Admin() {
        System.out.println("This is Default Constructor");
        this.id = 111;
        this.name = "Nikita";
        this.salary = 500000;
        this.allowance = 36500;
    }


    Admin(int id, String name, double salary, double allowance) {
        System.out.println("This is Parameterized Constructor");
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.allowance = allowance;
    }


    void display() {
        System.out.println("Admin Info:");
        System.out.println("ID: " + getID());
        System.out.println("Name: " + getName());
        System.out.println("Salary: " + getSalary());
        System.out.println("Allowance: " + getAllowance());
        System.out.println("  ");
    }
}

class Test {
    public static void main(String[] args) {
        Admin a1 = new Admin();  
        a1.display();

        Admin a2 = new Admin(112, "Riya", 600000, 42000);
        a2.display();
    }
}
