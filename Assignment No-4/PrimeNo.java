//34.	Write a program to check whether a given number is prime number. 

import java.util.Scanner;
public class PrimeNo{
public static void main(String args[]){
	int n,flag,i;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number : ");
	n=sc.nextInt();
	flag=1;
	if (n <= 1)
		flag=0;            
        else if (n == 2 || n == 3) 
            	flag=1;
	else if(n%2==0 || n%3==0)
		flag=0;
	else{
		for(i=5;i<=Math.sqrt(n);i+=6){
			if(n%i==0 || n%(i+2)==0){
				flag=0;
				break;
			}
		}
	}
	if(flag==1)
		System.out.println("Prime no ");
	else
		System.out.println("Not Prime");
}
}