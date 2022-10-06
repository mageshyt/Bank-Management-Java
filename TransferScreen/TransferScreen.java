package TransferScreen;

import HomeScreen.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TransferScreen extends  JFrame implements ActionListener {

    JButton button;
    JButton back;
    public TransferScreen() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(900, 550);

        JLabel label = new JLabel();
        label.setText("  Money Transfer");
        label.setForeground(new Color(65280));
        label.setBounds(100,0,320,40);
        label.setFont(new Font("MV Boli", 0, 30));
        label.setBackground(Color.BLACK);
        label.setOpaque(true);

        JLabel label1 = new JLabel();
        label1.setText("Enter the Account Number : ");
        label1.setForeground(new Color(65280));
        label1.setBounds(0,100,400,40);
        label1.setFont(new Font("MV Boli", 0, 25));
        label1.setBackground(Color.BLACK);
        label1.setOpaque(true);

        JTextField text1 = new JTextField();
        text1.setBounds(50,150,300,45);
        text1.setFont(new Font("Consolas",Font.BOLD,40));
        text1.setForeground(Color.BLACK);
        text1.setBackground(Color.lightGray);
        text1.setOpaque(true);

        JLabel label2 = new JLabel();
        label2.setText("Enter the Amount : ");
        label2.setForeground(new Color(65280));
        label2.setBounds(0,200,400,40);
        label2.setFont(new Font("MV Boli", 0, 25));
        label2.setBackground(Color.BLACK);
        label2.setOpaque(true);


        JTextField text2 = new JTextField();
        text2.setBounds(50,250,300,45);
        text2.setFont(new Font("Consolas",Font.BOLD,40));
        text2.setForeground(Color.BLACK);
        text2.setBackground(Color.lightGray);
        text2.setOpaque(true);

        button = new JButton("Confirm");
        button.setBounds(100,320,180,50);
        button.setFont(new Font("Consolas",Font.BOLD,18));
        button.setForeground(Color.BLACK);
        button.setFocusable(false);
        button.setBackground(Color.yellow);
        button.setOpaque(true);
        button.addActionListener(this);

        back = new JButton("Back");
        back.setBounds(10,10,100,30);
        back.setFont(new Font("Consolas",Font.BOLD,25));
        back.setForeground(Color.BLACK);
        back.setFocusable(false);
        back.setBackground(Color.yellow);
        back.setOpaque(true);
        back.setFocusable(false);
        back.addActionListener(this);



        this.setLayout(null);
        this.setVisible(true);
        this.add(label);
        this.add(label1);
        this.add(text1);
        this.add(label2);
        this.add(text2);
        this.add(button);
        this.getContentPane().setBackground(Color.BLACK);
        this.setLocationRelativeTo(null);
        this.add(back);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button){
            System.out.println("You Money Transferd Successfully");
        }
        if (e.getSource()==back){
            new HomeScreen();
        }
    }
}
