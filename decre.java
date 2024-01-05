class PrePostDecrement
{
public static void main(String args[]){
int i=20;
int a=i--;
System.out.println("a="+a); //prints 20
System.out.println("i"+i);//print 19
--i;
System.out.println(i);//print 18
System.out.println(--i);//prints 17
System.out.println(i--);//prints 17
System.out.println(i);//prints 16
int j=20;
int b=--j;
System.out.println("b="+b);//prints 19
System.out.println("j"+j);//prints 19
}
}
