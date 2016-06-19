/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author rgukt
 */
public class home implements ActionListener{
    
    public static void main(String arg[])
    {
        home a = new home();
    
    }
    private JButton b1,sub,hai;
    private JButton b2,p1,p2,p3,p4,h1,h2,h3,h4,h5;
    private JPanel pa1,pa2,pa3,pa4,pa5,pa6,pa7,pa8,pp1,pp2,pp3;
    private JPanel ppi1,ppi2,ppi3;
    private JLabel l1,la1,la2,la3,hello,intro,intro1,intro2;
    private JTextField t1,t2;
    private JLabel team;
    private JPanel pteam;
    private JButton pt1,pt2,pt3,pt4;
    private JFrame frame;
    
    public home()
            {
                
                 b1 = new JButton("INTRODUCTON TO DCV");
                 b1.setFont(new Font("Serif", Font.BOLD, 16));
                 b1.setBounds(0,0,900,25);
                 b2 = new JButton("CSE01@Batch06");
                 b2.setBounds(0,540,900,20);
                 
                 pa1 = new JPanel();
                 pa1.setBackground(Color.GRAY);
                 pa1.setBounds(0,40,900,40);
                 
                 ppi1 = new JPanel();
                 ppi1.setBounds(50,120,800,30);
                 ppi2 = new JPanel();
                 ppi2.setBounds(30,150,800,30);
                  ppi3 = new JPanel();
                 ppi3.setBounds(30,180,800,30);
                 intro =  new JLabel("This project helps to understand the construction of digital systems..It works as a virtual lab to the user. ");
                  ppi1.add(intro);
                  intro1 = new JLabel("Minimization of Logic using k-maps rather than using switching algebra which is difficult to implement.Construction of");
                  ppi2.add(intro1);
                  intro2 = new JLabel("digital circuits, Behavior of fundamental (AND,OR) , universal gates(NAND,NOR) and other gates(XNOR,XOR).");
                 
                  ppi3.add(intro2);
                 
                  team = new JLabel("PROJECT TEAM");
                  team.setBounds(350,250,200,30);
                  
                  pteam = new JPanel();
                  pteam.setBounds(330, 280, 150, 140);
                  //pteam.setBackground(Color.gray);
                  
                  pt1=new JButton("    G.SWATHI          ");
                  pt1.setBackground(Color.gray);
                  
                  pt2=new JButton("    G.REVATHI RANI    ");
                  pt2.setBackground(Color.gray);
                  
                  pt3=new JButton("    S.LOKESH          ");
                  pt3.setBackground(Color.gray);
                  
                  pt4=new JButton("    S.SURYA VAMSI     ");
                  pt4.setBackground(Color.gray);
                  
                  pteam.add(pt1);
                  pteam.add(pt2);
                  pteam.add(pt3);
                  pteam.add(pt4);
                  
                  h1 = new JButton("HOME");
                 h1.setBackground(Color.GRAY);
                 h1.setActionCommand("HOME");
                 h1.addActionListener(this);
                 h1.setFont(new Font("Serif", Font.BOLD, 16));
                 
                 h2 = new JButton("Basic Gates");
                 h2.setBackground(Color.GRAY);
                 h2.setActionCommand("BG");
                 h2.addActionListener(this);
                 h2.setFont(new Font("Serif", Font.BOLD, 16));
                 
                 h3 = new JButton("Logic minimizing");
                 h3.setBackground(Color.GRAY);
                 h3.setActionCommand("LM");
                 h3.addActionListener(this);
                 h3.setFont(new Font("Serif", Font.BOLD, 16));
                 
                 h4 = new JButton("Code Converters");
                 h4.setBackground(Color.GRAY);
                 h4.setFont(new Font("Serif", Font.BOLD, 16));
                 h4.setActionCommand("CC");
                 h4.addActionListener(this);
                 
                 
                 h5 = new JButton("Circuit Designing");
                 h5.setBackground(Color.GRAY);
                 h5.setActionCommand("CD");
                 h5.addActionListener(this);
                 h5.setFont(new Font("Serif", Font.BOLD, 16));
                 
                 pa1.add(h1);
                 pa1.add(h2);
                 pa1.add(h3);
                 pa1.add(h4);
                 pa1.add(h5);
                
                 //...............................................................
                 p1 = new JButton();
                 p1.setBackground(Color.GRAY);
                 p1.setBounds(5,90,880,5);
                 p2 = new JButton();
                 p2.setBackground(Color.GRAY);
                 p2.setBounds(5,535,880,5);
                 p3 = new JButton();
                 p3.setBackground(Color.GRAY);
                 p3.setBounds(5,90,5,450);
                 p4 = new JButton();
                 p4.setBackground(Color.GRAY);
                 p4.setBounds(875,90,5,450);
                 
                 hello = new JLabel("Hello!");
                 
                 hello.setBounds(600,100,200,20);
                 
                 //..............................................................
                 l1 = new JLabel("INTRODUCTION");
                 l1.setFont(new Font("serif", Font.BOLD, 16));
                 l1.setBounds(380,100,200,20);
                 
                 
                 hai = new JButton("hai");
                 hai.setBounds(600,100,200,20);
                 hai.addActionListener(this);
                 //.............................................................
                 pa4 = new JPanel();
                 pa4.setBounds(250,130,350,50);
                 pa4.setBackground(Color.GRAY);
                 pa4.setForeground(Color.WHITE);
                 
                 pa8 = new JPanel();
                 pa8.setBounds(600,100,200,20);
                 pa8.setBackground(Color.LIGHT_GRAY);
                 pa8.setForeground(Color.gray);
                 pa8.add(hello);
                 
                 pa5 = new JPanel();
                 pa5.setBounds(250,180,350,30);
                 pa5.setBackground(Color.GRAY);
                 pa5.setForeground(Color.WHITE);
                 
                 pa6 = new JPanel();
                 pa6.setBounds(250,210,350,30);
                 pa6.setBackground(Color.GRAY);
                 pa6.setForeground(Color.WHITE);
                 
                 pa7 = new JPanel();
                 pa7.setBounds(250,240,350,30);
                 pa7.setBackground(Color.GRAY);
                 pa7.setForeground(Color.WHITE);
                 
                 la1 = new JLabel("Authentication Required");
                 la1.setBounds(20,10,350,20);
                 la1.setForeground(Color.white);
                 la1.setFont(new Font("serif", Font.BOLD, 16));
                 
                 
                 la2 = new JLabel("User id:   ");
                 la2.setForeground(Color.white);
                 la2.setFont(new Font("serif", Font.BOLD, 16));
                 
                 t1 = new JTextField(20);
                 
                 la3 = new JLabel("Password:");
                 la3.setForeground(Color.white);
                 la3.setFont(new Font("serif", Font.BOLD, 16));
                 
                 t2 = new JTextField(20);
              
                 sub = new JButton("SUBMIT");
                 sub.setActionCommand("submit");
                 sub.addActionListener(this);
                 pa7.add(sub);
                 
                 pa4.add(la1);
                 pa5.add(la2);
                 pa5.add(t1);
                 pa6.add(la3);
                 pa6.add(t2);
                 
                 
                 //..............................................................
                frame =  new JFrame();
                frame.setLayout(null);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(new Dimension(900, 600));
                frame.setLocation(50,50);
                frame.setTitle("DIGITAL CIRCUITS VISUALISATION");
                frame.setBackground(Color.white);
                frame.add(b1);
                frame.add(b2);
                frame.add(pa1);
                frame.add(p1);
                frame.add(p2);
                frame.add(p3);
                frame.add(p4);
                frame.add(l1);
                frame.add(pa4);
                frame.add(pa5);
                frame.add(pa6);
                frame.add(pa7);
                
                
                frame.setVisible(true);
     
                
            }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet.");
        String k = e.getActionCommand();
        if("submit".equals(k))
        {
            String s = t1.getText();
            String p = t2.getText();
            
            if("".equals(s))
            {
                
               JOptionPane.showMessageDialog(null,"ENTER USER ID/PASSWWORD");
            }
            else if("N091895".equals(s)&&"N6P5F".equals(p))
            {
            
               
                hello.setText("Hello! VAMSI");
                hai.setText("hai"+s+p);
                pa4.setVisible(false);
                pa5.setVisible(false);
                pa6.setVisible(false);
                pa7.setVisible(false);
                frame.add(pa8);
                frame.add(ppi1);
                frame.add(ppi2);
                frame.add(ppi3);
                frame.add(team);
                frame.add(pteam);
                frame.setVisible(true);
            }
            else if("N090465".equals(s)&&"69PZT".equals(p))
            {
            
               
                hello.setText("Hello! SWATHI");
                hai.setText("hai"+s+p);
                pa4.setVisible(false);
                pa5.setVisible(false);
                pa6.setVisible(false);
                pa7.setVisible(false);
                frame.add(pa8);
                
                frame.add(ppi1);
                frame.add(ppi2);
                frame.add(ppi3);
                frame.add(team);
                frame.add(pteam);
                frame.setVisible(true);
            }
            else if("N090461".equals(s)&&"1EL86".equals(p))
            {
            
               
                hello.setText("Hello! REVATHI");
                hai.setText("hai"+s+p);
                pa4.setVisible(false);
                pa5.setVisible(false);
                pa6.setVisible(false);
                pa7.setVisible(false);
                frame.add(pa8);
                frame.add(ppi1);
                frame.add(ppi2);
                frame.add(ppi3);
                frame.add(team);
                frame.add(pteam);
                frame.setVisible(true);
            }
            else if("N091327".equals(s)&&"56761".equals(p))
            {
            
               
                hello.setText("Hello! LOKESH");
                hai.setText("hai"+s+p);
                pa4.setVisible(false);
                pa5.setVisible(false);
                pa6.setVisible(false);
                pa7.setVisible(false);
                frame.add(pa8);
                frame.add(ppi1);
                frame.add(ppi2);
                frame.add(ppi3);
                frame.add(team);
                frame.add(pteam);
                frame.setVisible(true);
            }
            else if("CSE01".equals(s)&&"BATCH06".equals(p))
            {
            
               
                hello.setText("Hello! USER");
                hai.setText("hai"+s+p);
                pa4.setVisible(false);
                pa5.setVisible(false);
                pa6.setVisible(false);
                pa7.setVisible(false);
               frame.add(pa8);
                frame.add(ppi1);
                frame.add(ppi2);
                frame.add(ppi3);
                frame.add(team);
                frame.add(pteam);
                frame.setVisible(true);
            }
            else
            {
            JOptionPane.showMessageDialog(null,"INVALID USER ID/PASSWWORD");
            }
        }
        if(hello.getText().equals("Hello! USER")||hello.getText().equals("Hello! LOKESH")||hello.getText().equals("Hello! REVATHI")||hello.getText().equals("Hello! SWATHI")||hello.getText().equals("Hello! VAMSI"))
        {
            if(k.equals("HOME"))
            {
            
            }
            else if(k.equals("BG"))
            {
                gate g = new gate();
            }
            else if(k.equals("LM"))
            {
                kmap km = new kmap();
            }
            else if(k.equals("CC"))
            {
                 cconverter cc = new cconverter();
            }
            else if(k.equals("CD"))
            {
                advcircuits adv = new advcircuits();
            }
        
        
        }
        
        
        
    }
    
}
