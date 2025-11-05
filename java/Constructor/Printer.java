class Printer{
void print(){
 System.out.println("Hello");
}

void print(int b){
 System.out.println(b);
}

void print(char c){
 System.out.println(c);
}

void print(String str){
System.out.println(str);
}
}

class Test{
public static void main(String[] a){
Printer p1 = new Printer();
p1.print();
p1.print(10);
p1.print('a');
p1.print("Vaishnavi");
}
}