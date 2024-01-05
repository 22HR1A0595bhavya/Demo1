import java.util.Scanner;
class Loop{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
//for(int i=n;i>=1;i--)
int i=n;
while(i>=1){

System.out.print(i+" ");
i=i-1;
}
}
}