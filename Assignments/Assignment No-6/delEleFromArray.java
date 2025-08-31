//18.Write a program to delete the specified Integer from an Array (using function). 

import java.util.Scanner;
public class delEleFromArray{
  public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter array size: ");
	int n=sc.nextInt();
	int a[]=new int[n];
	accept(a,n);
	System.out.println("enter element you want to delete :");
	int key=sc.nextInt();
	int ind=search(a,n,key);
	
	if(ind>=0){
		n=delElement(a,n,ind);
		display(a,n);
	}
	else
		System.out.println("Element not found");

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

	public static int search(int a[],int n,int key){
		for(int i=0;i<n;i++){
			if(a[i]==key)
				return i;
		}
		return -1;
	}
	
	public static int delElement(int a[],int n,int ind){
		for(int i=ind;i<n-1;i++)
			a[i]=a[i+1];

	return n-1;
	}
}