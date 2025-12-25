class Book {
    int isbn;
    String bname;
    String category;
    double price;

    void setISBN(int i) { isbn = i; }
    void setBName(String name) { bname = name; }
    void setCategory(String cat) { category = cat; }
    void setPrice(double p) { price = p; }

    int getISBN() { return isbn; }
    String getBName() { return bname; }
    String getCategory() { return category; }
    double getPrice() { return price; }

    Book() {
        System.out.println("This is Default Constructor");
        this.isbn = 101;
        this.bname = "Java Programming";
        this.category = "Education";
        this.price = 550.75;
    }

 
Book(int isbn, String bname, String category, double price) {
        System.out.println("This is Parameterized Constructor");
        this.isbn = isbn;
        this.bname = bname;
        this.category = category;
        this.price = price;
    }
void display() {
        System.out.println("Book Info:");
        System.out.println("ISBN: " + getISBN());
        System.out.println("Book Name: " + getBName());
        System.out.println("Category: " + getCategory());
        System.out.println("Price: " + getPrice());
        System.out.println("  ");
    }
}

class Test {
    public static void main(String[] args) {
        Book b1 = new Book();         
	b1.display();

        Book b2 = new Book(102, "C++ Basics", "Programming", 450.50);
        b2.display();
    }
}
