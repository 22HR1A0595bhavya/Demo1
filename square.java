class Square{
int length;
void insertRecord(int l){
length=l;
}
void calculateArea(){
System.out.println(length*length);
}
}
class TestSquare1{
public static void main(String[] args){
Square s1=new Square();
Square s2=new Square();
s1.insertRecord(4);
s2.insertRecord(3);
s1.calculateArea();
s2.calculateArea();
}
}
