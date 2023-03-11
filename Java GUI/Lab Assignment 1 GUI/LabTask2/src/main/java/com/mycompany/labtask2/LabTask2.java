package com.mycompany.labtask2;
import java.awt.*;
import javax.swing.*;
class GUI extends JFrame
{
    public GUI()
       {
          JPanel panel = new JPanel();
          panel.setLayout(new GridLayout(1,0,5,5));
          panel.add(new JButton("button 1"));
          panel.add(new JButton("button 2"));
          panel.add(new JButton("button 3"));
          panel.add(new JButton("button 4"));
          panel.add(new JButton("button 5"));
          
          JPanel frame = new JPanel(new BorderLayout());
          frame.add(panel,BorderLayout.SOUTH);
          add(frame,BorderLayout.SOUTH);
       }

}
public class LabTask2 
{

    public static void main(String[] args)
    {
        GUI frame = new GUI();
        frame.setTitle("LAB TASK 3");
        frame.setSize(450,250);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
