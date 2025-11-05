class Complex {
    double real, imaginary;

    void setReal(double r) { real = r; }
    void setImaginary(double i) { imaginary = i; }

    double getReal() { return real; }
    double getImaginary() { return imaginary; }

    Complex() {
        System.out.println("This is Default Constructor");
        this.real = 0.0;
        this.imaginary = 0.0;
    }

    Complex(double real, double imaginary) {
        System.out.println("This is Parameterized Constructor");
        this.real = real;
        this.imaginary = imaginary;
    }

    void display() {
        System.out.println("Complex Number: " + getReal() + " + " + getImaginary() + "i");
    }
}//Class ends here

class Test {
    public static void main(String[] args) {
        Complex c1 = new Complex();
        c1.display();

        Complex c2 = new Complex(5.5, 3.2);
        c2.display();
    }
}//Main ends here
