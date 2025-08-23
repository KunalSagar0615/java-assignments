import java.util.Scanner;
public class EvenOdd {
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter any no : ");
        n=sc.nextInt();
        if(n%2==0)
            System.out.println("no is positive");
        else
            System.out.println("no is odd");

        System.out.println("Enter any no : ");
        n=sc.nextInt();
        System.out.println((n % 2 == 0) ? "No is even" : "No is odd");

    }
}
