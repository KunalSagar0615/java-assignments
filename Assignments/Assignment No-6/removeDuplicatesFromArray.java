//19.Write a program to remove all duplicate elements from an array. 

import java.util.Scanner;
public class removeDuplicatesFromArray{
  public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter array size: ");
	int n=sc.nextInt();
	int a[]=new int[n];
	accept(a,n);
  }
	public static void accept(int a[],int n){
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
	}
	public static void display(int a[],int n){
		System.out.println("\narray elements are:");
		for(int i=0;i<n;i++)
			System.out.println(a[i]);
	}
}