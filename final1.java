class Bike{
final void run(){System.out.println("Running");}
}
class Honda extends Bike{
void run(){System.out.println("running safely with 100kmph");
public static void main(String args[]){
Hondaob=new Honda();
ob.run();
}
}
