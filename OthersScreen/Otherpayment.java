package OthersScreen;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Otherpayment{
    public Otherpayment(){
        JFrame frame= new JFrame();

        ImageIcon image=new ImageIcon("bc 1.png");
        ImageIcon image1=new ImageIcon("image 167.png");
        ImageIcon image2=new ImageIcon("Frame27.png");
        ImageIcon image3=new ImageIcon("Frame29.png");

        JLabel label=new JLabel();
        label.setIcon(image);
        label.setBounds(0,0,556,550);

        JLabel label1=new JLabel();
        label1.setIcon(image1);
        label1.setBounds(21,170,327,287);
        label.add(label1);

        JLabel label2=new JLabel();
        label2.setText("Phone bill");
        label2.setBounds(60,56,300,54);
        label2.setFont(new Font("Consolas", Font.BOLD,46));
        //label.add(label2);

        JLabel label3=new JLabel();
        label3.setIcon(image2);
        label3.setBounds(21,170,327,287);
        label.add(label3);

        JLabel label4=new JLabel();
        label4.setIcon(image3);
        label4.setBounds(63,56,301,75);
        label.add(label4);

        JLabel label5=new JLabel();
        label5.setText("Pay your bill on time");
        label5.setBounds(504,71,430,81);
        label5.setFont(new Font("Inter", Font.BOLD,36));
        label5.setForeground(new Color(70,69,95));

        JLabel label6=new JLabel();
        label6.setText("Phone no:");
        label6.setBounds(487,166,123,29);
        label6.setFont(new Font("Inter", Font.BOLD,24));

        JLabel label8=new JLabel();
        label8.setText("Amount:");
        label8.setBounds(487,280,107,29);
        label8.setFont(new Font("Inter", Font.BOLD,24));

        JTextField t1=new JTextField();
        t1.setPreferredSize(new Dimension(250,40));
        t1.setFont(new Font("Inter",Font.PLAIN,35));
        t1.setText("");
        t1.setBounds(487,210,385,42);
        t1.setBackground(new Color(224,241,255));
        t1.setBorder(new LineBorder(new Color(224,241,255),4));

        JTextField t2=new JTextField();
        t2.setPreferredSize(new Dimension(250,40));
        t2.setFont(new Font("Inter",Font.PLAIN,35));
        t2.setBackground(new Color(224,241,255));
        t2.setText("");
        t2.setBounds(487,325,385,42);
        t2.setBorder(new LineBorder(new Color(224,241,255),4));

        frame.setTitle("OtherPayment Page");
        frame.setSize(900,550);
        frame.getContentPane().setBackground(new Color(255,255,255));
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.add(label);
        frame.add(label5);
        frame.add(label6);
        frame.add(t1);
        frame.add(t2);
        frame.add(label8);

    }
}