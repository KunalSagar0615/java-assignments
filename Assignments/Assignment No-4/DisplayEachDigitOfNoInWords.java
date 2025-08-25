//28.	Write a program which accepts a number and display each digit of number in words. 

import java.util.Scanner;
public class DisplayEachDigitOfNoInWords{
  public static void main(String args[]){
	int n,s=0,r,no;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number :");
	n=sc.nextInt();
	
	while(n>0){
		r=n%10;
		s=s*10+r;
		n=n/10;
	}
	no=s;
	while(no>0){
		r=no%10;
		switch(r){
		case 0->System.out.println("zero");
		case 1->System.out.println("one");
		case 2->System.out.println("two");
		case 3->System.out.println("three");
		case 4->System.out.println("four");
		case 5->System.out.println("five");
		case 6->System.out.println("six");
		case 7->System.out.println("seven");
		case 8->System.out.println("eight");
		case 9->System.out.println("nine");
		}
		no=no/10;
	}
 }
}