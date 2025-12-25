package FileReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FirstNameReader extends Thread{

    public void run() {
        try {
        	BufferedReader b1 = new BufferedReader(new FileReader("C:\\Users\\vaish\\eclipse-workspace\\MultiThreading\\src\\FileReader\\firstname.txt"));

            String fname = null;
            while ((fname = b1.readLine()) != null) {
                System.out.print(fname +"\n");
            	}b1.close();
            }catch(FileNotFoundException e) {
            	e.printStackTrace();
            }catch (IOException e) {
            	e.printStackTrace();
        }
    }
}
