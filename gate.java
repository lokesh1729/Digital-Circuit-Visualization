/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author vamsi
 */
public class gate  extends Canvas implements ActionListener {
public static void main(String arg[]){
   gate b = new gate();
  //gate f = new gate();
}
private JButton b1;
private JButton b2;
private JButton AND;
private JButton OR;
private JButton NOT;
private JButton nand;
private JButton nor;
private JButton xor;
private JButton xnor;
private JButton buffer;
private JFrame frame;
public gate(){
    b1 = new JButton("VISUALISATION OF GATES");
     b1.setFont(new Font("Serif", Font.BOLD, 16));
     b1.setBounds(0,0,700,25);
     b2 = new JButton("CSE01@Batch06");
     b2.setBounds(0,630,700,20);
     //........................................................
     JPanel panel = new JPanel();
     panel.setBounds(20, 40, 150, 30);
     JLabel label= new JLabel("Basic Gates");
     label.setFont(new Font("Serif", Font.BOLD, 16));
     panel.add(label);
     JButton l1 = new JButton();
     l1.setBounds(0,70,700,10);
     JButton l2 = new JButton();
     l2.setBounds(0,180,700,10);
     //.........................................................
     JPanel panel1 = new JPanel();
     panel1.setBounds(30, 190, 160, 30);
     JLabel label1= new JLabel("Universal Gates");
     label1.setFont(new Font("Serif", Font.BOLD, 16));
     panel1.add(label1);
     JButton l11 = new JButton();
     l11.setBounds(0,230,700,10);
     JButton l22 = new JButton();
     l22.setBounds(0,340,700,10);
     //..........................................................
     JPanel panel2 = new JPanel();
     panel2.setBounds(30, 350, 150, 30);
     JLabel label2= new JLabel("Other Gates");
     label2.setFont(new Font("Serif", Font.BOLD, 16));
     panel2.add(label2);
     JButton l111 = new JButton();
     l111.setBounds(0,390,700,10);
     JButton l222 = new JButton();
     l222.setBounds(0,500,700,10);
     //.......................................................................
     
     AND = new JButton("AND");
     AND.setBounds(40,90,150,80);
     AND.setActionCommand("AND");
     AND.addActionListener(this);
     AND.setIcon(new ImageIcon("1.png"));
     OR = new JButton("OR");
     OR.setActionCommand("OR");
     OR.addActionListener(this);
     OR.setBounds(250,90,150,80);
     OR.setIcon(new ImageIcon("2.png"));
     NOT = new JButton("NOT");
     NOT.setBounds(460,90,150,80);
     NOT.setActionCommand("NOT");
     NOT.addActionListener(this);
     NOT.setIcon(new ImageIcon("3.png"));
     
     //........................................................................
     
          
     nand = new JButton("NAND");
     nand.setBounds(40,250,170,80);
     nand.setActionCommand("NAND");
     nand.addActionListener(this);
     nand.setIcon(new ImageIcon("4.png"));
     nor = new JButton("NOR");
     nor.setBounds(250,250,170,80);
     nor.setActionCommand("NOR");
     nor.addActionListener(this);
     nor.setIcon(new ImageIcon("5.png"));
     //.........................................................................
     
     xor = new JButton("EX-OR");
     xor.setBounds(40,410,190,80);
     xor.setActionCommand("XOR");
     xor.addActionListener(this);
     xor.setIcon(new ImageIcon("6.png"));
     xnor = new JButton("EX-NOR");
     xnor.setBounds(250,410,190,80);
     xnor.setActionCommand("XNOR");
     xnor.addActionListener(this);
     xnor.setIcon(new ImageIcon("7.png"));
     buffer = new JButton("BUFFER");
     buffer.setBounds(460,410,190,80);
     buffer.setActionCommand("BUFFER");
     buffer.addActionListener(this);
     buffer.setIcon(new ImageIcon("8.png"));
     
     //-----------------------------------------------------------------------------------------------------
     frame = new JFrame();
     frame.setLayout(null);
     frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
     frame.setSize(new Dimension(700, 700));
     frame.setLocation(50,50);
     frame.setTitle("DIGITAL CIRCUITS VISUALISATION");
     frame.add(b1);
     frame.add(panel);
     frame.add(l1);
     frame.add(AND);
     frame.add(OR);
     frame.add(NOT);
     frame.add(nand);
     frame.add(nor);
     frame.add(xor);
     frame.add(xnor);
     frame.add(buffer);
     frame.add(l2);
     frame.add(panel1);
     frame.add(l11);
     frame.add(l22);
     frame.add(b2);
       frame.add(panel2);
     frame.add(l111);
     frame.add(l222);
     frame.add(b2);
     frame.setVisible(true);
}
    @Override
    public void actionPerformed(ActionEvent e) {
       // throw new UnsupportedOperationException("Not supported yet.");
        String s = e.getActionCommand();
        if("AND".equals(s))
        {
            and an = new and();
        }
        else if("OR".equals(s))
        {
            or n =  new or();
        }
        else if("NOT".equals(s))
        {
            not ba =  new not();
        }
        else if("NOR".equals(s))
        {
            nor ga = new nor();
        }
        else if("NAND".equals(s))
        {
            nand nr = new nand();
        }
        else if("XOR".equals(s))
        {
            xor xr = new xor();
        }
        else if("XNOR".equals(s))
        {
            xnor xnr =  new xnor();
        }
        else if("BUFFER".equals(s))
        {
            buffer bbf  = new buffer();
        }
       
        
    }

    
}
