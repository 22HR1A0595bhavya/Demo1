class Student{
private String name;
private int id;
public void setId(int id){this.id=id;}
public void setName(String name){this.name=name;}
public int getId(){return this.id;}
public String getName(){return this.name;}
}
class Day4Program{
public static void main(String ags[]){
Student ob1=new Student();
ob1.setId(111);
ob1.setName("Test");
System.out.println("ID:"+ob1.getId());
System.out.println("Name:"+ob1.getName());
Student ob2=new Student();
ob2.setId(2026);
ob2.setName("Bhavya");
System.out.println("ID:"+ob2.getId());
System.out.println("Name:"+ob2.getName());
Student ob3=new Student();
ob3.setId(2005);
ob3.setName("NANI");
System.out.println("ID:"+ob3.getId());
System.out.println("Name:"+ob3.getName());
}
}
