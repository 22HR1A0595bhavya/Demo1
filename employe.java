class Employe{
int idno;
String name;
String dept;
void insertRecord(int i,String n,String d){
idno=i;
name=n;
dept=d;
}
void displayInformation(){
System.out.println(idno+" "+name+" "+dept);
}
}
class TestStudent4{
public static void main(String[] args){
Employe s1=new Employe();
Employe s2=new Employe();
s1.insertRecord(111,"bhavya","CSE");
s2.insertRecord(222,"BhavyaSri","AIDS");
s1.displayInformation();
s2.displayInformation();

}
}
