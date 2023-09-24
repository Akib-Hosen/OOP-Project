package Classes;
import LogIn.*;
import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import java.awt.event.*;
import java.awt.Color;
import java.util.*;
import java.awt.Cursor;
import javax.swing.table.*;
import java.io.*;
import java.nio.file.*;
import static javax.swing.JOptionPane.showMessageDialog;


public class User
{
    JFrame frame;
    JPanel p1,p2;
    JLabel bl1,wl1,l1,l2,l3,l4,l5;
    JScrollPane s1;
    JTable t1;
    DefaultTableModel m1;
    JButton b1,b2,b3,b4;
    ImageIcon i1;

    private String[] column = {"Full Name", "User Name", "Email", "Phone Number", "Password"};
    private String[] rows = new String[6];

    public User()
    {
        frame = new JFrame();


        //Background
		ImageIcon image = new ImageIcon("image/user1.jpg");
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
        wl1=new JLabel("User Information");

        b1 = new JButton();
        b1.setIcon(new ImageIcon("image/back.jpg"));
        b2 = new JButton();
        b2.setIcon(new ImageIcon("image/delete.png"));



        //table
        t1 = new JTable();
        m1 = new DefaultTableModel();
        m1.setColumnIdentifiers(column);

        t1.setModel(m1);
        t1.setSelectionBackground(Color.decode("#8AC5FF"));
        t1.setBackground(Color.WHITE);
        t1.setRowHeight(30);
        t1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        t1.getColumnModel().getColumn(0).setPreferredWidth(160);
        t1.getColumnModel().getColumn(1).setPreferredWidth(150);
        t1.getColumnModel().getColumn(2).setPreferredWidth(300);
        t1.getColumnModel().getColumn(3).setPreferredWidth(180);
        t1.getColumnModel().getColumn(4).setPreferredWidth(150);

        s1 = new JScrollPane(t1);
        s1.setBounds(370,30,630,500);
        s1.setBackground(Color.CYAN);

        String file = "File\\UData.txt";
        String temp = "File\\temp.txt";

        //input data

        try
        {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            int totalLines = 0;
            while (reader.readLine() != null)
                totalLines++;
            reader.close();

            for(int i = 0; i < totalLines; i++)
            {
                String line = Files.readAllLines(Paths.get(file)).get(i);
                String x = line.substring(0, 4);
                if (x.equals("Full"))
                {
                    rows[0] = Files.readAllLines(Paths.get(file)).get(i).substring(11);
                    rows[1] = Files.readAllLines(Paths.get(file)).get((i + 1)).substring(11);
                    rows[2] = Files.readAllLines(Paths.get(file)).get((i + 2)).substring(7);
                    rows[3] = Files.readAllLines(Paths.get(file)).get((i + 3)).substring(14);
                    rows[4] = Files.readAllLines(Paths.get(file)).get((i + 4)).substring(10);
                    m1.addRow(rows);
                }

            }
        }
        catch (Exception e)
        {
            System.out.println("Something went wrong");
            //return;
        }




        //add components
        frame.add(bl1);
        frame.add(wl1);
        frame.add(b1);
        frame.add(b2);

        frame.add(s1);

        frame.add(p1);
        frame.add(p2);
        frame.setIconImage(i1.getImage());



        //set component bounds
        bl1.setBounds(0, 160, 350, 350);
        wl1.setBounds(30, 30, 400, 50);
		wl1.setFont(new Font("SANS_SERIF", Font.BOLD, 30));

        b1.setBounds(30,600, 40, 40);
        b2.setBounds(630,540, 100, 49);
        b2.setBackground(new Color(51,204,255));
        b2.setBorder(BorderFactory.createEmptyBorder());


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
                    new AdminHome();
                    frame.setVisible(false);
                }
            }
        });

        b2.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent ae) 
            {

                if (t1.getSelectionModel().isSelectionEmpty())
                {
                    JOptionPane.showMessageDialog(null, "Please select user!!");
                }
                else
                {
                    String removeUser = t1.getModel().getValueAt(t1.getSelectedRow(), 0).toString();

                    File oldFile = new File(file);
                    File newFile = new File(temp);

                    int q = 0;

                    try
                    {
                        BufferedReader reader = new BufferedReader(new FileReader(file));
                        int totalLines = 0;
                        while (reader.readLine() != null)
                            totalLines++;
                        reader.close();

                        for (int i = 0; i < totalLines; i++) 
                        {
                            String line = Files.readAllLines(Paths.get(file)).get(i);
                            String x = line.substring(0, 4);
                            if (x.equals("Full")) 
                            {
                                String userName = Files.readAllLines(Paths.get(file)).get(i);
                                if (userName.substring(11).equals(removeUser)) 
                                {
                                    q = i;
                                }
                            }
                        }    
                    }
                    catch (Exception ex)
                    {
                        return;
                    }

                    try
                    {
                        FileWriter fw = new FileWriter(temp, true);
                        BufferedWriter bw = new BufferedWriter(fw);
                        PrintWriter pw = new PrintWriter(bw);

                        FileReader fr = new FileReader(file);
                        BufferedReader br = new BufferedReader(fr);

                        BufferedReader reader = new BufferedReader(new FileReader(file));
                        int totalLines = 0;
                        while (reader.readLine() != null)
                            totalLines++;
                        reader.close();

                        for (int j = 0; j < totalLines; j++) 
                        {
                            String line = Files.readAllLines(Paths.get(file)).get(j);
                            String x = line.substring(0, 4);

                            if (q != 0 && (j == q || j == (q + 1) || j == (q + 2) || j == (q + 3) || j == (q + 4))) 
                            {
                                String userName = Files.readAllLines(Paths.get(file)).get(j);
                                pw.println("#Removed! " + userName);
                            } 
                            else 
                            {
                                String userName = Files.readAllLines(Paths.get(file)).get(j);
                                pw.println(userName);
                            }
                        }
                        pw.flush();
                        pw.close();
                        fr.close();
                        br.close();
                        bw.close();
                        fw.close();
                    }
                    catch (Exception ex)
                    {
                        System.out.print(ex);
                    }

                    oldFile.delete();
                    File dump = new File(file);
                    newFile.renameTo(dump);

                    new User();
                    frame.setVisible(false);
                    
                }
            }
        });


    }
}