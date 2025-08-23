// 12.	Write a program to find maximum of three numbers? (3-4 logics) and 
// (with conditional operator). Modify and find minimum of three numbers. 
import java.util.Scanner;
public class maxBetThreeNos {
public static void main(String[] args)
{
    int a,b,c;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter first no :");
    a=sc.nextInt();
    System.out.println("Enter second no :");
    b=sc.nextInt();
    System.out.println("Enter third no :");
    c=sc.nextInt();

    if(a>b)
    b=a;
    if(c>b)
    b=c;
    System.out.println("max no is : "+b);


    System.out.println("Enter first no :");
    a=sc.nextInt();
    System.out.println("Enter second no :");
    b=sc.nextInt();
    System.out.println("Enter third no :");
    c=sc.nextInt();
    b=(a>b)?a:b;
    b=(c>b)?b:c;
    System.out.println("Max no is :"+b);

    System.out.println("Enter first no :");
    a=sc.nextInt();
    System.out.println("Enter second no :");
    b=sc.nextInt();
    System.out.println("Enter third no :");
    c=sc.nextInt();
    System.out.println("max no is : "+ Math.max(a,Math.max(b, c)));
} 
}
