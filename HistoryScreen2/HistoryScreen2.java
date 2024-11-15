package HistoryScreen2;
import HomeScreen.HomeScreen;
import MongoDb.Auth;
import MongoDb.Transaction;
import org.bson.Document;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class HistoryScreen2{
    JButton back;
    public HistoryScreen2(){
        JFrame frame= new JFrame();

                Document currentUser= Auth.CurrentUser;
                String userName= currentUser.getString("username");
               // String balance= currentUser.getString("balance");
                String balance= currentUser.get("balance").toString();
                ImageIcon image=new ImageIcon("HistoryScreen2/Assets/Large.png");
                ImageIcon image1=new ImageIcon("HistoryScreen2/Assets/cardframe.png");


                JLabel label=new JLabel(); //! this is for welcome text
                JLabel label1=new JLabel(); //! this is for username
                JLabel label2=new JLabel();//
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

                label.setText("Welcome back,");
                label.setFont(new Font("Consolas", Font.BOLD,24));
                label.setBounds(52,42,320,24);

                label1.setText(userName+" :)");
                label1.setBounds(52,66,320,34);
                label1.setFont(new Font("Consolas", Font.BOLD,24));

                label2.setText("Balance");
                label2.setBounds(72,144,100,17);
                label2.setFont(new Font("Consolas", Font.BOLD,14));

                label3.setText("₹ "+balance);
                label3.setBounds(79,171,150,29);
                label3.setFont(new Font("Consolas", Font.BOLD,24));

                label4.setIcon(image);
                label4.setBounds(43,205,391,300);
                label4.add(label21);

                label5.setText("Latest Transactions:");
                label5.setBounds(509,64,194,17);
                label5.setFont(new Font("Consolas", Font.BOLD,14));

                label7.setText("payment type");
                label7.setBounds(504,106,100,12);
                label7.setFont(new Font("Consolas", Font.BOLD,10));

                label8.setText("payment to/from");
                label8.setBounds(613,106,150,12);
                label8.setFont(new Font("Consolas", Font.BOLD,10));

                label9.setText("data");
                label9.setBounds(762,106,30,12);
                label9.setFont(new Font("Consolas", Font.BOLD,10));

                label10.setText("amount");
                label10.setBounds(850,106,200,12);
                label10.setFont(new Font("Consolas", Font.BOLD,10));


                label21.setText(" "+userName);
                label21.setBounds(140,365,100,25);
                label21.setForeground(Color.white);
                label21.setFont(new Font("Consolas", Font.BOLD,16));

                        // back btn
                back=new JButton("Back");
                back.setBounds(10,0,80,25);
                //! round border


                back.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.dispose();
                        new HomeScreen();
                    }
                });

            //Tranasction detail
            Transaction transaction= new Transaction ();

            ArrayList<Document> trans=transaction.getUserTransactions (userName);
            int count=0;
        //! empty lable
            JLabel emptyLabel = new JLabel();
    for (Document tran : trans) {
        //String amount = tran.get ("amount").toString();
                    String type = tran.get("type").toString();
         // get date
        String detail= "from "+tran.get("from").toString()+" to "+tran.get("to").toString();

       String date = tran.get("date").toString().substring(0,10);
                    String amount = tran.get("amount").toString();
                    paymentDetail pay = new paymentDetail(type, amount, date, detail, 0, 0);

                    pay.setBounds(504, 133 + count, 400, 42);
                    frame.add(pay);
                    count += 61;
            }

                frame.add(emptyLabel);

                frame.setTitle("History Page");
                frame.setSize(1000,550);
                frame.getContentPane().setBackground(new Color(255,255,255));
                frame.setVisible(true);
                frame.setLayout(null);
                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                frame.setLocationRelativeTo(null);
                frame.setResizable(false);
                frame.add(back);
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
                //frame.add (pd);

            }
        }