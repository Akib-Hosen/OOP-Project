package Classes;
import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import java.awt.event.*;
import java.awt.Color;
import java.util.*;
import java.awt.Cursor;
import static javax.swing.JOptionPane.showMessageDialog;


public class Rice
{
	JFrame frame;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23,l24,l25;
	JButton b1,bb2,b3,b4,b5;
	JComboBox c1,c2,c3,c4;
	ImageIcon i1;
	
	
	Rice()
	{
		//create frame
		frame = new JFrame("Smile Shop");


        //construct component
        l1 = new JLabel("Product Details");
		l2 = new JLabel();
        l2.setIcon(new ImageIcon("image/rice.jpg"));
		l3 = new JLabel("Amrita Sugandi Chinigura Rice");
		l4 = new JLabel("Brand: Amrita");
		l5 = new JLabel("Weight: 1kg");
		l6 = new JLabel("Price: 150tk");
		l7 = new JLabel("Quantity:");

		l8 = new JLabel();
        l8.setIcon(new ImageIcon("image/rice2.jpg"));
		l9 = new JLabel("Pran Sugandi Chinigura Rice");
		l10 = new JLabel("Brand: Pran");
		l11 = new JLabel("Weight: 1kg");
		l12 = new JLabel("Price: 140tk");
		l13 = new JLabel("Quantity:");

		l14 = new JLabel();
        l14.setIcon(new ImageIcon("image/rice3.jpg"));
		l15 = new JLabel("Chashi Sugandi Chinigura Rice");
		l16 = new JLabel("Brand: Chashi");
		l17 = new JLabel("Weight: 1kg");
		l18 = new JLabel("Price: 155tk");
		l19 = new JLabel("Quantity:");

		l20 = new JLabel();
        l20.setIcon(new ImageIcon("image/rice4.jpg"));
		l21 = new JLabel("Metro Bashmoti Rice");
		l22 = new JLabel("Brand: Metro");
		l23 = new JLabel("Weight: 1kg");
		l24 = new JLabel("Price: 220tk");
		l25 = new JLabel("Quantity:");
        
		
		
		String quantity[] = {"1","2","3","4","5"};
		c1 = new JComboBox(quantity);
		c2 = new JComboBox(quantity);
		c3 = new JComboBox(quantity);
		c4 = new JComboBox(quantity);
		
		
		
		b1 = new JButton();
		b1.setIcon(new ImageIcon("image/buy.png"));
		bb2 = new JButton();
        bb2.setIcon(new ImageIcon("image/back.jpg"));
		b3 = new JButton();
        b3.setIcon(new ImageIcon("image/buy.png"));
		b4 = new JButton();
        b4.setIcon(new ImageIcon("image/buy.png"));
		b5 = new JButton();
        b5.setIcon(new ImageIcon("image/buy.png"));
		
		
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
		frame.add(l9);
		frame.add(l10);
		frame.add(l11);
		frame.add(l12);
		frame.add(l13);
		frame.add(l14);
		frame.add(l15);
		frame.add(l16);
		frame.add(l17);
		frame.add(l18);
		frame.add(l19);
		frame.add(l20);
		frame.add(l21);
		frame.add(l22);
		frame.add(l23);
		frame.add(l24);
		frame.add(l25);

		frame.add(c1);
		frame.add(c2);
		frame.add(c3);
		frame.add(c4);

		frame.add(b1);
		frame.add(bb2);
		frame.add(b3);
		frame.add(b4);
		frame.add(b5);
		
		frame.setIconImage(i1.getImage());
		
		
		//set component bounds
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		
		
		l1.setBounds(510,10, 800, 80);
        l1.setFont(new Font("Segoe UI", Font.BOLD, 40));
		l2.setBounds(10,120, 300, 200);
		l3.setBounds(320,120, 300, 30);
		l3.setFont(new Font("Segoe UI", Font.BOLD, 20));
		l4.setBounds(320,160, 300, 30);
		l4.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		l5.setBounds(320,190, 300, 30);
		l5.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		l6.setBounds(320,220, 300, 30);
		l6.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		l7.setBounds(320,250, 300, 30);
		l7.setFont(new Font("Segoe UI", Font.PLAIN, 18));

		l8.setBounds(650,120, 300, 200);
		l9.setBounds(960,120, 300, 30);
		l9.setFont(new Font("Segoe UI", Font.BOLD, 20));
		l10.setBounds(960,160, 300, 30);
		l10.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		l11.setBounds(960,190, 300, 30);
		l11.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		l12.setBounds(960,220, 300, 30);
		l12.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		l13.setBounds(960,250, 300, 30);
		l13.setFont(new Font("Segoe UI", Font.PLAIN, 18));

		l14.setBounds(10,370, 300, 200);
		l15.setBounds(320,370, 300, 30);
		l15.setFont(new Font("Segoe UI", Font.BOLD, 20));
		l16.setBounds(320,410, 300, 30);
		l16.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		l17.setBounds(320,440, 300, 30);
		l17.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		l18.setBounds(320,470, 300, 30);
		l18.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		l19.setBounds(320,500, 300, 30);
		l19.setFont(new Font("Segoe UI", Font.PLAIN, 18));

		l20.setBounds(650,370, 300, 200);
		l21.setBounds(960,370, 300, 30);
		l21.setFont(new Font("Segoe UI", Font.BOLD, 20));
		l22.setBounds(960,410, 300, 30);
		l22.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		l23.setBounds(960,440, 300, 30);
		l23.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		l24.setBounds(960,470, 300, 30);
		l24.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		l25.setBounds(960,500, 300, 30);
		l25.setFont(new Font("Segoe UI", Font.PLAIN, 18));

		
		c1.setBounds(420,260,60,20);
		c2.setBounds(1040,260,60,20);
		c3.setBounds(420,510,60,20);
		c4.setBounds(1040,510,60,20);
		
		b1.setBounds(320,290,170,30);
		b3.setBounds(960,290, 170, 30);
		b4.setBounds(320,540, 170, 30);
		b5.setBounds(960,540, 170, 30);
		bb2.setBounds(10,600, 40, 40);
		
		
		b1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bb2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		b3.setCursor(new Cursor(Cursor.HAND_CURSOR));
		b4.setCursor(new Cursor(Cursor.HAND_CURSOR));
		b5.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		
		//frame properties
        frame.setSize (1250, 700);
		frame.setLocationRelativeTo(null);
        frame.setLayout (null);
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane();
        frame.setVisible (true);
		
		
		//Action listeners
		bb2.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {

                if (e.getSource() == bb2) 
                {
                    new Groceries();
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
                    new Payment();
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
                    new Payment();
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
                    new Payment();
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
                    new Payment();
                    frame.setVisible(false);
                }
            }
        });
		
		
	}

}