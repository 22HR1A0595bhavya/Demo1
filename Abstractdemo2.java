abstract class MyClass{
public void disp1(){
System.out.println("Concrete method of parent class");
}
abstract public void disp2();
}
class Demo extends MyClass{
public void disp2()
/*Must Override this method while extending Myclass*/
{
System.out.println("overriding abstract method");
}
}
class Test{
public static void main(String args[]){
//Myclass odj=new Demo();
MyClass ob;
ob=new Demo();
ob.disp1();
ob.disp2();
}
}
 