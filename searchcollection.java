import java.util.*;
class VectorExample{
public static void main(String args[]){
Vector<String>vec=new Vector<String>(4);
vec.add("Tiger");
vec.add("Lion");
vec.add("Dog");
vec.add("Elephant");
System.out.println("Size is:"+vec.size());
System.out.println("Default capacity is:"+vec.capacity());
System.out.println("Vector elements"+vec.capacity());
vec.addElement("rat");
vec.addElement("deer");
vec.addElement("cat");
System.out.println("size after addition:"+vec.size());
System.out.println("Capacity after addition is:"+vec.capacity());
System.out.println("Elements are:"+vec);
if(vec.contains("Tiger"))
{
System.out.println("Tiger is present at index"+vec.indexOf("Tiger"));
}
else
{System.out.println("Tiger is not present in list");
System.out.println("The first animal of vector is:"+vec.firstElement());
System.out.println("The last animal of the vector is:"+vec.lastElement());
}
}
}


