class Shape {
String color;
double area;
static String unit = "cm";  // shared measurement unit

Shape(){
	System.out.println("Shape Default Constructor called");
	this.color = "Red";
	this.area = 0.0;
}

Shape(String color, double area){
	System.out.println("Shape Parameterised Constructor called");
	this.color = color;
	this.area = area;
}

void setColor(){
	this.color = color;
}

void setArea(){
	this.area = area;
}

String getColor(){
	return color;
}

double getArea(){
	return area;
}

static void changeUnit(String newUnit){
	unit = newUnit;
}

void display(){
	System.out.println("Color: " + this.color);
	System.out.println("Area: " + this.area + " " + unit + "²");
	System.out.println();
}

} //class Shape ends here


class Circle extends Shape {
double radius;

Circle(){
	super();
	System.out.println("Circle Default Constructor called");
	this.radius = 5.0;
}

Circle(String color, double area, double radius){
	super(color, area);
	System.out.println("Circle Parameterised Constructor called");
	this.radius = radius;
}

void display(){
	super.display();
	System.out.println("Radius: " + radius + " " + unit);
	System.out.println();
}

} //class Circle ends here


class Rectangle extends Shape {
double length;
double breadth;

Rectangle(){
	super();
	System.out.println("Rectangle Default Constructor called");
	this.length = 10.0;
	this.breadth = 5.0;
}

Rectangle(String color, double area, double length, double breadth){
	super(color, area);
	System.out.println("Rectangle Parameterised Constructor called");
	this.length = length;
	this.breadth = breadth;
}

void display(){
	super.display();
	System.out.println("Length: " + length + " " + unit);
	System.out.println("Breadth: " + breadth + " " + unit);
	System.out.println();
}

} //class Rectangle ends here


class Triangle extends Shape {
double base;
double height;

Triangle(){
	super();
	System.out.println("Triangle Default Constructor called");
	this.base = 6.0;
	this.height = 8.0;
}

Triangle(String color, double area, double base, double height){
	super(color, area);
	System.out.println("Triangle Parameterised Constructor called");
	this.base = base;
	this.height = height;
}

void display(){
	super.display();
	System.out.println("Base: " + base + " " + unit);
	System.out.println("Height: " + height + " " + unit);
	System.out.println();
}

} //class Triangle ends here


class DemoInheritance {

public static void main(String[] a){
	Circle c1 = new Circle();
	c1.display();
	System.out.println(c1.getColor());
	System.out.println("\n\n");

	Shape.changeUnit("m"); // changing static unit for all shapes

	Rectangle r1 = new Rectangle("Blue", 50.0, 12.0, 6.0);
	r1.display();

	Triangle t1 = new Triangle("Green", 20.0, 4.0, 3.0);
	t1.display();
} //main ends here
} //DemoInheritanceShape ends here
