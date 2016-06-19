/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author rgukt
 */
public class buffer implements ActionListener {

   public static void main(String arg[])
   {
       buffer an =  new buffer();
   
   }
   
   private JButton p1,m1,p2,b1,b2,not1,A,O,A1,O1,A2,O2;
   private JPanel pa1,pa2,pa3;
   private JLabel label;
   private JFrame frame;
   public buffer()
   {
       p1 = new JButton("BEHAVIOUR OF BUFFER");
       p1.setBounds(0,0,600,20);
       p2 =  new JButton("CSE01@Batch06");
       p2.setBounds(0,350,600,20);
       m1 = new JButton();
       m1.setBounds(360,20,5,350);
       
       ///.......................................................................
       
       not1 = new JButton();
       not1.setIcon(new ImageIcon("z2.gif"));
       not1.setBounds(100,80,200,150);
       
       b1 =  new JButton("1");
       b1.setBounds(50,135,50,40);
       b1.setActionCommand("ip");
       b1.addActionListener(this);
       
       b2 =  new JButton("1");
       b2.setBounds(300,135,50,40);
       b2.setActionCommand("op");
       b2.addActionListener(this);
       
       //........................................................................
       
       label = new JLabel("TRUTH TABLE");
       label.setBounds(430,80,100,30);
       
       
      
       
       A =  new JButton("a");
       O =  new JButton("O");
       A1 = new JButton("1");
       A1.setBackground(Color.ORANGE);
       O1 = new JButton("1");
       O1.setBackground(Color.ORANGE);
       A2 = new JButton("0");
       A2.setBackground(Color.white);
       O2 = new JButton("0");
       O2.setBackground(Color.white);
       pa1 =  new JPanel();
       pa1.setBounds(370,110,200,40);
       pa2 =  new JPanel();
       pa2.setBounds(370,145,200,30);
       pa3 =  new JPanel();
       pa3.setBounds(370,175,200,30);
       pa1.add(A);
       pa1.add(O);
       pa2.add(A1);
       pa2.add(O1);
       pa3.add(A2);
       pa3.add(O2);
       
       
       
       //.........................................................................
       frame  = new JFrame();
       frame.setLayout(null);
       frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       frame.setSize(new Dimension(600,400));
       frame.setLocation(50,50);
       frame.setTitle("DIGITAL CIRCUITS VISUALISATION");
       frame.add(p1);
       frame.add(p2);
       frame.add(m1);
       frame.add(not1);
       frame.add(b1);
       frame.add(b2);
       frame.add(label);
       
       frame.add(pa1);
       frame.add(pa2);
       frame.add(pa3);
       frame.setVisible(true);
   
   }
    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet.");
        String k = e.getActionCommand();
        if("ip".equals(k))
        {
            if(b1.getText().equals("1"))
            {
                 b1.setText("0");
            }
            else
            {
                 b1.setText("1");
            }
        }
        A1.setBackground(Color.white);O1.setBackground(Color.white);
        A2.setBackground(Color.white);O2.setBackground(Color.white);
        if(b1.getText().equals("1"))
        {
            b2.setText("1"); A1.setBackground(Color.green);O1.setBackground(Color.green);
        }
        else
        {
            b2.setText("0"); A2.setBackground(Color.CYAN);O2.setBackground(Color.CYAN);
        }
        
        
    }
    
    
    
    
}
