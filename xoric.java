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
public class xoric implements ActionListener {
    
   public static void main(String arg[])
   {
   
       xoric ic7432 = new xoric();
   }
   private JButton ij1;
   private JButton ij2;
   private JButton ij3;
   private JButton ij4;
   private JButton ij5;
   private JButton ij6;
   private JButton ij7;
   private JButton ij8;
   private JButton ij9;
   private JButton ij10;
   private JButton ij11;
   private JButton ij12;
   private JButton ij13;
   private JButton ij14;
   
   private JButton vcc;
   private JButton ground;
   
   
   //............................................................................
   private JFrame frame;
   //............................................................................
   
   public xoric()
   {
        
        JButton b1 = new JButton("IC7486(XOR)  SPECIFICATION");
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
        
        JButton and74089 = new JButton("IC 7486");
        and74089.setBounds(230, 140, 380, 200);
        and74089.setFont(new Font("Serif", Font.BOLD, 20));
        
       ij1 = new JButton(" 1");
       ij1.setActionCommand("ij1");
       ij1.addActionListener(this);
       ij2 = new JButton(" 2");
       ij2.setActionCommand("ij2");
       ij2.addActionListener(this);
       ij3 = new JButton(" 3");
       ij3.addActionListener(this);
       ij4 = new JButton(" 4");
       ij4.setActionCommand("ij4");
       ij4.addActionListener(this);
       ij5 = new JButton(" 5");
       ij5.setActionCommand("ij5");
       ij5.addActionListener(this);
       ij6 = new JButton(" 6");
       ij6.addActionListener(this);
       ij7 = new JButton(" 7");
       ij7.setActionCommand("gr5");
       ij7.addActionListener(this);
       ij8 = new JButton(" 8");
       ij8.addActionListener(this);
       ij9 = new JButton("9");
       ij9.setActionCommand("ij9");
       ij9.addActionListener(this);
       ij10 = new JButton("10");
       ij10.setActionCommand("ij10");
       ij10.addActionListener(this);
       ij11 = new JButton("11");
       ij11.addActionListener(this);
       ij12 = new JButton("12");
       ij12.setActionCommand("ij12");
       ij12.addActionListener(this);
       ij13 = new JButton("13");
       ij13.setActionCommand("ij13");
       ij13.addActionListener(this);
       ij14 = new JButton("14");
       ij14.setActionCommand("vcc5");
       ij14.addActionListener(this);
       
        JPanel pans1 = new JPanel();
        pans1.setBounds(220,340,400,30);
        pans1.add(ij1);
        pans1.add(ij2);
        pans1.add(ij3);
        pans1.add(ij4);
        pans1.add(ij5);
        pans1.add(ij6);
        pans1.add(ij7);
        
        JPanel pans2 = new JPanel();
        pans2.setBounds(220,105,400,30);
        pans2.add(ij14);
        pans2.add(ij13);
        pans2.add(ij12);
        pans2.add(ij11);
        pans2.add(ij10);
        pans2.add(ij9);
        pans2.add(ij8);
        
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
      frame.add(and74089);
      frame.add(pans1);
       frame.add(pans2);
   frame.setVisible(true);
   
   }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet.");
        String s = e.getActionCommand();
        if(s.equals("vcc5"))
        {
            if(ij14.getText().equals("14"))
            {
                ij14.setText(" v");
                ij14.setBackground(Color.red);
            }
            else
            {
             ij14.setText("14");
                ij14.setBackground(null);
                ij1.setText(" 1");
                ij2.setText(" 2");
                ij3.setText(" 3");
                ij4.setText(" 4");
                ij5.setText(" 5");
                ij6.setText(" 6");
                ij8.setText(" 8");
                ij9.setText(" 9");
                ij10.setText("10");
                ij11.setText("11");
                ij12.setText("12");
                ij13.setText("13");
            
            }
            if(ij14.getText().equals(" v")&&ij7.getText().equals("G"))
            {
                ij1.setText(" x");
                ij2.setText(" x");
                ij3.setText(" x");
                ij4.setText(" x");
                ij5.setText(" x");
                ij6.setText(" x");
                ij8.setText(" x");
                ij9.setText(" x");
                ij10.setText(" x");
                ij11.setText(" x");
                ij12.setText(" x");
                ij13.setText(" x");
                
            
            }
        }
        else if(s.equals("gr5"))
        {
            if(ij7.getText().equals(" 7"))
            {
                ij7.setText("G");
                ij7.setBackground(Color.GRAY);
            }
            else
            {
             ij7.setText(" 7");
                ij7.setBackground(null);
                ij1.setText(" 1");
                ij2.setText(" 2");
                ij3.setText(" 3");
                ij4.setText(" 4");
                ij5.setText(" 5");
                ij6.setText(" 6");
                ij8.setText(" 8");
                ij9.setText(" 9");
                ij10.setText("10");
                ij11.setText("11");
                ij12.setText("12");
                ij13.setText("13");
            
            }
            if(ij14.getText().equals(" v")&&ij7.getText().equals("G"))
            {
                ij1.setText(" x");
                ij2.setText(" x");
                ij3.setText(" x");
                ij4.setText(" x");
                ij5.setText(" x");
                ij6.setText(" x");
                ij8.setText(" x");
                ij9.setText(" x");
                ij10.setText(" x");
                ij11.setText(" x");
                ij12.setText(" x");
                ij13.setText(" x");
                
            
            }
        
        
        }
        else if(s.equals("ij1"))
        {
        if(ij14.getText().equals(" v")&&ij7.getText().equals("G"))
        {
            if(ij1.getText().equals(" x"))
            {
                ij1.setText(" 1");ij3.setText(" x");
            }
            else if(ij1.getText().equals(" 1"))
            {
                ij1.setText(" 0");ij3.setText(" x");
            }
            else
            {
                ij1.setText(" x");ij3.setText(" x");
            
            }
            
        }
        else
        {
            connect5();
        }
        }
        else if(s.equals("ij2"))
        {
            if(ij14.getText().equals(" v")&&ij7.getText().equals("G"))
        {
        if(ij2.getText().equals(" x"))
            {
                ij2.setText(" 1");ij3.setText(" x");
            }
            else if(ij2.getText().equals(" 1"))
            {
                ij2.setText(" 0");ij3.setText(" x");
            }
            else
            {
                ij2.setText(" x");ij3.setText(" x");
            
            }
        }
        else
        {
            connect5();
        }
        
        }
        else if(s.equals("ij4"))
        {
        if(ij14.getText().equals(" v")&&ij7.getText().equals("G"))
        {
        if(ij4.getText().equals(" x"))
            {
                ij4.setText(" 1");ij6.setText(" x");
            }
            else if(ij4.getText().equals(" 1"))
            {
                ij4.setText(" 0");ij6.setText(" x");
            }
            else
            {
                ij4.setText(" x");ij6.setText(" x");
            
            }
        }
        else
        {
            connect5();
        }
        }
        else if(s.equals("ij5"))
        {
        if(ij14.getText().equals(" v")&&ij7.getText().equals("G"))
        {
            if(ij5.getText().equals(" x"))
            {
                ij5.setText(" 1");ij6.setText(" x");
            }
            else if(ij5.getText().equals(" 1"))
            {
                ij5.setText(" 0");ij6.setText(" x");
            }
            else
            {
                ij5.setText(" x");ij6.setText(" x");
            
            }
        
        }
        else
        {
            connect5();
        }
        }
        else if(s.equals("ij9"))
        {
        if(ij14.getText().equals(" v")&&ij7.getText().equals("G"))
        {
            if(ij9.getText().equals(" x"))
            {
                ij9.setText(" 1");ij8.setText(" x");
            }
            else if(ij9.getText().equals(" 1"))
            {
                ij9.setText(" 0");ij8.setText(" x");
            }
            else
            {
                ij9.setText(" x");ij8.setText(" x");
            
            }
        }
        else
        {
            connect5();
        }
        }
        else if(s.equals("ij10"))
        {
        if(ij14.getText().equals(" v")&&ij7.getText().equals("G"))
        {
            if(ij10.getText().equals(" x"))
            {
                ij10.setText(" 1");ij8.setText(" x");
            }
            else if(ij10.getText().equals(" 1"))
            {
                ij10.setText(" 0");ij8.setText(" x");
            }
            else
            {
                ij10.setText(" x");ij8.setText(" x");
            
            }
        
        }
        else
        {
            connect5();
        }
        }
        else if(s.equals("ij12"))
        {
        if(ij14.getText().equals(" v")&&ij7.getText().equals("G"))
        {
        if(ij12.getText().equals(" x"))
            {
                ij12.setText(" 1");ij11.setText(" x");
            }
            else if(ij12.getText().equals(" 1"))
            {
                ij12.setText(" 0");ij11.setText(" x");
            }
            else
            {
                ij12.setText(" x");ij11.setText(" x");
            
            }
        }
        else
        {
            connect5();
        }
        }
        else if(s.equals("ij13"))
        {
        if(ij14.getText().equals(" v")&&ij7.getText().equals("G"))
        {
            if(ij13.getText().equals(" x"))
            {
                ij13.setText(" 1");ij11.setText(" x");
            }
            else if(ij13.getText().equals(" 1"))
            {
                ij13.setText(" 0");ij11.setText(" x");
            }
            else
            {
                ij13.setText(" x");ij11.setText(" x");
            
            }
        
        }
        else
        {
            connect5();
        }
        }
        if(ij14.getText().equals(" v")&&ij7.getText().equals("G"))
        {
        if((ij1.getText().equals(" 0")&&ij2.getText().equals(" 0"))||(ij1.getText().equals(" 1")&&ij2.getText().equals(" 1")))
        {
                ij3.setText(" 0");
            
        }
        else if(ij1.getText().equals(" x")||ij2.getText().equals(" x"))
        {
        
            ij3.setText(" x");
        }
        else
        {
                ij3.setText(" 1");
        }
        if((ij4.getText().equals(" 0")&&ij5.getText().equals(" 0"))||(ij4.getText().equals(" 1")&&ij5.getText().equals(" 1")))
        {
                ij6.setText(" 0");
            
        }
        else if(ij4.getText().equals(" x")||ij5.getText().equals(" x"))
        {
        
            ij6.setText(" x");
        }
        else
        {
                ij6.setText(" 1");
        }
        if((ij9.getText().equals(" 0")&&ij10.getText().equals(" 0"))||ij9.getText().equals(" 1")&&ij10.getText().equals(" 1"))
        {
                ij8.setText(" 0");
            
        }
        else if(ij9.getText().equals(" x")||ij10.getText().equals(" x"))
        {
        
            ij8.setText(" x");
        }
        else
        {
                ij8.setText(" 1");
        }
        if((ij13.getText().equals(" 0")&&ij12.getText().equals(" 0"))||(ij13.getText().equals(" 1")&&ij12.getText().equals(" 1")))
        {
                ij11.setText(" 0");
            
        }
        else if(ij13.getText().equals(" x")||ij12.getText().equals(" x"))
        {
        
            ij11.setText(" x");
        }
        else
        {
                ij11.setText(" 1");
        }
        }
    }
    public void connect5()
    {
    if(ij14.getText().equals(" v")&&!"G".equals(ij7.getText()))
            {
        JOptionPane.showMessageDialog(null,"connect5 7 to Ground");
            }
            else if(!" v".equals(ij14.getText())&&ij7.getText().equals("G"))
            {
             JOptionPane.showMessageDialog(null,"connect5 14 to Vcc");
            }
            else
            {
             JOptionPane.showMessageDialog(null,"connect5 14 to Vcc and 7 to Ground");
            }
    }
   
}
