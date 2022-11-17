package OthersScreen;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class OthersScreen extends JFrame implements ActionListener {
                JLabel label=new JLabel();
                JLabel label6=new JLabel();
                JLabel label7=new JLabel();
                JLabel label8=new JLabel();
                JLabel label9=new JLabel();
                JLabel label10=new JLabel();
                JLabel label11=new JLabel();
                JLabel label12=new JLabel();
                JLabel label13=new JLabel();

                ImageIcon image=new ImageIcon("OthersScreen/Assets/image14.png");
                ImageIcon image1=new ImageIcon("OthersScreen/Assets/image14a.png");
                ImageIcon image2=new ImageIcon("OthersScreen/Assets/image15.png");
                ImageIcon image3=new ImageIcon("OthersScreen/Assets/image17.png");
                ImageIcon image4=new ImageIcon("OthersScreen/Assets/image18.png");
                ImageIcon image5=new ImageIcon("OthersScreen/Assets/image19.png");
                ImageIcon image6=new ImageIcon("OthersScreen/Assets/image16.png");



                JButton b1 = new JButton();
                JButton b2 = new JButton();
                JButton b3 = new JButton();
                JButton b4 = new JButton();
                JButton b5 = new JButton();
                JButton b6 = new JButton();
    public OthersScreen(){

        label.setIcon(image);
        label.setBounds(0,0,370,550);

                b1.setIcon(image1);
                b1.setBounds(415,88,97,111);
                b1.setFocusable(false);
                b1.setBackground(new Color(0,0,0,0));
                b1.setOpaque(false);
                b1.addActionListener(this);

                b2.setIcon(image2);
                b2.setBounds(558,90,138,111);
                b2.setFocusable(false);
                b2.setBackground(new Color(0,0,0,0));
                b2.setOpaque(false);
        b2.addActionListener(this);

                b3.setIcon(image3);
                b3.setBounds(410,254,107,111);
                b3.setFocusable(false);
                b3.setBackground(new Color(0,0,0,0));
                b3.setOpaque(false);
        b3.addActionListener(this);


        b4.setIcon(image4);
                b4.setBounds(551,250,176,111);
                b4.setFocusable(false);
                b4.setBackground(new Color(7,7,7,7));
                b4.setOpaque(false);
        b4.addActionListener(this);


        b5.setIcon(image5);
                b5.setBounds(743,90,107,111);
                b5.setFocusable(false);
                b5.setBackground(new Color(0,0,0,0));
                b5.setOpaque(false);
                b5.addActionListener(this);


                b6.setIcon(image6);
                b6.setBounds(743,250,116,116);
                b6.setFocusable(false);
                b6.setOpaque(false);
                b6.setBackground(new Color(0,0,0,0));
                b6.setOpaque(false);
        b6.addActionListener(this);


        label6.setText("Choose your Payment");
                label6.setBackground(Color.white);
                label6.setFont(new Font("Consolas", Font.BOLD,25));
                label6.setBounds(500,30,300,25);

                label7.setText(" Mobile");
                label7.setBounds(425,211,78,23);
                label7.setFont(new Font("Consolas", Font.BOLD,16));

                label8.setText("   DTH");
                label8.setBounds(588,214,78,23);
                label8.setFont(new Font("Consolas", Font.BOLD,16));

                label9.setText("  Water");
                label9.setBounds(425,368,78,23);
                label9.setFont(new Font("Consolas", Font.BOLD,16));

                label10.setText("   Car");
                label10.setBounds(595,370,78,23);
                label10.setFont(new Font("Consolas", Font.BOLD,16));

                label11.setText("Insurance");
                label11.setBounds(595,385,78,23);
                label11.setFont(new Font("Consolas", Font.BOLD,16));

                label12.setText("Landline");
                label12.setBounds(764,210,78,23);
                label12.setFont(new Font("Consolas", Font.BOLD,16));

                label13.setText("GAS");
                label13.setBounds(785,372,78,23);
                label13.setFont(new Font("Consolas", Font.BOLD,16));

                setTitle("Transfer Page");
                setSize(900,550);
                setLayout(null);
                setLocationRelativeTo(null);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setVisible(true);
                setResizable(false);
                getContentPane().setBackground(new Color(0,0,0,0));
                add(label);
                add(label6);
                add(label7);
                add(label8);
                add(label9);
                add(label10);
                add(label11);
                add(label12);
                add(label13);
                add(b1);
                add(b2);
                add(b3);
                add(b4);
                add(b5);
                add(b6);
            }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b1){
            new Otherpayment("Phone bill","phone no");
        }
        if(e.getSource() == b2){
            new Otherpayment("DTH bill","dth number");

        }
        if(e.getSource() == b3){
            new Otherpayment("Landline bill","landline no");

        }
        if(e.getSource() == b4){
            new Otherpayment("Water bill","meter no");
        }
        if(e.getSource() == b5){
            new Otherpayment("Car Insurance bill","car no");
        }
        if(e.getSource() == b6){
            new Otherpayment("Cylinder bill","gas no");
        }
    }
}




