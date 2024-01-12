abstract class Animal{//parent class
//abstract method
public abstract void sound();
}
//dog class extends/inherits animals class
class Dog extends Animal{
public void sound(){
System.out.println("Wool");
}
public static void main(String args[]){
Animal ob=new Dog();
ob.sound();
}
}
