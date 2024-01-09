import java.util.Vector;
class Main{
public static void main(String args[]){
Vector <String> frnd=new Vector<>();
frnd.add("john");
frnd.add("Nani");
frnd.add(2,"Mary");
System.out.println("Vector:"+frnd);
Vector<String> frnds=new Vector<>();
frnds.add("jani");
frnds.addAll(frnd);
System.out.println("New Vector:"+frnds);
}
}
