class Student{
private String name;
private int id;
public void setId(int id){this.id=id;}
public void setName(String name){this.name=name;}
public int getId(){return this.id;}
public String getName(){return this.name;}
}
class Day{
public static void main(String ags[]){
Student ob1=new Student();
ob1.setId(111);
ob1.setName("Test");
System.out.println("ID:"+ob1.getId());
System.out.println("Name:"+ob1.getName());
}
}
