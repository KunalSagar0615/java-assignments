//21.	Write a program that accepts a number and print it’s all digits. 

import java.util.Scanner;
public class PrintDigitsOfNo{
  public static void main(String args[]){
	int n,r,s;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a no :");
	n=sc.nextInt();
	while(n>0){
		r=n%10;
		System.out.print(" "+r);
		n=n/10;
	}
  }
}