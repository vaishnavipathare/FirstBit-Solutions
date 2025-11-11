class Farmer {
int id;
String name;
double landSize;
static String marketName = "National Agro Market"; // static variable

Farmer(){
	System.out.println("Farmer Default Constructor called");
	this.id = 101;
	this.name = "Ramesh";
	this.landSize = 5.5;
}

Farmer(int id, String name, double landSize){
	System.out.println("Farmer Parameterised Constructor called");
	this.id = id;
	this.name = name;
	this.landSize = landSize;
}

void setId(){
	this.id = id;
}

void setName(){
	this.name = name;
}

void setLandSize(){
	this.landSize = landSize;
}

int getId(){
	return id;
}

String getName(){
	return name;
}

double getLandSize(){
	return landSize;
}

static String getMarketName(){
	return marketName;
}

void display(){
	System.out.println("ID: " + this.id);
	System.out.println("Name: " + this.name);
	System.out.println("Land Size: " + this.landSize + " acres");
	System.out.println("Market Name: " + marketName);
	System.out.println();
}

} //class Farmer ends here


class OrganicFarmer extends Farmer {
String cropType;
String fertilizerUsed;

OrganicFarmer(){
	super();
	System.out.println("OrganicFarmer Default Constructor called");
	this.cropType = "Wheat";
	this.fertilizerUsed = "Compost";
}

OrganicFarmer(int id, String name, double landSize, String cropType, String fertilizerUsed){
	super(id, name, landSize);
	System.out.println("OrganicFarmer Parameterised Constructor called");
	this.cropType = cropType;
	this.fertilizerUsed = fertilizerUsed;
}

void display(){
	super.display();
	System.out.println("Crop Type: " + cropType);
	System.out.println("Fertilizer Used: " + fertilizerUsed);
	System.out.println();
}

} //class OrganicFarmer ends here


class DairyFarmer extends Farmer {
int cowsCount;
double milkPerDay;

DairyFarmer(){
	super();
	System.out.println("DairyFarmer Default Constructor called");
	this.cowsCount = 10;
	this.milkPerDay = 120.5;
}

DairyFarmer(int id, String name, double landSize, int cowsCount, double milkPerDay){
	super(id, name, landSize);
	System.out.println("DairyFarmer Parameterised Constructor called");
	this.cowsCount = cowsCount;
	this.milkPerDay = milkPerDay;
}

void display(){
	super.display();
	System.out.println("Cows Count: " + cowsCount);
	System.out.println("Milk per Day: " + milkPerDay + " litres");
	System.out.println();
}

} //class DairyFarmer ends here


class DemoInheritance {

public static void main(String[] a){
	OrganicFarmer of1 = new OrganicFarmer();
	of1.display();
	System.out.println(of1.getName());
	System.out.println("\n\n");

	DairyFarmer df1 = new DairyFarmer(202, "Suresh", 8.0, 15, 180.0);
	System.out.println("Market Name (Static): " + Farmer.getMarketName());
	df1.display();
} //main ends here
} //DemoInheritanceFarm ends here
