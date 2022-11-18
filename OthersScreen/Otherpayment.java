package OthersScreen;
import MongoDb.Transaction;
import OthersScreen.*;
import ThankYou.ThankYouScreen;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Otherpayment extends  JFrame implements ActionListener {
    JButton b1;
    String name,inputname;
    JLabel namelabel;
    JTextField  t2;
    public Otherpayment(String name,String inputname){

        this.name = name;
        this.inputname=inputname;

        ImageIcon image=new ImageIcon("OthersScreen/payimg.png");

        JLabel label=new JLabel();
        label.setIcon(image);
        label.setBounds(0,0,556,550);

        namelabel=new JLabel(name);
        namelabel.setBounds(100,70,225,54);
        namelabel.setFont(new Font("Consolas",1,40));
        namelabel.setForeground(Color.white);


        JLabel label5=new JLabel();
        label5.setText("Pay your bill on time");
        label5.setBounds(504,71,430,81);
        label5.setFont(new Font("Inter", Font.BOLD,36));
        label5.setForeground(new Color(70,69,95));

        JLabel label6=new JLabel();
        label6.setText(inputname)   ;
        label6.setBounds(487,166,250,29);
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

        t2=new JTextField();
        t2.setPreferredSize(new Dimension(250,40));
        t2.setFont(new Font("Inter",Font.PLAIN,35));
        t2.setBackground(new Color(224,241,255));
        t2.setText("");
        t2.setBounds(487,325,385,42);
        t2.setBorder(new LineBorder(new Color(224,241,255),4));

        b1 = new JButton("Pay Now");
        b1.setBounds(487,400,385,42);
        b1.setBackground(Color.red);
        b1.setOpaque(true);
        b1.setFont(new Font("Consolas",1,25));
        b1.addActionListener(this);

        setTitle("OtherPayment Page");
        setSize(900,550);
        getContentPane().setBackground(new Color(255,255,255));
        setVisible(true);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        add(namelabel);
        add(label);
        add(label5);
        add(label6);
        add(b1);
        add(t1);
        add(t2);
        add(label8);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1){
            Transaction tran= new Transaction ();
          String res=  tran.payOthers (Integer.parseInt (t2.getText ()),name,inputname);
          if(res.equals ("success")){
              JOptionPane.showMessageDialog (null,"Payment Successful");
              this.dispose ();
              new ThankYouScreen();
          }
          else{
              JOptionPane.showMessageDialog (null,"Payment Failed");
          }
        }
    }
}