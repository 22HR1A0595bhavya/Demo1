interface Bank{
float rateOfInterest();
}
class SBI implements Bank{
public float rateOfInterest(){return 9.12f;}
}
class PNB implements Bank{
public float rateOfInterest(){return 5.66f;}
}
class TestInterface{
public static void main(String args[]){
Bank b=new SBI();
System.out.println("ROI:"+b.rateOfInterest());
}}