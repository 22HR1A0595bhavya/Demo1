/*static method
it belongs to class rather than object
static method can acces static variable and can change value**,
*/
// program to demonstrate the use of static variable
class Student{
int rollno;
String name;
static String college="MTIET";
//static method to change value of static variable
static void change(){
college="reddy";
}
//constructor to initialize variable 
Student(int r,String n){
rollno=r;
name=n;
}
//method to display values
void display(){System.out.println(rollno+" "+name+" "+college);}
}
class Test1{
public static void main(String args[])
{
Student s1=new Student(11,"Sahithi");
Student s2=new Student(22,"nani");
s1.display();
s2.display();
Student.change();
Student s3=new Student(33,"kavya");
s1.display();
s2.display();
s3.display();
}
}
