import java.util.Scanner;
class FrequencyChar{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
char c=sc.next().charAt(0);
int count=0;
for(int i=0;i<=str.length()-1;i++){
if((c=='0'||c=='1'||c=='2'||c=='3'||c=='4')||(c=='5'||c=='6'||c=='7'||c=='8'||c=='9'))
{
count++;
}
}System.out.println(count);
}
}