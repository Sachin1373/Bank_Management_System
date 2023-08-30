
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{

    //Define the Buttons gloablly
    
    JButton login, sign_up, clear;
    JTextField cardTextField;
    JPasswordField pinTextField;

   
    Login(){
        //Title of the Frame
        setTitle("ATM MACHINE");

        //Add the icons
        setLayout(null);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2=i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel label=new JLabel(i3);
        label.setBounds(70,10, 100, 100);
        add(label);

        //Write on the frame
        JLabel text=new JLabel("Welcome to ATM");
        text.setBounds(200, 40, 400, 40);
        text.setFont(new Font("Osward",Font.BOLD,38));
        add(text);
            
          JLabel cardno=new JLabel("Card NO:");
        cardno.setBounds(120, 150, 400, 40);
        cardno.setFont(new Font("Raleway",Font.BOLD,20));
        add(cardno);

                //take input card.no
         cardTextField=new JTextField();
        cardTextField.setBounds(300,150,230,40);
        cardTextField.setFont(new Font("Arial",Font.BOLD,20));
        add(cardTextField);
       
          JLabel pin=new JLabel("PIN:");
        pin.setBounds(120, 220, 400, 40);
        pin.setFont(new Font("Raleway",Font.BOLD,28));
         pin.setFont(new Font("Arial",Font.BOLD,28));
        add(pin);

              //take input pin
         pinTextField=new JPasswordField();
         pinTextField.setBounds(300,220,230,40);
         add(pinTextField);

        //make three buttons
        // SIGN IN BUTTON
          login=new JButton("SIGN IN");
         login.setBounds(300,300,100,30);
         login.setBackground(Color.BLACK);
         login.setForeground(Color.WHITE);
         login.addActionListener(this);
         add(login);


         //CLEAR BUTTON
          clear=new JButton("CLEAR");
         clear.setBounds(430,300,100,30);
         clear.setBackground(Color.BLACK);
         clear.setForeground(Color.WHITE);
         clear.addActionListener(this);
         add(clear);



        //SIGN UP BUTTON
         sign_up=new JButton("SIGN UP");
         sign_up.setBounds(300,350,230,30);
         sign_up.setBackground(Color.BLACK);
         sign_up.setForeground(Color.WHITE);
         sign_up.addActionListener(this);
         add(sign_up);


         
      
        //set the background color
        getContentPane().setBackground(Color.white);

        //Creating the Frame
        setSize(800,450);
        setVisible(true);
    }
    //Override the ActionListener Interface
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==clear){
          cardTextField.setText("");
          pinTextField .setText("");
        }else if(ae.getSource()==login){

        }else if(ae.getSource()==sign_up){

        }
    }
    
    public static void main(String[] args){
        new Login();
    }
    
    
}
