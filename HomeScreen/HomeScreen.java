package HomeScreen;


import BalanceScreen.BalanceScreen;
import HistoryScreen.HistoryScreen;
import OthersScreen.OthersScreen;
import TransferScreen.TransferScreen;

import javax.swing.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class HomeScreen extends JFrame implements ActionListener, MouseListener {

    JButton transfer;
    JButton withdraw;
    JButton balance;
    JButton history;
    JButton others;





    BorderLayout Border = new BorderLayout();


    ImageIcon bg = new ImageIcon("HomeScreen/Asset/bg.png");
    ImageIcon bal = new ImageIcon("HomeScreen/Asset/balance.png");
    ImageIcon his = new ImageIcon("HomeScreen/Asset/history.png");
    ImageIcon trans = new ImageIcon("HomeScreen/Asset/transfer.png");
    ImageIcon other = new ImageIcon("HomeScreen/Asset/other.png");
    ImageIcon logo1 = new ImageIcon("HomeScreen/Asset/logo1.png");
    ImageIcon logo2 = new ImageIcon("HomeScreen/Asset/logo2.png");


    JLabel label;
    JLabel label1;
    JLabel label2;

    public HomeScreen(){

        label1 = new JLabel("  D'Crew's Bank");
        label1.setBounds(300,10,350,50);
        label1.setForeground(Color.GREEN);
        label1.setFont(new Font("Consolas",Font.BOLD,40));
        label1.setBackground(new Color(0f,0f,0f,0.7f));
        label1.setOpaque(true);

        label2 = new JLabel();
        label2.setBounds(100,100,300,300);


        label = new JLabel();
        label.setSize(900,550);
        label.setIcon(bg);


        transfer = new JButton("Transfer");
        transfer.setBounds(600,80,250,60);
        transfer.setFont(new Font("Consolas",Font.BOLD,25));
        transfer.setForeground(Color.cyan);
        transfer.setFocusable(false);
        transfer.setBackground(new Color(0f,0f,0f,0.7f));
        transfer.setOpaque(true);
        transfer.addActionListener(this);
        transfer.addMouseListener(this);

        withdraw = new JButton("WithDraw");
        withdraw.setBounds(600,160,250,60);
        withdraw.setFont(new Font("Consolas",Font.BOLD,25));
        withdraw.setForeground(Color.cyan);
        withdraw.setFocusable(false);
        withdraw.setBackground(new Color(0f,0f,0f,0.7f));
        withdraw.setOpaque(true);
        withdraw.addActionListener(this);
        withdraw.addMouseListener(this);


        balance = new JButton("Balance");
        balance.setBounds(600,240,250,60);
        balance.setFont(new Font("Consolas",Font.BOLD,25));
        balance.setForeground(Color.cyan);
        balance.setFocusable(false);
        balance.setBackground(new Color(0f,0f,0f,0.7f));
        balance.setOpaque(true);
        balance.addActionListener(this);
        balance.addMouseListener(this);


        history = new JButton("History");
        history.setBounds(600,320,250,60);
        history.setFont(new Font("Consolas",Font.BOLD,25));
        history.setForeground(Color.cyan);
        history.setFocusable(false);
        history.setBackground(new Color(0f,0f,0f,0.7f));
        history.setOpaque(true);
        history.addActionListener(this);
        history.addMouseListener(this);

        others = new JButton("Others");
        others.setBounds(600,400,250,60);
        others.setFont(new Font("Consolas",Font.BOLD,25));
        others.setForeground(Color.cyan);
        others.setFocusable(false);
        others.setBackground(new Color(0f,0f,0f,0.7f));
        others.setOpaque(true);
        others.addActionListener(this);
        others.addMouseListener(this);


        this.setSize(900,550);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setLayout(null);
        this.setTitle("D'Crew's");
        this.addMouseListener(this);
        this.setIconImage(logo1.getImage());
        this.setResizable(false);
        this.add(label);


        label.add(label1);
        label.add(transfer);
        label.add(balance);
        label.add(history);
        label.add(withdraw);
        label.add(others);
        label.add(label2);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == transfer){
            System.out.println("DO You Want to Transfer Money");
            new TransferScreen ();
        }
        if (e.getSource() == withdraw){
            System.out.println("DO You Want to Withdraw Money");
            //new withdrawScreen();
        }
        if (e.getSource() == history){
            System.out.println("DO You Want to  Check History");
            new HistoryScreen ();
        }
        if (e.getSource() == balance){
            System.out.println("DO You Want to Check Balance");
            new BalanceScreen ();
        }
        if (e.getSource() == others){
            System.out.println("DO You Want to Check Balance");
            new OthersScreen ();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if(e.getSource()==this)
        {
            label2.setIcon(logo2);
        }
        if (e.getSource()==balance){
            label2.setIcon(bal);
        }
        if(e.getSource()==history){
            label2.setIcon(his);
        }
        if (e.getSource()==others){
            label2.setIcon(other);
        }
        if (e.getSource()==transfer){
            label2.setIcon(trans);
        }
        if(e.getSource()==bg)
        {
            label2.setIcon(null);
        }


    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
