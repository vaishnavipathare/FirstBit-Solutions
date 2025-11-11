class SalesManager {
    int id;
    String name;
    double salary, incentive;
    int target;

    void setID(int i) { 
id = i; 
}
    void setName(String n) { 
name = n; 
}
    void setSalary(double s) {
salary = s;
}
    void setIncentive(double inc) { 
incentive = inc; 
}
    void setTarget(int t) { 
target = t; 
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
    double getIncentive() { 
return incentive;
 }
    int getTarget() {
 return target;
 }

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
}

class Test {
    public static void main(String[] args) {

SalesManager arr[]=new SalesManager[3];
arr[0] = new SalesManager();
arr[1] = new SalesManager(25, "Priya", 35000, 4000, 60); 
arr[2] = new SalesManager();
for(int i=0; i<arr.length;i++){
System.out.println(arr[i]);
}
}
}//Main ends here
