//6.	Write a program to print x to y (both inclusive) 

import java.util.Scanner;
public class PrintXToY{
  public static void main(String[] args){
	int i,x,y;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Starting no : ");
	x=sc.nextInt();
	System.out.println("Enter Ending no : ");
	y=sc.nextInt();
	if(y<x)	
		System.out.println("Starting number must be greater than Ending no");
	for(i=x;i<=y;i++)
		System.out.println(i);
  }
}