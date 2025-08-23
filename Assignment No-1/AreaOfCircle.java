import java.util.Scanner;
public class AreaOfCircle
{
	public static void main(String args[])
	{
		float r;
		double area;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius : ");
		r=sc.nextFloat();

		area = Math.PI *r*r;
		System.out.println("Area of circle : "+area);
		
	}

}