//3.Write a for Linear Search, which accepts an array of n elements and a key as parameters 
//and returns the position of key in the array and -1 if the key is not found. Accept n 
//numbers from the user, store them in an array. Accept the key to be searched and search it 
//using this function. Display appropriate messages

import java.util.Scanner;
public class LinearSearchInArray{
  public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter array size: ");
	int n=sc.nextInt();
	int a[]=new int[n];
	accept(a,n);
	System.out.println("enter key to search : ");
	int key=sc.nextInt();
	int index=search(a,n,key);
	if(index!=-1)
		System.out.println("key found at "+index);
	else
		System.out.println("key not found -1");
  }
	public static void accept(int a[],int n){
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
	}

	public static int search(int a[],int n,int key){
		int flag =-1;
		for(int i=0;i<n;i++){
			if(a[i]==key){
				flag =i;
				return flag;
			}
		}
		return flag;
	}
}
