//19.	Write a program to find factorial of N (N!).(3! = 3*2*1 or 1*2*3) 

import java.util.Scanner;
public class Factorial{
  public static void main(String args[]){
 	int n,i,fact=1;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a no :");
	n=sc.nextInt();
	for(i=1;i<=n;i++){
	  fact*=i;
	}
	System.out.println("Factorial is :"+fact);
 }
}