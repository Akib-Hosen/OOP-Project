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



public class AdminHome
{
	JFrame frame;
	JPanel p1,p2;
	JLabel bl1,l1,l2,l3,l4,l5;
    JButton b1,b2,b3,b4;
    ImageIcon i1;
	
	public AdminHome()
	{
		frame = new JFrame("Admin Homepage");

		//Background
		ImageIcon image = new ImageIcon("image/admin1.jpg");
        bl1 = new JLabel(image);

		//Background color
		p1 = new JPanel();
        p1.setBounds(0, 0, 350, 700);
        p1.setBackground(new Color(252, 255, 255));
        p2 = new JPanel();
        p2.setBounds(300, 0, 800, 700);
        p2.setBackground(new Color(51, 204, 255));

		//icon
	    i1=new ImageIcon("image/Icon.jpg");


		//construct component
		l1 =new JLabel("Admin Dashboard");
		l2 =new JLabel("User information");
		l3 =new JLabel("Add new user");
		l4 =new JLabel("Add new product");

		b1 = new JButton();
        b1.setIcon(new ImageIcon("image/user.jpg"));
		b2 = new JButton();
        b2.setIcon(new ImageIcon("image/addu.jpg"));
		b3 = new JButton();
        b3.setIcon(new ImageIcon("image/addp.jpeg"));
		b4 = new JButton();
        b4.setIcon(new ImageIcon("image/signout.jpg"));



	    //add components
		frame.add(bl1);
		frame.add(l1);
		frame.add(l2);
		frame.add(l3);
		frame.add(l4);
		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.add(b4);

		frame.add(p1);
		frame.add(p2);
		frame.setIconImage(i1.getImage());


		//set component bounds
		bl1.setBounds(0, 160, 350, 350);
		l1.setBounds(30, 30, 400, 50);
		l1.setFont(new Font("SANS_SERIF", Font.BOLD, 30));
		l2.setBounds(475,275, 300, 30);
        l2.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
		l3.setBounds(780,275, 300, 30);
        l3.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
		l4.setBounds(620,555, 300, 30);
        l4.setFont(new Font("SANS_SERIF", Font.BOLD, 20));

		b1.setBounds(450,70, 200, 200);
		b2.setBounds(750,70, 200, 200);
		b3.setBounds(600,350, 200, 200);
		b4.setBounds(950,600, 40, 40);


		b1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b4.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		
		//frame properties
        frame.setSize (1050, 700);
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
                    new User();
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
                    new AddUser();
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
                    JOptionPane.showMessageDialog(null, "Not available right now!!");
                }
            }
        });


		b4.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {

                if (e.getSource() == b4) 
                {
                    new AdminLog();
                    frame.setVisible(false);
                }
            }
        });
	}
}