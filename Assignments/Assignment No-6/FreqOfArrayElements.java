//4.Write a function, which accepts an integer array and an integer as parameters and counts the occurrences of the number in the array. 

import java.util.Scanner;
public class FreqOfArrayElements{
  public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter array size: ");
	int n=sc.nextInt();
	int a[]=new int[n];
	accept(a,n);
	System.out.println("enter element to cound its frequency :");
	int ele=sc.nextInt();
	frequnecy(a,n,ele);
  }
	public static void accept(int a[],int n){
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
	}

	public static void frequnecy(int a[],int n,int ele){
		int cnt=0;
		for(int i=0;i<n;i++){
			if(ele==a[i])
				cnt++;
		}
		System.out.println("frequency count :"+cnt);
	}
}