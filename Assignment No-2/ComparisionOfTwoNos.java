// 11.	Write a program to compare two numbers? (==,>,<) 
import java.util.Scanner;
public class ComparisionOfTwoNos {
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first no :");
        a=sc.nextInt();
        System.out.println("Enter second no :");
        b=sc.nextInt();

        if(a==b)
            System.out.println("both number are equal");
        else if(a>b)
            System.out.println("first no is greater than second");
        else if(a<b)
            System.out.println("first no is less than second ");
    }
}
