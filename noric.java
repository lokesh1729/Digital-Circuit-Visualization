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
public class noric implements ActionListener {
    
   public static void main(String arg[])
   {
   
       noric ic7432 = new noric();
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
   
   private JButton vcc;
   private JButton ground;
   
   
   //............................................................................
   private JFrame frame;
   //............................................................................
   
   public noric()
   {
        
        JButton b1 = new JButton("IC7402(NOR)  SPECIFICATION");
        b1.setBounds(0,0,650,30);
        
        JButton b2 = new JButton("");
        b2.setBounds(200,30,10,410);
        
        JButton b3 = new JButton("CSE01@Batch06");
        b3.setBounds(0,440,650,20);
        //.....................................................................
        
        
        JPanel panel1 = new JPanel();
        panel1.setBounds(0, 50, 200, 30);
        JButton in = new JButton("INPUTS");
        JButton on = new JButton("OUTPUTS");
        panel1.add(in);
        panel1.add(on);
        
        JPanel panel2 = new JPanel();
        panel2.setBounds(0, 80, 200, 30);
        JButton in2 = new JButton("   2,3   ");
        in2.setBackground(Color.white);
        JButton on2 = new JButton("      1      ");
        on2.setBackground(Color.white);
        panel2.add(in2);
        panel2.add(on2);
        
        JPanel panel3 = new JPanel();
        panel3.setBounds(0, 110, 200, 30);
        JButton in3 = new JButton("   5,6   ");
        in3.setBackground(Color.white);
        JButton on3 = new JButton("      4      ");
        on3.setBackground(Color.white);
        panel3.add(in3);
        panel3.add(on3);
        
        JPanel panel4 = new JPanel();
        panel4.setBounds(0, 140, 200, 30);
        JButton in4 = new JButton("   8,9  ");
        in4.setBackground(Color.white);
        JButton on4 = new JButton("     10     ");
        on4.setBackground(Color.white);
        panel4.add(in4);
        panel4.add(on4);
        
        JPanel panel5 = new JPanel();
        panel5.setBounds(0, 170, 200, 30);
        JButton in5 = new JButton(" 11,12 ");
        in5.setBackground(Color.white);
        JButton on5 = new JButton("     13     ");
        on5.setBackground(Color.white);
        panel5.add(in5);
        panel5.add(on5);
        
        JPanel panel6 = new JPanel();
        panel6.setBounds(0, 220, 200, 30);
        JButton in6 = new JButton("    14    ");
        in6.setBackground(Color.white);
        JButton on6 = new JButton("    Vcc   ");
        
        panel6.add(in6);
        panel6.add(on6);
        
        JPanel panel7 = new JPanel();
        panel7.setBounds(0, 250, 200, 30);
        JButton in7 = new JButton("     7     ");
        in7.setBackground(Color.white);
        JButton on7 = new JButton("Ground");
        
        panel7.add(in7);
        panel7.add(on7);
        //.......................................................................
        
        JButton and7408 = new JButton("IC 7402");
        and7408.setBounds(230, 140, 380, 200);
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
       i7.setActionCommand("GR");
       i7.addActionListener(this);
       i8 = new JButton(" 8");
       i8.setActionCommand("i8");
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
       i14.setActionCommand("VCC");
       i14.addActionListener(this);
       
        JPanel pan1 = new JPanel();
        pan1.setBounds(220,340,400,30);
        pan1.add(i1);
        pan1.add(i2);
        pan1.add(i3);
        pan1.add(i4);
        pan1.add(i5);
        pan1.add(i6);
        pan1.add(i7);
        
        JPanel pan2 = new JPanel();
        pan2.setBounds(220,105,400,30);
        pan2.add(i14);
        pan2.add(i13);
        pan2.add(i12);
        pan2.add(i11);
        pan2.add(i10);
        pan2.add(i9);
        pan2.add(i8);
        
        //.......................................................................
        frame = new JFrame();
     frame.setLayout(null);
     frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
     frame.setSize(new Dimension(650, 500));
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
            if(i14.getText().equals("14"))
            {
                i14.setText(" V");
                i14.setBackground(Color.red);
            }
            else
            {
             i14.setText("14");
                i14.setBackground(null);
                i1.setText(" 1");
                i2.setText(" 2");
                i3.setText(" 3");
                i4.setText(" 4");
                i5.setText(" 5");
                i6.setText(" 6");
                i8.setText(" 8");
                i9.setText(" 9");
                i10.setText("10");
                i11.setText("11");
                i12.setText("12");
                i13.setText("13");
            
            }
            if(i14.getText().equals(" V")&&i7.getText().equals("G"))
            {
                i1.setText(" X");
                i2.setText(" X");
                i3.setText(" X");
                i4.setText(" X");
                i5.setText(" X");
                i6.setText(" X");
                i8.setText(" X");
                i9.setText(" X");
                i10.setText(" X");
                i11.setText(" X");
                i12.setText(" X");
                i13.setText(" X");
                
            
            }
        }
        else if(s.equals("GR"))
        {
            if(i7.getText().equals(" 7"))
            {
                i7.setText("G");
                i7.setBackground(Color.GRAY);
            }
            else
            {
             i7.setText(" 7");
                i7.setBackground(null);
                i1.setText(" 1");
                i2.setText(" 2");
                i3.setText(" 3");
                i4.setText(" 4");
                i5.setText(" 5");
                i6.setText(" 6");
                i8.setText(" 8");
                i9.setText(" 9");
                i10.setText("10");
                i11.setText("11");
                i12.setText("12");
                i13.setText("13");
            
            }
            if(i14.getText().equals(" V")&&i7.getText().equals("G"))
            {
                i1.setText(" X");
                i2.setText(" X");
                i3.setText(" X");
                i4.setText(" X");
                i5.setText(" X");
                i6.setText(" X");
                i8.setText(" X");
                i9.setText(" X");
                i10.setText(" X");
                i11.setText(" X");
                i12.setText(" X");
                i13.setText(" X");
                
            
            }
        
        
        }
        else if(s.equals("i3"))
        {
        if(i14.getText().equals(" V")&&i7.getText().equals("G"))
        {
            if(i3.getText().equals(" X"))
            {
                i3.setText(" 1");i1.setText(" X");
            }
            else if(i3.getText().equals(" 1"))
            {
                i3.setText(" 0");i1.setText(" X");
            }
            else
            {
                i3.setText(" X");i1.setText(" X");
            
            }
            
        }
        else
        {
            connect();
        }
        }
        else if(s.equals("i2"))
        {
            if(i14.getText().equals(" V")&&i7.getText().equals("G"))
        {
        if(i2.getText().equals(" X"))
            {
                i2.setText(" 1");i1.setText(" X");
            }
            else if(i2.getText().equals(" 1"))
            {
                i2.setText(" 0");i1.setText(" X");
            }
            else
            {
                i2.setText(" X");i1.setText(" X");
            
            }
        }
        else
        {
            connect();
        }
        
        }
        else if(s.equals("i6"))
        {
        if(i14.getText().equals(" V")&&i7.getText().equals("G"))
        {
        if(i6.getText().equals(" X"))
            {
                i6.setText(" 1");i4.setText(" X");
            }
            else if(i6.getText().equals(" 1"))
            {
                i6.setText(" 0");i4.setText(" X");
            }
            else
            {
                i6.setText(" X");i4.setText(" X");
            
            }
        }
        else
        {
            connect();
        }
        }
        else if(s.equals("i5"))
        {
        if(i14.getText().equals(" V")&&i7.getText().equals("G"))
        {
            if(i5.getText().equals(" X"))
            {
                i5.setText(" 1");i4.setText(" X");
            }
            else if(i5.getText().equals(" 1"))
            {
                i5.setText(" 0");i4.setText(" X");
            }
            else
            {
                i5.setText(" X");i4.setText(" X");
            
            }
        
        }
        else
        {
            connect();
        }
        }
        else if(s.equals("i9"))
        {
        if(i14.getText().equals(" V")&&i7.getText().equals("G"))
        {
            if(i9.getText().equals(" X"))
            {
                i9.setText(" 1");i10.setText(" X");
            }
            else if(i9.getText().equals(" 1"))
            {
                i9.setText(" 0");i10.setText(" X");
            }
            else
            {
                i9.setText(" X");i10.setText(" X");
            
            }
        }
        else
        {
            connect();
        }
        }
        else if(s.equals("i8"))
        {
        if(i14.getText().equals(" V")&&i7.getText().equals("G"))
        {
            if(i8.getText().equals(" X"))
            {
                i8.setText(" 1");i10.setText(" X");
            }
            else if(i8.getText().equals(" 1"))
            {
                i8.setText(" 0");i10.setText(" X");
            }
            else
            {
                i8.setText(" X");i10.setText(" X");
            
            }
        
        }
        else
        {
            connect();
        }
        }
        else if(s.equals("i12"))
        {
        if(i14.getText().equals(" V")&&i7.getText().equals("G"))
        {
        if(i12.getText().equals(" X"))
            {
                i12.setText(" 1");i13.setText(" X");
            }
            else if(i12.getText().equals(" 1"))
            {
                i12.setText(" 0");i13.setText(" X");
            }
            else
            {
                i12.setText(" X");i13.setText(" X");
            
            }
        }
        else
        {
            connect();
        }
        }
        else if(s.equals("i11"))
        {
        if(i14.getText().equals(" V")&&i7.getText().equals("G"))
        {
            if(i11.getText().equals(" X"))
            {
                i11.setText(" 1");i13.setText(" X");
            }
            else if(i11.getText().equals(" 1"))
            {
                i11.setText(" 0");i13.setText(" X");
            }
            else
            {
                i11.setText(" X");i13.setText(" X");
            
            }
        
        }
        else
        {
            connect();
        }
        }
        if(i14.getText().equals(" V")&&i7.getText().equals("G"))
        {
        if(i3.getText().equals(" 0")&&i2.getText().equals(" 0"))
        {
                i1.setText(" 1");
            
        }
        else if(i3.getText().equals(" X")||i2.getText().equals(" X"))
        {
        
            i1.setText(" X");
        }
        else
        {
                i1.setText(" 0");
        }
        if(i6.getText().equals(" 0")&&i5.getText().equals(" 0"))
        {
                i4.setText(" 1");
            
        }
        else if(i6.getText().equals(" X")||i5.getText().equals(" X"))
        {
        
            i4.setText(" X");
        }
        else
        {
                i4.setText(" 0");
        }
        if(i9.getText().equals(" 0")&&i8.getText().equals(" 0"))
        {
                i10.setText(" 1");
            
        }
        else if(i9.getText().equals(" X")||i8.getText().equals(" X"))
        {
        
            i10.setText(" X");
        }
        else
        {
                i10.setText(" 0");
        }
        if(i11.getText().equals(" 0")&&i12.getText().equals(" 0"))
        {
                i13.setText(" 1");
            
        }
        else if(i11.getText().equals(" X")||i12.getText().equals(" X"))
        {
        
            i13.setText(" X");
        }
        else
        {
                i13.setText(" 0");
        }
        }
    }
    public void connect()
    {
    if(i14.getText().equals(" V")&&!"G".equals(i7.getText()))
            {
        JOptionPane.showMessageDialog(null,"connect 7 to Ground");
            }
            else if(!" V".equals(i14.getText())&&i7.getText().equals("G"))
            {
             JOptionPane.showMessageDialog(null,"connect 14 to Vcc");
            }
            else
            {
             JOptionPane.showMessageDialog(null,"connect 14 to Vcc and 7 to Ground");
            }
    }
   
}
