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
public class notic implements ActionListener {
    
   public static void main(String arg[])
   {
   
       notic ic7404 = new notic();
   }
   private JButton ic1;
   private JButton ic2;
   private JButton ic3;
   private JButton ic4;
   private JButton ic5;
   private JButton ic6;
   private JButton ic7;
   private JButton ic8;
   private JButton ic9;
   private JButton ic10;
   private JButton ic11;
   private JButton ic12;
   private JButton ic13;
   private JButton ic14;
   
   private JButton vcc;
   private JButton ground;
   
   
   //............................................................................
   private JFrame frame;
   //............................................................................
   
   public notic()
   {
        
        JButton b1 = new JButton("IC7404(NOT)  SPECIFICATION");
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
        
        JButton and7404 = new JButton("IC 7404");
        and7404.setBounds(230, 140, 380, 200);
        and7404.setFont(new Font("Serif", Font.BOLD, 20));
        
       ic1 = new JButton(" 1");
       ic1.setActionCommand("ic1");
       ic1.addActionListener(this);
       ic2 = new JButton(" 2");
       ic2.setActionCommand("ic2");
       ic2.addActionListener(this);
       ic3 = new JButton(" 3");
       ic3.setActionCommand("ic3");
       ic3.addActionListener(this);
       ic4 = new JButton(" 4");
       ic4.setActionCommand("ic4");
       ic4.addActionListener(this);
       ic5 = new JButton(" 5");
       ic5.setActionCommand("ic5");
       ic5.addActionListener(this);
       ic6 = new JButton(" 6");
       ic6.setActionCommand("ic6");
       ic6.addActionListener(this);
       ic7 = new JButton(" 7");
       ic7.setActionCommand("gr3");
       ic7.addActionListener(this);
       ic8 = new JButton(" 8");
       ic8.setActionCommand("ic8");
       ic8.addActionListener(this);
       ic9 = new JButton("9");
       ic9.setActionCommand("ic9");
       ic9.addActionListener(this);
       ic10 = new JButton("10");
       ic10.setActionCommand("ic10");
       ic10.addActionListener(this);
       ic11 = new JButton("11");
       ic11.setActionCommand("ic11");
       ic11.addActionListener(this);
       ic12 = new JButton("12");
       ic12.setActionCommand("ic12");
       ic12.addActionListener(this);
       ic13 = new JButton("13");
       ic13.setActionCommand("ic13");
       ic13.addActionListener(this);
       ic14 = new JButton("14");
       ic14.setActionCommand("vcc3");
       ic14.addActionListener(this);
       
        JPanel panc1 = new JPanel();
        panc1.setBounds(220,340,400,30);
        panc1.add(ic1);
        panc1.add(ic2);
        panc1.add(ic3);
        panc1.add(ic4);
        panc1.add(ic5);
        panc1.add(ic6);
        panc1.add(ic7);
        
        JPanel panc2 = new JPanel();
        panc2.setBounds(220,105,400,30);
        panc2.add(ic14);
        panc2.add(ic13);
        panc2.add(ic12);
        panc2.add(ic11);
        panc2.add(ic10);
        panc2.add(ic9);
        panc2.add(ic8);
        
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
      frame.add(and7404);
      frame.add(panc1);
       frame.add(panc2);
   frame.setVisible(true);
   
   }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet.");
        String s = e.getActionCommand();
        if(s.equals("vcc3"))
        {
            if(ic14.getText().equals("14"))
            {
                ic14.setText(" v");
                ic14.setBackground(Color.red);
            }
            else
            {
             ic14.setText("14");
                ic14.setBackground(null);
                ic1.setText(" 1");
                ic2.setText(" 2");
                ic3.setText(" 3");
                ic4.setText(" 4");
                ic5.setText(" 5");
                ic6.setText(" 6");
                ic8.setText(" 8");
                ic9.setText(" 9");
                ic10.setText("10");
                ic11.setText("11");
                ic12.setText("12");
                ic13.setText("13");
            
            }
            if(ic14.getText().equals(" v")&&ic7.getText().equals("G"))
            {
                ic1.setText(" x");
                ic2.setText(" x");
                ic3.setText(" x");
                ic4.setText(" x");
                ic5.setText(" x");
                ic6.setText(" x");
                ic8.setText(" x");
                ic9.setText(" x");
                ic10.setText(" x");
                ic11.setText(" x");
                ic12.setText(" x");
                ic13.setText(" x");
                
            
            }
        }
        else if(s.equals("gr3"))
        {
            if(ic7.getText().equals(" 7"))
            {
                ic7.setText("G");
                ic7.setBackground(Color.GRAY);
            }
            else
            {
             ic7.setText(" 7");
                ic7.setBackground(null);
            ic1.setText(" 1");
                ic2.setText(" 2");
                ic3.setText(" 3");
                ic4.setText(" 4");
                ic5.setText(" 5");
                ic6.setText(" 6");
                ic8.setText(" 8");
                ic9.setText(" 9");
                ic10.setText("10");
                ic11.setText("11");
                ic12.setText("12");
                ic13.setText("13");
            }
            if(ic14.getText().equals(" v")&&ic7.getText().equals("G"))
            {
                ic1.setText(" x");
                ic2.setText(" x");
                ic3.setText(" x");
                ic4.setText(" x");
                ic5.setText(" x");
                ic6.setText(" x");
                ic8.setText(" x");
                ic9.setText(" x");
                ic10.setText(" x");
                ic11.setText(" x");
                ic12.setText(" x");
                ic13.setText(" x");
                
            
            }
        
        
        }
        else if(s.equals("ic1"))
        {
        if(ic14.getText().equals(" v")&&ic7.getText().equals("G"))
        {
            if(ic1.getText().equals(" x"))
            {
                ic1.setText(" 1");ic2.setText(" x");
            }
            else if(ic1.getText().equals(" 1"))
            {
                ic1.setText(" 0");ic2.setText(" x");
            }
            else
            {
                ic1.setText(" x");ic2.setText(" x");
            
            }
            
        }
        else
        {
            connect3();
        }
        }
        else if(s.equals("ic3"))
        {
            if(ic14.getText().equals(" v")&&ic7.getText().equals("G"))
        {
        if(ic3.getText().equals(" x"))
            {
                ic3.setText(" 1");ic4.setText(" x");
            }
            else if(ic3.getText().equals(" 1"))
            {
                ic3.setText(" 0");ic4.setText(" x");
            }
            else
            {
                ic3.setText(" x");ic4.setText(" x");
            
            }
        }
        else
        {
            connect3();
        }
        
        }
       
