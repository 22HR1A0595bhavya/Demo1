import java.util.Scanner;
class Num{
public static void main(String ags[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter first number");
int num1=sc.nextInt();
System.out.println("Enter second number");
int num2=sc.nextInt();
System.out.println("Enter third number");
int num3=sc.nextInt();
//int num1=1;num2=2;
System.out.println("num1>num2 is>num3"+(num1 >num2 >num3));
System.out.println("num1<num2<num3 is"+(num1 <num2 <num3));
System.out.println("num1 <=num2 <=num3 is"+(num1 <=num2 <=num3));
System.out.println("num1 >=num2>=num3 is"+(num1 >=num2 >=num3));
System.out.println("num1 ==num2==num3 is"+(num1 ==num2 ==num3));
System.out.println("num1 !=num2!=num3 is"+(num1 !=num2 !=num3));
}
}
