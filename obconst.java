class Student6{
int id;
String name;
Student6(int i,String n){
id=i;
name=n;
}
//constructor to initialize another object
Student6(Student6 s){
id=s.id;
name=s.name;
}
void display(){
System.out.println(id+" "+name);}
public static void main(String args[]){
Student6 s1=new Student6(12,"nani");
Student6 s=new Student6(s1);
s1.display();
s.display();
}
}

