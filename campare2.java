class Teststringcomparision4{
public static void main(String args[]){
String s1="Sachin";
String s2="Sachin";
String s3="Ratan";
System.out.println(s1.compareTo(s2));//0
System.out.println(s1.compareTo(s3));//1(beacause s1>s3)
System.out.println(s3.compareTo(s1));
}
}