import java.util.Scanner;
class A{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int num1,num2;
num1=sc.nextInt();
num2=sc.nextInt();
num1=num1+num2;//temp=5
num2=num1-num2;//num1=7
num1=num1-num2;//num2=5
System.out.println(num1+"\n"+num2);
}
}