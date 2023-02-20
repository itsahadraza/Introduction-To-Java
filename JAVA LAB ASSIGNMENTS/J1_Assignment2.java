/*
Make the program with both approaches such that
a. It gets the account balance in the function and set it accordingly.
b. It shows the account balance using a function
*/
package com.mycompany.j1_assignment2;
import java.util.Scanner;
public class J1_Assignment2 
{
    public String get_balance;
    public void getbalance()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your account balance:");
        get_balance = sc.next();
    }
    public void show_detail()
    {
        System.out.println("Your total current account balance is:" + get_balance);
    }
}
