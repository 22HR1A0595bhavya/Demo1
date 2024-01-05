class Employe{
private int id;
private String name;
public void setId(int id){
this.id=id;
}
public void setName(String name){this.name=name;}
public int getId(){
return id;}
public String getName(){return name;}
}
class BCA2{
public static void main(String args[])
{
Employe ob=new Employe();
ob.setId(27741);
ob.setName("BHAVYA");
System.out.println("id:"+ob.getId());
System.out.println("name:"+ob.getName());
}
}
