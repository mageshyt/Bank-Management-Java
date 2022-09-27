import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class LoginPage implements ActionListener {

    JFrame frame = new JFrame();
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    JTextField userIDField = new JTextField();
    JPasswordField userPassField = new JPasswordField();


    JLabel userIDlabel = new JLabel("UserId : ");
    JLabel userPasslabel = new JLabel("Password : ");;
    JLabel messageLabel = new JLabel();
    JLabel label = new JLabel("Login Page");
    JLabel bg = new JLabel();
    ImageIcon xIcon;
    ImageIcon CheckIcon;

    JButton newreg;

    JCheckBox check = new JCheckBox("I'm Not a Robot");

    // this is testing push


    ImageIcon image = new ImageIcon("bglogin.png");


    HashMap<String,String> logininfo = new HashMap<String,String>();

    LoginPage(HashMap<String,String> loginInfoOriginal){
        logininfo = loginInfoOriginal;

        bg = new JLabel();
        bg.setSize(900,550);
        bg.setIcon(image);

        xIcon = new ImageIcon("tick.png");
        CheckIcon = new ImageIcon("wrong.png");

        check.setFocusable(false);
        check.setFont(new Font("Consolas",Font.BOLD,20));
        check.setIcon(CheckIcon);
        check.setSelectedIcon(xIcon);
        check.setBounds(600,275,250,40);
        check.setForeground(Color.white);
        check.setBackground(Color.BLACK);
        check.setOpaque(true);



        label.setBounds(350,10,250,40);
        label.setFont(new Font("Consolas",Font.BOLD,40));
        label.setForeground(new Color(54,245,165));


        userIDlabel.setBounds(600,100,150,30);
        userIDlabel.setFont(new Font("Consolas",Font.BOLD,25));
        userIDlabel.setForeground(Color.white);


        userPasslabel.setBounds(600,185,150,30);
        userPasslabel.setFont(new Font("Consolas",Font.BOLD,25));
        userPasslabel.setForeground(Color.WHITE);


        messageLabel.setBounds(600,400,300,40);
        messageLabel.setFont(new Font(null,Font.BOLD,25));

        userIDField.setBounds(600,125,250,35);
        userIDField.setForeground(Color.BLACK);
        userIDField.setFont(new Font("Consolas",Font.BOLD,25));
        userIDField.setBackground(Color.lightGray);
        userIDField.setOpaque(true);

        userPassField.setBounds(600,210,250,35);
        userPassField.setForeground(Color.BLACK);
        userPassField.setFont(new Font("Consolas",Font.BOLD,25));
        userPassField.setBackground(Color.lightGray);
        userPassField.setOpaque(true);

        loginButton.setBounds(600,350,100,40);
        loginButton.setBackground(new Color(54,245,165));
        loginButton.setForeground(Color.BLACK);
        loginButton.setFont(new Font("Consolas",Font.BOLD,20));
        loginButton.setOpaque(true);
        loginButton.setFocusable(false);
        loginButton.addActionListener(this);

        resetButton.setBounds(725,350,100,40);
        resetButton.setBackground(new Color(245,192,54));
        resetButton.setForeground(Color.BLACK);
        resetButton.setFont(new Font("Consolas",Font.BOLD,20));
        resetButton.setOpaque(true);
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);

        newreg = new JButton("New User ?");
        newreg.setBounds(10,450,150,25);
        newreg.setBackground(new Color(0,0,0));
        newreg.setForeground(Color.WHITE);
        newreg.setFont(new Font("Consolas",Font.BOLD,15));
        newreg.setOpaque(true);
        newreg.setFocusable(false);
        newreg.addActionListener(this);


        frame.add(messageLabel);
        frame.add(userIDField);
        frame.add(loginButton);
        frame.add(resetButton);
        frame.add(userPassField);
        frame.add(userIDlabel);
        frame.add(userPasslabel);
        frame.add(label);
        frame.add(newreg);

        frame.add(bg);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900,550);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.add(check);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == resetButton){
            userIDField.setText("");
            userPassField.setText("");
            messageLabel.setText("");
        }

        if (e.getSource() == loginButton){
            String userID = userIDField.getText();
            String Password = String.valueOf(userPassField.getPassword());

            if (logininfo.containsKey(userID)){
                if (logininfo.get(userID).equals(Password)){

                    messageLabel.setForeground(Color.GREEN);
                    messageLabel.setText("Login SuccessFull");
                    frame.dispose();
                    new HomeScreen();
                }
                else{
                    messageLabel.setForeground(Color.RED);
                    messageLabel.setText("Wrong Password");
                }
            }
            else{
                messageLabel.setForeground(Color.RED);
                messageLabel.setText("UserName Not Found");
            }
        }
        if (e.getSource()==newreg){
            new NewRegister();
            frame.dispose();
        }
    }
}
