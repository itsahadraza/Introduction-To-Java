/*
Modify the last activity and include functions of withdraw and deposit. Test these methods in 
main for procedural approach. For Object Oriented approach, modify the main class and call 
withdraw and deposit functions for two objects
 */
package com.mycompany.j3_assignment3;
import java.util.Scanner;
public class J3_Assignment3
{
    public String get_balance;
    public String get_withdraw;
    public String get_deposit;
    
    public void getbalance3()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your account balance:");
        get_balance = sc.next();
    }
    
    public void get_withdraw2()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the withdraw amount:");
        get_withdraw = sc.next();
    }
    
    public void get_withdeposit1()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the deposit amount:");
        get_deposit = sc.next();
    }
    public void show_detail()
    {
        System.out.println("Your total current account balance is:" + get_balance);
        System.out.println("Your withdraw amount is:" + get_withdraw);
        System.out.println("Your deposit amount is:" + get_deposit);

    }
}
