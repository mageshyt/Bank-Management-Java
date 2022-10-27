package TransferScreen;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TransferScreen extends  JFrame implements ActionListener {

    JButton button;
    JButton back;

    public TransferScreen() {
        JButton b1 = new JButton("Submit");

        JTextField textField = new JTextField();
        JTextField textField1 = new JTextField();

        b1.setFont(new Font("Inter", Font.BOLD, 25));
        b1.setBackground(Color.ORANGE);
        b1.setForeground(Color.BLACK);
        b1.setOpaque(true);
        //b1.addActionListener(this);
        b1.setBounds(277, 420, 160, 35);
        b1.setBorder(new LineBorder(Color.ORANGE, 4));

        JLabel label = new JLabel();
        JLabel label1 = new JLabel();
        JLabel label2 = new JLabel();
        JLabel label3 = new JLabel();
        JLabel label4 = new JLabel();
        JLabel label5 = new JLabel();
        JLabel label6 = new JLabel();

        textField.setPreferredSize(new Dimension(250, 40));
        textField.setFont(new Font("Inter", Font.PLAIN, 35));
        textField.setText("");
        textField.setBounds(223, 200, 351, 38);
        textField.setBorder(new LineBorder(Color.black, 4));

        textField1.setPreferredSize(new Dimension(250, 40));
        textField1.setFont(new Font("Inter", Font.PLAIN, 35));
        textField1.setText("");

        textField1.setBounds(223, 309, 351, 38);
        textField1.setBorder(new LineBorder(Color.black, 4));

        ImageIcon image = new ImageIcon("TransferScreen/Assets/image7.png");
        ImageIcon image1 = new ImageIcon("TransferScreen/Assets/image5.png");
        ImageIcon image2 = new ImageIcon("TransferScreen/Assets/image8.png");
        ImageIcon image3 = new ImageIcon("TransferScreen/Assets/image9.png");

        label.setIcon(image);//Background.img
        label.add(label1);
        label.add(label2);
        label.add(label3);
        label.add(label4);
        label.add(label5);
        label.add(label6);
        label.add(b1);
        label.add(textField);
        label.add(textField1);
        label.setBounds(0, 0, 900, 550);

        label1.setIcon(image1);//mobile.img
        label1.setBounds(521, 196, 382, 242);

        label2.setIcon(image2);//creditcars.img
        label2.setBounds(145, 201, 67, 69);

        label3.setIcon(image3);//money.img
        label3.setBounds(145, 309, 67, 69);

        label4.setText("Enter the mobile number:");
        label4.setBounds(223, 165, 351, 26);
        label4.setFont(new Font("Inter", Font.BOLD, 21));

        label5.setText("Enter the amount:");
        label5.setBounds(223, 274, 351, 26);
        label5.setFont(new Font("Inter", Font.BOLD, 21));

        label6.setText("no user found");
        label6.setBounds(294, 383, 134, 24);
        label6.setForeground(Color.red);
        label6.setFont(new Font("Inter", Font.BOLD, 20));

        setTitle("Transfer Page");
        setSize(915, 592);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
        add(label);


    }


    @Override
    public void actionPerformed(ActionEvent e) {
    }
}
