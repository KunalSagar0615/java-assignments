// 13.	Accept the time as hour, minute and seconds and check whether the time is valid. (Hint:0<=hour<24, 0<=minute <60, 0<=second <60) (3 logics) 
import java.util.Scanner;
public class timeIsValidOrNot {
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int hr,min,sec;
	System.out.println("Enter hours :");
	hr=sc.nextInt();
	System.out.println("Enter Min :");
	min=sc.nextInt();
	System.out.println("Enter seconds :");
	sec=sc.nextInt();
	if((0<=hr && hr<24) && (0<=min && min<60) && (0<=sec && sec<60))
		System.out.println("Time is valid");
	else
		System.out.println("Time is invalid");

	System.out.println("Enter hours :");
	hr=sc.nextInt();
	System.out.println("Enter Min :");
	min=sc.nextInt();
	System.out.println("Enter seconds :");
	sec=sc.nextInt();
	if(0<=hr && hr<24)	
		{
		if(0<=min && min<60)
			{
				if(0<=sec && sec<60)
				{
					System.out.println("Time is valid");
				}
				else
					System.out.println("Seconds are invalid");
			}
		else
			System.out.println("min are invalid");

		}
	else
		System.out.println("hours are invalid");


}
}
