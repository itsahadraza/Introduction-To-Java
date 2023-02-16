/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
//import static java.lang.Math.*;
import java.util.Scanner;
public class Main
{
    static void radius()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        int radius = sc.nextInt();
        int area = 3*radius*radius;
        System.out.println("the area of the circle is:"+ area);
    }
    	public static void main(String[] args) 
    	{
    	    radius();
        }
}