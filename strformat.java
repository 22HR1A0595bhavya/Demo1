class StrFormat{
public static void main(String args[])
{
String s1=new String("hello");
String s2=new String("world");
String s3=new String("java");
String s=String.format("%s%s%S",s1,s2,s3);
System.out.println(s.toString());
}
}