/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Color;
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
 * @author rgukt
 */
public class nandlatch implements ActionListener{

        public static void main(String arg[])
        {
            nandlatch nd = new nandlatch();
        }
    private JButton p1,m1,p2,i1,i2,o1,o2,latch,start;
    private JButton Qn,S,R,QN1,status,Qn1,S1,R1,QN11,status1,Qn2,S2,R2,QN12,status2,Qn3,S3,R3,QN13,status3,Qn4,S4,R4,QN14,status4;
    private JLabel labe1,labe2,label3,label4;
    private JPanel pa1,pa2,pa3,pa4,pa5;
    private JFrame frame;
    
    public nandlatch()
    {
        
        
            p1 = new JButton("BEHAVIOUR OF SR-LATCH USING NAND");
            p1.setFont(new Font("Serif", Font.BOLD, 16));
            p1.setBounds(0,0,1000,30);
            p2 = new JButton("CSE01@Batch06");
            p2.setBounds(0,550,1000,20);
            m1=  new JButton();
            m1.setBounds(580,30,10,520);
            start = new JButton("START");
            start.setActionCommand("start");
            start.addActionListener(this);
            start.setBounds(50,50,100,40);
            
            //..................................................................
            
            latch = new JButton();
            latch.setBounds(80,130,400,300);
            latch.setIcon(new ImageIcon("latch.gif"));
            
            i2 =  new JButton("R");
            i2.setActionCommand("i2");
            i2.setBounds(20,330,60,40);
            i2.addActionListener(this);
            i1 =  new JButton("S");
            i1.setActionCommand("i1");
            i1.addActionListener(this);
            i1.setBounds(20,190,60,40);
            o1 =  new JButton("Q");
            o1.setBounds(480,190,60,40);
            o1.setActionCommand("o1");
            o1.addActionListener(this);
            o2 = new JButton("!Q");
            o2.setBounds(480,330,60,40);
            o2.setActionCommand("o2");
            o2.addActionListener(this);
            
            //...................................................................
            
            labe1 = new JLabel("CHARACTERISTIC TABLE");
            labe1.setBounds(710,80,250,30);
            labe1.setFont(new Font("Serif", Font.BOLD, 13));
            
            Qn = new JButton("Qn");
            S = new JButton("S");
            R = new JButton("R");
            QN1  = new JButton("Qn+1");
            status = new JButton("       Status      ");
            
            pa1 = new JPanel();
            pa1.setBounds(530,120,550,30);
            
            pa1.add(Qn);
            pa1.add(S);
            pa1.add(R);
            pa1.add(QN1);
            pa1.add(status);
            
            
            Qn1 = new JButton("Qn");
            Qn1.setBackground(Color.white);
            S1 = new JButton("1");
            S1.setBackground(Color.white);
            R1 = new JButton("1");
            R1.setBackground(Color.white);
            QN11  = new JButton("  Qn  ");
            QN11.setBackground(Color.white);
            status1 = new JButton("memory state "); 
            status1.setBackground(Color.white);
            
            pa2 = new JPanel();
            pa2.setBounds(530,150,550,30);
            
            pa2.add(Qn1);
            pa2.add(S1);
            pa2.add(R1);
            pa2.add(QN11);
            pa2.add(status1);
            
            Qn2 = new JButton("Qn");
            Qn2.setBackground(Color.white);
            S2 = new JButton("1");
            S2.setBackground(Color.white);
            R2 = new JButton("0");
            R2.setBackground(Color.white);
            QN12  = new JButton("   0   ");
            QN12.setBackground(Color.white);
            status2 = new JButton("  RESET state   ");
            status2.setBackground(Color.white);
            
            pa3 = new JPanel();
            pa3.setBounds(530,180,550,30);
            
            pa3.add(Qn2);
            pa3.add(S2);
            pa3.add(R2);
            pa3.add(QN12);
            pa3.add(status2);
            
            
            Qn3 = new JButton("Qn");
            Qn3.setBackground(Color.white);
            S3 = new JButton("0");
            S3.setBackground(Color.white);
            R3 = new JButton("1");
            R3.setBackground(Color.white);
            QN13  = new JButton("   1   ");
            QN13.setBackground(Color.white);
            status3 = new JButton("    SET state    ");
            status3.setBackground(Color.white);
            
            pa4 = new JPanel();
            pa4.setBounds(530,210,550,30);
            
            pa4.add(Qn3);
            pa4.add(S3);
            pa4.add(R3);
            pa4.add(QN13);
            pa4.add(status3);
            
            Qn4= new JButton("Qn");
            Qn4.setBackground(Color.white);
            S4 = new JButton("0");
            S4.setBackground(Color.white);
            R4 = new JButton("0");
            R4.setBackground(Color.white);
            QN14  = new JButton("  X   ");
            QN14.setBackground(Color.white);
            status4 = new JButton("NON DETstate ");
            status4.setBackground(Color.white);
            
            pa5 = new JPanel();
            pa5.setBounds(530,240,550,30);
            
            pa5.add(Qn4);
            pa5.add(S4);
            pa5.add(R4);
            pa5.add(QN14);
            pa5.add(status4);
            
            //..........................................,,.......................
            frame =  new JFrame();
                frame.setLayout(null);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.setSize(new Dimension(1000, 600));
                frame.setLocation(50,50);
                frame.setTitle("DIGITAL CIRCUITS VISUALISATION");
                frame.add(p1);
                frame.add(p2);
                frame.add(m1);
                frame.add(labe1);
                frame.add(start);
                frame.add(latch);
                frame.add(i1);
                frame.add(i2);
                frame.add(o1);
                frame.add(o2);
                frame.add(pa1);
                frame.add(pa2);
                frame.add(pa3);
                frame.add(pa4);
                frame.add(pa5);
                frame.setVisible(true);
    
    }
    
