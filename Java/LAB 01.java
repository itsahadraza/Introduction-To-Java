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
	    if(val%2==0)
	    {
	        System.out.println("the number you enter is even");
	    }
	    else
	    {
	      System.out.println("the number you enter is odd");  
	    }
	}
}
