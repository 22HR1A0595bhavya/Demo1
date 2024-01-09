import java.util.Scanner;
class ReplaceAll{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String input=sc.nextLine();
char ch=sc.next().charAt(0);
String c=String.valueOf(ch);
String res=input.replaceAll(c,"#");
System.out.println(res);
}
}
