class Date
{
 	int day, month , year;
	String dow;
Date()//default constructor
{

System.out.println("Default Constructor Called");
this.day = 7;
this.month = 11;
this.year = 2003;
this.dow = "Friday";
}

Date(int d, int m, int y , String str){

System.out.println("Parametrized Constructor Called");

this.day=d;
this.month=m;
this.year=y;
this.dow= str;

} 
void setDay(int d){

	this.day = d;
}
void setMonth(int m){
	this.month = m;
}
void setYear(int y){
	this.year = y;
}
void setDOW(String str){
	this.dow = str;
}
int getDay(){
	return this.day;
}
int getMonth(){
	return this.month;
}
int getYear(){
	return this.year;
}
String getDOW(){
	return this.dow;
}

void Display(){

	System.out.println("Day is:"+this.day);
	System.out.println("Month is:"+this.month);
	System.out.println("Year is:"+this.year);
	System.out.println("DOW is:"+this.dow);
}

}//Date class ends here
class Test
{
	public static void main(String [] args){
		
Date arr[]=new Date[3];
arr[0] = new Date();
arr[1] = new Date(7,11,2025,"Friday");
arr[2] = new Date();
for(int i=0; i<arr.length;i++){
System.out.println(arr[i]);
//System.out.println(arr[i].display());
}
	

}//main Ends here 

}// Test Class ends here
