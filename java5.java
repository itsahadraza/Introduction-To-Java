import java.util.Scanner;
public class java5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Temperature in Celsius:");
        float Celsius = sc.nextFloat();
        float Fahrenheit = 9/5*(Celsius+32);
        System.out.println("Celsius converts into Fahrenheit:"+ Fahrenheit);
    }
}