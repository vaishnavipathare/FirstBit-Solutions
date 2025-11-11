class Employee {
    int id;
    String name;
    double salary, allowance;

    // Setter methods
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

    // Getter methods
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

Employee arr[]=new Employee[3];
arr[0] = new Employee();
arr[1] = new Employee(101, "Vaishnavi", 55000.75, 4500.50);;
arr[2] = new Employee();
for(int i=0; i<arr.length;i++){
System.out.println(arr[i]);
}
}
}//Main ends here
