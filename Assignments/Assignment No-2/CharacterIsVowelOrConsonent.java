// 8.Accept a lowercase character from the user and check whether the character is a vowel or consonant. (Hint: a,e,i,o,u are vowels) 
import java.util.Scanner;
public class CharacterIsVowelOrConsonent {
public static void main(String[] args) {
    char a;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a lowercase character : ");
    a=sc.next().charAt(0);
    if(a== 'a'||a=='e' || a=='i' || a=='o' || a=='u')
        System.out.println("given character is vowel");
    else 
        System.out.println("given character is consonent");
}
}
