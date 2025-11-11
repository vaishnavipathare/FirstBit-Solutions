class ElectricityBill{
static double ratePerUnit;
String customerName;
int customerID;
int unitsConsumed;

ElectricityBill(String name, int id, int units){
customerName = name;
customerID = id;
unitsConsumed = units;
}

static void changeRate(double newRate){
ratePerUnit = newRate;
}

double calculateBill(){
return unitsConsumed * ratePerUnit;
}

void displayBill(){
System.out.println("Customer:" + customerName);
System.out.println("ID :" +customerID);
System.out.println("Units : " +unitsConsumed);
System.out.println("Bill Amount: " +calculateBill());
}
}

class Test{
public static void main(String[] a){
ElectricityBill.changeRate(8.5);

ElectricityBill c1 = new ElectricityBill("Vaishnavi", 101, 120);
ElectricityBill c2 = new ElectricityBill("Rushikesh", 102, 200);
c1.displayBill();
c2.displayBill();


ElectricityBill.changeRate(9.0);
System.out.println("\nAfter rate change");
c1.displayBill();
c2.displayBill();
}

}