import java.util.Scanner;
class sort{
public static void main(String args[]){
int n,i=0;
Scanner sc=new Scanner(System.in);
System.out.println("size of array");
n=sc.nextInt();
int a[]=new int[n];
System.out.println("Enter all the elements:");
for(i=0;i<n;i++)
{a[i]=sc.nextInt();}
//sorting
for(i=0;i<a.length;i++){
for(int j=0;j<a.length-i-1;j++){
int temp=0;
if(a[j]>a[j+1]){//swap a[i] and a[j]
temp=a[j];
a[j]=a[j+1];
a[j+1]=temp;
}
}//for loop inner
}//for loop outer
for(int x : a)
System.out.print(x+" ");
}
}


