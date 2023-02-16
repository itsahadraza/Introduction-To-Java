/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
//import static java.lang.Math.*;
import java.util.Scanner;
public class Main
{
    private String student_name;
    private String student_cnic;
    private String section;
    
    public void set_student_name(String std)
    {
        student_name = std;
    }
    public void set_student_cnic(String cn)
    {
        student_cnic = cn;
    }
    public void set_section(String s)
    {
        section = s;
    }
    
    public void show_detail()
    {
        System.out.println("the name of the student is:"+ student_name);
        System.out.println("the cnic of the student is:"+ student_name);
        System.out.println("the section of the stduent is:"+ student_name);
    }
}

public class lab01
{
    public static void main(String[] args)
    {
        Main c1 = new Main();
        c1.set_student_name("AhadRaza");
        c1.set_student_cnic("37405-9412528-1");
        c1.set_section("BSCS-36(A)");
        c1.show_detail();
    }
}