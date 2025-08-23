//11.	Write a program to print even numbers from 1 to 10 (or odd numbers) 

public class EvenNosFrom1to10{
  public static void main (String args[]){
	int i;
	System.out.println("Even nos :");
	for(i=1;i<=10;i++)
	{	  
	  if(i%2==0)
		System.out.println(i);
	}
}
}