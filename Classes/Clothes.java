package Classes;
import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import java.awt.event.*;
import java.awt.Color;
import java.util.*;
import java.awt.Cursor;
import static javax.swing.JOptionPane.showMessageDialog;


public class Clothes
{
    JFrame frame;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8;
    JButton b1,b2,b3,b4,b5,b6,b7;
    ImageIcon i1;


    Clothes()
    {
        //create frame
		frame = new JFrame("Smile Shop");


        //construct component
        l1 = new JLabel("Clothes");
        l2 = new JLabel("Select your product");
		l3 = new JLabel("Casual Shirt");
		l4 = new JLabel("Formmal Shirt");
		l5 = new JLabel("Jeans Pant");
		l6 = new JLabel("Gabardine Pant");
		l7 = new JLabel("T-Shirts");
		l8 = new JLabel("Panjabi");




        b1 = new JButton();
        b1.setIcon(new ImageIcon("image/cshirt.jpg"));
		b2 = new JButton();
        b2.setIcon(new ImageIcon("image/fshirt.jpg"));
        b3 = new JButton();
        b3.setIcon(new ImageIcon("image/jeans.jpg"));
        b4 = new JButton();
        b4.setIcon(new ImageIcon("image/gpant.jpg"));
        b5 = new JButton();
        b5.setIcon(new ImageIcon("image/tshirts.jpg"));
        b6 = new JButton();
        b6.setIcon(new ImageIcon("image/panjabi.jpg"));
        b7 = new JButton();
        b7.setIcon(new ImageIcon("image/back.jpg"));


        i1=new ImageIcon("image/Icon.jpg");




        //add components
		frame.add(l1);
		frame.add(l2);
		frame.add(l3);
		frame.add(l4);
		frame.add(l5);
		frame.add(l6);
		frame.add(l7);
		frame.add(l8);
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);
        frame.add(b6);
        frame.add(b7);

        frame.setIconImage(i1.getImage());



        //set component bounds
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		
		
		l1.setBounds(420,10, 800, 80);
        l1.setFont(new Font("Segoe UI", Font.BOLD, 40));
        l2.setBounds(30,100,500, 60);
        l2.setFont(new Font("Segoe UI", Font.BOLD, 20));
		l3.setBounds(120,360, 300, 30);
        l3.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		l4.setBounds(450,360, 300, 30);
        l4.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        l5.setBounds(790,360, 300, 30);
        l5.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        l6.setBounds(120,650, 300, 30);
        l6.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        l7.setBounds(475,650, 300, 30);
        l7.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        l8.setBounds(790,650, 300, 30);
        l8.setFont(new Font("Segoe UI", Font.PLAIN, 20));

        b1.setBounds(30,160, 300, 200);
		b2.setBounds(360,160, 300, 200);
		b3.setBounds(690,160, 300, 200);
        b4.setBounds(30,450, 300, 200);
        b5.setBounds(360,450, 300, 200);
        b6.setBounds(690,450, 300, 200);
        b7.setBounds(30,700, 40, 40);



        b1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b4.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b5.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b6.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b7.setCursor(new Cursor(Cursor.HAND_CURSOR));





        //frame properties
        frame.setSize (1050, 800);
		frame.setLocationRelativeTo(null);
        frame.setLayout (null);
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane();
        frame.setVisible (true);
		
		
		b7.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {

                if (e.getSource() == b7) 
                {
                    new UserHome();
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
                    new Panjabi();
                    frame.setVisible(false);
                }
            }
        });

        b1.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {

                if (e.getSource() == b1) 
                {
                    new CasualShirt();
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
                    new FormalShirt();
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
                    new Jeanspant();
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
                    new Gabardine();
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
                    new TShirts();
                    frame.setVisible(false);
                }
            }
        });

    }





}


