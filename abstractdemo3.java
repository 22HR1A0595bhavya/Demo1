abstract class Shape{
abstract void draw();
}
//in real scenario implementation is provided by others 
//unknown by end user
class Rectangle extends Shape{
void draw(){System.out.println("drawing rectangle");
}
}
class Circle extends Shape{
void draw(){System.out.println("Drawing Circle");
}
}
//in real scenario method  is called by programmer or user
class Test4{
public static void main(String args[]){
Shape s=new Circle();
 s.draw();
 Shape r=new Rectangle();
 r.draw();
 }
 }
 