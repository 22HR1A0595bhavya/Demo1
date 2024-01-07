class Author{
String authorName;
int age;
String place;
Author(String name,int age,String place){
this.authorName=name;
this.age=age;
this.place=place;
}
}
class Book{
String name;
int price;
Author auther;//author details
Book(String n,int p,Author auther){
this.name=n;
this.price=p;
this.auther=auther;
}
public static void main(String args[]){
Author auther=new Author("John",18,"Ap");
Book b=new Book("Aristotle",150,auther);
System.out.println("Book Name="+b.name);
System.out.println("Book price="+b.price);
System.out.println("---------Author-----------");
System.out.println("Auther name="+b.auther.authorName);
System.out.println("Auther age="+b.auther.age);
System.out.println("Auther place="+b.auther.place);
}
}
