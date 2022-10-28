package BalanceScreen;

import MongoDb.Auth;
import MongoDb.Transaction;
import TransferScreen.TransferScreen;
import org.bson.Document;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BalanceScreen extends JFrame implements ActionListener {
    JButton back;
    JButton b1;

    public BalanceScreen() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(900, 550);

        Auth auth = new Auth();
        Document CurrentUser = Auth.CurrentUser;

        String balance = CurrentUser.get("balance").toString();
        String username = CurrentUser.get("username").toString();
        // ! transfer detail
        Transaction transaction = new Transaction();
        int transfers = transaction.noOfTransactions(username);


        ImageIcon img1 = new ImageIcon("BalanceScreen/Assets/logo1.png");

        JLabel label = new JLabel();
        label.setText("   My Balance");
        label.setForeground(Color.BLACK);
        label.setBounds(100, 40, 280, 40);
        label.setFont(new Font("Consolas", Font.BOLD, 30));
        label.setBackground(new Color(54, 245, 165));
        label.setOpaque(true);

        JLabel label1 = new JLabel();
        label1.setBounds(100, 100, 700, 350);
        label1.setBackground(Color.darkGray);
        label1.setOpaque(true);

        JLabel label2 = new JLabel();
        label2.setBounds(125, 125, 300, 300);
        label2.setBackground(new Color(18, 18, 18));
        label2.setOpaque(true);

        JLabel label3 = new JLabel();
        label3.setBounds(475, 125, 300, 300);
        label3.setBackground(new Color(18, 18, 18));
        label3.setOpaque(true);

        JLabel label4 = new JLabel();
        label4.setText("Available Balance");
        label4.setForeground(Color.lightGray);
        label4.setBounds(200, 145, 200, 25);
        label4.setFont(new Font("Consolas", Font.BOLD, 20));
        label4.setBackground(new Color(18, 18, 18));
        label4.setOpaque(true);

        JLabel label5 = new JLabel();
        label5.setText("Transactions");
        label5.setForeground(Color.lightGray);
        label5.setBounds(550, 135, 180, 30);
        label5.setFont(new Font("Consolas", Font.BOLD, 25));
        label5.setBackground(new Color(18, 18, 18));
        label5.setOpaque(true);

        JLabel label6 = new JLabel();
        label6.setText("₹ " + balance + "     INR");
        label6.setForeground(Color.white);
        label6.setBounds(150, 230, 270, 40);
        label6.setFont(new Font("Consolas", Font.BOLD, 30));
        label6.setBackground(new Color(18, 18, 18));
        label6.setOpaque(true);

        JLabel label7 = new JLabel();
        label7.setBounds(145, 135, 40, 40);
        label7.setIcon(img1);

        JLabel label8 = new JLabel();
        label8.setText("Last");
        label8.setForeground(Color.white);
        label8.setBounds(520, 180, 150, 40);
        label8.setFont(new Font("Consolas", Font.BOLD, 24));
        label8.setBackground(new Color(18, 18, 18));
        label8.setOpaque(true);

        //! this label is for the last transaction text
        JLabel label9 = new JLabel();
        label9.setText("30 days");
        label9.setForeground(Color.white);
        label9.setBounds(500, 220, 150, 40);
        label9.setFont(new Font("Consolas", Font.BOLD, 24));
        label9.setBackground(new Color(18, 18, 18));
        label9.setOpaque(true);

        // this label is for tranaction title
        JLabel label10 = new JLabel();
        label10.setText("Transaction");
        label10.setForeground(Color.lightGray);
        label10.setBounds(650, 180, 120, 40);
        label10.setFont(new Font("Consolas", Font.PLAIN, 14));
        label10.setBackground(new Color(18, 18, 18));
        label10.setOpaque (true);

        // this is for no of transactions
        JLabel label11 = new JLabel();
        label11.setText(""+transfers);
        label11.setForeground(Color.lightGray);
        label11.setBounds(670, 220, 100, 40);
        label11.setFont(new Font("Consolas", Font.PLAIN, 22));
        label11.setBackground(new Color(18, 18, 18));
        label11.setOpaque(true);


        b1 = new JButton("View Transactions");
        b1.setBounds(540, 375, 180, 20);
        b1.setFont(new Font("Consolas", Font.BOLD, 15));
        b1.setForeground(Color.cyan);
        b1.setFocusable(false);
        b1.setBackground(Color.black);
        b1.setOpaque(false);
        b1.setFocusable(false);
        b1.addActionListener(this);

        this.add(label11);
        this.add (label10);
        this.add(label9);
        this.add(label8);
        this.add(label7);
        this.add(b1);
        this.add(label6);
        this.add(label5);
        this.add(label4);
        this.add(label2);
        this.add(label3);
        this.setLayout(null);
        this.setVisible(true);
        this.add(label);
        this.add(label1);

        this.getContentPane().setBackground(Color.BLACK);
        this.setLocationRelativeTo(null);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            new TransferScreen();
        }
    }
}
