package com.mycompany.labtask4;
import java.awt.*;
import javax.swing.*;
class GUI extends JFrame
{
    public GUI()
    {
          JTextArea textarea = new JTextArea(17,20);
          JPanel panel = new JPanel();
          panel.setLayout(new GridLayout(1,0,5,5));
          panel.add(new JButton("Start Memo 1"));
          panel.add(new JButton("Start Memo 2"));
          panel.add(new JButton("Clear"));
          panel.add(new JButton("Get Memo 1"));
          panel.add(new JButton("Get Memo 2"));
          
          JScrollPane ScrollBar = new  JScrollPane(textarea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
          
          JPanel frame = new JPanel(new BorderLayout());
          frame.add(ScrollBar);
          frame.add(panel,BorderLayout.SOUTH);
          add(frame,BorderLayout.SOUTH);
          
          
    }
}
public class LabTask4 
{
    public static void main(String[] args)
    {
        GUI frame = new GUI();
        {
            frame.setTitle("Lab Task 4");
            frame.setSize(600,350);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setResizable(false);
            frame.setVisible(true);
        }
    }
}
