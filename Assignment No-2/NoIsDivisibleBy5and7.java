// 5.Write a program to check whether given number is divisible by 5 and 7? (with && operator and with nested if) 
import java.util.Scanner;
public class NoIsDivisibleBy5and7 {
public static void main(String args[])
{
    int no;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number : ");
    no=sc.nextInt();
    if((no%5==0) && (no%7==0))
        System.out.println("No is divisible by 5 and 7");
    else if((no%5==0))
        System.out.println("No is divisible by 5");
    else if((no%7==0))
        System.out.println("No is divisible by 7");
    else
        System.out.println("No is not divisible by 5 and 7");
}
}
