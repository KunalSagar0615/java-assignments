//15.	Write a program, which accepts annual basic salary of an employee and calculates and displays the Income tax as per the following rules 
//1.	Basic: < 1,50,000 Tax = 0 
//2.	1,50,000 to 3,00,000 Tax = 20% 
//3.	> 3,00,000 Tax = 30% 

import java.util.Scanner;
public class TaxOnEmpSal
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	float basicSal;
	double tax;
	System.out.println("Enter salary :");
	basicSal=sc.nextFloat();
	if(basicSal<150000)
		tax=0;
	else if(basicSal>150000 && basicSal<=300000)
		tax=(basicSal - 150000) * 0.20;
	else
		tax=(150000 * 0.20) +((basicSal- 300000) * 0.30);

	System.out.println("tax : "+tax);
}
}