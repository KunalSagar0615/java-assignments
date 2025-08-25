import java.util.Scanner;
public class EmployeeSalarySlip
{
	public static void main(String args[])
	{
	int id;
	float da,hra,tax,basicSalary,totalSalary;
	String name;

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter employee details:");
	System.out.println("ID:");
	id=sc.nextInt();
	
	System.out.println("name : ");
	name=sc.next();
	name=sc.nextLine();

	System.out.println("basicSalary :");
	basicSalary=sc.nextFloat();

	System.out.println("DA :");
	da=sc.nextFloat();

	System.out.println("HRA :");
	hra=sc.nextFloat();

	System.out.println("Tax :");
	tax=sc.nextFloat();

	totalSalary = basicSalary + ((basicSalary*(da+hra-tax))/100);

	System.out.println("Total salary : "+totalSalary);
	}
}