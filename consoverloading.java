class Student5{
int id;
String name;
int age;
//creating two arg constructor
Student5(int i,String n){
id=i;
name=n;
age=0;
}
//creating three arg constructor
Student5(int i,String n,int a){
id=i;
name=n;
age=a;
}
void display()
{
System.out.println(id+","+name+","+age);
}
public static void main(String args[])
{
Student5 s=new Student5(111,"bhavya");
Student5 s1=new Student5(222,"nani",19);
Student5 s2=new Student5(333,"bhavyasri",18);
s.display();
s1.display();
s2.display();
}
}


//in java all constructor are inherited from objects
