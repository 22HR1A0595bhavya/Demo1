
import java.util.Vector;
class VectorEx1{
public static void main(String args[]){
Vector<Integer> vec=new Vector<>();
vec.add(100);
vec.add(200);
vec.add(300);
vec.add(400);
vec.add(500);
vec.add(600);
vec.add(700);
vec.add(800);
System.out.println("value is:"+vec);
System.out.println("remove element of first occurance of 200:"+vec.remove((Integer)200));
System.out.println("Values in vector:"+vec);
System.out.println("Remove element at index 4:"+vec.remove(4));
System.out.println("New Value list in vector:"+vec);//remove an element
vec.removeElementAt(5);
//check vector and display the element
System.out.println("3Vector element after removal:"+vec);
//get the hash code for this vector
System.out.println("Hash code for vector="+vec.hashCode());
//get element at specified index
System.out.println("Element at index 1 is:"+vec.get(1));
}
}


