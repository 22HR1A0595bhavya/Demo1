import java.util.Scanner;
class Abc{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
for(int i=1;i<=num;i++){
if(num%i==0){
System.out.print(i);
if(i!=num)
System.out.print(",");
}
}
}
}
