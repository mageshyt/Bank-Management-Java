package Login;

import HomeScreen.HomeScreen;
import MongoDb.Auth;
import MongoDb.Mongodb;
import NewRegister.NewRegister;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Objects;

public class forgetpass implements ActionListener {

    JFrame frame = new JFrame();
    JButton loginButton = new JButton("Sign In");
    JTextField panField = new JTextField();
    JTextField newpassField  = new JTextField();
    JPasswordField confpassfield= new JPasswordField();
    JLabel bglabel = new JLabel();



    JLabel panno = new JLabel("Pan Card No : ");
    JLabel newpass = new JLabel("New Password : ");
    JLabel confPass = new JLabel("Confirm Password : ");
    JLabel messageLabel = new JLabel();
    JLabel label = new JLabel("Forget Password");
    JLabel bg = new JLabel();


    // this is testing push


    ImageIcon image = new ImageIcon("Login/bglogin2.png");

    static int  attempts = 0;

    public forgetpass(){

        bglabel.setBounds(469,0,431,550);
        bglabel.setBackground(Color.white);
        bglabel.setOpaque(true);

        bg = new JLabel();
        bg.setSize(900,550);
        bg.setIcon(image);

        label.setBounds(525,60,350,40);
        label.setFont(new Font("Courier New",Font.BOLD,30));
        label.setForeground(new Color(70, 69, 95));


        panno.setBounds(550,130,300,30);
        panno.setFont(new Font("Consolas",Font.BOLD,25));
        panno.setForeground(new Color(70, 69, 95));


        newpass.setBounds(550,215,300,30);
        newpass.setFont(new Font("Consolas",Font.BOLD,25));
        newpass.setForeground(new Color(70, 69, 95));

        confPass.setBounds(550,295,300,30);
        confPass.setFont(new Font("Consolas",Font.BOLD,25));
        confPass.setForeground(new Color(70, 69, 95));


        messageLabel.setBounds(600,400,300,40);
        messageLabel.setFont(new Font(null,Font.BOLD,25));

        panField.setBounds(560,160,300,35);
        panField.setForeground(Color.BLACK);
        panField.setFont(new Font("Consolas",Font.BOLD,25));
        panField.setBackground(new Color(224, 241, 255));
        panField.setOpaque(true);

        newpassField.setBounds(560,245,300,35);
        newpassField.setForeground(Color.BLACK);
        newpassField.setFont(new Font("Consolas",Font.BOLD,25));
        newpassField.setBackground(new Color(224, 241, 255));
        newpassField.setOpaque(true);

        confpassfield.setBounds(560,330,300,35);
        confpassfield.setForeground(Color.BLACK);
        confpassfield.setFont(new Font("Consolas",Font.BOLD,25));
        confpassfield.setBackground(new Color(224, 241, 255));
        confpassfield.setOpaque(true);

        loginButton.setBounds(600,400,200,40);
        loginButton.setBackground(new Color(123, 76, 255));
        loginButton.setForeground(Color.BLACK);
        loginButton.setFont(new Font("Consolas",Font.BOLD,20));
        loginButton.setOpaque(true);
        loginButton.setFocusable(false);
        loginButton.addActionListener(this);

        frame.add(panno);
        frame.add(newpass);
        frame.add(confPass);
        frame.add(label);
        frame.add(messageLabel);
        frame.add(panField);
        frame.add(loginButton);
        frame.add(newpassField);
        frame.add(confpassfield);

        frame.add(bg);
        frame.add(bglabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900,550);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

//        if (e.getSource() == loginButton){
//                       // result
//
//            try {
//                String result = auth.Login(userID,Password);
//                System.out.println("Result : " + result);
//                if(Objects.equals (result, "success")){
//                    messageLabel.setForeground(Color.GREEN);
//                    messageLabel.setText("Login Successful");
//                    frame.dispose();
//                    HomeScreen homeScreen = new HomeScreen();
//                }
//                else if(Objects.equals(result, "failed")){
//                    messageLabel.setForeground(Color.RED);
//                    messageLabel.setText("login password incorrect");
//                    attempts++;
//                    if(attempts == 3){
//                        auth.LockUser(userID);
//
//                    }
//                }
//                else if(Objects.equals(result, "locked")){
//                    messageLabel.setForeground(Color.RED);
//
//                    long reliseTime = Auth.waitingTime;
//                    // pop up
//                    JOptionPane.showMessageDialog(null,"Your Account is Locked for " + reliseTime + " hours","Account Locked",JOptionPane.ERROR_MESSAGE);
//                }
//
//                else{
//                    messageLabel.setForeground(Color.RED);
//                    messageLabel.setText("User Not Found");
//                }
//
//            } catch (ParseException ex) {
//                throw new RuntimeException(ex);
//            }
        //}

    }
}
