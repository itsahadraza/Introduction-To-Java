package com.mycompany.labtask1;
import java.awt.*;
import javax.swing.*;
class GUI extends JFrame
{
    public GUI()
    {
        GridLayout grid = new GridLayout(4,4);
        grid.setHgap(3);
        grid.setVgap(3);
        JPanel panel = new JPanel();
        panel.setLayout(grid);
        panel.setFont(new Font("Arial", Font.BOLD, 20));
        panel.add(new JButton(""+7));
        panel.add(new JButton(""+8));
        panel.add(new JButton(""+9));
        panel.add(new JButton("/"));
        panel.add(new JButton(""+4));
        panel.add(new JButton(""+5));
        panel.add(new JButton(""+6));
        panel.add(new JButton("*"));
        panel.add(new JButton(""+1));
        panel.add(new JButton(""+2));
        panel.add(new JButton(""+3));
        panel.add(new JButton("-"));
        panel.add(new JButton(""+0));
        panel.add(new JButton("."));
        panel.add(new JButton("="));
        panel.add(new JButton("+"));

        JPanel panel2 = new JPanel(new BorderLayout());
        panel2.add(new JTextField("Enter Your Value:"), BorderLayout.NORTH);
        panel2.add(panel, BorderLayout.CENTER);
        add(panel2,BorderLayout.CENTER);
     }  
}
public class LabTask1 
{
    public static void main(String[] args)
    {
        GUI frame = new GUI();
        frame.setTitle("LAB TASK 1");
        frame.setSize(280,280);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
