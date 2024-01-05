import java.util.Scanner;
class BreakEx1{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
byte i=0;
while(true)
{
//if(i==n)break;
i++;
if(i%5==0)continue;
System.out.print(i+",");
}
}
}