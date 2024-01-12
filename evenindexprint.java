//example to access elements present at odd index
class CharAtExample{
public static void main(String args[]){
String str="Welcome to college";
for(int i=0;i<=str.length()-1;i++){
if(i%2==0){System.out.println("char at :" +i+ "place " +str.charAt(i));}
}
}
}
