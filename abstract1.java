abstract class Bike{
abstract void run();
}
class Honda extends Bike{
void run(){System.out.println("Running safely");}
}
class Test{
public static void main(String args[]){
Bike ob=new Honda();
ob.run();
}
}



































