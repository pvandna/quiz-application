package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{
    
    String name;
    JButton start,back;
    
    Rules(String name){
        this.name = name;
        setBounds(100,100,700,40);
        getContentPane().setBackground(Color.YELLOW);
        setLayout(null);
        
        JLabel heading = new JLabel(" INSTRUCTIONS ");
        heading.setBounds(500,30,700,40);
        heading.setFont(new Font("Algerian",Font.BOLD, 40));
        heading.setForeground(new Color(30,144,254));
        add(heading);
        
        JLabel rules = new JLabel();
        rules.setBounds(350,100,850,450);
        rules.setBackground(Color.red);
        rules.setFont(new Font("Monospaced",Font.BOLD, 20));
       
          rules.setText(
            "<html>"+ 
                "1.  You will have only 15 seconds per each questions." + "<br><br>" +
                "2. You can't exit from the quiz while you're playing." + "<br><br>" +
                "3. You will get points on the basis of your answer." + "<br><br>" +
                "4. Choose one answer from the four option given below the questions." + "<br><br>" +
                "5. To save your answer click on next button." + "<br><br>" +
                "6. Please do not use any search engine." + "<br><br>" +
                "7. Question will get change automatically after 15 seconds." + "<br><br>" +
                "8. 50-50 life line will only use once." + "<br><br>" +
            "<html>"
        );
        add(rules);
        
        back =new JButton("Back");
        back.setBounds(350,550,150,40);
        back.setBackground(new Color(30,144,254));
        back.setFont(new Font("Times New Roman",Font.BOLD,25));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        start = new JButton("Start Quiz");
        start.setBounds(800, 550, 150, 40);
        start.setBackground(new Color(30, 144, 254));
        start.setFont(new Font("Times New Roman",Font.BOLD,25));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
        setSize(1370,700);
        setLocation(0,0);
        setVisible(true);
        
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == start){
            setVisible(false);
            new Quiz(name);
            
        
            }else if (ae.getSource() == back){
              setVisible(false);
              new Login(); 
        }
    }
    public  static void main(String args[]){
        new Rules("User");

    }

}