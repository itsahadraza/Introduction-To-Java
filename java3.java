import java.util.Scanner;
public class java3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of length:");
        float length = sc.nextFloat();
        System.out.println("Enter the value of width:");
        float width = sc.nextFloat();
        float Area = length*width;
        System.out.println("THE AREA OF THE RECTANGLE IS:"+ Area);
    }
}