    @Override
    
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet.");
        String s =  e.getActionCommand();
        if("start".equals(s))
        {
            if(start.getText().equals("START")){
                i1.setText("1");
                i2.setText("0");
                o1.setText("1");
                o2.setText("0");
                start.setText("STOP");
            }
            else {
                start.setText("START");
                cl();
                i1.setText("S");
                i2.setText("R");
                o1.setText("Q");
                o2.setText("!Q");
            }
        }
        if(start.getText().equals("STOP"))
        {
            if(s.equals("i1"))
            {
                if(i1.getText().equals("1"))
                {
                    i1.setText("0");
                }
                else
                {
                    i1.setText("1");
                
                 }
            }
            else if(s.equals("i2"))
            {
                if(i2.getText().equals("1"))
                {
                    i2.setText("0");
                }
                else
                {
                    i2.setText("1");
                
                 }
            
            }
           cl();
        if(i1.getText().equals("0")&&i2.getText().equals("1"))
        {
            o1.setText("1");o2.setText("0");
            Qn3.setBackground(Color.gray);
            S3.setBackground(Color.gray);
            R3.setBackground(Color.gray);
            QN13.setBackground(Color.gray);
            status3.setBackground(Color.gray);
        }
        else if(i1.getText().equals("1")&&i2.getText().equals("0"))
        {   
                 o1.setText("0");o2.setText("1");
            Qn2.setBackground(Color.pink);
            S2.setBackground(Color.pink);
            R2.setBackground(Color.pink);
            QN12.setBackground(Color.pink);
            status2.setBackground(Color.pink);
        }
        else if(i1.getText().equals("1")&&i2.getText().equals("1"))
        {
                
             Qn1.setBackground(Color.CYAN);
            S1.setBackground(Color.cyan);
            R1.setBackground(Color.cyan);
            QN11.setBackground(Color.cyan);
            status1.setBackground(Color.cyan);
        }
        else if(i1.getText().equals("0")&&i2.getText().equals("0"))
        {
            if(o2.getText().equals("1"))
            {
                o2.setText("0");o1.setText("1");
            }
            else
            {
                o2.setText("1");o1.setText("0");
            }
            Qn4.setBackground(Color.YELLOW);
            S4.setBackground(Color.YELLOW);
            R4.setBackground(Color.yellow);
            QN14.setBackground(Color.yellow);
            status4.setBackground(Color.yellow);
        
        }
        }
    }
    public void cl()
    {
    Qn1.setBackground(Color.white);
            S1.setBackground(Color.white);
            R1.setBackground(Color.white);
            QN11.setBackground(Color.white);
            Qn2.setBackground(Color.white);
            S2.setBackground(Color.white);
            R2.setBackground(Color.white);
            QN12.setBackground(Color.white);
            Qn3.setBackground(Color.white);
            S3.setBackground(Color.white);
            R3.setBackground(Color.white);
            QN13.setBackground(Color.white);
            Qn4.setBackground(Color.white);
            S4.setBackground(Color.white);
            R4.setBackground(Color.white);
            QN14.setBackground(Color.white);
            status1.setBackground(Color.white);status2.setBackground(Color.white);status3.setBackground(Color.white);status4.setBackground(Color.white);
    }
    
    
}
