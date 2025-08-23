import java.util.Scanner;
public class ConvertTempreture {
// 3.Accept temperatures in Fahrenheit(F) and print it in Celsius(C) and 
// Kelvin (K). (Hint: C=5/9(F- 32), K = C + 273.15) 
    public static void main(String args[])
    {
        float celcius,fahrenheit;
        double kelvin;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Temprature in Fahrenheit :");
        fahrenheit=sc.nextFloat();

        celcius = 5/9*(fahrenheit-32);
        kelvin=celcius+273.15;

        System.out.println("Temprature in celcius : "+celcius);
        System.out.println("Temprature in kelvin : "+kelvin);
    }
}
