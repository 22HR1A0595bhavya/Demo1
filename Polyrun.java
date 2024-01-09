class Person{
public void move(){System.out.println("I am Person");
}
}
class Student extends Person{
public void move(){System.out.println("I am Student");
}
}
class Faculty extends Student{
public void move(){System.out.println("I am Faculty");
}
}

class Test2{
public static void main(String args[]){
Person a=new Person();
Person b=new Student();
Person c=new Faculty();
a.move();
b.move();
c.move();
}
}
