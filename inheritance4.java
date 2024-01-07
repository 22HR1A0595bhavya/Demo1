class Animal{
void eat(){System.out.println("---eating----");}
}
class Dog extends Animal{
void bark(){System.out.println("----barking----");}
}
class Cat extends Animal{
void meow(){System.out.println("---meowing---");}
}
class Inher3{
public static void main(String args[]){
Cat d=new Cat();
d.eat();
d.meow();
Dog c=new Dog();
c.bark();
c.eat();
}
}
