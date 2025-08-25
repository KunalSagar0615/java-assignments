//2.	Write a program to print multiplication table between 1 to n. 

import java.util.Scanner;
public class MultiplicationTable
{
	public static void main(String args[]){
	int i,n,j,k;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a no to print mulatipliction table : ");
	n=sc.nextInt();

	for(i=1;i<=n;i++){
			System.out.println("\nTable of "+i);
		for(j=1;j<=10;j++){
				System.out.println(i+"*"+j+":"+(i*j));
		}
	}
	}
}