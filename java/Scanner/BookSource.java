import java.util.Scanner;

class Book {
    int bookid;
    String bookname;
    double price;

    void setBookid(int id) {
        bookid = id;
    }

    void setBookname(String name) {
        bookname = name;
    }

    void setPrice(double p) {
        price = p;
    }

    int getBookid() {
        return bookid;
    }

    String getBookname() {
        return bookname;
    }

    double getPrice() {
        return price;
    }

    Book() {
        bookid = 0;
        bookname = "";
        price = 0.0;
    }

    Book(int id, String name, double p) {
        bookid = id;
        bookname = name;
        price = p;
    }

    void display() {
        System.out.println("\n--- Book Details ---");
        System.out.println("Book ID: " + bookid);
        System.out.println("Book Name: " + bookname);
        System.out.println("Book Price: " + price);
    }
    // class ends here
}

public class BookSource {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book b = new Book();

        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Book Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Book Price: ");
        double price = sc.nextDouble();

        b.setBookid(id);
        b.setBookname(name);
        b.setPrice(price);

        b.display();
        sc.close();
    }
    // main ends here
}
