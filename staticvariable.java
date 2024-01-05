//java program to illustrate the uses of static variable
class counter{
static int count=0;
Counter()
{
count++;//increment value of variable
System.out.println(count);
}
public static void main(String args[]){
Counter c1=new Counter();
Counter c2=new Counter();
Counter c3=new Counter();
}
}

