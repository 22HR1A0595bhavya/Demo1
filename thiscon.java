class Student1{
int rollno;
String name;
float fee;
Student1(int rollno,String name,float fee){
this.rollno=rollno;
this.name=name;
this.fee=fee;
}
void display(){
System.out.println(rollno+" "+name+" "+fee);}
}
class Stcl{
public static void main(String args[])
{
Student1 s1=new Student1(111,"ankit",500f);
Student1 s2=new Student1(112,"suman",600f);
s1.display();
s2.display();
}
}
