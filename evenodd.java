import java.util.Scanner;
class Even{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n;
n=sc.nextInt();
if(n%2==0)
{
System.out.println("Even\n");
System.out.println(n+" is even");
}
else
{
System.out.println("Odd\n");
System.out.println(n+" is Odd");
}
}
}

