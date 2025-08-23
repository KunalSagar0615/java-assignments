//25.	Write a program to check whether a given number is Armstrong number
import java.util.Scanner;
public class Armstrong{
  public static void main(String args[]){
	int n,r,temp,cnt=0;
	double s=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a no :");
	n=sc.nextInt();
	temp=n;
	while(n>0)
        {
        cnt++;
        n=n/10;
    	}
    	n=temp;
	while(n>0){
		r=n%10;
		s=s+Math.pow(r,cnt);
		n=n/10;
	}
	if(s==temp)
		System.out.println("No is armstrong");
 	else
		System.out.println("No is not armstrong"); 
 }
}