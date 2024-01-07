class Animal{
public void eat(){
System.out.println("i can eat");
}
}
class Dog extends Animal{
public void bark(){
System.out.println("i eat bark");
}
}
class Test{
public static void main(String args[]){
Dog labrador=new Dog();
labrador.eat();
labrador.bark();
}
}


