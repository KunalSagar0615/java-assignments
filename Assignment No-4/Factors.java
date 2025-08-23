//29.	Write a program to print factors of a given number. 

import java.util.Scanner;
public class Factors
{
 public static void main(String args[]){
	int n,i;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number :");
	n=sc.nextInt();
	for(i=1;i<=n;i++){
		if(n%i==0)
			System.out.println(i);
	}
}
}