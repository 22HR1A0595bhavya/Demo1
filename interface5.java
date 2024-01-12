interface Printtable{
void print();
}
interface Showable{
void show();
}
class A implements Printtable,Showable{
public void print(){System.out.println("HEllo");}
public void show(){System.out.println("Welcome");}
}
class TestInterface{
public static void main(String args[]){
A obj=new A();
obj.print();
obj.show();
}
}

