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

public class Login 
{
    JFrame frame;
	JLabel bl1,l1,l2,l3,l4,l5,l6;
    JButton lb1,fb2,sb3,ab4;
	JTextField t1;
	JPasswordField p1;
    ImageIcon i1;


    public Login() 
	{
		//create frame
        frame = new JFrame("Login- Smile Shop");

        
		//Background
		ImageIcon image = new ImageIcon("image/log1.jpg");
        bl1 = new JLabel(image);
		
		//Background color
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);
        

		//construct component
		l1 =new JLabel("Login");
		l2 =new JLabel("Username:");
		l3 =new JLabel("Password:");
        l4 =new JLabel("Don't have an account?");


        lb1 = new JButton();
        lb1.setIcon(new ImageIcon("image/login.png"));

        fb2 = new JButton("Forgot Password?");
        fb2.setForeground(Color.yellow);
        fb2.setContentAreaFilled(false);
        fb2.setBorderPainted(false);

        sb3 =new JButton("Signup");
        sb3.setForeground(Color.yellow);
        sb3.setContentAreaFilled(false);
        sb3.setBorderPainted(false);


        ab4 =new JButton("Admin Portal");
        ab4.setForeground(Color.BLACK);
        ab4.setContentAreaFilled(false);
        ab4.setBorderPainted(false);

        
		
		//icon
		i1=new ImageIcon("image/Icon.jpg");


        
		
		
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
		frame.add(l1);
		frame.add(l2);
		frame.add(l3);
		frame.add(l4);
		frame.add(t1);
		frame.add(p1);
		frame.add(lb1);
		frame.add(fb2);
		frame.add(sb3);
		frame.add(ab4);
		frame.setIconImage(i1.getImage());
		
		
		
		//set component bounds
		bl1.setBounds(0, 0, 700, 700);

		l1.setBounds(720, 80, 300, 50);
		l1.setFont(new Font("SANS_SERIF", Font.BOLD, 40));
		l2.setBounds(720, 160, 300, 50);
		l2.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
		l3.setBounds(720, 260, 300, 50);
		l3.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
		l4.setBounds(735, 460, 250, 30);
		l4.setFont(new Font("SANS_SERIF", Font.PLAIN, 15));


        lb1.setBounds(800,360, 100, 45);
        lb1.setBackground(Color.LIGHT_GRAY);
        lb1.setBorder(BorderFactory.createEmptyBorder());

        fb2.setBounds(720, 420, 250, 30);
        fb2.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 18));

        sb3.setBounds(795, 460, 250, 30);
        sb3.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 18));

        ab4.setBounds(720, 500, 250, 30);
        ab4.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 18));



        lb1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        fb2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        sb3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        ab4.setCursor(new Cursor(Cursor.HAND_CURSOR));

        
		
		
		

        //frame properties
        frame.setSize (1050,700);
		frame.setLocationRelativeTo(null);
        frame.setLayout (null);
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane();
        frame.setVisible (true);



        //Action listeners

        sb3.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {

                if (e.getSource() == sb3) 
                {
                    new Signup();
                    frame.setVisible(false);
                }
            }
        });


        ab4.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {

                if (e.getSource() == ab4) 
                {
                    new AdminLog();
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
                    boolean valid = false;
                    String user = t1.getText();
                    String pas = p1.getText();
                    String fileData = "";

                    if (user.isEmpty() || pas.isEmpty())
                    {
                        JOptionPane.showMessageDialog(null, "Please fill all of the fields.");
                    }
                    else
                    {
                        try
                        {
                            File fr = new File("File\\UData.txt");
                            Scanner scanner = new Scanner(fr);

                            while(scanner.hasNextLine())
                            {
                                fileData += scanner.nextLine() +"\n";
                            }
                            scanner.close();

                            if(fileData.contains("User Name: " +user) && fileData.contains("Password: " +pas))
                            {
                                valid = true;
                            }
                        }
                        catch(FileNotFoundException ex)
                        {
                            
                        }
                        if(valid)
                            {
                                new UserHome();
                                frame.setVisible(false);
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(null, "Invalid username or password!!");

                                t1.setText(null);
                                p1.setText(null);
                            }
                    }
                }
            }
        });


        
    }
}