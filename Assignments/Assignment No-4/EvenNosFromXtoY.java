//14.	Write a program to print even numbers from x to y (both inclusive) (or odd numbers) 

import java.util.Scanner;
public class EvenNosFromXtoY{
  public static void main (String args[]){
	int i,x,y;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter starting number : ");
	x=sc.nextInt();
	System.out.println("Enter ending number : ");
	y=sc.nextInt();
	if(y<x)
		System.out.println(" second number must begreater than first");
	System.out.println("Even nos :");
	for(i=x;i<=y;i++)
	{	  
	  if(i%2==0)
		System.out.println(i);
	}
}
}