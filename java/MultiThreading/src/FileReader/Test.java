package FileReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test {

    // Coordinator that pairs first + last names and prints them
    static class NamePrinter {
        private String firstName = null;
        private String lastName = null;
        private boolean firstReady = false;
        private boolean lastReady = false;

        // Called by FirstNameReader
        public synchronized void setFirstName(String fname) {
            // wait until previous pair was consumed
            while (firstReady) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }

            this.firstName = fname;
            this.firstReady = true;

            if (lastReady) {
                printPair();
            } else {
                notifyAll();
            }
        }

        // Called by LastNameReader
        public synchronized void setLastName(String lname) {
            while (lastReady) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }

            this.lastName = lname;
            this.lastReady = true;

            if (firstReady) {
                printPair();
            } else {
                notifyAll();
            }
        }

        // Print and reset so next pair can be produced
        private synchronized void printPair() {
            System.out.println(firstName + " " + lastName);

            // reset for next pair
            firstName = null;
            lastName = null;
            firstReady = false;
            lastReady = false;

            notifyAll();
        }
    }

    // Reads first names and calls NamePrinter.setFirstName(...)
    static class FirstNameReader implements Runnable {
        private final String path;
        private final NamePrinter printer;

        FirstNameReader(String path, NamePrinter printer) {
            this.path = path;
            this.printer = printer;
        }

        @Override
        public void run() {
            try (BufferedReader br = new BufferedReader(new FileReader(path))) {
                String line;
                while ((line = br.readLine()) != null) {
                    printer.setFirstName(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // Reads last names and calls NamePrinter.setLastName(...)
    static class LastNameReader implements Runnable {
        private final String path;
        private final NamePrinter printer;

        LastNameReader(String path, NamePrinter printer) {
            this.path = path;
            this.printer = printer;
        }

        @Override
        public void run() {
            try (BufferedReader br = new BufferedReader(new FileReader(path))) {
                String line;
                while ((line = br.readLine()) != null) {
                    printer.setLastName(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        // update these paths to match your files
        String firstPath = "C:\\Users\\vaish\\eclipse-workspace\\MultiThreading\\src\\FileReader\\firstname.txt";
        String lastPath  = "C:\\Users\\vaish\\eclipse-workspace\\MultiThreading\\src\\FileReader\\lastname.txt";

        NamePrinter printer = new NamePrinter();

        Thread t1 = new Thread(new FirstNameReader(firstPath, printer), "FirstNameReader");
        Thread t2 = new Thread(new LastNameReader(lastPath, printer), "LastNameReader");

        t1.start();
        t2.start();

        // wait for both readers to finish
        t1.join();
        t2.join();

        System.out.println("All done.");
    }

    // (optional) old main1 code removed for clarity
}
