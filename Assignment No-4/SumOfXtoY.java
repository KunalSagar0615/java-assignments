//10.	Write a program to find sum of x to y (both inclusive) 

import java.util.Scanner;
public class SumOfXtoY{
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
		sum+=i;
	System.out.println("Sum of x to y is : "+sum);
 
}
}