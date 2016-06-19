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
public class nandic implements ActionListener {
    
   public static void main(String arg[])
   {
   
       nandic ic7400 = new nandic();
   }
   private JButton if1;
   private JButton if2;
   private JButton if3;
   private JButton if4;
   private JButton if5;
   private JButton if6;
   private JButton if7;
   private JButton if8;
   private JButton if9;
   private JButton if10;
   private JButton if11;
   private JButton if12;
   private JButton if13;
   private JButton if14;
   
   private JButton vcc;
   private JButton ground;
   
   
   //............................................................................
   private JFrame frame;
   //............................................................................
   
   public nandic()
   {
        
        JButton b1 = new JButton("IC7400(NAND)  SPECIFICATION");
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
        JButton in2 = new JButton("   1,2   ");
        in2.setBackground(Color.white);
        JButton on2 = new JButton("      3      ");
        on2.setBackground(Color.white);
        panel2.add(in2);
        panel2.add(on2);
        
        JPanel panel3 = new JPanel();
        panel3.setBounds(0, 110, 200, 30);
        JButton in3 = new JButton("   4,5   ");
        in3.setBackground(Color.white);
        JButton on3 = new JButton("      6      ");
        on3.setBackground(Color.white);
        panel3.add(in3);
        panel3.add(on3);
        
        JPanel panel4 = new JPanel();
        panel4.setBounds(0, 140, 200, 30);
        JButton in4 = new JButton("  10,9  ");
        in4.setBackground(Color.white);
        JButton on4 = new JButton("      8      ");
        on4.setBackground(Color.white);
        panel4.add(in4);
        panel4.add(on4);
        
        JPanel panel5 = new JPanel();
        panel5.setBounds(0, 170, 200, 30);
        JButton in5 = new JButton(" 12,13 ");
        in5.setBackground(Color.white);
        JButton on5 = new JButton("     11     ");
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
        
        JButton and74085 = new JButton("IC 7400");
        and74085.setBounds(230, 140, 380, 200);
        and74085.setFont(new Font("Serif", Font.BOLD, 20));
        
       if1 = new JButton(" 1");
       if1.setActionCommand("if1");
       if1.addActionListener(this);
       if2 = new JButton(" 2");
       if2.setActionCommand("if2");
       if2.addActionListener(this);
       if3 = new JButton(" 3");
       if3.addActionListener(this);
       if4 = new JButton(" 4");
       if4.setActionCommand("if4");
       if4.addActionListener(this);
       if5 = new JButton(" 5");
       if5.setActionCommand("if5");
       if5.addActionListener(this);
       if6 = new JButton(" 6");
       if6.addActionListener(this);
       if7 = new JButton(" 7");
       if7.setActionCommand("gr4");
       if7.addActionListener(this);
       if8 = new JButton(" 8");
       if8.addActionListener(this);
       if9 = new JButton("9");
       if9.setActionCommand("if9");
       if9.addActionListener(this);
       if10 = new JButton("10");
       if10.setActionCommand("if10");
       if10.addActionListener(this);
       if11 = new JButton("11");
       if11.addActionListener(this);
       if12 = new JButton("12");
       if12.setActionCommand("if12");
       if12.addActionListener(this);
       if13 = new JButton("13");
       if13.setActionCommand("if13");
       if13.addActionListener(this);
       if14 = new JButton("14");
       if14.setActionCommand(" vcc4");
       if14.addActionListener(this);
       
        JPanel pand1 = new JPanel();
        pand1.setBounds(220,340,400,30);
        pand1.add(if1);
        pand1.add(if2);
        pand1.add(if3);
        pand1.add(if4);
        pand1.add(if5);
        pand1.add(if6);
        pand1.add(if7);
        
        JPanel pand2 = new JPanel();
        pand2.setBounds(220,105,400,30);
        pand2.add(if14);
        pand2.add(if13);
        pand2.add(if12);
        pand2.add(if11);
        pand2.add(if10);
        pand2.add(if9);
        pand2.add(if8);
        
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
      frame.add(and74085);
      frame.add(pand1);
       frame.add(pand2);
   frame.setVisible(true);
   
   }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet.");
        String s = e.getActionCommand();
        if(s.equals(" vcc4"))
        {
            if(if14.getText().equals("14"))
            {
                if14.setText(" v");
                if14.setBackground(Color.red);
            }
            else
            {
             if14.setText("14");
                if14.setBackground(null);
                if1.setText(" 1");
                if2.setText(" 2");
                if3.setText(" 3");
                if4.setText(" 4");
                if5.setText(" 5");
                if6.setText(" 6");
                if8.setText(" 8");
                if9.setText(" 9");
                if10.setText("10");
                if11.setText("11");
                if12.setText("12");
                if13.setText("13");
            
            }
            if(if14.getText().equals(" v")&&if7.getText().equals("G"))
            {
                if1.setText(" x");
                if2.setText(" x");
                if3.setText(" x");
                if4.setText(" x");
                if5.setText(" x");
                if6.setText(" x");
                if8.setText(" x");
                if9.setText(" x");
                if10.setText(" x");
                if11.setText(" x");
                if12.setText(" x");
                if13.setText(" x");
                
            
            }
        }
        else if(s.equals("gr4"))
        {
            if(if7.getText().equals(" 7"))
            {
                if7.setText("G");
                if7.setBackground(Color.GRAY);
            }
            else
            {
             if7.setText(" 7");
                if7.setBackground(null);
                if1.setText(" 1");
                if2.setText(" 2");
                if3.setText(" 3");
                if4.setText(" 4");
                if5.setText(" 5");
                if6.setText(" 6");
                if8.setText(" 8");
                if9.setText(" 9");
                if10.setText("10");
                if11.setText("11");
                if12.setText("12");
                if13.setText("13");
            
            }
            if(if14.getText().equals(" v")&&if7.getText().equals("G"))
            {
                if1.setText(" x");
                if2.setText(" x");
                if3.setText(" x");
                if4.setText(" x");
                if5.setText(" x");
                if6.setText(" x");
                if8.setText(" x");
                if9.setText(" x");
                if10.setText(" x");
                if11.setText(" x");
                if12.setText(" x");
                if13.setText(" x");
                
            
            }
        
        
        }
        else if(s.equals("if1"))
        {
        if(if14.getText().equals(" v")&&if7.getText().equals("G"))
        {
            if(if1.getText().equals(" x"))
            {
                if1.setText(" 1");if3.setText(" x");
            }
            else if(if1.getText().equals(" 1"))
            {
                if1.setText(" 0");if3.setText(" x");
            }
            else
            {
                if1.setText(" x");if3.setText(" x");
            
            }
            
        }
        else
        {
            connect4();
        }
        }
        else if(s.equals("if2"))
        {
            if(if14.getText().equals(" v")&&if7.getText().equals("G"))
        {
        if(if2.getText().equals(" x"))
            {
                if2.setText(" 1");if3.setText(" x");
            }
            else if(if2.getText().equals(" 1"))
            {
                if2.setText(" 0");if3.setText(" x");
            }
            else
            {
                if2.setText(" x");if3.setText(" x");
            
            }
        }
        else
        {
            connect4();
        }
        
        }
        else if(s.equals("if4"))
        {
        if(if14.getText().equals(" v")&&if7.getText().equals("G"))
        {
        if(if4.getText().equals(" x"))
            {
                if4.setText(" 1");if6.setText(" x");
            }
            else if(if4.getText().equals(" 1"))
            {
                if4.setText(" 0");if6.setText(" x");
            }
            else
            {
                if4.setText(" x");if6.setText(" x");
            
            }
        }
        else
        {
            connect4();
        }
        }
        else if(s.equals("if5"))
        {
        if(if14.getText().equals(" v")&&if7.getText().equals("G"))
        {
            if(if5.getText().equals(" x"))
            {
                if5.setText(" 1");if6.setText(" x");
            }
            else if(if5.getText().equals(" 1"))
            {
                if5.setText(" 0");if6.setText(" x");
            }
            else
            {
                if5.setText(" x");if6.setText(" x");
            
            }
        
        }
        else
        {
            connect4();
        }
        }
        else if(s.equals("if9"))
        {
        if(if14.getText().equals(" v")&&if7.getText().equals("G"))
        {
            if(if9.getText().equals(" x"))
            {
                if9.setText(" 1");if8.setText(" x");
            }
            else if(if9.getText().equals(" 1"))
            {
                if9.setText(" 0");if8.setText(" x");
            }
            else
            {
                if9.setText(" x");if8.setText(" x");
            
            }
        }
        else
        {
            connect4();
        }
        }
        else if(s.equals("if10"))
        {
        if(if14.getText().equals(" v")&&if7.getText().equals("G"))
        {
            if(if10.getText().equals(" x"))
            {
                if10.setText(" 1");if8.setText(" x");
            }
            else if(if10.getText().equals(" 1"))
            {
                if10.setText(" 0");if8.setText(" x");
            }
            else
            {
                if10.setText(" x");if8.setText(" x");
            
            }
        
        }
        else
        {
            connect4();
        }
        }
        else if(s.equals("if12"))
        {
        if(if14.getText().equals(" v")&&if7.getText().equals("G"))
        {
        if(if12.getText().equals(" x"))
            {
                if12.setText(" 1");if11.setText(" x");
            }
            else if(if12.getText().equals(" 1"))
            {
                if12.setText(" 0");if11.setText(" x");
            }
            else
            {
                if12.setText(" x");if11.setText(" x");
            
            }
        }
        else
        {
            connect4();
        }
        }
        else if(s.equals("if13"))
        {
        if(if14.getText().equals(" v")&&if7.getText().equals("G"))
        {
            if(if13.getText().equals(" x"))
            {
                if13.setText(" 1");if11.setText(" x");
            }
            else if(if13.getText().equals(" 1"))
            {
                if13.setText(" 0");if11.setText(" x");
            }
            else
            {
                if13.setText(" x");if11.setText(" x");
            
            }
        
        }
        else
        {
            connect4();
        }
        }
        if(if14.getText().equals(" v")&&if7.getText().equals("G"))
        {
        if(if1.getText().equals(" 1")&&if2.getText().equals(" 1"))
        {
                if3.setText(" 0");
            
        }
        else if(if1.getText().equals(" x")||if2.getText().equals(" x"))
        {
        
            if3.setText(" x");
        }
        else
        {
                if3.setText(" 1");
        }
        if(if4.getText().equals(" 1")&&if5.getText().equals(" 1"))
        {
                if6.setText(" 0");
            
        }
        else if(if4.getText().equals(" x")||if5.getText().equals(" x"))
        {
        
            if6.setText(" x");
        }
        else
        {
                if6.setText(" 1");
        }
        if(if9.getText().equals(" 1")&&if10.getText().equals(" 1"))
        {
                if8.setText(" 0");
            
        }
        else if(if9.getText().equals(" x")||if10.getText().equals(" x"))
        {
        
            if8.setText(" x");
        }
        else
        {
                if8.setText(" 1");
        }
        if(if13.getText().equals(" 1")&&if12.getText().equals(" 1"))
        {
                if11.setText(" 0");
            
        }
        else if(if13.getText().equals(" x")||if12.getText().equals(" x"))
        {
        
            if11.setText(" x");
        }
        else
        {
                if11.setText(" 1");
        }
        }
    }
    public void connect4()
    {
    if(if14.getText().equals(" v")&&!"G".equals(if7.getText()))
            {
        JOptionPane.showMessageDialog(null,"connect4 7 to Ground");
            }
            else if(!" v".equals(if14.getText())&&if7.getText().equals("G"))
            {
             JOptionPane.showMessageDialog(null,"connect4 14 to Vcc");
            }
            else
            {
             JOptionPane.showMessageDialog(null,"connect4 14 to Vcc and 7 to Ground");
            }
    }
   
}
