import java.util.Scanner;

class Car {
    int modelno;
    String name;
    double price;

    void setModelno(int m) {
        modelno = m;
    }

    void setName(String n) {
        name = n;
    }

    void setPrice(double p) {
        price = p;
    }

    int getModelno() {
        return modelno;
    }

    String getName() {
        return name;
    }

    double getPrice() {
        return price;
    }

    Car() {
        modelno = 0;
        name = "";
        price = 0.0;
    }

    Car(int modelno, String name, double price) {
        this.modelno = modelno;
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println("\n--- Car Details ---");
        System.out.println("Model No: " + modelno);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
    // class ends here
}

public class CarSource {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car c = new Car();

        System.out.print("Enter Car Model No: ");
        int modelno = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Car Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Car Price: ");
        double price = sc.nextDouble();

        c.setModelno(modelno);
        c.setName(name);
        c.setPrice(price);

        c.display();
        sc.close();
    }
    // main ends here
}
