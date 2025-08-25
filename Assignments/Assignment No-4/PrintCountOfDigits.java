//22.	Write a program that accepts a number and count the number of digits in given number. 
import java.util.Scanner;
public class PrintCountOfDigits{
  public static void main(String args[]){
	int n,r,cnt=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a no :");
	n=sc.nextInt();
	while(n>0){
		r=n%10;
		cnt++;
		n=n/10;
	}
	System.out.print("Count : "+cnt);
  }
}