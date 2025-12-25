class TestString{
public static void main(String[] a){
String cName1 = "FirstBit";
String cName2 = "TCS";
String cName3 = "Infosys";
String str = new String("FirstBit");

if(cName1==cName2){
System.out.println("Equal");
}
else{
System.out.println("Not Equal");
}

if(cName1==str){
System.out.println("Equal");
}
else{
System.out.println("Not Equal");
}

}
}