class Employe{
private int id;
public void setId(int id){
this.id=id;
}
public int getId(){
return id;}
}
class BCA2{
public static void main(String args[])
{
Employe ob=new Employe();
ob.setId(27741);
System.out.println("id:"+ob.getId());
}
}
