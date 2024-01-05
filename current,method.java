class A{
void m(){System.out.println("hello m");}
void n(){
System.out.prinln("hello n");
//m();//same as this.m(();
this.m();
}
}
Class TestThis4{
public static void main(String arg[]){
A a=new A();
a.n();
}
}

