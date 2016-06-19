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
public class andic implements ActionListener {
    
   public static void main(String arg[])
   {
   
       andic ic7408 = new andic();
   }
   private JButton ia1;
   private JButton ia2;
   private JButton ia3;
   private JButton ia4;
   private JButton ia5;
   private JButton ia6;
   private JButton ia7;
   private JButton ia8;
   private JButton ia9;
   private JButton ia10;
   private JButton ia11;
   private JButton ia12;
   private JButton ia13;
   private JButton ia14;
   
   private JButton vcc;
   private JButton ground;
   
   
   //............................................................................
   private JFrame frame;
   //............................................................................
   
   public andic()
   {
        
        JButton b1 = new JButton("IC7408(AND)  SPECIFICATION");
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
        
        JButton and7408 = new JButton("IC 7408");
        and7408.setBounds(230, 140, 380, 200);
        and7408.setFont(new Font("Serif", Font.BOLD, 20));
        
       ia1 = new JButton(" 1");
       ia1.setActionCommand("ia1");
       ia1.addActionListener(this);
       ia2 = new JButton(" 2");
       ia2.setActionCommand("ia2");
       ia2.addActionListener(this);
       ia3 = new JButton(" 3");
	ia3.setActionCommand("ia3");
       ia3.addActionListener(this);
       ia4 = new JButton(" 4");
       ia4.setActionCommand("ia4");
       ia4.addActionListener(this);
       ia5 = new JButton(" 5");
       ia5.setActionCommand("ia5");
       ia5.addActionListener(this);
       ia6 = new JButton(" 6");
	ia6.setActionCommand("ia6");
       ia6.addActionListener(this);
       ia7 = new JButton(" 7");
       ia7.setActionCommand("gr1");
       ia7.addActionListener(this);
       ia8 = new JButton(" 8");
	ia8.setActionCommand("ia8");
       ia8.addActionListener(this);
       ia9 = new JButton("9");
       ia9.setActionCommand("ia9");
       ia9.addActionListener(this);
       ia10 = new JButton("10");
       ia10.setActionCommand("ia10");
       ia10.addActionListener(this);
       ia11 = new JButton("11");
	ia11.setActionCommand("ia11");
       ia11.addActionListener(this);
       ia12 = new JButton("12");
       ia12.setActionCommand("ia12");
       ia12.addActionListener(this);
       ia13 = new JButton("13");
       ia13.setActionCommand("ia13");
       ia13.addActionListener(this);
       ia14 = new JButton("14");
       ia14.setActionCommand("vcc1");
       ia14.addActionListener(this);
       
        JPanel pan1 = new JPanel();
        pan1.setBounds(220,340,400,30);
        pan1.add(ia1);
        pan1.add(ia2);
        pan1.add(ia3);
        pan1.add(ia4);
        pan1.add(ia5);
        pan1.add(ia6);
        pan1.add(ia7);
        
        JPanel pan2 = new JPanel();
        pan2.setBounds(220,105,400,30);
        pan2.add(ia14);
        pan2.add(ia13);
        pan2.add(ia12);
        pan2.add(ia11);
        pan2.add(ia10);
        pan2.add(ia9);
        pan2.add(ia8);
        
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
        if(s.equals("vcc1"))
        {
            if(ia14.getText().equals("14"))
            {
                ia14.setText(" v");
                ia14.setBackground(Color.red);
            }
            else
            {
             ia14.setText("14");
                ia14.setBackground(null);
                ia1.setText(" 1");
                ia2.setText(" 2");
                ia3.setText(" 3");
                ia4.setText(" 4");
                ia5.setText(" 5");
                ia6.setText(" 6");
                ia8.setText(" 8");
                ia9.setText(" 9");
                ia10.setText("10");
                ia11.setText("11");
                ia12.setText("12");
                ia13.setText("13");
            
            }
            if(ia14.getText().equals(" v")&&ia7.getText().equals("G"))
            {
                ia1.setText(" x");
                ia2.setText(" x");
                ia3.setText(" x");
                ia4.setText(" x");
                ia5.setText(" x");
                ia6.setText(" x");
                ia8.setText(" x");
                ia9.setText(" x");
                ia10.setText(" x");
                ia11.setText(" x");
                ia12.setText(" x");
                ia13.setText(" x");
                
            
            }
        }
        else if(s.equals("gr1"))
        {
            if(ia7.getText().equals(" 7"))
            {
                ia7.setText("G");
                ia7.setBackground(Color.GRAY);
            }
            else
            {
             ia7.setText(" 7");
                ia7.setBackground(null);
                ia1.setText(" 1");
                ia2.setText(" 2");
                ia3.setText(" 3");
                ia4.setText(" 4");
                ia5.setText(" 5");
                ia6.setText(" 6");
                ia8.setText(" 8");
                ia9.setText(" 9");
                ia10.setText("10");
                ia11.setText("11");
                ia12.setText("12");
                ia13.setText("13");
            
            }
            if(ia14.getText().equals(" v")&&ia7.getText().equals("G"))
            {
                ia1.setText(" x");
                ia2.setText(" x");
                ia3.setText(" x");
                ia4.setText(" x");
                ia5.setText(" x");
                ia6.setText(" x");
                ia8.setText(" x");
                ia9.setText(" x");
                ia10.setText(" x");
                ia11.setText(" x");
                ia12.setText(" x");
                ia13.setText(" x");
                
            
            }
        
        
        }
        else if(s.equals("ia1"))
        {
        if(ia14.getText().equals(" v")&&ia7.getText().equals("G"))
        {
            if(ia1.getText().equals(" x"))
            {
                ia1.setText(" 1");ia3.setText(" x");
            }
            else if(ia1.getText().equals(" 1"))
            {
                ia1.setText(" 0");ia3.setText(" x");
            }
            else
            {
                ia1.setText(" x");ia3.setText(" x");
            
            }
            
        }
        else
        {
            connect();
        }
        }
        else if(s.equals("ia2"))
        {
            if(ia14.getText().equals(" v")&&ia7.getText().equals("G"))
        {
        if(ia2.getText().equals(" x"))
            {
                ia2.setText(" 1");ia3.setText(" x");
            }
            else if(ia2.getText().equals(" 1"))
            {
                ia2.setText(" 0");ia3.setText(" x");
            }
            else
            {
                ia2.setText(" x");ia3.setText(" x");
            
            }
        }
        else
        {
            connect();
        }
        
        }
        else if(s.equals("ia4"))
        {
        if(ia14.getText().equals(" v")&&ia7.getText().equals("G"))
        {
        if(ia4.getText().equals(" x"))
            {
                ia4.setText(" 1");ia6.setText(" x");
            }
            else if(ia4.getText().equals(" 1"))
            {
                ia4.setText(" 0");ia6.setText(" x");
            }
            else
            {
                ia4.setText(" x");ia6.setText(" x");
            
            }
        }
        else
        {
            connect();
        }
        }
        else if(s.equals("ia5"))
        {
        if(ia14.getText().equals(" v")&&ia7.getText().equals("G"))
        {
            if(ia5.getText().equals(" x"))
            {
                ia5.setText(" 1");ia6.setText(" x");
            }
            else if(ia5.getText().equals(" 1"))
            {
                ia5.setText(" 0");ia6.setText(" x");
            }
            else
            {
                ia5.setText(" x");ia6.setText(" x");
            
            }
        
        }
        else
        {
            connect();
        }
        }
        else if(s.equals("ia9"))
        {
        if(ia14.getText().equals(" v")&&ia7.getText().equals("G"))
        {
            if(ia9.getText().equals(" x"))
            {
                ia9.setText(" 1");ia8.setText(" x");
            }
            else if(ia9.getText().equals(" 1"))
            {
                ia9.setText(" 0");ia8.setText(" x");
            }
            else
            {
                ia9.setText(" x");ia8.setText(" x");
            
            }
        }
        else
        {
            connect();
        }
        }
        else if(s.equals("ia10"))
        {
        if(ia14.getText().equals(" v")&&ia7.getText().equals("G"))
        {
            if(ia10.getText().equals(" x"))
            {
                ia10.setText(" 1");ia8.setText(" x");
            }
            else if(ia10.getText().equals(" 1"))
            {
                ia10.setText(" 0");ia8.setText(" x");
            }
            else
            {
                ia10.setText(" x");ia8.setText(" x");
            
            }
        
        }
        else
        {
            connect();
        }
        }
        else if(s.equals("ia12"))
        {
        if(ia14.getText().equals(" v")&&ia7.getText().equals("G"))
        {
        if(ia12.getText().equals(" x"))
            {
                ia12.setText(" 1");ia11.setText(" x");
            }
            else if(ia12.getText().equals(" 1"))
            {
                ia12.setText(" 0");ia11.setText(" x");
            }
            else
            {
                ia12.setText(" x");ia11.setText(" x");
            
            }
        }
        else
        {
            connect();
        }
        }
        else if(s.equals("ia13"))
        {
        if(ia14.getText().equals(" v")&&ia7.getText().equals("G"))
        {
            if(ia13.getText().equals(" x"))
            {
                ia13.setText(" 1");ia11.setText(" x");
            }
            else if(ia13.getText().equals(" 1"))
            {
                ia13.setText(" 0");ia11.setText(" x");
            }
            else
            {
                ia13.setText(" x");ia11.setText(" x");
            
            }
        
        }
        else
        {
            connect();
        }
        }
        if(ia14.getText().equals(" v")&&ia7.getText().equals("G"))
        {
        if(ia1.getText().equals(" 1")&&ia2.getText().equals(" 1"))
        {
                ia3.setText(" 1");
            
        }
        else if(ia1.getText().equals(" x")||ia2.getText().equals(" x"))
        {
        
            ia3.setText(" x");
        }
        else
        {
                ia3.setText(" 0");
        }
        if(ia4.getText().equals(" 1")&&ia5.getText().equals(" 1"))
        {
                ia6.setText(" 1");
            
        }
        else if(ia4.getText().equals(" x")||ia5.getText().equals(" x"))
        {
        
            ia6.setText(" x");
        }
        else
        {
                ia6.setText(" 0");
        }
        if(ia9.getText().equals(" 1")&&ia10.getText().equals(" 1"))
        {
                ia8.setText(" 1");
            
        }
        else if(ia9.getText().equals(" x")||ia10.getText().equals(" x"))
        {
        
            ia8.setText(" x");
        }
        else
        {
                ia8.setText(" 0");
        }
        if(ia13.getText().equals(" 1")&&ia12.getText().equals(" 1"))
        {
                ia11.setText(" 1");
            
        }
        else if(ia13.getText().equals(" x")||ia12.getText().equals(" x"))
        {
        
            ia11.setText(" x");
        }
        else
        {
                ia11.setText(" 0");
        }
        }
    }
    public void connect()
    {
    if(ia14.getText().equals(" v")&&!"G".equals(ia7.getText()))
            {
        JOptionPane.showMessageDialog(null,"connect 7 to Ground");
            }
            else if(!" v".equals(ia14.getText())&&ia7.getText().equals("G"))
            {
             JOptionPane.showMessageDialog(null,"connect 14 to Vcc");
            }
            else
            {
             JOptionPane.showMessageDialog(null,"connect 14 to Vcc and 7 to Ground");
            }
    }
   
}
