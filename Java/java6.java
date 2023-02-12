import java.util.Scanner;
public class java6
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of the variable a:");
        int a = sc.nextInt();
        if(a > 0)
        {
            System.out.println("It is a positive number");
        }
        else if(a<0)
        {
            System.out.println("It is a negative number");
        }
        else
        {
            System.out.println("It is equal to zero");
        }
    }
}