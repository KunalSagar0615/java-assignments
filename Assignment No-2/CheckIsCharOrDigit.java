//20.Write a program to check whether given character is a digit or a character in lowercase or uppercase alphabet. 

import java.util.Scanner;
public class CheckIsCharOrDigit{
  public static void main(String[] args){
	char ch;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a character : ");
	ch=sc.next().charAt(0);
	
	if(Character.isLowerCase(ch))
		System.out.println("It is an lowercase alphabet");
	else if(Character.isUpperCase(ch))
		System.out.println("It is an uppercase alphabet ");
	else if(Character.isDigit(ch))
		System.out.println("It is digit");
	else
		System.out.println("It other than alphabet and digit");
}
}