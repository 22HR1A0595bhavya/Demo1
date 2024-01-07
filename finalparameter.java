class A{
int cube(final int n){
n=n+2;
//cant be changed as n is final
return n*n*n;
}
public static void main(String args[]){
Bike11 b=new Bike11();
b.cube(5);
}
}
//final method cant overrided
//cant change value (constant)