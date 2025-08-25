import java.util.Scanner;
public class ArithmeticAndHarmonicMeanOf2Nos {
public static void main(String args[])
{
    float n1,n2,am,hm;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Two Number :");
    n1=sc.nextFloat();
    n2=sc.nextFloat();
    am=(n1+n2)/2;
    hm=(n1/n2)*(n1+n2);
    System.out.println("Arethemit mean"+am);
    System.out.println("Harmonic mean"+hm);
}
}
// 5.Accept two numbers and print arithmetic and harmonic mean of the two numbers. (Hint: AM=(a+b)/2, HM = ab/(a+b)) 
