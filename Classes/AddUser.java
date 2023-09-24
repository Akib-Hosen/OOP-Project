package Classes;
import LogIn.*;
import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import java.awt.event.*;
import java.awt.Color;
import java.util.*;
import java.io.*;
import java.time.LocalDateTime;
import java.awt.Cursor;
import static javax.swing.JOptionPane.showMessageDialog;

public class AddUser
{
    JFrame frame;
    JPanel pn1,pn2;
    JLabel bl1,l1,l2,l3,l4,l5,l6,l7,l8;
    JButton sb1,lb2;
    JTextField t1,t2,t3,t4;
    JPasswordField p1,p2;
    ImageIcon i1;


    public AddUser()
    {
        //Create frame
        frame = new JFrame("Add User");


        //Background
        ImageIcon image = new ImageIcon("image/signu.jpg");
        bl1 = new JLabel(image);


        //Background color
		pn1 = new JPanel();
        pn1.setBounds(0, 0, 700, 700);
        pn1.setBackground(new Color(252, 255, 255));
        pn2 = new JPanel();
        pn2.setBounds(700, 0, 350, 700);
        pn2.setBackground(new Color(51,204,255));


        //icon
        i1=new ImageIcon("image/Icon.jpg");



        //construct component
        l1 =new JLabel("Resgistration");
        l2 =new JLabel("Fullname:");
        l3 =new JLabel("Username:");
        l4 =new JLabel("E-mail:");
        l5 =new JLabel("Phone Number:");
        l6 =new JLabel("Password:");
        l7 =new JLabel("Confirm Password:");


        t1 = new JTextField("");
        t2 = new JTextField("");
        t3 = new JTextField("");
        t4 = new JTextField("");
        p1 = new JPasswordField("");
        p2 = new JPasswordField("");


        sb1 = new JButton();
        sb1.setIcon(new ImageIcon("image/signup.png"));
        lb2 = new JButton();
        lb2.setIcon(new ImageIcon("image/back.jpg"));



        //add components
        frame.add(bl1);
        frame.add(sb1);
        frame.add(lb2);
        frame.add(l1);
		frame.add(l2);
		frame.add(l3);
		frame.add(l4);
		frame.add(l5);
		frame.add(l6);
		frame.add(l7);

        frame.add(t1);
		frame.add(t2);
		frame.add(t3);
		frame.add(t4);
		frame.add(p1);
		frame.add(p2);

        frame.add(pn1);
        frame.add(pn2);

        frame.setIconImage(i1.getImage());


        //set component bounds
		bl1.setBounds(80, 60, 500, 500);

        sb1.setBounds(720,550, 250, 30);
        sb1.setBackground(new Color(51,204,255));
        sb1.setBorder(BorderFactory.createEmptyBorder());
        lb2.setBounds(30,600, 40, 40);

        l1.setBounds(720, 10, 300, 50);
		l1.setFont(new Font("SANS_SERIF", Font.BOLD, 40));
        l2.setBounds(720, 60, 300, 50);
		l2.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        l3.setBounds(720, 140, 300, 50);
		l3.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        l4.setBounds(720, 220, 300, 50);
		l4.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        l5.setBounds(720, 300, 300, 50);
		l5.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        l6.setBounds(720, 380, 300, 50);
		l6.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        l7.setBounds(720, 460, 300, 50);
		l7.setFont(new Font("SANS_SERIF", Font.BOLD, 20));


        t1.setBounds(720, 110, 250, 30);
        t1.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 15));
        t2.setBounds(720, 190, 250, 30);
        t2.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 15));
        t3.setBounds(720, 270, 250, 30);
        t3.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 15));
        t4.setBounds(720, 350, 250, 30);
        t4.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 15));
        p1.setBounds(720, 430, 250, 30);
        p1.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 15));
        p2.setBounds(720, 510, 250, 30);
        p2.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 15));


        lb2.setCursor(new Cursor(Cursor.HAND_CURSOR));


        
        

		//frame properties
        frame.setSize (1050, 700);
		frame.setLocationRelativeTo(null);
        frame.setLayout (null);
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane();
        frame.setVisible (true);



        //Action listeners

        lb2.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {

                if (e.getSource() == lb2) 
                {
                    new AdminHome();
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
                    String fname = t1.getText();
                    String uname = t2.getText();
                    String mail = t3.getText();
                    String phn = t4.getText();
                    String pass = p1.getText();
                    String cpass = p2.getText();

                    if (fname.isEmpty()==false && uname.isEmpty()==false && mail.isEmpty()==false && phn.isEmpty()==false && pass.isEmpty()== false && cpass.isEmpty()==false)
                    {
                        if(cpass.equals(pass))
                        {
                            try
                            {
                                File file = new File("File\\UData.txt");
                                if(!file.exists())
                                {
                                    file.createNewFile();
                                }
                                FileWriter fw = new FileWriter(file, true);

                                fw.write("Full Name: " +fname +"\n");
                                fw.write("User Name: " +uname +"\n");
                                fw.write("Email: " +mail +"\n");
                                fw.write("Phone Number: " +phn +"\n");
                                fw.write("Password: " +pass +"\n");
                                fw.write("================================================" +"\n");
                                fw.write("==~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~==" +"\n");
                                fw.write("================================================" +"\n");
                                fw.close();

                                JOptionPane.showMessageDialog(null, "Signup Successfully!!");

                                t1.setText(null);
                                t2.setText(null);
                                t3.setText(null);
                                t4.setText(null);
                                p1.setText(null);
                                p2.setText(null);

                            }
                            catch(Exception ex)
                            {
                                System.out.print(ex);
                                JOptionPane.showMessageDialog(null, "Something Went Wrong.");
                            }
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Password didn't match.");
                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Please enter valid information in all fields.");
                    }
                }
            }
        });
    }
}