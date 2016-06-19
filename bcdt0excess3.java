/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author rgukt
 */
public class bcdt0excess3 implements ActionListener{
    
    public static void main(String arg[])
    {
     bcdt0excess3 bcd = new bcdt0excess3();
    
    }
    
    private JButton p1,m1,p2,i1,i2,i3,i4,ip1,ip2,ip3,ip4,op1,op2,op3,op4,bcde;
    private JLabel label1,lip1,lip2,lip3,lip4,label2;
    private JPanel pa1,pa2,pa4,pa3;
    private JFrame frame;
    
    public bcdt0excess3()
    {       p1 = new JButton("BCD TO EXCESS-3");
            p1.setFont(new Font("Serif", Font.BOLD, 16));
            p1.setBounds(0,0,1000,30);
            p2 = new JButton("CSE01@Batch06");
            p2.setBounds(0,550,1000,20);
            m1=  new JButton();
            m1.setBounds(230,30,10,520);
            //......................................................................
            
            label1  = new JLabel("BCD INPUTS");
            label1.setBounds(20,50,100,30);
            
            pa1 =  new JPanel();
            pa1.setBounds(20,80,160,30);
            pa2 =  new JPanel();
            pa2.setBounds(20,110,160,30);
            pa3 =  new JPanel();
            pa3.setBounds(20,140,160,30);
            pa4 =  new JPanel();
            pa4.setBounds(20,170,160,30);
             
            lip1 = new JLabel("INPUT 1(A):");lip2 = new JLabel("INPUT 2(B):");lip3 = new JLabel("INPUT 3(C):");lip4 = new JLabel("INPUT 4(D):");
            i1 = new JButton("1"); i2 = new JButton("0"); i3 = new JButton("0"); i4 = new JButton("1"); 
            
            i1.setActionCommand("one");
            i1.addActionListener(this);
            
            i2.setActionCommand("two");
            i2.addActionListener(this);
            
            i3.setActionCommand("three");
            i3.addActionListener(this);
            
            i4.setActionCommand("four");
            i4.addActionListener(this);
            
            pa1.add(lip1);
            pa1.add(i1);
            
            pa2.add(lip2);
            pa2.add(i2);
            
            pa3.add(lip3);
            pa3.add(i3);
            
            pa4.add(lip4);
            pa4.add(i4);
        //...........................................................................
            
            label2 = new JLabel("EXCESS-3 CONVERTER");
            label2.setFont(new Font("Serif", Font.BOLD, 16));
            label2.setBounds(530,40,250,30);
            
            bcde = new JButton();
            bcde.setBounds(390,80,460,400);
            bcde.setIcon(new ImageIcon("ex3.gif"));
            
            ip1 = new JButton("1");
            ip1.setBounds(330, 120, 60,40);
            ip2 = new JButton("0");
            ip2.setBounds(330, 210, 60,40);
            ip3 = new JButton("0");
            ip3.setBounds(330, 300, 60,40);
            ip4 = new JButton("1");
            ip4.setBounds(330, 390, 60,40);
            
            op1 = new JButton("1");
            op1.setBounds(850, 120, 60,40);
            op2 = new JButton("1");
            op2.setBounds(850, 210, 60,40);
            op3 = new JButton("0");
            op3.setBounds(850, 300, 60,40);
            op4 = new JButton("0");
            op4.setBounds(850, 390, 60,40);
            
            
            
            
        //...........................................................................
                frame =  new JFrame();
                frame.setLayout(null);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.setSize(new Dimension(1000, 600));
                frame.setLocation(50,50);
                frame.setTitle("DIGITAL CIRCUITS VISUALISATION");
                frame.add(p1);
                frame.add(p2);
                frame.add(m1);
                frame.add(label1);
                frame.add(label2);
                frame.add(pa1);
                frame.add(pa2);
                frame.add(pa3);
                frame.add(pa4);
                frame.add(bcde);
                frame.add(ip1);
                frame.add(ip2);
                frame.add(ip3);
                frame.add(ip4);
                frame.add(op1);
                frame.add(op2);
                frame.add(op3);
                frame.add(op4);
                
                
                frame.setVisible(true);
        
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet.");
        String s = e.getActionCommand();
       if("one".equals(s)){ 
        if(i1.getText().equals("0"))
            {
                if(i2.getText().equals("0")&&i3.getText().equals("0"))
                {
                    i1.setText("1");ip1.setText("1");
                }
                else
                {
                     JOptionPane.showMessageDialog(null,"BCD range exceeded");
                }
            }
            else
            {
                i1.setText("0");ip1.setText("0");
            }
            
        }
        else if("two".equals(s))
        {
            if(i2.getText().equals("0"))
            {
                if(i1.getText().equals("0"))
                        {
                            i2.setText("1");ip2.setText("1");
                        }
                else
                {
                 JOptionPane.showMessageDialog(null,"BCD range exceeded");
                }
            
            }
            else
            {
                i2.setText("0");ip2.setText("0");
            }
            
            
        }
        else if("three".equals(s))
        {    if(i3.getText().equals("0"))
            {
                if(i1.getText().equals("0"))
                        {
                            i3.setText("1");ip3.setText("1");
                        }
                else
                {
                 JOptionPane.showMessageDialog(null,"BCD range exceeded");
                }
            
            }
        else
        {
                i3.setText("0");ip3.setText("0");
        }
            
        }
        else if("four".equals(s))
        {
            
            if(i4.getText().equals("0"))
            {i4.setText("1");ip4.setText("1");}
            else
             {i4.setText("0");ip4.setText("0");}
        }
       
       int c = 0;
       if(i4.getText().equals("1"))
       {
           c=1;
           op4.setText("0");
           
       }
       else
       {
           op4.setText("1");
       }
       if((i3.getText().equals("1"))&&(c==1))
       {
        c=1;
           op3.setText("1");
       }
       else if((i3.getText().equals("0"))&&(c==1)||(i3.getText().equals("1"))&&(c==0))
       {
                op3.setText("0");c=1;
       }
       
       else
       {
           c=0;
           op3.setText("1");
       }
       if((i2.getText().equals("1"))&&(c==1))
       {
        c=1;
           op2.setText("0");
       }
       else if((i2.getText().equals("0"))&&(c==1))
       {
                op2.setText("1");c=0;
       }
       else if((i2.getText().equals("1"))&&(c==0))
       {
           op2.setText("1");c=0;
       }
       else
       {
           c=0;
           op2.setText("0");
       
       }
       if((i1.getText().equals("1"))&&(c==1))
       {
        c=1;
           op1.setText("0");
       }
       else if((i1.getText().equals("0"))&&(c==1)||(i1.getText().equals("1"))&&(c==0))
       {
                op1.setText("1");c=1;
       }
       
       else
       {
           c=0;
           op1.setText("0");
       
       }
    }
    
}
