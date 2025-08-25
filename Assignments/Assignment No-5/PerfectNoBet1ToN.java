//5.	Write a program to print perfect numbers between 1 to n. 

import java.util.Scanner;
public class PerfectNoBet1ToN{
  public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int n,s,i,num;
	System.out.println("enter number : ");
	n=sc.nextInt();

	System.out.println("Perfect numbers : ");
	for(i=1;i<n;i++){
		num=i;
		int sum=0;
		for(int j=1;j<num;j++){
			if(num%j==0){
				sum+=j;
			}
		}
		if(sum==num)
			System.out.println(sum);
	}
  }
}