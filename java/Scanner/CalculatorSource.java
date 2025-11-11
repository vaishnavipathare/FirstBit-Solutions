import java.util.Scanner;

class Calculator {
    int num1, num2;

    Calculator() {
        num1 = 0;
        num2 = 0;
    }

    Calculator(int a, int b) {
        num1 = a;
        num2 = b;
    }

    void add() {
        System.out.println("Addition = " + (num1 + num2));
    }

    void subtract() {
        System.out.println("Subtraction = " + (num1 - num2));
    }

    void multiply() {
        System.out.println("Multiplication = " + (num1 * num2));
    }

    void divide() {
        if (num2 != 0)
            System.out.println("Division = " + ((double) num1 / num2));
        else
            System.out.println("Division not possible (denominator = 0)");
    }
    // class ends here
}

public class CalculatorSource {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        Calculator c = new Calculator(a, b);

        c.add();
        c.subtract();
        c.multiply();
        c.divide();

        sc.close();
    }
    // main ends here
}
