import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
public class Vpn extends JFrame implements ActionListener
{
    JLabel l;
    JRadioButton jb[]=new JRadioButton[5];
    JButton b1,b2;
    ButtonGroup bg;
    TextField t1;
    int count=0,current=0,x=1,y=1,now=0;
    int m[]=new int[10];
    Vpn(String s)
    {
        super(s);
        l=new JLabel();
        add(l);
        bg=new ButtonGroup();
        for(int i=0;i<5;i++)
        {
            jb[i]=new JRadioButton();
            add(jb[i]);
            bg.add(jb[i]);
        }
        b1=new JButton("Connect");
        b2=new JButton("Disconnect");
        b1.addActionListener(this);
        b2.addActionListener(this);
        add(b1);add(b2);

        l.setBounds(30,40,450,20);
        b1.setBounds(100,240,100,30);
        b2.setBounds(270,240,100,30);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocation(250,100);
        setVisible(true);
        setSize(600,600);
    }
    public void actionPerformed(ActionEvent e)
    {

        t1 = new TextField();
        t1.setBounds(300 ,500 , 100 , 100);
        t1.setText("Congratulations");
        add(t1);


        ProcessBuilder processBuilder = new ProcessBuilder("C:\\Users\\priya\\Desktop\\project school ka\\cc2.bat");


        try {

            Process process = processBuilder.start();

            StringBuilder output = new StringBuilder();

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(process.getInputStream()));

            String line;
            while ((line = reader.readLine()) != null) {
                output.append(line + "\n");
            }

            int exitVal = process.waitFor();
            if (exitVal == 0) {
                System.out.println(output);
                System.exit(0);
            } else {
                //abnormal...
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

    }

    public static void main(String s[])
    {
        new Vpn("Online Test Of Java");
    }
}