import java.util.Scanner;
class prog{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n1=sc.nextInt();//10
int n2=sc.nextInt();//2
try
{
int n3=(int)n1/n2;
System.out.println(n1+"/"+n2+"="+n3);
}
catch(Exception e){
System.out.println(e);
System.out.println("We learnt Exception");
}
finally{
System.out.println("Finally block executed");
}
System.out.println("Thank you");
}
}
