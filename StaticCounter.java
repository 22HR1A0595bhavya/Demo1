class Counter{
	//static int count=0;
int count=0;//if we give static prints 1,2,3 /prints 1, 1, 1
Counter(){
count++;
System.out.println(count);}
public static void main(String args[]){
Counter c1=new Counter();
Counter c2=new Counter();
Counter c3=new Counter();
}}
/*
java static variable

