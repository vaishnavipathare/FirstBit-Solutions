package constructors;

public class CarConstructor {
		 
		String brand;
		String Model;
		String color;
		double price;
		
		CarConstructor(){
			this("kia","Seltos", "black", 1300000);
			System.out.println("Default Constructor Called\n");
			this.brand = "BMW";
			this.Model= "m88";
			this.color = "Black";
			this.price= 7500000;
		}
		
		CarConstructor(String brand, String Model, String color, double price){
			System.out.println("Parameterised Constructor Called\n");
			this.brand = brand; //assignment of local variable brand to the instance variable brand of current invoking object.
			this.Model = Model;
			this.color = color;
			this.price = price;
			display();
		}
		
		void display() {
			System.out.println("This is a Car");
			System.out.println("brand: " +brand);
			System.out.println("Model: " +Model);
			System.out.println("color: " +color);
			System.out.println("price: " +price);	
			System.out.println("\n");
			
		}

	}

	class Test{
		public static void main(String[] args) {
			
			CarConstructor c1 = new CarConstructor();
			CarConstructor c2 = new CarConstructor("audi", "u7", "orange", 877577);
			
			c1.display();
			c2.display();			
		}
		
		
	}
