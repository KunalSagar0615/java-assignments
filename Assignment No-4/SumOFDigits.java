//24.	Write a program to find sum of digits of given number. 
import java.util.Scanner;
public class SumOFDigits{
  public static void main(String args[]){
	int n,r,s=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a no :");
	n=sc.nextInt();
	while(n>0){
		r=n%10;
		s+=r;
		n=n/10;
	}
	System.out.print("Sum of digits :  "+s);
  }
}