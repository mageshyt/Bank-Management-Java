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

public class LoginPage implements ActionListener {

    JFrame frame = new JFrame();
    JButton loginButton = new JButton("Sign In");
    JTextField userIDField = new JTextField();
    JPasswordField userPassField = new JPasswordField();
    JLabel bglabel = new JLabel();



    JLabel userIDlabel = new JLabel("UserId : ");
    JLabel userPasslabel = new JLabel("Password : ");;
    JLabel messageLabel = new JLabel();
    JLabel label = new JLabel("Sign In to D'Crews ");
    JLabel bg = new JLabel();
    JButton newreg;
    JButton forget;


    // this is testing push


    ImageIcon image = new ImageIcon("Login/bglogin.png");

    static int  attempts = 0;

    public LoginPage(){

        bglabel.setBounds(469,0,431,550);
        bglabel.setBackground(Color.white);
        bglabel.setOpaque(true);

        bg = new JLabel();
        bg.setSize(900,550);
        bg.setIcon(image);

        label.setBounds(505,75,350,40);
        label.setFont(new Font("Courier New",Font.BOLD,30));
        label.setForeground(new Color(70, 69, 95));


        userIDlabel.setBounds(550,130,150,30);
        userIDlabel.setFont(new Font("Consolas",Font.BOLD,25));
        userIDlabel.setForeground(new Color(70, 69, 95));


        userPasslabel.setBounds(550,215,150,30);
        userPasslabel.setFont(new Font("Consolas",Font.BOLD,25));
        userPasslabel.setForeground(new Color(70, 69, 95));


        messageLabel.setBounds(600,400,300,40);
        messageLabel.setFont(new Font(null,Font.BOLD,25));

        userIDField.setBounds(560,160,300,35);
        userIDField.setForeground(Color.BLACK);
        userIDField.setFont(new Font("Consolas",Font.BOLD,25));
        userIDField.setBackground(new Color(224, 241, 255));
        userIDField.setOpaque(true);

        userPassField.setBounds(560,245,300,35);
        userPassField.setForeground(Color.BLACK);
        userPassField.setFont(new Font("Consolas",Font.BOLD,25));
        userPassField.setBackground(new Color(224, 241, 255));
        userPassField.setOpaque(true);

        loginButton.setBounds(600,350,200,40);
        loginButton.setBackground(new Color(123, 76, 255));
        loginButton.setForeground(Color.BLACK);
        loginButton.setFont(new Font("Consolas",Font.BOLD,20));
        loginButton.setOpaque(true);
        loginButton.setFocusable(false);
        loginButton.addActionListener(this);


        newreg = new JButton("New User ?");
        newreg.setBounds(530,310,120,25);
        newreg.setBackground(Color.white);
        newreg.setForeground(new Color(123, 76, 255));
        newreg.setFont(new Font("Consolas",Font.BOLD,18));
        newreg.setOpaque(true);
        newreg.setFocusable(false);
        newreg.setBorder(BorderFactory.createEmptyBorder());
        newreg.addActionListener(this);

        forget = new JButton("Forget Password ?");
        forget.setBounds(690,310,180,25);
        forget.setBackground(Color.white);
        forget.setForeground(new Color(123, 76, 255));
        forget.setFont(new Font("Consolas",Font.BOLD,18));
        forget.setOpaque(true);
        forget.setFocusable(false);
        forget.setBorder(BorderFactory.createEmptyBorder());
        forget.addActionListener(this);


        frame.add(userIDlabel);
        frame.add(userPasslabel);
        frame.add(label);
        frame.add(messageLabel);
        frame.add(userIDField);
        frame.add(loginButton);
        frame.add(userPassField);

        frame.add(newreg);
        frame.add(forget);

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

        if (e.getSource() == loginButton){
            String userID = userIDField.getText();
            String Password = String.valueOf(userPassField.getPassword());
            System.out.println ("User ID : " + userID + " Password : " + Password);
            Auth auth = new Auth();
            // result
            // if both are empty
            if (userID.isEmpty() && Password.isEmpty()){
                messageLabel.setText("Please Enter User ID and Password");
                messageLabel.setForeground(Color.red);
            }
            try {
                String result = auth.Login(userID,Password);
                System.out.println("Result : " + result);
                if(Objects.equals (result, "success")){
                    messageLabel.setForeground(Color.GREEN);
                    messageLabel.setText("Login Successful");
                    frame.dispose();
                    HomeScreen homeScreen = new HomeScreen();
                }
                else if(Objects.equals(result, "failed")){
                    messageLabel.setForeground(Color.RED);
                    messageLabel.setText("login password incorrect");
                    attempts++;
                    if(attempts == 3){
                        auth.LockUser(userID);

                    }
                }
                else if(Objects.equals(result, "locked")){
                    messageLabel.setForeground(Color.RED);

                    long reliseTime = Auth.waitingTime;
                    // pop up
                    JOptionPane.showMessageDialog(null,"Your Account is Locked for " + reliseTime + " hours","Account Locked",JOptionPane.ERROR_MESSAGE);
                }

                else{
                    messageLabel.setForeground(Color.RED);
                    messageLabel.setText("User Not Found");
                }

            } catch (ParseException ex) {
                throw new RuntimeException(ex);
            }
        }
        if (e.getSource()==newreg){
            new NewRegister();
            frame.dispose();
        }
        if (e.getSource()==forget){
            new forgetpass();
        }
    }
}
