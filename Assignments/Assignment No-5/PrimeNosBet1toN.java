//4.	Write a program to print prime numbers between 1 to n. 

import java.util.Scanner;
public class PrimeNosBet1toN{
  public static void main(String args[]){
	int n,i,num,flag,j;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter n :");
	n=sc.nextInt();
	for(i=2;i<=n;i++){
		flag=1;
		num=i;
		if(num==2 || num==3)
			flag=1;
		else if(num%2==0 || num%3==0)
			flag=0;
		else{
			for(j=5;j<=Math.sqrt(num);j+=6){
				if(num%j==0 || num%(j+2)==0){
					flag=0;
					break;
				}
			}
		}
		if(flag==1)
			System.out.println(num);
	}	
  }
}