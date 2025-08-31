//11.Write a program to find the largest two numbers in a given array. 

import java.util.Scanner;
public class Largest2NosInArray{
  public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter array size: ");
	int n=sc.nextInt();
	int a[]=new int[n];
	accept(a,n);
	largest2Nos(a,n);
  }

	public static void accept(int a[],int n){
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
	}

	public static void largest2Nos(int a[],int n){
		int max1=a[0],max2=a[1];
		for(int i:a){
			if(max1<i){
				max2=max1;
				max1=i;
			}
			else if(max2<i && max2!=max1)
				max2=i;
		}
		System.out.println("Largest to nos are : "+max2+" "+max1);
	}
}