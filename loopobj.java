import java.util.Scanner;
class Student{
private String name;
private int id;
public void setId(int id){this.id=id;}
public void setName(String name){this.name=name;}
public int getId(){return this.id;}
public String getName(){return this.name;}
}
class Day4Program{
public static void main(String ags[]){
	Scanner sc=new Scanner(System.in);
Student[] ob=new Student[3];
for(int i=0;i<3;i++){
ob[i]=new Student();
ob[i].setId(sc.nextInt());
ob[i].setName(sc.next());
System.out.println("ID:"+ob[i].getId());
System.out.println("Name:"+ob[i].getName());
}
System.out.println("Details are:");
for(int j=0;j<3;j++){
	System.out.println("ID"+ob[j].getId());
	System.out.println("Name"+ob[j].getName());
}
}
}