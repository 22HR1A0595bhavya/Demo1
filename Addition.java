import java.util.Scanner;
class Addition{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
double num1=sc.nextDouble();
double num2=sc.nextDouble();
double sum=0;
double sub=0;
double mul=0;
double mod=0;
double div=0;
System.out.println("num1="+num1);
System.out.println("nem2="+num2);
sum=num1+num2;
sub=num1-num2;
mul=num1*num2;
mod=num1%num2;
div=num1/num2;
if(num2==0){
System.out.println("Division by zero");}

System.out.println(num1+"+"+num2+"="+sum);
System.out.println(num1+"-"+num2+"="+sub);
System.out.println(num1+"*"+num2+"="+mul);
System.out.println(num1+"/"+num2+"="+div);
System.out.println(num1+"%"+num2+"="+mod);
}
}
