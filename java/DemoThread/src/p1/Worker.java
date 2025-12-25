package p1;

//Part1
//public class Worker extends Thread {

public class Worker implements Runnable{
		
	
	public void run() {
	String str = "1234567891198765634";
	for(int i =0;i<str.length(); i++) {
		System.out.print(" " +str.charAt(i));
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
}

class Test{
 public static void main(String[] args) {
	 //Part 1
	 Worker w1 = new Worker();
	 //w1.start();
	 //Part 2
	 Thread t1 = new Thread(w1);
	 t1.start();
	 
	 
	 String str = "qjhhsgdfgbbbdhhsjdhfhsdfnsdmndjfhnsjdfnhhdg";
		for(int i =0;i<str.length(); i++) {
			System.out.print(" " +str.charAt(i));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
 }
}