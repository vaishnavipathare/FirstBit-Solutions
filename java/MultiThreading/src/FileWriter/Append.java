package FileWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Append{
    public static void main(String[] args) {
        try {
            FileWriter f1 = new FileWriter("demo.txt",true);
            System.out.println("Hello World");
            f1.write("Hello World");
            f1.close();
            System.out.println("Written Successfuly.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
