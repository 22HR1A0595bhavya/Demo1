class Demo{
public static void main(){
System.out.println("main method without argument called");
}
public static void main(int x){
System.out.println("main method with argument called"+x*2);
}
public static void main(String s){
System.out.println("welcome"+s);
}
public static void main(String args[]){
System.out.println("i am writtig");
main();
main("harsha");
main(20);
}
}