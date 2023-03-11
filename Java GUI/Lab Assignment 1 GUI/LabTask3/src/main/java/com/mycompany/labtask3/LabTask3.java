package com.mycompany.labtask3;
import java.awt.*;
import javax.swing.*;
class GUI extends JFrame
{
    public GUI()
    {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2,3,9,9));
        panel.add(new JButton("one"));
        panel.add(new JButton("two"));
        panel.add(new JButton("three"));
        panel.add(new JButton("four"));
        panel.add(new JButton("five"));
        panel.add(new JButton("six"));
        
        JPanel frame = new JPanel(new BorderLayout());
        frame.add(panel, BorderLayout.CENTER);
        add(frame, BorderLayout.CENTER);
                        
    }
}

public class LabTask3 
{
    public static void main(String[] args)
    {
        GUI frame = new GUI();
        frame.setTitle("Lab Task 2");
        frame.setSize(430,270);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(true);
    }
}
