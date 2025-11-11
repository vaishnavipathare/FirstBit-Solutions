class Army {
int id;
String name;
String rank;
static String countryName = "India"; // static variable shared by all soldiers

Army() {
    System.out.println("Army Default Constructor called");
    this.id = 101;
    this.name = "Default Soldier";
    this.rank = "Private";
}

Army(int id, String name, String rank) {
    System.out.println("Army Parameterised Constructor called");
    this.id = id;
    this.name = name;
    this.rank = rank;
}

void setId(int id) {
    this.id = id;
}

void setName(String name) {
    this.name = name;
}

void setRank(String rank) {
    this.rank = rank;
}

int getId() {
    return id;
}

String getName() {
    return name;
}

String getRank() {
    return rank;
}

static String getCountryName() {
    return countryName;
}

void display() {
    System.out.println("ID: " + this.id);
    System.out.println("Name: " + this.name);
    System.out.println("Rank: " + this.rank);
    System.out.println("Country: " + countryName);
    System.out.println();
}

} //class Army ends here



class Infantry extends Army {
String weaponType;
int missionsCompleted;

Infantry() {
    super();
    System.out.println("Infantry Default Constructor called");
    this.weaponType = "Rifle";
    this.missionsCompleted = 2;
}

Infantry(int id, String name, String rank, String weaponType, int missionsCompleted) {
    super(id, name, rank);
    System.out.println("Infantry Parameterised Constructor called");
    this.weaponType = weaponType;
    this.missionsCompleted = missionsCompleted;
}

void setWeaponType(String weaponType) {
    this.weaponType = weaponType;
}

void setMissionsCompleted(int missionsCompleted) {
    this.missionsCompleted = missionsCompleted;
}

String getWeaponType() {
    return weaponType;
}

int getMissionsCompleted() {
    return missionsCompleted;
}

void display() {
    super.display();
    System.out.println("Weapon Type: " + weaponType);
    System.out.println("Missions Completed: " + missionsCompleted);
    System.out.println();
}
} //class Infantry ends here



class Navy extends Army {
String shipName;
boolean underwaterTraining;

Navy() {
    super();
    System.out.println("Navy Default Constructor called");
    this.shipName = "INS Vikrant";
    this.underwaterTraining = true;
}

Navy(int id, String name, String rank, String shipName, boolean underwaterTraining) {
    super(id, name, rank);
    System.out.println("Navy Parameterised Constructor called");
    this.shipName = shipName;
    this.underwaterTraining = underwaterTraining;
}

void setShipName(String shipName) {
    this.shipName = shipName;
}

void setUnderwaterTraining(boolean underwaterTraining) {
    this.underwaterTraining = underwaterTraining;
}

String getShipName() {
    return shipName;
}

boolean getUnderwaterTraining() {
    return underwaterTraining;
}

void display() {
    super.display();
    System.out.println("Ship Name: " + shipName);
    System.out.println("Underwater Training: " + underwaterTraining);
    System.out.println();
}
} //class Navy ends here



class AirForce extends Army {
String aircraftType;
boolean parachuteTraining;

AirForce() {
    super();
    System.out.println("AirForce Default Constructor called");
    this.aircraftType = "Fighter Jet";
    this.parachuteTraining = true;
}

AirForce(int id, String name, String rank, String aircraftType, boolean parachuteTraining) {
    super(id, name, rank);
    System.out.println("AirForce Parameterised Constructor called");
    this.aircraftType = aircraftType;
    this.parachuteTraining = parachuteTraining;
}

void setAircraftType(String aircraftType) {
    this.aircraftType = aircraftType;
}

void setParachuteTraining(boolean parachuteTraining) {
    this.parachuteTraining = parachuteTraining;
}

String getAircraftType() {
    return aircraftType;
}

boolean getParachuteTraining() {
    return parachuteTraining;
}

void display() {
    super.display();
    System.out.println("Aircraft Type: " + aircraftType);
    System.out.println("Parachute Training: " + parachuteTraining);
    System.out.println();
}
} //class AirForce ends here



class DemoInheritance {
public static void main(String[] a) {

    Infantry i1 = new Infantry();
    i1.display();
    System.out.println(i1.getName());
    System.out.println("\n\n");

    Navy n1 = new Navy(202, "Rohan", "Commander", "INS Kolkata", true);
    n1.display();
    System.out.println("\n\n");

    AirForce a1 = new AirForce(303, "Arjun", "Pilot", "Tejas Mk2", true);
    a1.display();

    System.out.println("Country Name (Static): " + Army.getCountryName());
} //main ends here
} //DemoArmy ends here
