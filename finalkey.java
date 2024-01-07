//final variable value canot change once declared
//if changed error is occured
class A{
final int speed=90;//final variable
void run(){
System.out.println(speed);
}
public static void main(String args[]){
A o=new A();
o.run();
}
}
