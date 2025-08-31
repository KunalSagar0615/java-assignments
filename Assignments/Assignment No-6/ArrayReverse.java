//7.Write a program to reverse an array of n integers using function. 

import java.util.Scanner;
public class ArrayReverse{
  public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter array size: ");
	int n=sc.nextInt();
	int a[]=new int[n];
	accept(a,n);
	reverse(a,n);
  }

	public static void accept(int a[],int n){
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
	}

	public static void reverse(int a[],int n){
		for(int i=n-1;i>=0;i--)
			System.out.print(" "+a[i]);
	}
}
