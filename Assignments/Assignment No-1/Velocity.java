import java.util.Scanner;

public class Velocity {
    // A1 Q3
public static void main(String args[])
{
    float u,a,t;
    double v , s;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter initial velocity : ");
    u=sc.nextFloat();
    System.out.println("Enter acceleration : ");
    a=sc.nextFloat();
    System.out.println("Enter time : ");
    t=sc.nextFloat();

    v = u + (a*t);
    s=u+((a*t)*2);
    System.out.println("velocity : "+v);
    System.out.println("Distance travelled : "+s);
}
}
