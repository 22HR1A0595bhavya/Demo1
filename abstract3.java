abstract class Bank{
abstract float getRateOfInterest();
}
class SBI extends Bank{
float getRateOfInterest(){return 7;}
}
class PNB extends Bank{
float getRateOfInterest(){return 8;}
}
class IDBI extends Bank{
	float getRateOfInterest(){return 9;}
}
class HDFC extends Bank{
	float getRateOfInterest(){return 5;}
}
class TestBank{
public static void main(String args[]){
Bank b;
b=new SBI();
System.out.println("Rate of Interest is:"+b.getRateOfInterest()+"%");
b=new PNB();
System.out.println("Rate of Interest is:"+b.getRateOfInterest()+"%");
b=new IDBI();
System.out.println("Rate of Interest is:"+b.getRateOfInterest()+"%");
b=new HDFC();
System.out.println("Rate of Interest is:"+b.getRateOfInterest()+"%");
}
}