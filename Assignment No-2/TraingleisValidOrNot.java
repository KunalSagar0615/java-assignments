// 10.	Accept three sides of triangle as input, and print whether the triangle is valid or not. 
// (Hint: The triangle is valid if the sum of each of the two sides is greater than the third side). 
import java.util.Scanner;
public class TraingleisValidOrNot {
public static void main(String[] args) {
    float a,b,c;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter first side of traingle : ");
    a=sc.nextFloat();
    System.out.println("Enter second side of traingle : ");
    b=sc.nextFloat();
    System.out.println("Enter third side of traingle : ");
    c=sc.nextFloat();

    if((a+b>c)&&(a+c>b)&&(c+b>a))
        System.out.println("Traingle is valid ");
    else
        System.out.println("Traingle is not valid");
}
}
