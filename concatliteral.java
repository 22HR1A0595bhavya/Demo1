class Testimmutablestring{
public static void main(String args[]){
String s="Sachin";
s=s.concat("Tendulkar");//concat()method appends the string at the end
System.out.println(s);//will print sachin because string s are immutable objects
}
}