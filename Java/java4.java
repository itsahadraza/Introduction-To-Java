import java.util.Scanner;
public class java4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of length of one side of the cube:");
        float length = sc.nextFloat();
        float cube = length*length*length;
        System.out.println("THE VOLUME OF THE ONE SIDE OF THE CUBE IS:"+ cube);
    }
}