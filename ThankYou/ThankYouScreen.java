package ThankYou;
import HomeScreen.HomeScreen;

import javax.swing.*;
import java.awt.*;
public class ThankYouScreen extends JFrame {

    public ThankYouScreen(){

                JButton b1=new JButton();
                b1.setText("Back to home");
                b1.setBackground(new Color(142, 225, 185));
                b1.setForeground(Color.BLACK);
                b1.setOpaque(true);
                b1.setBounds(531,374,230,45);


                ImageIcon image=new ImageIcon("ThankYou/Assets/image13.png");

                JLabel label=new JLabel();
                JLabel label1=new JLabel();
                JLabel label2=new JLabel();
                JLabel label3=new JLabel();

                label.setIcon(image);
                label.setBounds(0,0,370,592);

                label1.setText("     Thank you");
                label1.setFont(new Font("Consolas", Font.BOLD,40));
                label1.setBounds(437,134,361,61);
                label1.setForeground(Color.black);

                label2.setText("  Gratitude is a quality similar to electricity: It must be ");
                label2.setFont(new Font("Consolas", Font.BOLD,16));
                label2.setBounds(390 ,185,700,61);
                label2.setForeground(Color.black);

                label3.setText("produced and discharged and used up in order to exist at all ");
                label3.setFont(new Font("Consolas", Font.BOLD,16));
                label3.setBounds(390 ,205,700,61);
                label3.setForeground(Color.black);

                setTitle("Thankyou Page");
                setLayout(null);
                setSize(950,592);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setVisible(true);
                setLocationRelativeTo(null);
                setResizable(false);
                b1.addActionListener(e -> {
                    dispose();
                    new HomeScreen();
                });
                add(label1);
                add(label);
                add(label2);
                add(label3);
                add(b1);

            }
    }
