import java.util.*;
class TestJavaCollection{
public static void main(String args[]){
PriorityQueue<String>queue=new PriorityQueue<String>();
queue.add("Auyush");
queue.add("Gourav");
queue.add("Amit");
queue.add("Garima");
queue.add("ashish");
System.out.println("head"+queue.element());
System.out.println("head"+queue.peek());
System.out.println("Iterating the queue element");
Iterator itr=queue.iterator();
while(itr.hasNext()){
System.out.println(itr.next());
}
queue.remove();
queue.poll();
System.out.println("After removing two element");
Iterator<String>itr2=queue.iterator();
while(itr2.hasNext())
{
System.out.println(itr2.next());
}
}
}
