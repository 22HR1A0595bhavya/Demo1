class Base{
float salary=200000;}
class Derived extends Base{
int bonus=1000;
public static void main(String args[]){
Derived ob=new Derived();
System.out.prinn("Salary="+ob.salary);
System.out.println("Bonus="+ob.bonus);
}
}

