import java.util.Scanner;
class Loop{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
//for(int i=0;i<=100;i=i+5)
int i=0;
int n=sc.nextInt();
while(i<=n){
System.out.print(i+" ");
i=i+5;}
System.out.print(i+" ");
}
}
