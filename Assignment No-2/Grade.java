//16.Write a program to accept marks for three subjects and find the total marks secured , average and also display the class obtained. 
//(Class I – above %, class II – % to %, pass class – % to % and fail otherwise) 

import java.util.Scanner;
public class Grade
{
public static void main(String[] args)
{
	int total,m1,m2,m3;
	double avg,p;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter marks of subject 1:");
	m1=sc.nextInt();
	System.out.println("Enter marks of subject 2:");
	m2=sc.nextInt();
	System.out.println("Enter marks of subject 3:");
	m3=sc.nextInt();
	
	total=m1+m2+m3;
	avg=total/3;

	p= (total / 300) * 100;
	System.out.println("Total marks = "+total);
	System.out.println("Average marks = "+avg);

	if(p<75)
		System.out.println("Grade : Class I");
	else if(p>50 && p<=70)
		System.out.println("Grade : Class II");
	else if(p>35 && p<50)
		System.out.println("Grade : Class III");
	else
		System.out.println("Grade : Fail");
}
}