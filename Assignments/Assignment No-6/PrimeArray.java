//14.Write a program to accept n numbers and store all prime numbers in an array called prime. Display this array. 

import java.util.Scanner;
public class PrimeArray{
  public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter array size :");
	int n=sc.nextInt();
	int a[]=new int[n];
	accept(a);
	
	int cnt=0;
	for(int i:a){
		if(isPrimeNo(i))
			cnt++;
	}

	int primeArr[]=new int[cnt];
	int index=0;
	for(int i:a){
		if(isPrimeNo(i))
			primeArr[index++]=i;
	}

	displayPrimeArray(primeArr);
	
  }



	public static void accept(int a[]){
		Scanner sc = new Scanner(System.in);
    		for (int i = 0; i < a.length; i++) {
        		a[i] = sc.nextInt();
   		}
	}

	public static boolean isPrimeNo(int n){
	
	if(n<2)
		return false;
	else if(n==2 || n==3)
		return true;
	else if(n%2==0 || n%3==0)
		return false;
	else{
	for(int i=5;i<=Math.sqrt(n);i+=6){
		if(n%i==0 || n%(i+2)==0)
			return false;
	}
	}
	return true;
	}

	public static void displayPrimeArray(int primeArr[]){
		System.out.println("Prime array :");
		for(int i:primeArr)
			System.out.print(" "+i);
	}
}