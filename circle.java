class Circle{
int radius;
void insertRecord(int l){
radius=l;
}
void calculateArea(){
System.out.println(3.14*radius*radius);
}
}
class TestCircle{
public static void main(String[] args){
Circle s1=new Circle();
Circle s2=new Circle();
s1.insertRecord(1);
s2.insertRecord(3);
s1.calculateArea();
s2.calculateArea();
}
}