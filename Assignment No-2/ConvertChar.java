//19.	Write a Program to convert lowercase letter into uppercase letter and vice versa.

import java.util.Scanner;
public class ConvertChar
{
  public static void main(String[] args){
	char ch;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a character : ");
	ch=sc.next().charAt(0);
	if(Character.isLowerCase(ch)){
		ch=Character.toUpperCase(ch);
		System.out.println("Character In uppercase : "+ch);
	}
	else if(Character.isUpperCase(ch)){
		ch=Character.toLowerCase(ch);
		System.out.println("Character in uppercase : "+ch);
	}
	else
		System.out.println("It is not an alphabet character");

}
}