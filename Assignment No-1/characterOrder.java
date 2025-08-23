//12.	Accept a character from the keyboard and display its previous and next character in order. Ex. If the character entered is ‘d’,
// display “The previous character is c”, “The next character is e”. 

import java.util.Scanner;

public class characterOrder {
public static void main(String[] args) {
char ch;
Scanner sc = new Scanner(System.in);   
System.out.println("Enter a character: ");
ch = sc.next().charAt(0);  
char charprev = (char)(ch - 1);
char charnext = (char)(ch + 1);
System.out.println("previous character:" + charprev);
System.out.println("next character:" + charnext);
}
}