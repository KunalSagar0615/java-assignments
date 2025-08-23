// 9.	A cashier has currency notes of denomination 1, 5 and 10. Accept the amount to be withdrawn from the 
// user and print the total number of currency notes of each denomination the cashier will have to give. 
import java.util.Scanner;
public class AtmCash {
public static void main(String args[])
{
    int amt;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter amount you want to withdraw : ");
    amt=sc.nextInt();
    System.out.println("10 rs notes = "+amt/10);
    amt=amt%10;
    System.out.println("5rs notes ="+amt/5);
    amt=amt%5;
    System.out.println("1rs = "+amt/1);
    amt%=1;
}
}
