package classsNobject;

public class Car {
	 
	String brand;
	String Model;
	String color;
	double price;
	
	void display() {
		
		System.out.println("This is a Car");
		System.out.println("brand: " +brand);
		System.out.println("Model: " +Model);
		System.out.println("color: " +color);
		System.out.println("price: " +price);	
		
	}

}

class Test{
	public static void main(String[] args) {
		
		Car c = new Car();
		c.display();
		
	}
	
	
}
