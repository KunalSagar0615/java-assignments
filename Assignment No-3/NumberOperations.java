//3.	Accept two numbers in variables x and y from the user and perform the following operations 

import java.util.Scanner;
public class NumberOperations{
  public static void main(String[] args){
	int a,b,c,ch;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first no : ");
	a=sc.nextInt();
	System.out.println("Enter second no : ");
	b=sc.nextInt();
	
	System.out.println("\n 1: Equality \n 2: Less Than \n 3: Quotient and Remainder \n 4: Range \n 5: Swap  \n Enter your choice :");
	ch=sc.nextInt();
	switch(ch){
	  case 1:
		if(a==b)
			System.out.println("both are equal");	
		else
			System.out.println("both are not equal");
		break;

	  case 2:
		if(a<b)
			System.out.println("first no is less than second");
		else
			System.out.println("second no is less than first");
		break;

	  case 3:
		System.out.println("Quotient is : "+(a/b));
		System.out.println("Reminder is : "+(a%b));
		break;

	  case 4:
		System.out.println("Enter a no : ");
		c=sc.nextInt();
		if((c>a && c<b) || (c<a && c>b))
			System.out.println("Third no is lies between first and second");
		else
			System.out.println("Third dosenot lies between first and second");
		break;

	  case 5:
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("Swapped values : "+a+" "+b);
		break;
	
	  default:System.out.println("Invalid choice ");

	}
}
}