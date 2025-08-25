//18.	Write a program to find sum of even numbers from x to y (both inclusive)   (or odd numbers) 

import java.util.Scanner;
public class SumOfXToYQ18{
  public static void main(String[] args){
	int sum=0,i,x,y;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter starting no : ");
	x=sc.nextInt();
	System.out.println("Enter ending no : ");
	y=sc.nextInt();
	if(y<x)	
		System.out.println("Starting number must be greater than Ending no");

	 for(i=x;i<=y;i++)
	{
	if(i%2==0)
		sum+=i;
	}
	System.out.println("Sum of x to y is : "+sum);
 
}
}