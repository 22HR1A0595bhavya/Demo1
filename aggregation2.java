class Address{
String city,state,country;
public Address(String city,String state,String country){
this.city=city;
this.state=state;
this.country=country;
}
}
class Emp{
int id;
String name;
Address obaddress;// aggregation
public Emp(int id,String name,Address obaddress){
this.id=id;
this.name=name;
this.obaddress=obaddress;
}
void display(){
System.out.println(id+" "+name);
System.out.println(obaddress.city+" "+obaddress.state+" "+obaddress.country);
}
public static void main(String args[]){
	Address address1=new Address("gzb","UP","india");
	Address address2=new Address("gno","Ap","india");
	Emp e1=new Emp(111,"nani",address1);
	Emp e2=new Emp(222,"lucky",address2);
	e1.display();
	e2.display();
}
} 

