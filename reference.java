//intialization through reference
class Student{
int id;
String name;
}
class TestStudent2{
public static void main(String args[]){
Student s1=new Student();
s1.id=100;
s1.name="Madhu";
System.out.println(+s1.id);
System.out.println(+s1.name);
}
}
