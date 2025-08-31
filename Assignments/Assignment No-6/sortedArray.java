//16.	Write a program to merge two sorted arrays into a third array such that the third array is also in the sorted order. 

import java.util.Scanner;
public class sortedArray{

  public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size of first array & elements :");
	int n1=sc.nextInt();
	int a1[]=new int[n1];
	accept(a1);

	System.out.println("Enter size of second array & elements :");
	int n2=sc.nextInt();
	int a2[]=new int[n2];
	accept(a2);

	sort(a1);
	System.out.println("\n\nFirst sorted array :");
	display(a1);

	sort(a2);
	System.out.println("\n\nsecond sorted array :");
	display(a2);

	int sortedArr[]=new int[n1+n2];
	mergeArr(a1,a2,n1,n2,sortedArr);
	sort(sortedArr);
	System.out.println("\n\nmerged sorted array :");
	display(sortedArr);

	
  }
	public static void accept(int a[]){
		Scanner sc = new Scanner(System.in);
    		for (int i = 0; i < a.length; i++) {
        		a[i] = sc.nextInt();
   		}
	}

	public static void sort(int a[]){
	for(int i=0;i<a.length ;i++){
		for(int j=0;j<a.length-i-1;j++){
			if(a[j]>a[j+1]){	
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
	}

	public static void mergeArr(int a1[],int a2[],int n1,int n2,int sortedArr[]){
		for(int i=0;i<n1;i++)
			sortedArr[i]=a1[i];

		for(int i=0;i<n2;i++)
			sortedArr[n1+i]=a2[i];

	}
	
	public static void display(int a[]){
		for(int i:a)
			System.out.print(" "+i);
	}
}