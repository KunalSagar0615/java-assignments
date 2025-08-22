//30.Write a program to print sum of factors of a given number 

import java.util.Scanner;
public class SumOfFactors
{
 public static void main(String args[]){
	int n,i,sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number :");
	n=sc.nextInt();
	for(i=1;i<=n;i++){
		if(n%i==0)
			sum+=i;
	}
	System.out.println("Sum of factors : "+sum);
}
}