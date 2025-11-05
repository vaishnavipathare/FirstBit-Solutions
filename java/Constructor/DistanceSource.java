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
System.out.println("Distance Info:");
System.out.println("Kilometers: " + getKm());
System.out.println("Meters: " + getM());
System.out.println("  ");
    }
}

class Test {
public static void main(String[] args) {
Distance d1 = new Distance();  
d1.display();

Distance d2 = new Distance(10, 900.5);
 d2.display();
    }
}
