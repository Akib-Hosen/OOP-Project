package Classes;
import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import java.awt.event.*;
import java.awt.Color;
import java.util.*;
import java.awt.Cursor;
import static javax.swing.JOptionPane.showMessageDialog;

public class Payment
{
    JFrame frame;
    JPanel pn1,pn2;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
    JButton b1,b2;
    JTextField t1,t2,t3,t4;
    ImageIcon i1;


    Payment()
    {
        frame = new JFrame("Payment Information");


        //Background
        ImageIcon image = new ImageIcon("image/payment.jpg");
        l1 = new JLabel(image);

        //Background color
		pn1 = new JPanel();
        pn1.setBounds(0, 0, 600, 700);
        pn1.setBackground(new Color(252, 255, 255));
        pn2 = new JPanel();
        pn2.setBounds(600, 0, 450, 700);
        pn2.setBackground(new Color(51,204,255));


        //icon
        i1=new ImageIcon("image/Icon.jpg");


        //construct component

        b1 = new JButton();
        b1.setIcon(new ImageIcon("image/back.jpg"));
        b2 = new JButton("Confirm Payment");

        l2 = new JLabel("Complete Your Payment");
        l3 = new JLabel("We accept only");
        l4 = new JLabel();
        l4.setIcon(new ImageIcon("image/master.png"));
        l5 = new JLabel();
        l5.setIcon(new ImageIcon("image/visa.png"));
        l6 = new JLabel("Enter account number:");
        l7 = new JLabel("Enter account name:");
        l8 = new JLabel("Valid on:");
        l9 = new JLabel("CVC/CVV:");


        t1 = new JTextField("");
        t2 = new JTextField("");
        t3 = new JTextField("");
        t4 = new JTextField("");
        


        //add components
        frame.add(b1);
        frame.add(b2);
        frame.add(l1);
        frame.add(l2);
        frame.add(l3);
        frame.add(l4);
        frame.add(l5);
        frame.add(l6);
        frame.add(l7);
        frame.add(l8);
        frame.add(l9);
        frame.add(t1);
        frame.add(t2);
        frame.add(t3);
        frame.add(t4);
        frame.add(pn1);
        frame.add(pn2);

        frame.setIconImage(i1.getImage());


        //set component bounds
		l1.setBounds(40, 60, 500, 500);
        l2.setBounds(620, 10, 350, 50);
		l2.setFont(new Font("SANS_SERIF", Font.BOLD, 30));
        l3.setBounds(620, 80, 300, 50);
		l3.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        l4.setBounds(775, 70, 70, 70);
        l5.setBounds(850, 70, 70, 70);

        l6.setBounds(620, 160, 300, 50);
        l6.setFont(new Font("SANS_SERIF", Font.BOLD, 15));
        l7.setBounds(620, 230, 300, 50);
        l7.setFont(new Font("SANS_SERIF", Font.BOLD, 15));
        l8.setBounds(620, 300, 300, 50);
        l8.setFont(new Font("SANS_SERIF", Font.BOLD, 15));
        l9.setBounds(620, 370, 300, 50);
        l9.setFont(new Font("SANS_SERIF", Font.BOLD, 15));



        t1.setBounds(620, 200, 250, 30);
        t1.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 15));
        t2.setBounds(620, 270, 250, 30);
        t2.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 15));
        t3.setBounds(620, 340, 250, 30);
        t3.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 15));
        t4.setBounds(620, 410, 250, 30);
        t4.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 15));




        b1.setBounds(30,600, 40, 40);
        b2.setBounds(630,490, 230, 30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);



        b1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        

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
                    new UserHome();
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
                    JOptionPane.showMessageDialog(null, "Payment done successfully!!");
                    t1.setText(null);
                    t2.setText(null);
                    t3.setText(null);
                    t4.setText(null);
                }
            }
        });


    }
}
