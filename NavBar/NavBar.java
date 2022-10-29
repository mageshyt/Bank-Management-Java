package NavBar;

import Login.IdPass;
import Login.LoginPage;
import NewRegister.NewRegister;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class NavBar extends JFrame implements ActionListener, MouseListener {

    JButton homebtn;
    JButton aboutbtn;
    JButton servicesbtn;
    JButton supportbtn;
    JButton quesbtn;
    JButton loginbtn;
    JButton signupbtn;
    JLabel bglabel;
    JLabel label;
    JLabel logotxt;
    JLabel text;

    ImageIcon bg = new ImageIcon("NavBar/nightsky.jpg");
    ImageIcon logo = new ImageIcon("NavBar/logo2.png");

    public NavBar(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(900,550);
        this.setLayout(null);

        bglabel = new JLabel();
        bglabel.setSize(900,550);
        bglabel.setIcon(bg);

        label = new JLabel();
        label.setSize(300,300);
        label.setIcon(logo);
        label.setBounds(250,100,300,300);

        text = new JLabel("D'Crew's Bank  Your life!, Your Money, Your Bank!..");
        text.setBounds(150,420,700,40);
        text.setBackground(new Color(0,0,0,1));
        text.setOpaque(true);
        text.setFont(new Font("Ink Free",Font.BOLD,25));
        text.setForeground(new Color(54,245,165));


        logotxt = new JLabel("D'Crew's");
        logotxt.setBounds(30,18,130,40);
        logotxt.setBackground(new Color(0,0,0,1));
        logotxt.setOpaque(true);
        logotxt.setFont(new Font("MV Boli",Font.BOLD,25));
        logotxt.setForeground(new Color(255, 235, 0));

        homebtn = new JButton("Home");
        homebtn.setBounds(150,25,80,30);
        homebtn.setForeground(Color.white);
        homebtn.setFont(new Font("Consolas",Font.BOLD,20));
        homebtn.setBackground(new Color(0,0,0,200));
        homebtn.setOpaque(false);
        homebtn.setFocusable(false);
        homebtn.addActionListener(this);
        homebtn.addMouseListener(this);




        aboutbtn = new JButton("About");
        aboutbtn.setBounds(225,25,100,30);
        aboutbtn.setForeground(Color.white);
        aboutbtn.setFont(new Font("Consolas",Font.BOLD,20));
        aboutbtn.setBackground(new Color(0,0,0,200));
        aboutbtn.setOpaque(false);
        aboutbtn.setFocusable(false);
        aboutbtn.addActionListener(this);
        aboutbtn.addMouseListener(this);



        servicesbtn = new JButton("Services");
        servicesbtn.setBounds(325,25,130,30);
        servicesbtn.setForeground(Color.white);
        servicesbtn.setFont(new Font("Consolas",Font.BOLD,20));
        servicesbtn.setBackground(new Color(0,0,0,200));
        servicesbtn.setOpaque(false);
        servicesbtn.setFocusable(false);
        servicesbtn.addActionListener(this);
        servicesbtn.addMouseListener(this);


        supportbtn = new JButton("Support");
        supportbtn.setBounds(455,25,115,30);
        supportbtn.setForeground(Color.white);
        supportbtn.setFont(new Font("Consolas",Font.BOLD,20));
        supportbtn.setBackground(new Color(0,0,0,200));
        supportbtn.setOpaque(false);
        supportbtn.setFocusable(false);
        supportbtn.addActionListener(this);
        supportbtn.addMouseListener(this);

        quesbtn = new JButton("FAQ");
        quesbtn.setBounds(570,25,70,30);
        quesbtn.setForeground(Color.white);
        quesbtn.setFont(new Font("Consolas",Font.BOLD,20));
        quesbtn.setBackground(new Color(0,0,0,200));
        quesbtn.setOpaque(false);
        quesbtn.setFocusable(false);
        quesbtn.addActionListener(this);
        quesbtn.addMouseListener(this);

        loginbtn = new JButton("Login");
        loginbtn.setBounds(660,25,100,30);
        loginbtn.setForeground(Color.black);
        loginbtn.setFont(new Font("Consolas",Font.BOLD,20));
        loginbtn.setBackground(new Color(54,245,165));
        loginbtn.setOpaque(true);
        loginbtn.setFocusable(false);
        loginbtn.addActionListener(this);
        loginbtn.addMouseListener(this);

        signupbtn = new JButton("Sign Up");
        signupbtn.setBounds(760,25,120,30);
        signupbtn.setForeground(Color.black);
        signupbtn.setFont(new Font("Consolas",Font.BOLD,20));
        signupbtn.setBackground(new Color(245,192,54));
        signupbtn.setOpaque(true);
        signupbtn.setFocusable(false);
        signupbtn.addActionListener(this);
        signupbtn.addMouseListener(this);



        this.addMouseListener(this);
        this.add(homebtn);
        this.add(aboutbtn);
        this.add(servicesbtn);
        this.add(supportbtn);
        this.add(quesbtn);
        this.add(loginbtn);
        this.add(signupbtn);
        this.add(label);
        this.add(logotxt);
        this.add(text);
        this.setVisible(true);
        this.add(bglabel);

        this.setResizable(false);
        this.setLocationRelativeTo(null);

    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginbtn){
            IdPass idPass = new IdPass();
            LoginPage login = new LoginPage();
        }
        if (e.getSource() == signupbtn){
            new NewRegister();
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
        if (e.getSource() == homebtn){
            homebtn.setForeground(Color.red);
        }
        if (e.getSource() == aboutbtn){
            aboutbtn.setForeground(Color.red);
        }
        if (e.getSource() == servicesbtn){
            servicesbtn.setForeground(Color.red);
        }
        if (e.getSource() == supportbtn){
            supportbtn.setForeground(Color.red);
        }
        if (e.getSource() == quesbtn){
            quesbtn.setForeground(Color.red);
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() == homebtn){
            homebtn.setForeground(Color.white);
        }
        if (e.getSource() == aboutbtn){
            aboutbtn.setForeground(Color.white);
        }
        if (e.getSource() == servicesbtn){
            servicesbtn.setForeground(Color.white);
        }
        if (e.getSource() == supportbtn){
            supportbtn.setForeground(Color.white);
        }
        if (e.getSource() == quesbtn){
            quesbtn.setForeground(Color.white);
        }

    }
}
