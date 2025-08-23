// 4.	Accept the cost price and selling price from the keyboard. Find out if the seller has made a 
// profit or loss and display how much profit or loss has been made
import java.util.Scanner;
public class ProfitOrLoss {
public static void main(String args[])
{
    int costPrice,sellingPrice;

    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Cost Price : ");
    costPrice=sc.nextInt();
    System.out.println("Enter Selling Price : ");
    sellingPrice=sc.nextInt();

    if(sellingPrice>costPrice)
        System.out.println("Seller has made profit");
    else
        System.out.println("Seller has made loss");
}
}
