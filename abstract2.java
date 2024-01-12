abstract class Bank{
abstract int getRateOfInterest();
}
class SBI extends Bank{
int getRateOfInterest(){return 7;}
}
class PNB extends Bank{
int getRateOfInterest(){return 8;}
class IDBI ectends Bank{
	int getRateOfInterest(){return 9;}
}
class HDFC extends Bank{
	int getRateOfInterest(){return 5;}
}
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
