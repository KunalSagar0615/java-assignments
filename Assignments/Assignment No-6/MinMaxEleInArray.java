//2.	Write a program to accept n numbers in an array and find the largest and smallest number. 

import java.util.Scanner;
public class MinMaxEleInArray{
  public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter array size: ");
	int n=sc.nextInt();
	int a[]=new int[n];
	accept(a,n);
	max(a,n);
	min(a,n);
  }
	public static void accept(int a[],int n){
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
	}

	public static void max(int a[],int n){
		int max=a[0];
		for(int i=0;i<n;i++){
			if(max<a[i])
				max=a[i];
		}
		System.out.println("largest no is : "+max);
	}

	public static void min(int a[],int n){
		int min=a[0];
		for(int i=0;i<n;i++){
			if(min>a[i])
				min=a[i];
		}
		System.out.println("smallest no is :"+min);
	}
}