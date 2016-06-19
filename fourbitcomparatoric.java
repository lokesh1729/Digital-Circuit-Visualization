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
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author manivmk
 */
public class fourbitcomparatoric implements ActionListener {
    
   public static void main(String arg[])
   {
   
       fourbitcomparatoric ic7408 = new fourbitcomparatoric();
   }
   private JButton i1;
   private JButton i2;
   private JButton i3;
   private JButton i4;
   private JButton i5;
   private JButton i6;
   private JButton i7;
   private JButton i8;
   private JButton i9;
   private JButton i10;
   private JButton i11;
   private JButton i12;
   private JButton i13;
   private JButton i14;
   private JButton i15;
   private JButton i16;
   
   private JButton vcc;
   private JButton ground;
   
   
   //............................................................................
   private JFrame frame;
   //............................................................................
   
   public fourbitcomparatoric()
   {
        
        JButton b1 = new JButton("IC7485(4BIT COMPARATOR)  SPECIFICATION");
        b1.setBounds(0,0,730,30);
        
        JButton b2 = new JButton("");
        b2.setBounds(240,30,10,410);
        
        JButton b3 = new JButton("CSE01@Batch06");
        b3.setBounds(0,440,730,20);
        //.....................................................................
        
        
        JPanel panel1 = new JPanel();
        panel1.setBounds(0, 50, 240, 30);
        JButton in = new JButton("         IC PIN SPECIFICATION      ");
       
        panel1.add(in);
        
        
        JPanel panel2 = new JPanel();
        panel2.setBounds(0, 80, 230, 30);
        JButton in2 = new JButton(" 9,11,14,1  ");
        in2.setBackground(Color.white);
        JButton on2 = new JButton("B0,B1,B2,B3  ");
        on2.setBackground(Color.white);
        panel2.add(in2);
        panel2.add(on2);
        
        JPanel panel3 = new JPanel();
        panel3.setBounds(0, 110, 230, 30);
        JButton in3 = new JButton("10,12,13,15");
        in3.setBackground(Color.white);
        JButton on3 = new JButton("A0,A1,A2,A3");
        on3.setBackground(Color.white);
        panel3.add(in3);
        panel3.add(on3);
        
        JPanel panel4 = new JPanel();
        panel4.setBounds(0, 140, 220, 30);
        JButton in4 = new JButton("    2   ");
        in4.setBackground(Color.white);
        JButton on4 = new JButton("    A>B(I/P)    ");
        on4.setBackground(Color.white);
        panel4.add(in4);
        panel4.add(on4);
        
        JPanel panel5 = new JPanel();
        panel5.setBounds(0, 170, 220, 30);
        JButton in5 = new JButton("   3   ");
        in5.setBackground(Color.white);
        JButton on5 = new JButton("    A=B(I/P)    ");
        on5.setBackground(Color.white);
        panel5.add(in5);
        panel5.add(on5);
        
        JPanel panel8 = new JPanel();
        panel8.setBounds(0, 200, 220, 30);
        JButton in8 = new JButton("   4   ");
        in8.setBackground(Color.white);
        JButton on8 = new JButton("    A<B(I/P)    ");
        on8.setBackground(Color.white);
        panel8.add(in8);
        panel8.add(on8);
        
        JPanel panel9 = new JPanel();
        panel9.setBounds(0, 230, 220, 30);
        JButton in9 = new JButton("   5   ");
        in9.setBackground(Color.white);
        JButton on9 = new JButton("    A<B(O/P)    ");
        on9.setBackground(Color.white);
        panel9.add(in9);
        panel9.add(on9);
        
        JPanel panel10 = new JPanel();
        panel10.setBounds(0, 260, 220, 30);
        JButton in10 = new JButton("   6   ");
        in10.setBackground(Color.white);
        JButton on10 = new JButton("    A=B(O/P)    ");
        on10.setBackground(Color.white);
        panel10.add(in10);
        panel10.add(on10);
        
        JPanel panel11 = new JPanel();
        panel11.setBounds(0, 290, 220, 30);
        JButton in11 = new JButton("   7   ");
        in11.setBackground(Color.white);
        JButton on11 = new JButton("    A>B(O/P)    ");
        on11.setBackground(Color.white);
        panel11.add(in11);
        panel11.add(on11);
        
        JPanel panel6 = new JPanel();
        panel6.setBounds(0, 340, 200, 30);
        JButton in6 = new JButton("    16    ");
        in6.setBackground(Color.white);
        JButton on6 = new JButton("    Vcc   ");
        
        panel6.add(in6);
        panel6.add(on6);
        
        JPanel panel7 = new JPanel();
        panel7.setBounds(0, 370, 200, 30);
        JButton in7 = new JButton("     8     ");
        in7.setBackground(Color.white);
        JButton on7 = new JButton("Ground");
        
        panel7.add(in7);
        panel7.add(on7);
        //.......................................................................
        
        JButton and7408 = new JButton("IC 7485");
        and7408.setBounds(260, 140, 440, 200);
        and7408.setFont(new Font("Serif", Font.BOLD, 20));
        
       i1 = new JButton(" 1");
       i1.setActionCommand("i1");
       i1.addActionListener(this);
       i2 = new JButton(" 2");
       i2.setActionCommand("i2");
       i2.addActionListener(this);
       i3 = new JButton(" 3");
       i3.setActionCommand("i3");
       i3.addActionListener(this);
       i4 = new JButton(" 4");
       i4.setActionCommand("i4");
       i4.addActionListener(this);
       i5 = new JButton(" 5");
       i5.setActionCommand("i5");
       i5.addActionListener(this);
       i6 = new JButton(" 6");
       i6.setActionCommand("i6");
       i6.addActionListener(this);
       i7 = new JButton(" 7");
       i7.setActionCommand("i7");
       i7.addActionListener(this);
       i8 = new JButton(" 8");
       i8.setActionCommand("GR");
       i8.addActionListener(this);
       i9 = new JButton("9");
       i9.setActionCommand("i9");
       i9.addActionListener(this);
       i10 = new JButton("10");
       i10.setActionCommand("i10");
       i10.addActionListener(this);
       i11 = new JButton("11");
       i11.setActionCommand("i11");
       i11.addActionListener(this);
       i12 = new JButton("12");
       i12.setActionCommand("i12");
       i12.addActionListener(this);
       i13 = new JButton("13");
       i13.setActionCommand("i13");
       i13.addActionListener(this);
       i14 = new JButton("14");
       i14.setActionCommand("i14");
       i14.addActionListener(this);
       
       i15 = new JButton("15");
       i15.setActionCommand("i15");
       i15.addActionListener(this);
       i16 = new JButton("16");
       i16.setActionCommand("VCC");
       i16.addActionListener(this);
      
        JPanel pan1 = new JPanel();
        pan1.setBounds(250,340,450,30);
        pan1.add(i1);
        pan1.add(i2);
        pan1.add(i3);
        pan1.add(i4);
        pan1.add(i5);
        pan1.add(i6);
        pan1.add(i7);
        pan1.add(i8);
        JPanel pan2 = new JPanel();
        pan2.setBounds(250,105,450,30);
        pan2.add(i16);
        pan2.add(i15);
        pan2.add(i14);
        pan2.add(i13);
        pan2.add(i12);
        pan2.add(i11);
        pan2.add(i10);
        pan2.add(i9);
        
        //.......................................................................
        frame = new JFrame();
     frame.setLayout(null);
     frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
     frame.setSize(new Dimension(730, 500));
     frame.setLocation(50,50);
     frame.setTitle("DIGITAL CIRCUITS VISUALISATION");
       frame.add(b1);
       frame.add(b2);
       frame.add(b3);
       frame.add(panel1);
       frame.add(panel2);
       frame.add(panel3);
       frame.add(panel4);
       frame.add(panel5);
       frame.add(panel8);
       frame.add(panel9);
       frame.add(panel10);
       frame.add(panel11);
      frame.add(panel6);
     frame.add(panel7);
     frame.add(and7408);
      frame.add(pan1);
       frame.add(pan2);
   frame.setVisible(true);
   
   }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet.");
        String s = e.getActionCommand();
        if(s.equals("VCC"))
        {
            if(i16.getText().equals("16"))
            {
                i16.setText(" v");
                i16.setBackground(Color.red);
            }
            else
            {
             i16.setText("16");
                i16.setBackground(null);
                i1.setText(" 1");
                i2.setText(" 2");
                i3.setText(" 3");
                i4.setText(" 4");
                i5.setText(" 5");
                i6.setText(" 6");
                 i7.setText(" 7");
                i9.setText(" 9");
                i10.setText("10");
                i11.setText("11");
                i12.setText("12");
                i13.setText("13");
                i14.setText("14");
                i15.setText("13");
            
            }
            if(i16.getText().equals(" v")&&i8.getText().equals("G"))
            {
                i1.setText(" x");
                i2.setText(" x");
                i3.setText(" x");
                i4.setText(" x");
                i5.setText(" x");
                i6.setText(" x");
                i7.setText(" x");
                i9.setText(" x");
                i10.setText(" x");
                i11.setText(" x");
                i12.setText(" x");
                i13.setText(" x");
                i14.setText(" x");
                i15.setText(" x");
                
            
            }
        }
        else if(s.equals("GR"))
        {
            if(i8.getText().equals(" 8"))
            {
                i8.setText("G");
                i8.setBackground(Color.GRAY);
            }
            else
            {
             i8.setText(" 8");
                i8.setBackground(null);
                i1.setText(" 1");
                i2.setText(" 2");
                i3.setText(" 3");
                i4.setText(" 4");
                i5.setText(" 5");
                i6.setText(" 6");
                i7.setText(" 7");
                i9.setText(" 9");
                i10.setText("10");
                i11.setText("11");
                i12.setText("12");
                i13.setText("13");
                i14.setText("14");
                i15.setText("15");
            
            }
            if(i16.getText().equals(" v")&&i8.getText().equals("G"))
            {
                i1.setText(" x");
                i2.setText(" x");
                i3.setText(" x");
                i4.setText(" x");
                i5.setText(" x");
                i6.setText(" x");
                i7.setText(" x");
                i9.setText(" x");
                i10.setText(" x");
                i11.setText(" x");
                i12.setText(" x");
                i13.setText(" x");
                i14.setText(" x");
                i15.setText(" x");
                
            
            }
        
        
        }
        else if(s.equals("i1"))
        {
        if(i16.getText().equals(" v")&&i8.getText().equals("G"))
        {
            if(i1.getText().equals(" x"))
            {
                i1.setText(" 1");i5.setText(" x");i6.setText(" x");i6.setText(" x");
            }
            else if(i1.getText().equals(" 1"))
            {
                i1.setText(" 0");i5.setText(" x");i6.setText(" x");i6.setText(" x");
            }
            else
            {
                i1.setText(" x");i5.setText(" x");i6.setText(" x");i6.setText(" x");
            
            }
            
        }
        else
        {
            connect();
        }
        }
       else if(s.equals("i2"))
        {
        if(i16.getText().equals(" v")&&i8.getText().equals("G"))
        {
            if(i2.getText().equals(" x"))
            {
                i2.setText(" 1");i5.setText(" x");i6.setText(" x");i6.setText(" x");
            }
            else if(i2.getText().equals(" 1"))
            {
                i2.setText(" 0");i5.setText(" x");i6.setText(" x");i6.setText(" x");
            }
            else
            {
                i2.setText(" x");i5.setText(" x");i6.setText(" x");i6.setText(" x");
            
            }
            
        }
        else
        {
            connect();
        }
        }
        else if(s.equals("i3"))
        {
        if(i16.getText().equals(" v")&&i8.getText().equals("G"))
        {
            if(i3.getText().equals(" x"))
            {
                i3.setText(" 1");i5.setText(" x");i6.setText(" x");i6.setText(" x");
            }
            else if(i3.getText().equals(" 1"))
            {
                i3.setText(" 0");i5.setText(" x");i6.setText(" x");i6.setText(" x");
            }
            else
            {
                i3.setText(" x");i5.setText(" x");i6.setText(" x");i6.setText(" x");
            
            }
            
        }
        else
        {
            connect();
        }
        }
        else if(s.equals("i4"))
        {
        if(i16.getText().equals(" v")&&i8.getText().equals("G"))
        {
            if(i4.getText().equals(" x"))
            {
                i4.setText(" 1");i5.setText(" x");i6.setText(" x");i6.setText(" x");
            }
            else if(i4.getText().equals(" 1"))
            {
                i4.setText(" 0");i5.setText(" x");i6.setText(" x");i6.setText(" x");
            }
            else
            {
                i4.setText(" x");i5.setText(" x");i6.setText(" x");i6.setText(" x");
            
            }
            
        }
        else
        {
            connect();
        }
        }
        else if(s.equals("i9"))
        {
        if(i16.getText().equals(" v")&&i8.getText().equals("G"))
        {
            if(i9.getText().equals(" x"))
            {
                i9.setText(" 1");i5.setText(" x");i6.setText(" x");i6.setText(" x");
            }
            else if(i9.getText().equals(" 1"))
            {
                i9.setText(" 0");i5.setText(" x");i6.setText(" x");i6.setText(" x");
            }
            else
            {
                i9.setText(" x");i5.setText(" x");i6.setText(" x");i6.setText(" x");
            
            }
            
        }
        else
        {
            connect();
        }
        }
        else if(s.equals("i10"))
        {
        if(i16.getText().equals(" v")&&i8.getText().equals("G"))
        {
            if(i10.getText().equals(" x"))
            {
                i10.setText(" 1");i5.setText(" x");i6.setText(" x");i6.setText(" x");
            }
            else if(i10.getText().equals(" 1"))
            {
                i10.setText(" 0");i5.setText(" x");i6.setText(" x");i6.setText(" x");
            }
            else
            {
                i10.setText(" x");i5.setText(" x");i6.setText(" x");i6.setText(" x");
            
            }
            
        }
        else
        {
            connect();
        }
        }
        else if(s.equals("i11"))
        {
        if(i16.getText().equals(" v")&&i8.getText().equals("G"))
        {
            if(i11.getText().equals(" x"))
            {
                i11.setText(" 1");i5.setText(" x");i6.setText(" x");i6.setText(" x");
            }
            else if(i11.getText().equals(" 1"))
            {
                i11.setText(" 0");i5.setText(" x");i6.setText(" x");i6.setText(" x");
            }
            else
            {
                i11.setText(" x");i5.setText(" x");i6.setText(" x");i6.setText(" x");
            
            }
            
        }
        else
        {
            connect();
        }
        }
        else if(s.equals("i12"))
        {
        if(i16.getText().equals(" v")&&i8.getText().equals("G"))
        {
            if(i12.getText().equals(" x"))
            {
                i12.setText(" 1");i5.setText(" x");i6.setText(" x");i6.setText(" x");
            }
            else if(i12.getText().equals(" 1"))
            {
                i12.setText(" 0");i5.setText(" x");i6.setText(" x");i6.setText(" x");
            }
            else
            {
                i12.setText(" x");i5.setText(" x");i6.setText(" x");i6.setText(" x");
            
            }
            
        }
        else
        {
            connect();
        }
        }
        else if(s.equals("i13"))
        {
        if(i16.getText().equals(" v")&&i8.getText().equals("G"))
        {
            if(i13.getText().equals(" x"))
            {
                i13.setText(" 1");i5.setText(" x");i6.setText(" x");i6.setText(" x");
            }
            else if(i13.getText().equals(" 1"))
            {
                i13.setText(" 0");i5.setText(" x");i6.setText(" x");i6.setText(" x");
            }
            else
            {
                i13.setText(" x");i5.setText(" x");i6.setText(" x");i6.setText(" x");
            
            }
            
        }
        else
        {
            connect();
        }
        }
        else if(s.equals("i14"))
        {
        if(i16.getText().equals(" v")&&i8.getText().equals("G"))
        {
            if(i14.getText().equals(" x"))
            {
                i14.setText(" 1");i5.setText(" x");i6.setText(" x");i6.setText(" x");
            }
            else if(i14.getText().equals(" 1"))
            {
                i14.setText(" 0");i5.setText(" x");i6.setText(" x");i6.setText(" x");
            }
            else
            {
                i14.setText(" x");i5.setText(" x");i6.setText(" x");i6.setText(" x");
            
            }
            
        }
        else
        {
            connect();
        }
        }
        else if(s.equals("i15"))
        {
        if(i16.getText().equals(" v")&&i8.getText().equals("G"))
        {
            if(i15.getText().equals(" x"))
            {
                i15.setText(" 1");i5.setText(" x");i6.setText(" x");i6.setText(" x");
            }
            else if(i15.getText().equals(" 1"))
            {
                i15.setText(" 0");i5.setText(" x");i6.setText(" x");i6.setText(" x");
            }
            else
            {
                i15.setText(" x");i5.setText(" x");i6.setText(" x");i6.setText(" x");
            
            }
            
        }
        else
        {
            connect();
        }
        }
        if(i16.getText().equals(" v")&&i8.getText().equals("G"))
        {
        if(i1.getText().equals(" x")||i9.getText().equals(" x")||i10.getText().equals(" x")||i11.getText().equals(" x")||i12.getText().equals(" x")||i13.getText().equals(" x")||i14.getText().equals(" x"))
        {
           i5.setText(" x");i6.setText(" x");i7.setText(" x");
        }
        else
        {
                int a3,a2,a1,a0,b3,b2,b1,b0;
                if(i15.getText().equals(" 1"))
                {
                a3=1;
                }
                else
                {
                a3=0;
                }
                if(i1.getText().equals(" 1"))
                {
                b3=1;
                }
                else
                {
                b3=0;
                }
                if(i14.getText().equals(" 1"))
                {
                b2=1;
                }
                else
                {
                b2=0;
                }
                if(i13.getText().equals(" 1"))
                {
                a2=1;
                }
                else
                {
                a2=0;
                }
                if(i12.getText().equals(" 1"))
                {
                a1=1;
                }
                else
                {
                a1=0;
                }
                if(i11.getText().equals(" 1"))
                {
                b1=1;
                }
                else
                {
                b1=0;
                }
                if(i10.getText().equals(" 1"))
                {
                a0=1;
                }
                else
                {
                a0=0;
                }
                if(i9.getText().equals(" 1"))
                {
                b0=1;
                }
                else
                {
                b0=0;
                }
                if(a3>b3)
                {
                    if(i4.getText().equals(" 1"))
                    {
                        i5.setText(" 1");
                    }
                    else 
                    {
                        i5.setText(" x");
                    }
                    if(i3.getText().equals(" 1"))
                    {
                        i6.setText(" 0");
                    }
                    else 
                    {
                        i6.setText(" x");
                    }
                    if(i2.getText().equals(" 1"))
                    {
                        i7.setText(" 0");
                    }
                    else 
                    {
                        i7.setText(" x");
                    }
                
                }
                else if(a3<b3)
                {
                 if(i4.getText().equals(" 1"))
                    {
                        i5.setText(" 0");
                    }
                    else 
                    {
                        i5.setText(" x");
                    }
                    if(i3.getText().equals(" 1"))
                    {
                        i6.setText(" 0");
                    }
                    else 
                    {
                        i6.setText(" x");
                    }
                    if(i2.getText().equals(" 1"))
                    {
                        i7.setText(" 1");
                    }
                    else 
                    {
                        i7.setText(" x");
                    }
                
                }
                else if((a3==b3)&&(a2>b2))
                {
                     if(i4.getText().equals(" 1"))
                    {
                        i5.setText(" 1");
                    }
                    else 
                    {
                        i5.setText(" x");
                    }
                    if(i3.getText().equals(" 1"))
                    {
                        i6.setText(" 0");
                    }
                    else 
                    {
                        i6.setText(" x");
                    }
                    if(i2.getText().equals(" 1"))
                    {
                        i7.setText(" 0");
                    }
                    else 
                    {
                        i7.setText(" x");
                    }
                }
                else if((a3==b3)&&(a2<b2))
                {
                     if(i4.getText().equals(" 1"))
                    {
                        i5.setText(" 0");
                    }
                    else 
                    {
                        i5.setText(" x");
                    }
                    if(i3.getText().equals(" 1"))
                    {
                        i6.setText(" 0");
                    }
                    else 
                    {
                        i6.setText(" x");
                    }
                    if(i2.getText().equals(" 1"))
                    {
                        i7.setText(" 1");
                    }
                    else 
                    {
                        i7.setText(" x");
                    }
                }
                else if((a3==b3)&&(a2==b2)&&(a1>b1))
                {
                     if(i4.getText().equals(" 1"))
                    {
                        i5.setText(" 1");
                    }
                    else 
                    {
                        i5.setText(" x");
                    }
                    if(i3.getText().equals(" 1"))
                    {
                        i6.setText(" 0");
                    }
                    else 
                    {
                        i6.setText(" x");
                    }
                    if(i2.getText().equals(" 1"))
                    {
                        i7.setText(" 0");
                    }
                    else 
                    {
                        i7.setText(" x");
                    }
                
                }
                else if((a3==b3)&&(a2==b2)&&(a1<b1))
                {
                 if(i4.getText().equals(" 1"))
                    {
                        i5.setText(" 0");
                    }
                    else 
                    {
                        i5.setText(" x");
                    }
                    if(i3.getText().equals(" 1"))
                    {
                        i6.setText(" 0");
                    }
                    else 
                    {
                        i6.setText(" x");
                    }
                    if(i2.getText().equals(" 1"))
                    {
                        i7.setText(" 1");
                    }
                    else 
                    {
                        i7.setText(" x");
                    }
                }
                else if((a3==b3)&&(a2==b2)&&(a1==b1)&&(a0>b0))
                {
                 if(i4.getText().equals(" 1"))
                    {
                        i5.setText(" 1");
                    }
                    else 
                    {
                        i5.setText(" x");
                    }
                    if(i3.getText().equals(" 1"))
                    {
                        i6.setText(" 0");
                    }
                    else 
                    {
                        i6.setText(" x");
                    }
                    if(i2.getText().equals(" 1"))
                    {
                        i7.setText(" 0");
                    }
                    else 
                    {
                        i7.setText(" x");
                    }
                }
                else if((a3==b3)&&(a2==b2)&&(a1==b1)&&(a0<b0))
                {
                 if(i4.getText().equals(" 1"))
                    {
                        i5.setText(" 0");
                    }
                    else 
                    {
                        i5.setText(" x");
                    }
                    if(i3.getText().equals(" 1"))
                    {
                        i6.setText(" 0");
                    }
                    else 
                    {
                        i6.setText(" x");
                    }
                    if(i2.getText().equals(" 1"))
                    {
                        i7.setText(" 1");
                    }
                    else 
                    {
                        i7.setText(" x");
                    }
                }
                else if((a3==b3)&&(a2==b2)&&(a1==b1)&&(a0==b0))
                {
                 if(i4.getText().equals(" 1"))
                    {
                        i5.setText(" 0");
                    }
                    else 
                    {
                        i5.setText(" x");
                    }
                    if(i3.getText().equals(" 1"))
                    {
                        i6.setText(" 1");
                    }
                    else 
                    {
                        i6.setText(" x");
                    }
                    if(i2.getText().equals(" 1"))
                    {
                        i7.setText(" 0");
                    }
                    else 
                    {
                        i7.setText(" x");
                    }
                
                }}
        }
    }
    public void connect()
    {
    if(i16.getText().equals(" v")&&!"G".equals(i8.getText()))
            {
        JOptionPane.showMessageDialog(null,"connect 8 to Ground");
            }
            else if(!" v".equals(i16.getText())&&i8.getText().equals("G"))
            {
             JOptionPane.showMessageDialog(null,"connect 16 to Vcc");
            }
            else
            {
             JOptionPane.showMessageDialog(null,"connect 16 to Vcc and 8 to Ground");
            }
    }
   
}
