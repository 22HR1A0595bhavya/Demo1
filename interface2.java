interface printtable{
void print();
}
class A6 implements printtable{
public void print()
{System.out.print("Hello");
}
}
class Test{
public static void main(String args[]){
A6 ob=new A6();
ob.print();
}
}
