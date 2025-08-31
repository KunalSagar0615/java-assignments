//12.Write a program to find the second largest & smallest elements in an array. 

import java.util.Scanner;
public class SecondlargestAndSmallest{
  public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter array elements : ");
	int n=sc.nextInt();
	int a[]=new int[n];
	System.out.println("Ente array elements : ");
	for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
	sort(a,n);
	System.out.println("Second largest element is: "+(a[n-2]));
	System.out.println("Second smallest element is: "+(a[1]));
	
  }
	public static void sort(int a[],int n){
		int temp;
		for(int i=0;i<n;i++){
			for(int j=0;j<n-i-1;j++){
			if(a[j]>a[j+1]){
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				}
			}
		}
	}
}