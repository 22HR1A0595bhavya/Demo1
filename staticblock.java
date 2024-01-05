/*super can't use non static data and static method directly
this and super cant use in static
//jvm needto call obj and obj need to call method 
so when its static no need of object so main() method is ststic
*/
//Example of static block
class A2{
static{System.out.println("static block is invoked");
}
public static void main(String args[]){
System.out.println("Hello mam");
}
}
