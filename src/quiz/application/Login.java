package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
    
    JButton rules,back;
     JTextField tfname;
     
    Login(){
        getContentPane().setBackground(Color.YELLOW);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpg"));
        Image i2 = i1.getImage().getScaledInstance(700, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,700,700);
        add(image);
       
        JLabel heading = new JLabel("Online Quiz");
        heading.setBounds(850,100,600,90);
        heading.setFont(new Font("viner hand itc",Font.BOLD, 70));
        heading.setForeground(new Color(30,144,254));
        add(heading);
        
        JLabel name = new JLabel("Enter Your Name");
        name.setBounds(900,230,600,60);
        name.setFont(new Font("Mongolian Baiti",Font.BOLD, 40));
         name.setForeground(new Color(30,144,254));
        add(name);
        
        tfname = new JTextField();
        tfname.setBounds(900,300,300,30);
        tfname.setFont(new Font("Times New Roman",Font.BOLD,25));
        add(tfname);
        
        rules =new JButton("Start");
        rules.setBounds(850,400,150,35);
        rules.setBackground(new Color(30,144,254));
        rules.setFont(new Font("Times New Roman",Font.BOLD,25));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);
        
        back =new JButton("Exit");
        back.setBounds(1100,400,150,35);
        back.setBackground(new Color(30,144,254));
        back.setFont(new Font("Times New Roman",Font.BOLD,25));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        setSize(1370,700);
        setLocation(0,0);
        setVisible(true);

    }
    
    public void actionPerformed(ActionEvent ae) {
        
        if(ae.getSource() == rules){
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);
            
        }else if (ae.getSource() == back){
              setVisible(false);
        }
        
    }
    
    public static void main(String[] args){
        new Login();
    }
}
    