        else if(s.equals("ic5"))
        {
        if(ic14.getText().equals(" v")&&ic7.getText().equals("G"))
        {
            if(ic5.getText().equals(" x"))
            {
                ic5.setText(" 1");ic6.setText(" x");
            }
            else if(ic5.getText().equals(" 1"))
            {
                ic5.setText(" 0");ic6.setText(" x");
            }
            else
            {
                ic5.setText(" x");ic6.setText(" x");
            
            }
        
        }
        else
        {
            connect3();
        }
        }
        else if(s.equals("ic9"))
        {
        if(ic14.getText().equals(" v")&&ic7.getText().equals("G"))
        {
            if(ic9.getText().equals(" x"))
            {
                ic9.setText(" 1");ic8.setText(" x");
            }
            else if(ic9.getText().equals(" 1"))
            {
                ic9.setText(" 0");ic8.setText(" x");
            }
            else
            {
                ic9.setText(" x");ic8.setText(" x");
            
            }
        }
        else
        {
            connect3();
        }
        }
        else if(s.equals("ic11"))
        {
        if(ic14.getText().equals(" v")&&ic7.getText().equals("G"))
        {
            if(ic11.getText().equals(" x"))
            {
                ic11.setText(" 1");ic10.setText(" x");
            }
            else if(ic11.getText().equals(" 1"))
            {
                ic11.setText(" 0");ic10.setText(" x");
            }
            else
            {
                ic11.setText(" x");ic10.setText(" x");
            
            }
        
        }
        else
        {
            connect3();
        }
        }
      
        else if(s.equals("ic13"))
        {
        if(ic14.getText().equals(" v")&&ic7.getText().equals("G"))
        {
            if(ic13.getText().equals(" x"))
            {
                ic13.setText(" 1");ic12.setText(" x");
            }
            else if(ic13.getText().equals(" 1"))
            {
                ic13.setText(" 0");ic12.setText(" x");
            }
            else
            {
                ic13.setText(" x");ic12.setText(" x");
            
            }
        
        }
        else
        {
            connect3();
        }
        }
        if(ic14.getText().equals(" v")&&ic7.getText().equals("G"))
        {
        if(ic1.getText().equals(" 0"))
        {
                ic2.setText(" 1");
            
        }
        else if(ic1.getText().equals(" x"))
        {
        
            ic2.setText(" x");
        }
        else
        {
                ic2.setText(" 0");
        }
        if(ic3.getText().equals(" 0"))
        {
                ic4.setText(" 1");
            
        }
        else if(ic3.getText().equals(" x"))
        {
        
            ic4.setText(" x");
        }
        else
        {
                ic4.setText(" 0");
        }
        if(ic5.getText().equals(" 0"))
        {
                ic6.setText(" 1");
            
        }
        else if(ic5.getText().equals(" x"))
        {
        
            ic6.setText(" x");
        }
        else
        {
                ic6.setText(" 0");
        }
        if(ic9.getText().equals(" 0"))
        {
                ic8.setText(" 1");
            
        }
        else if(ic9.getText().equals(" x"))
        {
        
            ic8.setText(" x");
        }
        else
        {
                ic8.setText(" 0");
        }
        if(ic11.getText().equals(" 0"))
        {
                ic10.setText(" 1");
            
        }
        else if(ic11.getText().equals(" x"))
        {
        
            ic10.setText(" x");
        }
        else
        {
                ic10.setText(" 0");
        }
        if(ic13.getText().equals(" 0"))
        {
                ic12.setText(" 1");
            
        }
        else if(ic13.getText().equals(" x"))
        {
        
            ic12.setText(" x");
        }
        else
        {
                ic12.setText(" 0");
        }
        }
    }
    public void connect3()
    {
    if(ic14.getText().equals(" v")&&!"G".equals(ic7.getText()))
            {
        JOptionPane.showMessageDialog(null,"connect3 7 to Ground");
            }
            else if(!" v".equals(ic14.getText())&&ic7.getText().equals("G"))
            {
             JOptionPane.showMessageDialog(null,"connect3 14 to Vcc");
            }
            else
            {
             JOptionPane.showMessageDialog(null,"connect3 14 to Vcc and 7 to Ground");
            }
    }
   
}
