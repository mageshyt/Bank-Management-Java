package BalanceScreen;
import HomeScreen.HomeScreen;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BalanceScreen extends JFrame implements ActionListener {
    JButton back;
    public BalanceScreen(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(900,550);

        JLabel label = new JLabel();
        label.setText("Balance Check");
        label.setForeground(new Color(65280));
        label.setBounds(150,0,250,40);
        label.setFont(new Font("MV Boli", 0, 30));
        label.setBackground(Color.BLACK);
        label.setOpaque(true);


        JLabel label1 = new JLabel();
        label1.setText("Your Available Balance !..");
        label1.setForeground(new Color(65280));
        label1.setFont(new Font("MV Boli", 0, 25));
        label1.setBounds(0,50,350,40);
        label1.setBackground(Color.BLACK);
        label1.setOpaque(true);

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
        this.getContentPane().setBackground(Color.BLACK);
        this.setLocationRelativeTo(null);
        this.add(back);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==back){
            new HomeScreen();
        }
    }
}
