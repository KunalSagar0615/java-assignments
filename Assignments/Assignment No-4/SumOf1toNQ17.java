//17.	Write a program to find sum of even numbers from 1 to N (or odd numbers) 

import java.util.Scanner;
public class SumOf1toNQ17{
  public static void main(String[] args){
	int sum=0,i,n;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a no : ");
	n=sc.nextInt();
	 for(i=1;i<=n;i++)
	{
		if(i%2==0)
			sum+=i;
	}
	System.out.println("Sum of 1 to n is : "+sum);
}
}