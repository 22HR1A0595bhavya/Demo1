class Rectangle{
int length;
int breadth;
void insertRecord(int l,int b){
length=l;
breadth=b;
}
void calculateArea(){
System.out.println(length*breadth);
}
}
cclass TestRectangle1{
public static void main(String[] args){
Rectangle s1=new Rectangle();
Rectangle s2=new Rectangle();
s1.insertRecord(4,13);
s2.insertRecord(3,15);
s1.calculateArea();
s2.calculateArea();
}
}
