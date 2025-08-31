//13.Write a program to store even & odd elements of an array in two separate arrays.

 import java.util.Scanner;
public class EvenOddElementsOfArray{
  public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter array size: ");
	int n=sc.nextInt();
	int a[]=new int[n];
	accept(a,n);

	int even=evencnt(a,n);
	int evenarray[]=new int[even];

	int odd=n-even;
	int oddarray[]=new int[odd];

	separateArray(a,n,evenarray,oddarray);
	displayEvenArray(evenarray);
	displayOddArray(oddarray);
  }
	public static void accept(int a[],int n){
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
	}

	public static int evencnt(int a[],int n){
		int cnt=0;
		for(int i:a){
			if(i%2==0)
				cnt++;
		}
		return cnt;
	}
	public static void separateArray(int a[],int n,int evenarray[],int oddarray[]){
		int oindex=-1;
		int eindex=-1;
		for(int i:a){
			if(i%2==0)
				evenarray[++eindex]=i;
			else
				oddarray[++oindex]=i;
		}
	}

	public static void displayEvenArray(int evenarray[]){
		System.out.println("even array:");
		for(int i:evenarray)
			System.out.print(" "+i);
	}

	public static void displayOddArray(int oddarray[]){
		System.out.println("\nodd array:");
		for(int i:oddarray)
			System.out.print(" "+i);
	}

	
}