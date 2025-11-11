class Student{
int fbid;
String name;
double distance;
static int count = 0;

Student(){
	System.out.println("Student Deafult Constructor called");
	this.fbid = 101;
	this.name = "Vaishnavi";
	this.distance = 2.3;
	count++;
}

Student(int fbid, String name, double distance){
	System.out.println("Student Parameterised Constructor called");
	this.fbid = fbid;
	this.name = name;
	this.distance = distance;
	count++;
}

void setFbid(){
	this.fbid = fbid;
}

void setName(){
	this.name = name;
}

void setDistance(){
	 this.distance = distance;
}

int getFbid(){
	return fbid;
}

String getName(){
	return name;
}

double getDistance(){
	return distance;
}

static int getCount(){
	return count;
}


void display(){
 System.out.println("FBID: " + this.fbid);
        System.out.println("Name: " + this.name);
        System.out.println("Distance: " + this.distance);
        System.out.println();
}

}//class Student ends here

class PlacedStudents extends Student{
String cName;
String destination;

 	PlacedStudents() {
        super();
	System.out.println("PlacedStudents Default Constructor called");
	this.cName = "xyz";
	this.destination = "pune";
    }

        PlacedStudents(int fbid, String name, double distance, String cName, String destination) {
        super(fbid, name, distance); 
	System.out.println("PlacedStudents Parameterised Constructor called");
        this.cName = cName;
        this.destination = destination;
    }

 void setCName(String cName) {
        this.cName = cName;
    }

    void setDestination(String destination) {
        this.destination = destination;
    }
        String getCName() {
        return cName;
    }

    String getDestination() {
        return destination;
    }

void display(){
	super.display(); // step 3
	System.out.println("Company Name: " + cName);
        System.out.println("Destination: " + destination);
        System.out.println();
}

} //Class PlacedStudents ends here

class DemoInheritance{

public static void main(String[] a){
	PlacedStudents ps1 = new PlacedStudents();
	ps1.display();
	System.out.println(ps1.getName());
	System.out.println("\n\n");

	PlacedStudents ps2 = new PlacedStudents(201, "Ravi", 10.2, "TCS", "Pune");
	System.out.println("Student total count:" +Student.getCount());
	ps2.display();
} //main ends here
} //demoinheritance ends here