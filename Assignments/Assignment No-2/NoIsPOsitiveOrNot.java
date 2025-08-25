import java.util.Scanner;
public class NoIsPOsitiveOrNot {
public static void main(String args[])
{
    int no;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a no : ");
    no=sc.nextInt();
    if(no>0)
        System.out.println("No is positive");
    else
        System.out.println("No is not positive");
}
}
