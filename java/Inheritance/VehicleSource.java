class Vehicle {
int vno;
String brand;
double price;
static String registrationAuthority = "RTO Maharashtra"; // static variable

Vehicle(){
	System.out.println("Vehicle Default Constructor called");
	this.vno = 101;
	this.brand = "Honda";
	this.price = 500000.0;
}

Vehicle(int vno, String brand, double price){
	System.out.println("Vehicle Parameterised Constructor called");
	this.vno = vno;
	this.brand = brand;
	this.price = price;
}

void setVno(){
	this.vno = vno;
}

void setBrand(){
	this.brand = brand;
}

void setPrice(){
	this.price = price;
}

int getVno(){
	return vno;
}

String getBrand(){
	return brand;
}

double getPrice(){
	return price;
}

static String getRegistrationAuthority(){
	return registrationAuthority;
}

void display(){
	System.out.println("Vehicle No: " + this.vno);
	System.out.println("Brand: " + this.brand);
	System.out.println("Price: " + this.price);
	System.out.println("Registration Authority: " + registrationAuthority);
	System.out.println();
}

} //class Vehicle ends here


class Car extends Vehicle {
String model;
String fuelType;

Car(){
	super();
	System.out.println("Car Default Constructor called");
	this.model = "City";
	this.fuelType = "Petrol";
}

Car(int vno, String brand, double price, String model, String fuelType){
	super(vno, brand, price);
	System.out.println("Car Parameterised Constructor called");
	this.model = model;
	this.fuelType = fuelType;
}

void display(){
	super.display();
	System.out.println("Model: " + model);
	System.out.println("Fuel Type: " + fuelType);
	System.out.println();
}

} //class Car ends here


class Bike extends Vehicle {
String type;
int gears;

Bike(){
	super();
	System.out.println("Bike Default Constructor called");
	this.type = "Sport";
	this.gears = 5;
}

Bike(int vno, String brand, double price, String type, int gears){
	super(vno, brand, price);
	System.out.println("Bike Parameterised Constructor called");
	this.type = type;
	this.gears = gears;
}

void display(){
	super.display();
	System.out.println("Type: " + type);
	System.out.println("Gears: " + gears);
	System.out.println();
}

} //class Bike ends here


class Truck extends Vehicle {
double capacity;
String company;

Truck(){
	super();
	System.out.println("Truck Default Constructor called");
	this.capacity = 10.5;
	this.company = "Tata";
}

Truck(int vno, String brand, double price, double capacity, String company){
	super(vno, brand, price);
	System.out.println("Truck Parameterised Constructor called");
	this.capacity = capacity;
	this.company = company;
}

void display(){
	super.display();
	System.out.println("Capacity: " + capacity);
	System.out.println("Company: " + company);
	System.out.println();
}

} //class Truck ends here


class DemoInheritance{

public static void main(String[] a){
	Car c1 = new Car();
	c1.display();
	System.out.println(c1.getBrand());
	System.out.println("\n\n");

	Bike b1 = new Bike(202, "Yamaha", 150000.0, "Racing", 6);
	System.out.println("Registration Authority (Static): " + Vehicle.getRegistrationAuthority());
	b1.display();
} //main ends here
} //DemoInheritanceVehicle ends here
