/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter your value:");
	    int val = sc.nextInt();
	    switch(val)
	    {
	       case 1:
	            System.out.println("THE VALUE YOU ENTER IS ODD");
	            break;
	       case 2:
	           System.out.println("THE VALUE YOU ENTER IS EVEN");
	           break;
	       default:
	           break;
	    }
	}
}
