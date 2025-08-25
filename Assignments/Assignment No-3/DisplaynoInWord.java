//1.Accept a single digit from the user and display it in words. For example, if digit entered is 9, display Nine. 

import java.util.Scanner;
public class DisplaynoInWord{
  public static void main(String[] args){
	int n;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a digit");
	n=sc.nextInt();
	
	switch(n){
	case 1->System.out.println("One");
	case 2->System.out.println("Two");
	case 3->System.out.println("Three");
	case 4->System.out.println("Four");
	case 5->System.out.println("Five");
	case 6->System.out.println("Six");
	case 7->System.out.println("Seven");
	case 8->System.out.println("Eight");
	case 9->System.out.println("Nine");
	case 0->System.out.println("Zero");
	default->System.out.println("You enterd other than 0 to 9");
	}
}
}