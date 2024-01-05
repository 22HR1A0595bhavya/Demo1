class s2{
void m(s2 obj){
System.out.println("menthod is invoked");
}
void p(){
m(this);
}
public static void main(String args[]){
s2 ob=new s2();
ob.p();
}
}
//used to pass arguments in method