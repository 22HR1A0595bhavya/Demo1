import java.util.*;
class CharAtExample6{
ArrayList<Character>a1;
//Constructor 
CharAtExample6(){
a1=new ArrayList<Character>();
a1.add('a');a1.add('e');a1.add('i');a1.add('o');
a1.add('u');a1.add('A');a1.add('E');a1.add('I');
a1.add('O');a1.add('U');
}
private boolean isVowel(char c){
for(int i=0;i<a1.size();i++)
{
if(c==a1.get(i)){
return true;}}
return false;}
public int countVowels(String s)
{
int countVowel=0;
int size=s.length();
for(int j=0;j<size;j++)
{
char c=s.charAt(j);
if(isVowel(c)){
countVowel=countVowel+1;
}}
return countVowel;}
public static void main(String arg[])
{
CharAtExample6 obj=new CharAtExample6();
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
int noOfVowel=obj.countVowels(str);
System.out.println("String  "+str);
System.out.println("Total no.of vowels in the string are:"+noOfVowel+"\n");
}
}