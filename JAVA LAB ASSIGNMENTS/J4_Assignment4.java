/*
Write a program that has variables to store Car data like; CarModel, CarName, CarPrice and 
CarOwner. The program should include functions to assign user defined values to the abovementioned variable and a display function to show the values. Write a main that calls these 
functions. Now write another runner class that declares three Car objects and displays the data 
of all three.
 */

package com.mycompany.j4_assignment4;
import java.util.Scanner;
public class J4_Assignment4 
{
    public String CarModel;
    public String CarName;
    public String CarPrice;
    public String CarOwner;
    
    public void get_CarModel()
    {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter the Car Model:");
        CarModel = s1.next();
    }
    
    public void get_CarPrice()
    {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter the Car Price:");
        CarPrice = s1.next();
    }
    
    public void get_CarName()
    {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter the Car Name");
        CarName = s1.next();
    }
    
    public void get_CarOwner()
    {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter the Car Owner Name");
        CarOwner = s1.next();
    }
    
    public void show_detail()
    {
        System.out.println("Car Name:"+  CarName);
        System.out.println("Car Model:"+ CarModel);
        System.out.println("Car Price:"+ CarPrice);
        System.out.println("Car Owner:"+ CarOwner);
    }
}
