class Car {
    String model, brand, colour;
    double price;
    int fuelCapacity;

    void setModel(String m) { model = m; }
    void setBrand(String b) { brand = b; }
    void setPrice(double p) { price = p; }
    void setColour(String c) { colour = c; }
    void setFuelCapacity(int fc) { fuelCapacity = fc; }

    String getModel() { return model; }
    String getBrand() { return brand; }
    double getPrice() { return price; }
    String getColour() { return colour; }
    int getFuelCapacity() { return fuelCapacity; }

    Car() {
        System.out.println("This is Default Constructor");
        this.model = "Not Assigned";
        this.brand = "Unknown";
        this.price = 0.0;
        this.colour = "Not Set";
        this.fuelCapacity = 0;
    }

    Car(String model, String brand, double price, String colour, int fuelCapacity) {
        System.out.println("This is Parameterized Constructor");
        this.model = model;
        this.brand = brand;
        this.price = price;
        this.colour = colour;
        this.fuelCapacity = fuelCapacity;
    }

    void display() {
        System.out.println("Car Details:");
        System.out.println("Model: " + getModel());
        System.out.println("Brand: " + getBrand());
        System.out.println("Price: " + getPrice());
        System.out.println("Colour: " + getColour());
        System.out.println("Fuel Capacity: " + getFuelCapacity() + " liters");
    }
}//Class ends here

class Test {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.display();

        Car c2 = new Car("Creta", "Hyundai", 1500000, "White", 45);
        c2.display();
    }
}//Main ends here
