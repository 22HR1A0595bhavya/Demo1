class Triangle{
int length;
int breadth;
int height;
void insertRecord(int l,int b,int h){
length=l;
breadth=b;
height=h;
}
void calculateArea(){
System.out.println(length*breadth*height);
}
}
class TestTriangle1{
public static void main(String[] args){
Triangle s1=new Triangle();
Triangle s2=new Triangle();
s1.insertRecord(4,5,3);
s2.insertRecord(3,1,1); 
s1.calculateArea();
s2.calculateArea();
}
}