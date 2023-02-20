/*
Make the program with both approaches such that
a. It gets the title of book in the function and set it accordingly.
b. It gets the price of book in the function and set it accordingly.
c. It gets the numberOfPages in the function and set it accordingly.
d. It shows the details about book using a function.
 */

package com.mycompany.j2_assignment2;
import java.util.Scanner;
public class J2_Assignment2 
{
    public String book_title;
    public String book_price;
    public String book_pages;
    
    public void set_booktitle()
    {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter the title of the book:");
        book_title = s1.next();
    }
    
    public void set_bookprice()
    {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter the price of the book:");
        book_price = s1.next();
    }
    
    public void set_bookpages()
    {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter the total number of pages:");
        book_pages = s1.next();
    }
    
    public void show_detail()
    {
        System.out.println("BOOK TITLE IS:" + book_title);
        System.out.println("bOOK PAGES IS:"+ book_pages);
        System.out.println("BOOK PRICE IS:"+ book_price);
    }
}
