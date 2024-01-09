class Animal
{
public void move()
{
System.out.println("call from animal class");
}
}
class wild extends Animal
{
public void move(){
System.out.println("call frm wild class");
}}
class Pet extends Animal
{
public void move(){
System.out.println("call frm pet class");
}}
class Test
{
public static void main(String args[])
{
Animal a=new Animal();
Animal w=new wild();
Animal p=new Pet();
a.move();
w.move();
p.move();
}}