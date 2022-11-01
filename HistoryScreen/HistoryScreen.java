package HistoryScreen;
import HomeScreen.HomeScreen;
import MongoDb.Transaction;
import org.bson.Document;

import javax.print.Doc;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class HistoryScreen extends  JFrame implements ActionListener  {
    JButton back;
    public HistoryScreen(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(900,550);

        JLabel label = new JLabel();
        label.setText("Transaction History");
        label.setBounds(150,0,350,40);
        label.setForeground(new Color(65280));
        label.setFont(new Font("MV Boli", 0, 30));
        label.setBackground(Color.BLACK);
        label.setOpaque(true);

        Transaction transaction = new Transaction ();

        ArrayList<Document> transactions = transaction.getUserTransactions("magesh");

            // create a label and add it to the frame with the transaction details
            int y = 50;
            int count = 1;
//        for (Document transactionDoc : transactions) {
//            JLabel transactionLabel = new JLabel();
//            transactionLabel.setText(transactionDoc.getString("from") + " sent " + transactionDoc.getInteger("amount") + " to " + transactionDoc.getString("to"));
//            transactionLabel.setBounds(150, y*count, 350, 40);
//            transactionLabel.setForeground(new Color(65280));
//            transactionLabel.setFont(new Font("MV Boli", 0, 18));
//            transactionLabel.setBackground(Color.BLACK);
//            transactionLabel.setOpaque(true);
//            count++;
//            this.add(transactionLabel);
//        }

    //! add j scroll pane
        JLabel label2 = new JLabel("test");
        JScrollPane scrollPane = new JScrollPane(label2);
        scrollPane.setBounds(100,100,300,120);

        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        back = new JButton("Back");
        back.setBounds(10,10,90,30);
        back.setFont(new Font("Consolas",Font.BOLD,25));
        back.setForeground(Color.BLACK);
        back.setFocusable(false);
        back.setBackground(Color.yellow);
        back.setOpaque(true);
        back.setFocusable(false);
        back.addActionListener(this);

        this.setLayout(null);
        this.setVisible(true);
        this.getContentPane().setBackground(Color.BLACK);
        this.setLocationRelativeTo(null);
        this.add(label);
        this.add(back);
        this.add(scrollPane);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==back){
            new HomeScreen();
        }

    }
}
