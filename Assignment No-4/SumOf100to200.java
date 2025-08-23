//16.	Write a program to find sum of even numbers from 100 to 200 (or odd numbers) 

public class SumOf100to200{
  public static void main(String[] args){
	int sum=0,i;
	 for(i=100;i<=200;i++)
	{
		if(i%2==0)
				sum+=i;
	}
	System.out.println("Sum of 100 to 200 is : "+sum);
 }
}