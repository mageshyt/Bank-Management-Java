package NewRegister;

import Login.IdPass;
import Login.LoginPage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewRegister extends JFrame implements ActionListener {

    JButton button;
    JLabel bg;
    ImageIcon img = new ImageIcon("NewRegister/newregisterimg.png");
    JButton loginButton;
    JButton resetButton;
    JButton alacc;

    JTextField nametxt;
    JTextField phonetxt;
    JTextField pantxt;
    JTextField emailtxt;
    JTextField passtxt;
    JTextField conftxt;

    public NewRegister(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(900,550);


        bg = new JLabel();
        bg.setSize(900,550);
        bg.setIcon(img);

        JLabel label = new JLabel("Register User");
        label.setForeground(Color.white);
        label.setFont(new Font("Consolas",Font.BOLD,45));
        label.setBounds(300,10,350,50);
        label.setBackground(new Color(0,0,0,0));
        label.setOpaque(true);

        JLabel name = new JLabel("Name ");
        name.setForeground(Color.white);
        name.setFont(new Font("Consolas",Font.BOLD,25));
        name.setBounds(500,75,300,25);
        name.setBackground(new Color(0,0,0,0));
        name.setOpaque(true);

        nametxt = new JTextField();
        nametxt.setBackground(Color.lightGray);
        nametxt.setOpaque(true);
        nametxt.setForeground(Color.BLACK);
        nametxt.setFont(new Font("Consolas",1,25));
        nametxt.setBounds(500,100,250,40);

        JLabel Phoneno = new JLabel("Phone Number");
        Phoneno.setForeground(Color.white);
        Phoneno.setFont(new Font("Consolas",Font.BOLD,25));
        Phoneno.setBounds(500,150,300,35);
        Phoneno.setBackground(new Color(0,0,0,0));
        Phoneno.setOpaque(true);

        phonetxt = new JTextField();
        phonetxt.setBackground(Color.lightGray);
        phonetxt.setOpaque(true);
        phonetxt.setForeground(Color.BLACK);
        phonetxt.setFont(new Font("Consolas",1,25));
        phonetxt.setBounds(500,175,250,40);

        JLabel panno = new JLabel("Pan Card Number");
        panno.setForeground(Color.white);
        panno.setFont(new Font("Consolas",Font.BOLD,25));
        panno.setBounds(500,225,300,35);
        panno.setBackground(new Color(0,0,0,0));
        panno.setOpaque(true);

        pantxt = new JTextField();
        pantxt.setBackground(Color.lightGray);
        pantxt.setOpaque(true);
        pantxt.setForeground(Color.BLACK);
        pantxt.setFont(new Font("Consolas",1,25));
        pantxt.setBounds(500,250,250,40);

        JLabel email = new JLabel("Email ");
        email.setForeground(Color.white);
        email.setFont(new Font("Consolas",Font.BOLD,25));
        email.setBounds(500,300,300,35);
        email.setBackground(new Color(0,0,0,0));
        email.setOpaque(true);

       emailtxt = new JTextField();
        emailtxt.setBackground(Color.lightGray);
        emailtxt.setOpaque(true);
        emailtxt.setForeground(Color.BLACK);
        emailtxt.setFont(new Font("Consolas",1,25));
        emailtxt.setBounds(500,325,250,40);

        JLabel password = new JLabel("Create New Password ");
        password.setForeground(Color.white);
        password.setFont(new Font("Consolas",Font.BOLD,25));
        password.setBounds(500,375,300,35);
        password.setBackground(new Color(0,0,0,0));
        password.setOpaque(true);

       passtxt = new JTextField();
        passtxt.setBackground(Color.lightGray);
        passtxt.setOpaque(true);
        passtxt.setForeground(Color.BLACK);
        passtxt.setFont(new Font("Consolas",1,25));
        passtxt.setBounds(500,400,250,40);


        JLabel confpass= new JLabel("Confirm Password ");
        confpass.setForeground(Color.white);
        confpass.setFont(new Font("Consolas",Font.BOLD,25));
        confpass.setBounds(500,450,300,35);
        confpass.setBackground(new Color(0,0,0,0));
        confpass.setOpaque(true);

        conftxt = new JTextField();
        conftxt.setBackground(Color.lightGray);
        conftxt.setOpaque(true);
        conftxt.setForeground(Color.BLACK);
        conftxt.setFont(new Font("Consolas",1,25));
        conftxt.setBounds(500,475,250,40);


        loginButton = new JButton("Login");
        loginButton.setBounds(100,350,100,40);
        loginButton.setBackground(new Color(54,245,165));
        loginButton.setForeground(Color.BLACK);
        loginButton.setFont(new Font("Consolas",Font.BOLD,20));
        loginButton.setOpaque(true);
        loginButton.setFocusable(false);
        loginButton.addActionListener(this);

        resetButton = new JButton("Reset");
        resetButton.setBounds(200,350,100,40);
        resetButton.setBackground(new Color(245,192,54));
        resetButton.setForeground(Color.BLACK);
        resetButton.setFont(new Font("Consolas",Font.BOLD,20));
        resetButton.setOpaque(true);
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);


        alacc = new JButton("Already Have an Account ?");
        alacc.setBounds(10,450,200,25);
        alacc.setBackground(new Color(0,0,0));
        alacc.setForeground(Color.WHITE);
        alacc.setFont(new Font("Consolas",Font.BOLD,10));
        alacc.setOpaque(true);
        alacc.setFocusable(false);
        alacc.addActionListener(this);

        this.add(label);
        this.add(name);
        this.add(Phoneno);
        this.add(panno);
        this.add(email);
        this.add(password);
        this.add(confpass);

        this.add(nametxt);
        this.add(phonetxt);
        this.add(pantxt);
        this.add(passtxt);
        this.add(emailtxt);
        this.add(conftxt);

        this.add(loginButton);
        this.add(resetButton);
        this.add(alacc);


        this.add(bg);

        this.setVisible(true);
        this.setLayout(null);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == alacc){
            IdPass idPass = new IdPass();
            LoginPage login = new LoginPage(idPass.getLoginInfo());
            this.dispose();
        }

        if (e.getSource() == resetButton){
            nametxt.setText("");
            phonetxt.setText("");
            pantxt.setText("");
            emailtxt.setText("");
            passtxt.setText("");
            conftxt.setText("");
        }
    }
}
