import java.util.Scanner;

class HR {
    int id;
    String name;
    double salary, commission;

    void setID(int i) { id = i; }
    void setName(String n) { name = n; }
    void setSalary(double s) { salary = s; }
    void setCommission(double c) { commission = c; }

    int getID() { return id; }
    String getName() { return name; }
    double getSalary() { return salary; }
    double getCommission() { return commission; }

    HR() {
        System.out.println("This is Default Constructor");
        this.id = 11;
        this.name = "Sneha";
        this.salary = 60000;
        this.commission = 3000;
    }

    HR(int id, String name, double salary, double commission) {
        System.out.println("This is Parameterized Constructor");
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.commission = commission;
    }

    void display() {
        System.out.println("HR Info:");
        System.out.println("ID: " + getID());
        System.out.println("Name: " + getName());
        System.out.println("Salary: " + getSalary());
        System.out.println("Commission: " + getCommission());
        System.out.println(" ");
    }
}//Class ends here

class TestHR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HR h1 = new HR();
        h1.display();

        System.out.print("Enter HR ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter HR Name: ");
        String name = sc.nextLine();

        System.out.print("Enter HR Salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter HR Commission: ");
        double commission = sc.nextDouble();

        HR h2 = new HR(id, name, salary, commission);
        h2.display();

        sc.close();
    }
}//Main ends here
