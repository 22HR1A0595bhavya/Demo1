abstract class Animal{//parent class
//abstract method
public abstract void sound();
}
//dog class extends/inherits animals class
class Dog extends Animal{
public void sound(){
System.out.println("Woof");
}
}
class Cat extends Animal{
public void sound(){
System.out.println("meow");
}
}
class Lion extends Animal{
public void sound(){
System.out.println("Roars");
}
}
class Test{
public static void main(String args[]){
Animal ob;
ob=new Dog();    ob. sound();
ob=new Cat();    ob.sound();
ob=new Lion();   ob.sound();
}
}
