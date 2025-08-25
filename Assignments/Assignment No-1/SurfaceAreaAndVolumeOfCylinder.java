import java.util.Scanner;
public class SurfaceAreaAndVolumeOfCylinder {
    // A1 Q2 surface area = 2 πr2+ 2πrh, volume = πr2h
    public static void main(String args[])
    {
        float r,h;
        double surfaceArea,volume;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius : ");
        r=sc.nextFloat();
        System.out.println("Enter height : ");
        h=sc.nextFloat();

        surfaceArea = (2 * Math.PI * r * 2) +(2 * Math.PI * r * h);
        volume = Math.PI * r * 2 * h;
        System.out.println("Surface area : "+surfaceArea);
        System.out.println("Volume : "+volume);
    }
}
