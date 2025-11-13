class Farmer {
    int id;
    String name;
    double landSize;
    static String marketName = "National Agro Market";

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

    void setId(int id){
        this.id = id;
    }

    void setName(String name){
        this.name = name;
    }

    void setLandSize(double landSize){
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

    static void setMarketName(String market){
        marketName = market;
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

    void setCropType(String cropType){
        this.cropType = cropType;
    }

    void setFertilizerUsed(String fertilizerUsed){
        this.fertilizerUsed = fertilizerUsed;
    }

    String getCropType(){
        return cropType;
    }

    String getFertilizerUsed(){
        return fertilizerUsed;
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

    void setCowsCount(int cowsCount){
        this.cowsCount = cowsCount;
    }

    void setMilkPerDay(double milkPerDay){
        this.milkPerDay = milkPerDay;
    }

    int getCowsCount(){
        return cowsCount;
    }

    double getMilkPerDay(){
        return milkPerDay;
    }

    void display(){
        super.display();
        System.out.println("Cows Count: " + cowsCount);
        System.out.println("Milk per Day: " + milkPerDay + " litres");
        System.out.println();
    }

} //class DairyFarmer ends here


class PoultryFarmer extends Farmer {
    int noOfChickens;
    int noOfShades;
    double eggsPerDay;
    String poultryFarmerName;
    int hensTransferred;

    PoultryFarmer() {
        super();
        System.out.println("PoultryFarmer Default Constructor called");
        this.noOfChickens = 50;
        this.noOfShades = 2;
        this.eggsPerDay = 120.0;
        this.poultryFarmerName = "Raju";
        this.hensTransferred = 10;
    }

    PoultryFarmer(int id, String name, double landSize, int noOfChickens, int noOfShades, double eggsPerDay, String poultryFarmerName, int hensTransferred) {
        super(id, name, landSize);
        System.out.println("PoultryFarmer Parameterised Constructor called");
        this.noOfChickens = noOfChickens;
        this.noOfShades = noOfShades;
        this.eggsPerDay = eggsPerDay;
        this.poultryFarmerName = poultryFarmerName;
        this.hensTransferred = hensTransferred;
    }

    void setNoOfChickens(int noOfChickens){
        this.noOfChickens = noOfChickens;
    }

    void setNoOfShades(int noOfShades){
        this.noOfShades = noOfShades;
    }

    void setEggsPerDay(double eggsPerDay){
        this.eggsPerDay = eggsPerDay;
    }

    void setPoultryFarmerName(String poultryFarmerName){
        this.poultryFarmerName = poultryFarmerName;
    }

    void setHensTransferred(int hensTransferred){
        this.hensTransferred = hensTransferred;
    }

    int getNoOfChickens(){
        return noOfChickens;
    }

    int getNoOfShades(){
        return noOfShades;
    }

    double getEggsPerDay(){
        return eggsPerDay;
    }

    String getPoultryFarmerName(){
        return poultryFarmerName;
    }

    int getHensTransferred(){
        return hensTransferred;
    }

    void display() {
        super.display();
        System.out.println("Poultry Farmer Name: " + poultryFarmerName);
        System.out.println("Number of Chickens: " + noOfChickens);
        System.out.println("Number of Shades: " + noOfShades);
        System.out.println("Eggs per Day: " + eggsPerDay);
        System.out.println("Hens Transferred: " + hensTransferred);
        System.out.println();
    }
}// Poultry Farmer ends here


class Test {

    public static void main(String[] a){
        OrganicFarmer of1 = new OrganicFarmer();
        of1.display();
        System.out.println(of1.getName());
        System.out.println("\n\n");

        DairyFarmer df1 = new DairyFarmer(202, "Suresh", 8.0, 15, 180.0);
        System.out.println("Market Name (Static): " + Farmer.getMarketName());
        df1.display();

        PoultryFarmer pf1 = new PoultryFarmer(303, "Manoj", 4.5, 80, 3, 200.0, "Manoj", 20);
        pf1.display();
    }// Main ends here
}// Test Ends here 
