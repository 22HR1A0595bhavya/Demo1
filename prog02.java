import java.util.Scanner;
class test{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
char c=sc.next().charAt(0);
if((c!=alpha()))
System.out.println("YES");
else
System.out.println("NO");
}
}