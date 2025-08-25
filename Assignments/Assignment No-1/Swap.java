// 7.Accept two integers from the user and interchange them. Display the interchanged numbers. 
// Using temporary variable Without using temporary variable 
// a.Using + and – operator 
// b.Using / and * operator 

import java.util.Scanner;
public class Swap {
public static void main(String args[])
{
    int a,b;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter first number : ");
    a = sc.nextInt();
    System.out.print("Enter second number : ");
    b = sc.nextInt();
    a = a + b;
    b = a - b;
    a = a - b;
    System.out.println("a="+a);
    System.out.println("b="+b);
    a = a * b;
    b = a / b;
    a = a / b;
    System.out.println("a="+a);
    System.out.println("b="+b);
}
}
