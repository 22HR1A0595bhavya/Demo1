class Student{
int id;
String name;
//parameterized constructor
Student(int i,String n){
id=i;
name=n;
}
//method to display values
void display(){
System.out.println(id+" "+name);}
public static void main(String args[]){
Student s1=new Student(111,"nani");
Student s2=new Student(222,"bhavya");
s1.display();
s2.display();
}
}

