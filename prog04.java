import java.util.Scanner;
class test{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
char c=sc.next().charAt(0);
if(((c<='A'&&c>='Z')&&(c<='a'&&c>='z'))&&(c!='A'||c!='E'||c!='I'||c!='O'||c!='U')||(c!='a'||c!='e'||c!='i'||c!='o'||c!='u'))
System.out.println("NO");
else
System.out.println("YES");

}
}