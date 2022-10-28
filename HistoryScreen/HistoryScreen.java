package HistoryScreen;
import HomeScreen.HomeScreen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HistoryScreen  {
    JButton back;
    public HistoryScreen(){
                JFrame frame= new JFrame();

                ImageIcon image=new ImageIcon("HistoryScreen/Assets/Large.png");
                ImageIcon image1=new ImageIcon("HistoryScreen/Assets/cardframe.png");
                ImageIcon image2=new ImageIcon("HistoryScreen/Assets/Frame23.png");
                ImageIcon image3=new ImageIcon("HistoryScreen/Assets/image163.png");
                ImageIcon image4=new ImageIcon("HistoryScreen/Assets/image164.png");


                JLabel label=new JLabel();
                JLabel label1=new JLabel();
                JLabel label2=new JLabel();
                JLabel label3=new JLabel();
                JLabel label4=new JLabel();
                JLabel label5=new JLabel();
                JLabel label6=new JLabel();
                JLabel label7=new JLabel();
                JLabel label8=new JLabel();
                JLabel label9=new JLabel();
                JLabel label10=new JLabel();
                JLabel label11=new JLabel();
                JLabel label12=new JLabel();
                JLabel label13=new JLabel();
                JLabel label14=new JLabel();
                JLabel label15=new JLabel();
                JLabel label16=new JLabel();
                JLabel label17=new JLabel();
                JLabel label18=new JLabel();
                JLabel label19=new JLabel();
                JLabel label20=new JLabel();
                JLabel label21 = new JLabel();

                label6.setIcon(image1);
                label6.setBounds(0,-8,488,550);
                label6.add(label);
                label6.add(label1);
                label6.add(label2);
                label6.add(label3);
                label6.add(label4);

                label11.setIcon(image2);
                label11.setBounds(504,133,61,42);
                label11.add(label13);

                label12.setIcon(image2);
                label12.setBounds(504,194,61,42);
                label12.add(label14);

                label13.setIcon(image3);
                label13.setBounds(11,8,43,25);

                label14.setIcon(image4);
                label14.setBounds(11,8,43,25);

                label.setText("Welcome back,");
                label.setFont(new Font("Consolas", Font.BOLD,24));
                label.setBounds(52,42,320,24);

                label1.setText("Magesh :)");
                label1.setBounds(52,66,320,24);
                label1.setFont(new Font("Consolas", Font.BOLD,24));

                label2.setText("Balance");
                label2.setBounds(72,144,100,17);
                label2.setFont(new Font("Consolas", Font.BOLD,14));

                label3.setText("$ 240,419");
                label3.setBounds(79,171,150,29);
                label3.setFont(new Font("Consolas", Font.BOLD,24));

                label4.setIcon(image);
                label4.setBounds(43,205,391,300);
                label4.add(label21);

                label5.setText("Latest Transactions:");
                label5.setBounds(509,64,194,17);
                label5.setFont(new Font("Consolas", Font.BOLD,14));

                label7.setText("payment type");
                label7.setBounds(504,106,68,12);
                label7.setFont(new Font("Consolas", Font.BOLD,10));

                label8.setText("payment to/from");
                label8.setBounds(603,106,88,12);
                label8.setFont(new Font("Consolas", Font.BOLD,10));

                label9.setText("data");
                label9.setBounds(752,106,22,12);
                label9.setFont(new Font("Consolas", Font.BOLD,10));

                label10.setText("amount");
                label10.setBounds(846,106,38,12);
                label10.setFont(new Font("Consolas", Font.BOLD,10));

                label15.setText("Payment to Haemanth");
                label15.setBounds(588,144,124,24);
                label15.setFont(new Font("Consolas", Font.BOLD,12));

                label16.setText("Payment to Soorya");
                label16.setBounds(588,202,124,24);
                label16.setFont(new Font("Consolas", Font.BOLD,12));

                label17.setText("Thu, Oct 27");
                label17.setBounds(741,148,124,12);
                label17.setForeground(Color.GRAY);
                label17.setFont(new Font("Consolas", Font.BOLD,10));

                label18.setText("Fri, Sep 28");
                label18.setBounds(741,205,124,12);
                label18.setForeground(Color.GRAY);
                label18.setFont(new Font("Consolas", Font.BOLD,10));

                label19.setText("₹ 500");
                label19.setBounds(830,144,45,17);
                label19.setForeground(Color.RED);
                label19.setFont(new Font("Consolas", Font.BOLD,16));

                label20.setText("₹ 8200");
                label20.setBounds(830,203,55,17);
                label20.setForeground(Color.BLACK);
                label20.setFont(new Font("Consolas", Font.BOLD,16));

                label21.setText(" Magesh");
                label21.setBounds(140,365,100,25);
                label21.setForeground(Color.white);
                label21.setFont(new Font("Consolas", Font.BOLD,16));




                frame.setTitle("History Page");
                frame.setSize(900,550);
                frame.getContentPane().setBackground(new Color(255,255,255));
                frame.setVisible(true);
                frame.setLayout(null);
                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                frame.setResizable(false);
                frame.add(label21);
                frame.add(label5);
                frame.add(label6);
                frame.add(label7);
                frame.add(label8);
                frame.add(label9);
                frame.add(label10);
                frame.add(label11);
                frame.add(label12);
                frame.add(label15);
                frame.add(label16);
                frame.add(label17);
                frame.add(label18);
                frame.add(label19);
                frame.add(label20);
            }
        }





