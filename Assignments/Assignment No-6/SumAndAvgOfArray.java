//1.	Write a program to accept n numbers and store in an array. Calculate Sum and 
//Average of n numbers. 

import java.util.Scanner;
public class SumAndAvgOfArray{

public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter array size: ");
	int n=sc.nextInt();
	int a[]=new int[n];
	accept(a,n);
	sum(a,n);
}

	public static void accept(int a[],int n){
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
	}
	public static void sum(int a[],int n){
		int sum=0;
		for(int i=0;i<n;i++){
			sum+=a[i];
		}
		System.out.println("Sum is:"+sum);
		System.out.println("Avg is : "+(sum/n));
	}

}