import java.util.Scanner;

class Complex {
    int real;
    int imag;

    Complex() {
        real = 0;
        imag = 0;
    }

    Complex(int r, int i) {
        real = r;
        imag = i;
    }

    void add(Complex c1, Complex c2) {
        int r = c1.real + c2.real;
        int i = c1.imag + c2.imag;
        System.out.println("Sum = " + r + " + " + i + "i");
    }

    void display() {
        System.out.println("Complex Number: " + real + " + " + imag + "i");
    }
    // class ends here
}

public class ComplexSource {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first complex number:");
        System.out.print("Real part: ");
        int r1 = sc.nextInt();
        System.out.print("Imaginary part: ");
        int i1 = sc.nextInt();

        System.out.println("\nEnter second complex number:");
        System.out.print("Real part: ");
        int r2 = sc.nextInt();
        System.out.print("Imaginary part: ");
        int i2 = sc.nextInt();

        Complex c1 = new Complex(r1, i1);
        Complex c2 = new Complex(r2, i2);
        Complex result = new Complex();

        result.add(c1, c2);
        sc.close();
    }
    // main ends here
}
