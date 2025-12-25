package p1;

public class Test {
    public static void main(String[] args) {

        Thread t1 = new Thread(new fname());
        Thread t2 = new Thread(new lname());

        t1.start();
        t2.start();
    }
}
