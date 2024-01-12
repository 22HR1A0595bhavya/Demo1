class Person{
protected String fname="yamuna";
protected String lname="yammy";
protected int age=24;
}
class Student extends Person{
private int graduationYear=2018;
public static void main(String args[]){
Student Obj=new Student();
System.out.println("Name:"+Obj.fname+" "+Obj.lname);
System.out.println("Age:"+Obj.age);
System.out.println("Graduation Year:"+Obj.graduationYear);
}
}