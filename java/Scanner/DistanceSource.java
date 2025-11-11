import java.util.Scanner;

class Distance {
    int km;
    double m;

    void setKm(int k) { 
        km = k; 
    }

    void setM(double meters) { 
        m = meters; 
    }

    int getKm() { 
        return km;
    }

    double getM() {
        return m; 
    }

    Distance() {
        System.out.println("This is Default Constructor");
        this.km = 5;
        this.m = 350.75;
    }

    Distance(int km, double m) {
        System.out.println("This is Parameterized Constructor");
        this.km = km;
        this.m = m;
    }

    void display() {
        System.out.println("\n--- Distance Info ---");
        System.out.println("Kilometers: " + getKm());
        System.out.println("Meters: " + getM());
    }
}

public class DistanceSource {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Distance d1 = new Distance();  
        d1.display();

        System.out.print("\nEnter distance in kilometers: ");
        int km = sc.nextInt();

        System.out.print("Enter distance in meters: ");
        double m = sc.nextDouble();

        Distance d2 = new Distance(km, m);
        d2.display();

        sc.close();
    }
}
