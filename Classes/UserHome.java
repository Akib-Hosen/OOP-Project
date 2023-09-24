package Classes;
import LogIn.*;
import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import java.awt.event.*;
import java.awt.Color;
import java.util.*;
import java.awt.Cursor;
import static javax.swing.JOptionPane.showMessageDialog;



public class UserHome
{
    JFrame frame;
    JLabel wl1,l1,cl1,cl2,cl3,cl4,cl5,cl6;
    JButton b1,b2,b3,b4,b5,b6,sb1,b7;
    ImageIcon i1;


    public UserHome()
    {
        //create frame
		frame = new JFrame("Smile Shop");

        
        //construct component
         wl1=new JLabel("Welcome To Smile Shop");
         l1=new JLabel("Catagories");
         cl1=new JLabel("Groceries");
         cl2=new JLabel("Clothes");
         cl3=new JLabel("Shoes");
         cl4=new JLabel("Electronic Accessories");
         cl5=new JLabel("Sports");
         cl6=new JLabel("Home Appliances");


         b1 = new JButton();
         b1.setIcon(new ImageIcon("image/gr.jpg"));
         b2 = new JButton();
         b2.setIcon(new ImageIcon("image/clothes.jpg"));
         b3 = new JButton();
         b3.setIcon(new ImageIcon("image/shoe.jpg"));
         b4 = new JButton();
         b4.setIcon(new ImageIcon("image/electro.jpg"));
         b5 = new JButton();
         b5.setIcon(new ImageIcon("image/sports.jpg"));
         b6 = new JButton();
         b6.setIcon(new ImageIcon("image/home.jpg"));
         sb1 =  new JButton();
         sb1.setIcon(new ImageIcon("image/signout.jpg"));
         
         //icon
         i1=new ImageIcon("image/Icon.jpg");




        //add components
        frame.add(wl1);
        frame.add(l1);
        frame.add(cl1);
        frame.add(cl2);
        frame.add(cl3);
        frame.add(cl4);
        frame.add(cl5);
        frame.add(cl6);
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);
        frame.add(b6);
        frame.add(sb1);
        frame.setIconImage(i1.getImage());
        

        //Background
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		
		
		//set component bounds
        wl1.setBounds(250,10, 800, 80);
        wl1.setFont(new Font("Segoe UI", Font.BOLD, 50));
        l1.setBounds(30,100,500, 60);
        l1.setFont(new Font("Segoe UI", Font.BOLD, 20));
        
        cl1.setBounds(120,360, 300, 30);
        cl1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        cl2.setBounds(465,360, 300, 30);
        cl2.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        cl3.setBounds(810,360, 300, 30);
        cl3.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        cl4.setBounds(80,650, 300, 30);
        cl4.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        cl5.setBounds(465,650, 300, 30);
        cl5.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        cl6.setBounds(775,650, 300, 30);
        cl6.setFont(new Font("Segoe UI", Font.PLAIN, 20));


        b1.setBounds(30,160, 300, 200);
        b2.setBounds(360,160, 300, 200);
        b3.setBounds(690,160, 300, 200);
        b4.setBounds(30,450, 300, 200);
        b5.setBounds(360,450, 300, 200);
        b6.setBounds(690,450, 300, 200);
        sb1.setBounds(950,700, 40, 40);


        b1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b4.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b5.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b6.setCursor(new Cursor(Cursor.HAND_CURSOR));
        sb1.setCursor(new Cursor(Cursor.HAND_CURSOR));


        //frame properties
        frame.setSize (1050, 800);
		frame.setLocationRelativeTo(null);
        frame.setLayout (null);
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane();
        frame.setVisible (true);

        //Action listeners

        b1.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {

                if (e.getSource() == b1) 
                {
                    new Groceries();
                    frame.setVisible(false);
                }
            }
        });
		
		
		
		b2.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {

                if (e.getSource() == b2) 
                {
                    new Clothes();
                    frame.setVisible(false);
                }
            }
        });
		
		
		b3.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {

                if (e.getSource() == b3) 
                {
                    new Shoes();
                    frame.setVisible(false);
                }
            }
        });
		
		
		b4.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {

                if (e.getSource() == b4) 
                {
                    new Eacc();
                    frame.setVisible(false);
                }
            }
        });
		
		
		b5.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {

                if (e.getSource() == b5) 
                {
                    new Sports();
                    frame.setVisible(false);
                }
            }
        });
		
		
		b6.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {

                if (e.getSource() == b6) 
                {
                    new Home();
                    frame.setVisible(false);
                }
            }
        });

        sb1.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {

                if (e.getSource() == sb1) 
                {
                    new Login();
                    frame.setVisible(false);
                }
            }
        });
    }







}
