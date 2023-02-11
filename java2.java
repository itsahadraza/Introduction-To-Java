import java.util.Scanner;
public class java2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of the variable a:");
        int a = sc.nextInt();
        System.out.println("Enter the value of the variable b:");
        int b = sc.nextInt();
        System.out.println("Enter the value of the variable c:");
        int c = sc.nextInt();
        int sum = a+b+c;
        int product = a*b*c;
        int divide = a/b/c;
        System.out.println("THE SUM OF THESE VALUES IS:"+ sum);
        System.out.println("THE PRODUCT OF THESE VALUES IS:"+ product);
        System.out.println("THE DIVIDE OF THESE VALUES IS:"+ divide);

    }
}