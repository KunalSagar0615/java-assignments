//20.	Write a program to accept to integers x and n computer x^n. 

import java.util.Scanner;
public class xOfn
{
 public static void main(String args[]){
	int res=1,x,n,i;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter x : ");
	x=sc.nextInt();
	System.out.println("Enter n : ");
	n=sc.nextInt();

	for(i=1;i<=n;i++){
		res=res*x;
	}
	System.out.println("x^n : "+res);
 }
}


