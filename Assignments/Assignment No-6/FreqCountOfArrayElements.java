//10.Write a program to accept n numbers in the range of 1 to 25 and count the frequency of occurrence of each number. 

import java.util.Scanner;
public class FreqCountOfArrayElements{
  public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter array size: ");
	int n=sc.nextInt();
	int a[]=new int[n];
	System.out.println("enter elements in range 1 to 25 :");
	accept(a,n);
	for(int i=1;i<25;i++){
		if(search(a,n,i)){
		int cnt=frequnecy(a,n,i);
		System.out.println("Frequency count for "+i+" "+cnt);
		}
	}
  }
	public static void accept(int a[],int n){
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
	}

	public static boolean search(int a[],int n,int ele){
		for(int i=0;i<n;i++){
			if(ele==a[i])
				return true;
		}
		return false;
	}

	public static int frequnecy(int a[],int n,int ele){
		int cnt=0;
		for(int i=0;i<n;i++){
			if(ele==a[i])
				cnt++;
		}
		return cnt;
	}

}