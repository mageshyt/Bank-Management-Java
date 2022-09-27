import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HistoryScreen extends  JFrame implements ActionListener {
    JButton back;
    HistoryScreen(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(900,550);

        JLabel label = new JLabel();
        label.setText("Transaction History");
        label.setBounds(150,0,350,40);
        label.setForeground(new Color(65280));
        label.setFont(new Font("MV Boli", 0, 30));
        label.setBackground(Color.BLACK);
        label.setOpaque(true);


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
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==back){
            new HomeScreen();
        }

    }
}
