//27.	Write a program to check whether given number if palindrome number

import java.util.Scanner;
public class palindromeNo{
  public static void main(String args[]){
	int n,s=0,r,temp;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number :");
	n=sc.nextInt();
	
	temp=n;
	while(n>0){
		r=n%10;
		s=s*10+r;
		n=n/10;
	}
	if(temp==s)
		System.out.println("No is palindrome");
	else
		System.out.println("No is not palindrome ");
 }
}