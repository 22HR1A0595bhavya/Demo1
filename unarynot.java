// Illustrate unary not operator
import java.util.Scanner;
class Test{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
boolean cond=sc.nextBool();
//boolean cond=true;
//int a=10;int b=1;//Display value stored in above variable
System.out.println("Cond is:"+cond);
System.out.println("Var1="+a);
System.out.println("Var2="+b);
//Displaying values stored in above variable
//after applying unary NOT operator
System.out.println("Now cond is:" +!cond);
System.out.println("!(a<b)="+!(a<b));
System.out.println("!(a>b)="+!(a>b));
}
}
