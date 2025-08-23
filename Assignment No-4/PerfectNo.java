//33.	Write a program to check whether a given number is perfect number. 

import java.util.Scanner;
public class PerfectNo{
	public static void main(String[] args){
	int n,temp,s=0,i;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number ");
	n=sc.nextInt();
	temp=n;
	for(i=1;i<n;i++){
		if(n%i==0)
			s+=i;
	}
	if(temp==s)
		System.out.println("No is perfect");
	else
		System.out.println("No is not perfect");
	
}
}