class StringBuilderExample2{
public static void main(String args[]){
StringBuilder sb=new StringBuilder("hello");
sb.insert(1,"java");//now original string is changed
System.out.println(sb);//prints hjavaello
}
}