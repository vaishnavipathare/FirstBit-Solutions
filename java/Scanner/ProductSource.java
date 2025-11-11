import java.util.Scanner;

class Product {
    int productID;
    String pName;
    double price;
    int quantity;

    void setProductID(int id) { productID = id; }
    void setPName(String n) { pName = n; }
    void setPrice(double p) { price = p; }
    void setQuantity(int q) { quantity = q; }

    int getProductID() { return productID; }
    String getPName() { return pName; }
    double getPrice() { return price; }
    int getQuantity() { return quantity; }

    Product() {
        System.out.println("This is Default Constructor");
        this.productID = 0;
        this.pName = "Unknown";
        this.price = 0.0;
        this.quantity = 0;
    }

    Product(int productID, String pName, double price, int quantity) {
        System.out.println("This is Parameterized Constructor");
        this.productID = productID;
        this.pName = pName;
        this.price = price;
        this.quantity = quantity;
    }

    void display() {
        System.out.println("Product Details:");
        System.out.println("Product ID: " + getProductID());
        System.out.println("Product Name: " + getPName());
        System.out.println("Price: " + getPrice());
        System.out.println("Quantity: " + getQuantity());
    }
}//Class ends here

class TestProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Product p1 = new Product();
        p1.display();

        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Product Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Product Quantity: ");
        int quantity = sc.nextInt();

        Product p2 = new Product(id, name, price, quantity);
        p2.display();

        sc.close();
    }
}//Main ends here
