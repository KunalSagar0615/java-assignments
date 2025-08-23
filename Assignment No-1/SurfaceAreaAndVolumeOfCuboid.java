//A1 Q6.Accept three dimensions length (l), breadth(b) and height(h) of a cuboid and print surface area and volume. (Hint: surface area=2(lb + lh +bh), volume = lbh) 

import java.util.Scanner;

public class SurfaceAreaAndVolumeOfCuboid {
public static void main(String args[])
{
    float surfaceArea,volume,l,b,h;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter length Of cuboid : ");
    l=sc.nextFloat();
    System.out.println("Enter breadth Of cuboid : ");
    b=sc.nextFloat();
    System.out.println("Enter height Of cuboid : ");
    h=sc.nextFloat();

    surfaceArea=2*(l*b + l*h +b*h);
     volume = l*b*h;
    
    System.out.println("Surface area of cuboid : "+surfaceArea);
    System.out.println("Volume of Cuboid : "+volume);
}
}
