package HistoryScreen2;

import javax.swing.*;
import java.awt.*;

public class paymentDetail extends JComponent{

    public paymentDetail(String type, String amount, String date,String detail,int x,int y){
        // ! frame
        //frame = new JFrame();
        ImageIcon rightArrow=new ImageIcon("HistoryScreen2/Assets/image163.png");
        ImageIcon LeftArrow=new ImageIcon("HistoryScreen2/Assets/image164.png");

        ImageIcon background=new ImageIcon("HistoryScreen2/Assets/Frame23.png");

        System.out.println("Amount is "+amount);
        // Amount lable
        JLabel amountLabel=new JLabel();
        amountLabel.setText(amount);
        amountLabel.setBounds(350,10,200,25);
        //  right Arrow
        JLabel rightArrowLabel=new JLabel();
        rightArrowLabel.setIcon(rightArrow);
        rightArrowLabel.setBounds(11,8,43,25);

        // left Arrow
        JLabel leftArrowLabel=new JLabel();
        leftArrowLabel.setIcon(LeftArrow);
        leftArrowLabel.setBounds(11,8,43,25);

        // Type lable
        JLabel typeLabel=new JLabel();
        typeLabel.setIcon (background); // first add background
        typeLabel.setBounds(0,0,61,42);
        if(type.equals ("send")){

            typeLabel.add(rightArrowLabel);
        }else{
            typeLabel.add(leftArrowLabel);
        }

        // Details
        JLabel detailLabel=new JLabel();
        detailLabel.setText(detail);
        detailLabel.setBounds(100,10,260,24);
        detailLabel.setFont(new Font ("Consolas", Font.BOLD,10));

        // Date
        JLabel dateLabel=new JLabel();
        dateLabel.setText(date);
        dateLabel.setBounds(255,10,124,24);
        dateLabel.setFont(new Font ("Consolas", Font.BOLD,10));

        // test lable
        add (typeLabel);
        add (detailLabel);
        add (dateLabel);
        add(amountLabel);
    }
    // create a custom component
}
