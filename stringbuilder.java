class StringBuilderExample{
public static void main(String args[]){
StringBuilder sb=new StringBuilder("hello");
sb.append("java");//now orginal string is changed
System.out.println(sb);//prints hello java
}
}