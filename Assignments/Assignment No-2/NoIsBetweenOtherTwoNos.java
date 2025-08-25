// 7.Write a program to accept three numbers and check whether the first is between the other two numbers. 
// Ex: Input 20 10 30. Output: 20 is between 10 and 

import java.util.Scanner;
public class NoIsBetweenOtherTwoNos {
public static void main(String[] args) {
   int a,b,c;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter first no : ");
   a= sc.nextInt();
   System.out.println("Enter second no : ");
   b= sc.nextInt();
   System.out.println("Enter third no : ");
   c= sc.nextInt();

   if((a>b && a<c)|| (a<b && a>c))
        System.out.println("a is in between b and c");
    else
        System.out.println("a is not in between b and c");
}
}
