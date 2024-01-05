import java.util.Scanner;
class Increment{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int i=10;
int a=i++;
System.out.println("a="+a);
System.out.println(i);//print 11
++i;
System.out.println(i);//prints 12
System.out.println(++i);//prints 13
System.out.println(i++);//print 13
System.out.println(i);
int j=10;
int b=++j;
System.out.println("b="+b);
}
}
