//Example of abstract class that has abstract and non abstract methods
abstract class Bike{ 
Bike(){System.out.println("bike is created");}
abstract void run();
void changeGear(){System.out.println("gear changed");
}
}
//creating a child class which inherits Abstract class
class Honda extends Bike{
void run(){System.out.println("running safely");}
}
//creating a test class which calls abstract and non abstract methods
class Test4{
public static void main(String args[]){
Bike obj=new Honda();
obj.run();
obj.changeGear();
}
}
