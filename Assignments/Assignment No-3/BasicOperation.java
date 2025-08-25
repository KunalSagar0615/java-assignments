//2.Write a program, which accepts two integers and an operator as a character (+ - * /), performs the corresponding operation and displays the result. 

import java.util.Scanner;
public class BasicOperation{
  public static void main(String[] args){
	int a,b;
	char op;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first no :");
	a=sc.nextInt();
	System.out.println("Enter second no :");
	b=sc.nextInt();
	System.out.println("Enter Operand :");
	op=sc.next().charAt(0);

	switch(op){
		case '+'->System.out.println("Addition : "+(a+b));
		case '-'->System.out.println("Substraction : "+(a-b));
		case '*'->System.out.println("Multiplication  : "+(a*b));
		case '/'->System.out.println("Division : "+(a/b));
		default->System.out.println("Wrong operand !!");
}	
}
}