//interface declaration by first user
interface Drawable{
void draw();
}
//implementation of second user
class Rectangle implements Drawable{
public void draw(){System.out.println("Drawing Rectangle");}}
//Implementation by third user
class Circle implements Drawable{
public void draw(){System.out.println("Drawing Circle");}}
//Using interface by third user
class TestInterface{
public static void main(String args[]){
Drawable d=new Circle()	;
//in real sceniaro object is provided by method eg.getDrawable()
d.draw();
}}
 