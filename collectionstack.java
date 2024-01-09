import java.util.*;
class TestJavaCollection{
public static void main(String args[]){
Stack<String>stack=new Stack<String>();
stack.push("Auyush");
stack.push("Gourav");
stack.push("Amit");
stack.push("Garima");
stack.push("ashish");
stack.pop();
Iterator<String>itr=stack.iterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}
}
}
