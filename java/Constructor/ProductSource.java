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

class Test {
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.display();

        Product p2 = new Product(301, "Laptop", 55000.50, 5);
        p2.display();
    }
}//Main ends here
