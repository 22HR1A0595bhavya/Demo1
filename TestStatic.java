//static
//memory allocated for instance variable
// STATIC VARIABLE
/*
java static variable is used for 1.variable 2.method 3.block
initialized only once
*/



class Student{
int rollno;//instance variable
String name;
static String college="MTIET";//static variable
//constructor
Student(int r,String n){
rollno=r;
name=n;
}
//method to display the value
void display(){System.out.println(rollno+" "+name+" "+college);
}
}
public class TestStatic{
	public static void main(String args[]){
		Student s1=new Student(11,"BHAVYA");
		Student s2=new Student(22,"NANI");
		//we can change college of all objects by the single line of code
		Student.college="MJC";
		s1.display();
		s2.display();
}}
	


//test class to store values of objects
