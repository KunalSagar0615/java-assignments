//8.Write a program to copy one array into another array using function. 

import java.util.Scanner;
public class CopyArray{
  public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter array size: ");
	int n=sc.nextInt();
	int a[]=new int[n];
	accept(a,n);
	copyarray(a,n);
  }
	public static void accept(int a[],int n){
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
	}
	
	public static void copyarray(int a[],int n){
	int newarray[]=new int[n];
	for(int i=0;i<n;i++){
		newarray[i]=a[i];
	}
	System.out.println("new array : ");
	for(int i=0;i<n;i++){
		System.out.print(" "+newarray[i]);
	}
	}
}