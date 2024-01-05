//sum and average of array
class Main{
public static void main(String args[]){
int[] numbers={2,12,-8,4,5,6};
int sum=0;
Double average;
//access all elements using for each loop& add each element in sum
for(int number:numbers){
sum+=number;
}
//get the total numbers of elements
int arrayLength=numbers.length;
//calculate average,convert the average from int to double
average=((double)sum/(double)arrayLength);
System.out.println("Sum="+sum);
System.out.println("Average="+average);
}
}
