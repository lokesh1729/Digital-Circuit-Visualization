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
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author manivmk
 */
public class kmap implements ActionListener{

    public static void main(String arg[])
    {
            kmap m = new kmap();
    }
    
    private JButton p1,m1,p2,b1,cont,compute;
    private JLabel label1,label2,l1,anser;
    private JPanel pa1,pa2,pa3,pa4;
    private JPanel paa1,paa2,paa3,paa4;
    private JPanel pan1,pan2,pan3;
    private JPanel paan1,paan2,paan3;
    
    private JFrame frame;
    
    private JButton r1,r2,r3,rr1,rr2,rr3,rrr1,rrr2,rrr3;
    private JButton ar1,ar2,ar3,arr1,arr2,arr3,arrr1,arrr2,arrr3;
    private JButton a1,a2,a3,a4,a5,a11,a12,a13,a14,a15,a21,a22,a23,a24,a25;
    private JButton aa1,aa2,aa3,aa4,aa5,aa11,aa12,aa13,aa14,aa15,aa21,aa22,aa23,aa24,aa25;
    
    public kmap()
    {
        p1 = new JButton("LOGIC MINIMIZATION USING KMAP");
        p1.setBounds(0,0,750,20);
        
        p2 = new JButton("CSE01@Batch06");
        p2.setBounds(0, 440, 750, 15);
        m1 = new JButton();
        m1.setBounds(340,20,5,450);
        
        //................................................................
        
        //........................................................................
        label1 = new JLabel("NUMBER OF VARIABLES");
        b1 = new JButton("2");
        b1.setActionCommand("num");
        b1.addActionListener(this);
        cont = new JButton("Continue");
        cont.setActionCommand("continue");
        cont.addActionListener(this);
        
        compute = new JButton("Compute");
        compute.setBounds(200,220,100,30);
        compute.setActionCommand("compute");
        compute.addActionListener(this);
        
        
        pa1 = new JPanel();
        pa1.setBounds(0,40,350,30);
        
        pa1.add(label1);
        pa1.add(b1);
        pa1.add(cont);
        
        
        
        label2 = new JLabel("Select minterms");
        label2.setBounds(20,80,300,30);
        
        pa2 = new JPanel();
        pa2.setBounds(10,110,250,30);
        
        r1= new JButton("A\\B");
        r1.setBackground(Color.WHITE);
        r2=new JButton(" 0 ");
        
        r2.setBackground(Color.WHITE);
        r3 = new JButton(" 1 ");
        r3.setBackground(Color.WHITE);
        
        pa2.add(r1);
        pa2.add(r2);
        pa2.add(r3);
        
        pa3 = new JPanel();
        pa3.setBounds(10,140,250,30);
        
        rr1= new JButton("  0  ");
        rr1.setBackground(Color.WHITE);
        rr2=new JButton(" 0 ");
        rr2.setActionCommand("r1");
        rr2.addActionListener(this);
        rr3 = new JButton(" 0 ");
        rr3.setActionCommand("r2");
        rr3.addActionListener(this);
        
        pa3.add(rr1);
        pa3.add(rr2);
        pa3.add(rr3);
        
        pa4 = new JPanel();
        pa4.setBounds(10,170,250,30);
        
        rrr1= new JButton("  1  ");
        rrr1.setBackground(Color.WHITE);
        rrr2=new JButton(" 0 ");
        rrr2.setActionCommand("r3");
        rrr2.addActionListener(this);
        rrr3 = new JButton(" 0 ");
        rrr3.setActionCommand("r4");
        rrr3.addActionListener(this);
        
        pa4.add(rrr1);
        pa4.add(rrr2);
        pa4.add(rrr3);
        //........................................................................
        
        
        paa2 = new JPanel();
        paa2.setBounds(390,110,250,30);
        
        ar1= new JButton("A\\B");
        ar1.setBackground(Color.WHITE);
        ar2=new JButton(" 0 ");
        
        ar2.setBackground(Color.WHITE);
        ar3 = new JButton(" 1 ");
        ar3.setBackground(Color.WHITE);
        
        paa2.add(ar1);
        paa2.add(ar2);
        paa2.add(ar3);
        
        paa3 = new JPanel();
        paa3.setBounds(390,140,250,30);
        
        arr1= new JButton("  0  ");
        arr1.setBackground(Color.WHITE);
        arr2=new JButton(" 0 ");
        arr2.setActionCommand("r1");
        arr2.addActionListener(this);
        arr3 = new JButton(" 0 ");
        arr3.setActionCommand("r2");
        arr3.addActionListener(this);
        
        paa3.add(arr1);
        paa3.add(arr2);
        paa3.add(arr3);
        
        paa4 = new JPanel();
        paa4.setBounds(390,170,250,30);
        
        arrr1= new JButton("  1  ");
        arrr1.setBackground(Color.WHITE);
        arrr2=new JButton(" 0 ");
        arrr2.setActionCommand("r3");
        arrr2.addActionListener(this);
        arrr3 = new JButton(" 0 ");
        arrr3.setActionCommand("r4");
        arrr3.addActionListener(this);
        
        paa4.add(arrr1);
        paa4.add(arrr2);
        paa4.add(arrr3);
        
        //.........................................................................
        pan1 = new JPanel();
        pan1.setBounds(0,110,340,30);
        
        a1= new JButton("A\\BC");
        a1.setBackground(Color.WHITE);
        a2=new JButton(" 00 ");
        a2.setBackground(Color.WHITE);
        a3 = new JButton(" 01 ");
        a3.setBackground(Color.WHITE);
        a4 = new JButton(" 11 ");
        a4.setBackground(Color.WHITE);
        a5 = new JButton(" 10 ");
        a5.setBackground(Color.WHITE);
        
        pan1.add(a1);
        pan1.add(a2);
        pan1.add(a3);
        pan1.add(a4);
        pan1.add(a5);
        
        //.......................................................................
        
         pan2 = new JPanel();
        pan2.setBounds(0,140,340,30);
        
        a11= new JButton("   0   ");
        a11.setBackground(Color.WHITE);
        a12=new JButton("  0  ");
        a12.setActionCommand("a1");
        a12.addActionListener(this);
        a13 = new JButton("  0  ");
        a13.setActionCommand("a2");
        a13.addActionListener(this);
        a14 = new JButton("  0  ");
        a14.setActionCommand("a3");
        a14.addActionListener(this);
        a15 = new JButton("  0  ");
        a15.setActionCommand("a4");
        a15.addActionListener(this);
        

        
        pan2.add(a11);
        pan2.add(a12);
        pan2.add(a13);
        pan2.add(a14);
        pan2.add(a15);
        
        
        
        //........................................................................
        
         pan3 = new JPanel();
        pan3.setBounds(0,170,340,30);
        
        a21= new JButton("   1   ");
        a21.setBackground(Color.WHITE);
        a22=new JButton("  0  ");
       a22.setActionCommand("a5");
        a22.addActionListener(this);
        a23 = new JButton("  0  ");
        a23.setActionCommand("a6");
        a23.addActionListener(this);
        a24 = new JButton("  0  ");
        a24.setActionCommand("a7");
        a24.addActionListener(this);
        a25 = new JButton("  0  ");
        a25.setActionCommand("a8");
        a25.addActionListener(this);

        
        pan3.add(a21);
        pan3.add(a22);
        pan3.add(a23);
        pan3.add(a24);
        pan3.add(a25);
        //......................................................................
        paan1 = new JPanel();
        paan1.setBounds(390,110,340,30);
        
        aa1= new JButton("A\\BC");
        aa1.setBackground(Color.WHITE);
        aa2=new JButton(" 00 ");
        aa2.setBackground(Color.WHITE);
        aa3 = new JButton(" 01 ");
        aa3.setBackground(Color.WHITE);
        aa4 = new JButton(" 11 ");
        aa4.setBackground(Color.WHITE);
        aa5 = new JButton(" 10 ");
        aa5.setBackground(Color.WHITE);
        
        paan1.add(aa1);
        paan1.add(aa2);
        paan1.add(aa3);
        paan1.add(aa4);
        paan1.add(aa5);
        
        //.......................................................................
        
         paan2 = new JPanel();
        paan2.setBounds(390,140,340,30);
        
        aa11= new JButton("   0   ");
        aa11.setBackground(Color.WHITE);
        aa12=new JButton("  0  ");
        aa12.setActionCommand("a1");
        aa12.addActionListener(this);
        aa13 = new JButton("  0  ");
        aa13.setActionCommand("a2");
        aa13.addActionListener(this);
        aa14 = new JButton("  0  ");
        aa14.setActionCommand("a3");
        aa14.addActionListener(this);
        aa15 = new JButton("  0  ");
        aa15.setActionCommand("a4");
        aa15.addActionListener(this);
        

        
        paan2.add(aa11);
        paan2.add(aa12);
        paan2.add(aa13);
        paan2.add(aa14);
        paan2.add(aa15);
        
        
        
        //........................................................................
        
         paan3 = new JPanel();
        paan3.setBounds(390,170,340,30);
        
        aa21= new JButton("   1   ");
        aa21.setBackground(Color.WHITE);
        aa22=new JButton("  0  ");
       aa22.setActionCommand("a5");
        aa22.addActionListener(this);
        aa23 = new JButton("  0  ");
        aa23.setActionCommand("a6");
        aa23.addActionListener(this);
        aa24 = new JButton("  0  ");
        aa24.setActionCommand("a7");
        aa24.addActionListener(this);
        aa25 = new JButton("  0  ");
        aa25.setActionCommand("a8");
        aa25.addActionListener(this);

        
        paan3.add(aa21);
        paan3.add(aa22);
        paan3.add(aa23);
        paan3.add(aa24);
        paan3.add(aa25);
        
        
        
        //........................................................................
    frame = new JFrame();
     frame.setLayout(null);
     frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
     frame.setSize(new Dimension(750, 500));
     frame.setLocation(50,50);
     frame.setTitle("DIGITAL CIRCUITS VISUALISATION");
     frame.add(p1);
     frame.add(p2);
     frame.add(m1);
     frame.add(pa1);
     /*frame.add(pa2);
     frame.add(pa3);
     frame.add(pa4);*/
     /*frame.add(pan1);
     frame.add(pan2);
     frame.add(pan3);*/
     frame.add(label2);
     frame.add(compute);
     frame.setVisible(true);
    
    }
    @Override
    public void actionPerformed(ActionEvent e) {
       // throw new UnsupportedOperationException("Not supported yet.");
        String s = e.getActionCommand();
        if(cont.getText().equals("Continue")){
        if(s.equals("num"))
        {
            if(b1.getText().equals("2"))
            {
                b1.setText("3");
            }
            else
            {
                b1.setText("2");
            }
        }}
        if(s.equals("continue"))
        {
            if(cont.getText().equals("Continue")){
            cont.setText("ok!");}
            else
            {
            JOptionPane.showMessageDialog(null,"Compute your inputs");
            }
        }
        if(cont.getText().equals("ok!")&&(compute.getText().equals("Compute")))
        {
            if(b1.getText().equals("2")){
            frame.add(pa2);
            frame.add(pa3);
            frame.add(pa4);
            frame.setVisible(true);
            if(s.equals("r1"))
            {
            if(rr2.getText().equals(" 0 "))
            {
                rr2.setText(" 1 ");rr2.setBackground(Color.red);arr2.setText(" 1 ");
            }
            else if(rr2.getText().equals(" 1 "))
            {
                rr2.setText(" X ");rr2.setBackground(Color.green);arr2.setText(" X ");
            }
            else
            {
                rr2.setText(" 0 ");;rr2.setBackground(null);arr2.setText(" 0 ");
            }
            }
            if(s.equals("r2"))
            {
            if(rr3.getText().equals(" 0 "))
            {
                rr3.setText(" 1 ");rr3.setBackground(Color.red);arr3.setText(" 1 ");
            }
            else if(rr3.getText().equals(" 1 "))
            {
                rr3.setText(" X ");rr3.setBackground(Color.green);arr3.setText(" X ");
            }
            else
            {
                rr3.setText(" 0 ");;rr3.setBackground(null);arr3.setText(" 0 ");
            }
            }
            if(s.equals("r3"))
            {
            if(rrr2.getText().equals(" 0 "))
            {
                rrr2.setText(" 1 ");rrr2.setBackground(Color.red);arrr2.setText(" 1 ");
            }
            else if(rrr2.getText().equals(" 1 "))
            {
                rrr2.setText(" X ");rrr2.setBackground(Color.green);arrr2.setText(" X ");
            }
            else
            {
                rrr2.setText(" 0 ");;rrr2.setBackground(null);arrr2.setText(" 0 ");
            }
            }
            if(s.equals("r4"))
            {
            if(rrr3.getText().equals(" 0 "))
            {
                rrr3.setText(" 1 ");rrr3.setBackground(Color.red);arrr3.setText(" 1 ");
            }
            else if(rr2.getText().equals(" 1 "))
            {
                rrr3.setText(" X ");rrr3.setBackground(Color.green);arrr3.setText(" X ");
            }
            else
            {
                rrr3.setText(" 0 ");;rrr3.setBackground(null);arrr3.setText(" 0 ");
            }
            }
            }
            else{
            frame.add(pan1);
            frame.add(pan2);
            frame.add(pan3);
            frame.setVisible(true);
             if(s.equals("a1"))
             {
                 if(a12.getText().equals("  0  "))
                 {
                     a12.setText("  1  ");a12.setBackground(Color.red);aa12.setText("  1  ");
                 }
                 else if(a12.getText().equals("  1  "))
                 {
                      a12.setText("  X  ");a12.setBackground(Color.GREEN);aa12.setText("  X  ");
                 }
                 else
                 {
                      a12.setText("  0  ");a12.setBackground(null);aa12.setText("  0  ");
                 }
                 
                 
             
             }
             if(s.equals("a2"))
             {
                 if(a13.getText().equals("  0  "))
                 {
                     a13.setText("  1  ");a13.setBackground(Color.red);aa13.setText("  1  ");
                 }
                 else if(a13.getText().equals("  1  "))
                 {
                      a13.setText("  X  ");a13.setBackground(Color.GREEN);aa13.setText("  X  ");
                 }
                 else
                 {
                      a13.setText("  0  ");a13.setBackground(null);aa13.setText("  0  ");
                 }
                 
                 
             
             }
            if(s.equals("a3"))
             {
                 if(a14.getText().equals("  0  "))
                 {
                     a14.setText("  1  ");a14.setBackground(Color.red);aa14.setText("  1  ");
                 }
                 else if(a14.getText().equals("  1  "))
                 {
                      a14.setText("  X  ");a14.setBackground(Color.GREEN);aa14.setText("  X  ");
                 }
                 else
                 {
                      a14.setText("  0  ");a14.setBackground(null);aa14.setText("  0  ");
                 }
                 
                 
             
             }
            if(s.equals("a4"))
             {
                 if(a15.getText().equals("  0  "))
                 {
                     a15.setText("  1  ");a15.setBackground(Color.red);aa15.setText("  1  ");
                 }
                 else if(a15.getText().equals("  1  "))
                 {
                      a15.setText("  X  ");a15.setBackground(Color.GREEN);aa15.setText("  X  ");
                 }
                 else
                 {
                      a15.setText("  0  ");a15.setBackground(null);aa15.setText("  0  ");
                 }
                 
                 
             
             }
            
            if(s.equals("a5"))
             {
                 if(a22.getText().equals("  0  "))
                 {
                     a22.setText("  1  ");a22.setBackground(Color.red);aa22.setText("  1  ");
                 }
                 else if(a22.getText().equals("  1  "))
                 {
                      a22.setText("  X  ");a22.setBackground(Color.GREEN);aa22.setText("  X  ");
                 }
                 else
                 {
                      a22.setText("  0  ");a22.setBackground(null);aa22.setText("  0  ");
                 }
                 
                 
             
             }
             if(s.equals("a6"))
             {
                 if(a23.getText().equals("  0  "))
                 {
                     a23.setText("  1  ");a23.setBackground(Color.red);aa23.setText("  1  ");
                 }
                 else if(a23.getText().equals("  1  "))
                 {
                      a23.setText("  X  ");a23.setBackground(Color.GREEN);aa23.setText("  X  ");
                 }
                 else
                 {
                      a23.setText("  0  ");a23.setBackground(null);aa23.setText("  0  ");
                 }
                 
                 
             
             }
            if(s.equals("a7"))
             {
                 if(a24.getText().equals("  0  "))
                 {
                     a24.setText("  1  ");a24.setBackground(Color.red);aa24.setText("  1  ");
                 }
                 else if(a24.getText().equals("  1  "))
                 {
                      a24.setText("  X  ");a24.setBackground(Color.GREEN);aa24.setText("  X  ");
                 }
                 else
                 {
                      a24.setText("  0  ");a24.setBackground(null);aa24.setText("  0  ");
                 }
                 
                 
             
             }
            if(s.equals("a8"))
             {
                 if(a25.getText().equals("  0  "))
                 {
                     a25.setText("  1  ");a25.setBackground(Color.red);aa25.setText("  1  ");
                 }
                 else if(a25.getText().equals("  1  "))
                 {
                      a25.setText("  X  ");a25.setBackground(Color.GREEN);aa25.setText("  X  ");
                 }
                 else
                 {
                      a25.setText("  0  ");a25.setBackground(null);aa25.setText("  0  ");
                 }
                 
                 
             
             }
            
            
            
            }
            
        }
        if(s.equals("compute"))
        {   if(compute.getText().equals("Compute")){
            compute.setText("CHECK");
            if(b1.getText().equals("2"))
            {
            frame.add(paa2);
            frame.add(paa3);
            frame.add(paa4);
            frame.setVisible(true);
            
            if(rr2.getText().equals(" 1 ")||rr2.getText().equals(" X "))
            {
                arr2.setBackground(Color.blue);
            }
            else
            {
                arr2.setBackground(Color.white);
            }
            if(rr3.getText().equals(" 1 ")||rr3.getText().equals(" X "))
            {
                arr3.setBackground(Color.blue);
            }
            else
            {
                arr3.setBackground(Color.white);
            }
            if(rrr2.getText().equals(" 1 ")||rrr2.getText().equals(" X "))
            {
                arrr2.setBackground(Color.blue);
            }
            else
            {
                arrr2.setBackground(Color.white);
            }
            if(rrr3.getText().equals(" 1 ")||rrr3.getText().equals(" X "))
            {
                arrr3.setBackground(Color.blue);
            }
            else
            {
                arrr3.setBackground(Color.white);
            }
            
            }
            else
            {
            
                frame.add(paan1);
                frame.add(paan2);
                frame.add(paan3);
                frame.setVisible(true);
                
                if(a12.getText().equals("  1  ")||a12.getText().equals("  X  "))
                {
                    aa12.setBackground(Color.blue);
                }
                else
                {
                    aa12.setBackground(Color.white);
                }
                if(a13.getText().equals("  1  ")||a13.getText().equals("  X  "))
                {
                    aa13.setBackground(Color.blue);
                }
                else
                {
                    aa13.setBackground(Color.white);
                }
                if(a14.getText().equals("  1  ")||a14.getText().equals("  X  "))
                {
                    aa14.setBackground(Color.blue);
                }
                else
                {
                    aa14.setBackground(Color.white);
                }
                if(a15.getText().equals("  1  ")||a15.getText().equals("  X  "))
                {
                    aa15.setBackground(Color.blue);
                }
                else
                {
                    aa15.setBackground(Color.white);
                }
                if(a22.getText().equals("  1  ")||a22.getText().equals("  X  "))
                {
                    aa22.setBackground(Color.blue);
                }
                else
                {
                    aa22.setBackground(Color.white);
                }
                if(a23.getText().equals("  1  ")||a23.getText().equals("  X  "))
                {
                    aa23.setBackground(Color.blue);
                }
                else
                {
                    aa23.setBackground(Color.white);
                }
                if(a24.getText().equals("  1  ")||a24.getText().equals("  X  "))
                {
                    aa24.setBackground(Color.blue);
                }
                else
                {
                    aa24.setBackground(Color.white);
                }
                if(a25.getText().equals("  1  ")||a25.getText().equals("  X  "))
                {
                    aa25.setBackground(Color.blue);
                }
                else
                {
                    aa25.setBackground(Color.white);
                }
            }
        
            }
            else
            {
            JOptionPane.showMessageDialog(null,"Processing");
            }
        }
        
    }
    
    
    
}
