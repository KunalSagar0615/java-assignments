//9.Write a program to compare two arrays using function using function. 

import java.util.Scanner;
public class CompairArray{
  public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size of array : ");
	int n=sc.nextInt();
	int a1[]=new int[n];
	int a2[]=new int[n];

	System.out.println("enter first array elements : ");
	for(int i=0;i<n;i++)
		a1[i]=sc.nextInt();

	System.out.println("enter second array elements : ");
	for(int i=0;i<n;i++)
		a2[i]=sc.nextInt();

	compairArray(a1,a2,n);
  }

	public static void compairArray(int a1[],int a2[],int n){
		for(int i=0;i<n;i++){
			if(a1[i]==a2[1]){
				System.out.println(" index "+i+" is equal");
			}
			else
				System.out.println("index "+i+" is not equal");
		}
	}
}