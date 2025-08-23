//2.Write a program to print hello N times 

import java.util.Scanner;
public class PrintHelloNTimes{
  public static void main(String[] args){
	int n,i;
	Scanner sc=new Scanner(System.in);
	System.out.println("How many times you want print hello : ");
	n=sc.nextInt();
	for(i=0;i<n;i++)
		System.out.println("Hello");
  }
}