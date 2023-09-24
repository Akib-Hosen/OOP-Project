package LogIn;
import Classes.*;
import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import java.awt.event.*;
import java.awt.Color;
import java.util.*;
import java.io.*;
import java.awt.Cursor;
import static javax.swing.JOptionPane.showMessageDialog;

public class AdminLog
{
    JFrame frame;
    JPanel pn1,pn2;
    JLabel bl1,l1,l2,l3;
    JButton lb1,b2;
    JTextField t1;
	JPasswordField p1;
    ImageIcon i1;

    public AdminLog()
    {
        frame = new JFrame("Smile Shop");

        //Background
        ImageIcon image = new ImageIcon("image/admin.jpg");
        bl1 = new JLabel(image);

        //Background color
		pn1 = new JPanel();
        pn1.setBounds(0, 0, 700, 700);
        pn1.setBackground(new Color(252, 255, 255));
        pn2 = new JPanel();
        pn2.setBounds(700, 0, 350, 700);
        pn2.setBackground(new Color(51,204,255));

        //icon
        i1 = new ImageIcon("image/Icon.jpg");


        //construct component
		l1 =new JLabel("Admin Login");
		l2 =new JLabel("Username:");
		l3 =new JLabel("Password:");

        lb1 = new JButton();
        lb1.setIcon(new ImageIcon("image/login.png"));
        b2 = new JButton();
        b2.setIcon(new ImageIcon("image/back.jpg"));


        //login panal
		t1 = new JTextField("");
        t1.setBounds(720, 210, 250, 30);
        t1.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 15));
        t1.setToolTipText("Enter your username");

        p1 = new JPasswordField("");
        p1.setBounds(720, 310, 250, 30);
        p1.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 18));
        p1.setToolTipText("Enter your password");


        //add components
        frame.add(bl1);
        frame.add(lb1);
		frame.add(b2);

        frame.add(l1);
		frame.add(l2);
		frame.add(l3);
		frame.add(t1);
		frame.add(p1);

        frame.add(pn1);
        frame.add(pn2);

        frame.setIconImage(i1.getImage());

        //set component bounds
		bl1.setBounds(80, 60, 500, 500);
        l1.setBounds(720, 80, 300, 50);
		l1.setFont(new Font("SANS_SERIF", Font.BOLD, 32));
		l2.setBounds(720, 160, 300, 50);
		l2.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
		l3.setBounds(720, 260, 300, 50);
		l3.setFont(new Font("SANS_SERIF", Font.BOLD, 20));

        lb1.setBounds(800,370, 100, 45);
        lb1.setBackground(new Color(51,204,255));
        lb1.setBorder(BorderFactory.createEmptyBorder());
        b2.setBounds(30,600, 40, 40);

        lb1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b2.setCursor(new Cursor(Cursor.HAND_CURSOR));


        //frame properties
        frame.setSize (1050,700);
		frame.setLocationRelativeTo(null);
        frame.setLayout (null);
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane();
        frame.setVisible (true);


        //Action listeners

        b2.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {

                if (e.getSource() == b2) 
                {
                    new Login();
                    frame.setVisible(false);
                }
            }
        });


        lb1.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {

                if (e.getSource() == lb1) 
                {
                    String user = t1.getText();
                    String pass = p1.getText();

                    if (user.isEmpty()|| pass.isEmpty())
                    {
                        JOptionPane.showMessageDialog(null, "Please fill all of the feilds.");
                    }
                    else
                    {
                        if (user.equals("admin") && pass.equals("admin"))
                        {
                            new AdminHome();
                            frame.setVisible(false);
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Invalid username or password.");
                        }
                    }
                }
            }
        });
    }
}