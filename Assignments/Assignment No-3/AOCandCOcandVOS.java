//4.Accept radius from the user and write a program having menu with the following options and corresponding actions 

import java.util.Scanner;
public class AOCandCOcandVOS{
  public static void main(String[] args)
  {
	float r;
	int ch;
	Scanner sc=new Scanner(System.in);
	
	while(true){
	System.out.println("\n Enter radius : ");
	r=sc.nextFloat();
	
	System.out.println(" \n1: Area of Circle \n 2: Circumference of Circle \n 3: Volume of Sphere \n 4:Exit \n Enter your choice : ");
	ch=sc.nextInt();
		switch(ch){
		  case 1-> System.out.println("Area of circle : "+(Math.PI *(r*r)));
		  case 2->System.out.println("Circumference of circle : "+(2* Math.PI * r));
		  case 3-> System.out.println("Volume of spehere : "+((4.0/3)*Math.PI*(r*r*r)));
		  case 4-> {
			System.out.println("Exited");
			return;
		  }
		  default->System.out.println("Invalid choice");
		}
	}
}
}