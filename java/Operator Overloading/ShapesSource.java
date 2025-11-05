class Triangle{
int base, height;
}

class Rectangle{
int length;
float breadth;

}

class Circle{
float radius;

}

class Shape{

void area(int b, int h){
System.out.println("Area of Traingle is : " +((1/2) * b * h));
}

void area(int l, float b){
System.out.println("Area of Rectangle is: " +(l*b));
}

void area(float r){
System.out.println("Area of Circle is: " +(3.14*r*r));

}
}

class Test{
public static void main(String[] a){
//Triangle t1 = new Triangle();
//Rectangle
Shape s1 = new Shape();
s1.area(5, 4);
s1.area(5, 2.3f);
s1.area(1.4f);
}
}