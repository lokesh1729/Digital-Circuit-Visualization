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
import javax.swing.JPanel;

/**
 *
 * @author rgukt
 */
public class cconverter implements ActionListener{

    public static void main(String arg[])
    {
        cconverter cn = new cconverter();
    }
     
    private JButton p1,m1,p2,bg,gb,b7,b3,nor,nand;
    private JButton and1,or1,not1,nor1,nand1,xor1,xnor1,bc1;
    private JLabel l1,l2,l3,lbg,lgb,lb7,lb3,lnor,lnand;
    private JLabel land1,lor1,lnot1,lnor1,lnand1,lxor1,lxnor1,lbc1;
    private JPanel pa1,pa2,pa3,pa4,pa5,pa6;
    private JPanel pan1,pan2,pan3,pan4,pan5,pan6,pan7,pan8;
    private JFrame frame;
    
    public cconverter()
    {
        p1 = new JButton("CODE CONVERTERS,MEMORY ELEMENTS & IC SPECIFICATIONS");
        p1.setBounds(0,0,950,30);
        p2 = new JButton("CSE01@Batch06");
        p2.setBounds(0,550,950,20);
        m1 = new JButton();
        m1.setBounds(470,30,5,520);
        //.........................................................................
        
        l1 = new JLabel("CODE CONVERTERS");
        l1.setBounds(30,60,300,30);
        l1.setFont(new Font("Serif", Font.BOLD, 14));
        l2 = new JLabel("MEMORY ELEMENTS");
        l2.setBounds(30,250,300,30);
        l2.setFont(new Font("Serif", Font.BOLD, 14));
        
        l3 = new JLabel("IC SPECIFICATION");
        l3.setBounds(540,60,300,30);
        l3.setFont(new Font("Serif", Font.BOLD, 14));
        
        pa1 = new JPanel();
        pa1.setBounds(20,90,400,30);
        pa1.setBackground(Color.gray);
        
        pa2 = new JPanel();
        pa2.setBounds(20,130,400,30);
        pa2.setBackground(Color.gray);
        
        pa3 = new JPanel();
        pa3.setBounds(20,170,400,30);
        pa3.setBackground(Color.gray);
        
        pa4 = new JPanel();
        pa4.setBounds(20,210,400,30);
        pa4.setBackground(Color.gray);
        
        
        lbg = new JLabel("  Binary  to  Gray  Converter");
        bg = new JButton("click here");
        bg.setBackground(Color.gray);
        bg.setForeground(Color.WHITE);
        bg.setActionCommand("1");
        bg.addActionListener(this);
        pa1.add(lbg);
        pa1.add(bg);
        
        lgb = new JLabel("  Gray  to  Binary Converter  ");
        gb = new JButton("click here");
        gb.setBackground(Color.gray);
        gb.setForeground(Color.WHITE);
        gb.setActionCommand("2");
        gb.addActionListener(this);
        pa2.add(lgb);
        pa2.add(gb);
        
        lb7 = new JLabel("BCD to 7-Segment Display");
        b7 = new JButton("click here");
        b7.setBackground(Color.gray);
        b7.setForeground(Color.WHITE);
        b7.setActionCommand("3");
        b7.addActionListener(this);
        pa3.add(lb7);
        pa3.add(b7);
        
        lb3 = new JLabel("BCD to EXCESS-3 Converter");
        b3 = new JButton("click here");
        b3.setBackground(Color.gray);
        b3.setForeground(Color.WHITE);
        b3.setActionCommand("4");
        b3.addActionListener(this);
        pa4.add(lb3);
        pa4.add(b3);
        
        //.........................................................................
        
        pa5 = new JPanel();
        pa5.setBounds(20,280,400,30);
        pa5.setBackground(Color.gray);
        
        pa6 = new JPanel();
        pa6.setBounds(20,320,400,30);
        pa6.setBackground(Color.gray);
        
        lnor = new JLabel("SR-Latch Using NOR ");
        nor = new JButton("click here");
        nor.setBackground(Color.gray);
        nor.setForeground(Color.WHITE);
        nor.setActionCommand("5");
        nor.addActionListener(this);
        pa5.add(lnor);
        pa5.add(nor);
        
        lnand = new JLabel("SR-Latch Using NAND");
        nand = new JButton("click here");
        nand.setBackground(Color.gray);
        nand.setForeground(Color.WHITE);
        nand.setActionCommand("6");
        nand.addActionListener(this);
        pa6.add(lnand);
        pa6.add(nand);
        //......................................................................
        
        
        pan1 = new JPanel();
        pan1.setBounds(500,90,400,30);
        pan1.setBackground(Color.gray);
        
        pan2 = new JPanel();
        pan2.setBounds(500,130,400,30);
        pan2.setBackground(Color.gray);
        
        pan3 = new JPanel();
        pan3.setBounds(500,170,400,30);
        pan3.setBackground(Color.gray);
        
        pan4 = new JPanel();
        pan4.setBounds(500,210,400,30);
        pan4.setBackground(Color.gray);
        
        pan5 = new JPanel();
        pan5.setBounds(500,250,400,30);
        pan5.setBackground(Color.gray);
        
        pan6 = new JPanel();
        pan6.setBounds(500,290,400,30);
        pan6.setBackground(Color.gray);
        
        pan7 = new JPanel();
        pan7.setBounds(500,330,400,30);
        pan7.setBackground(Color.gray);
        
        pan8 = new JPanel();
        pan8.setBounds(500,370,400,30);
        pan8.setBackground(Color.gray);
        
        land1 = new JLabel("AND IC(7408)");
        and1 = new JButton("click here");
        and1.setBackground(Color.gray);
        and1.setForeground(Color.WHITE);
        and1.setActionCommand("11");
        and1.addActionListener(this);
        pan1.add(land1);
        pan1.add(and1);
        
        lor1   = new JLabel(" OR IC(7432)");
        or1 = new JButton("click here");
        or1.setBackground(Color.gray);
        or1.setForeground(Color.WHITE);
        or1.setActionCommand("12");
        or1.addActionListener(this);
        pan2.add(lor1);
        pan2.add(or1);
        
        lnot1 = new JLabel("NOT IC(7404)");
        not1 = new JButton("click here");
        not1.setBackground(Color.gray);
        not1.setForeground(Color.WHITE);
        not1.setActionCommand("13");
        not1.addActionListener(this);
        pan3.add(lnot1);
        pan3.add(not1);
        
        lnand1 = new JLabel("NAND IC(7400)");
        nand1 = new JButton("click here");
        nand1.setBackground(Color.gray);
        nand1.setForeground(Color.WHITE);
        nand1.setActionCommand("14");
        nand1.addActionListener(this);
        pan4.add(lnand1);
        pan4.add(nand1);
        
        lnor1   = new JLabel("NOR IC(7402)");
        nor1 = new JButton("click here");
        nor1.setBackground(Color.gray);
        nor1.setForeground(Color.WHITE);
        nor1.setActionCommand("15");
        nor1.addActionListener(this);
        pan5.add(lnor1);
        pan5.add(nor1);
        
        lxor1   = new JLabel("EXOR IC(7486)");
        xor1 = new JButton("click here");
        xor1.setBackground(Color.gray);
        xor1.setForeground(Color.WHITE);
        xor1.setActionCommand("16");
        xor1.addActionListener(this);
        pan6.add(lxor1);
        pan6.add(xor1);
        
        lxnor1   = new JLabel("EXNOR IC(74266)");
        xnor1 = new JButton("click here");
        xnor1.setBackground(Color.gray);
        xnor1.setForeground(Color.WHITE);
        xnor1.setActionCommand("17");
        xnor1.addActionListener(this);
        pan7.add(lxnor1);
        pan7.add(xnor1);
        
        lbc1   = new JLabel("4Bit Comparator IC(7485)");
        bc1 = new JButton("click here");
        bc1.setBackground(Color.gray);
        bc1.setForeground(Color.WHITE);
        bc1.setActionCommand("18");
        bc1.addActionListener(this);
        pan8.add(lbc1);
        pan8.add(bc1);
        
        
        //.......................................................................
                frame =  new JFrame();
                frame.setLayout(null);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.setSize(new Dimension(950, 600));
                frame.setLocation(50,50);
                frame.setTitle("DIGITAL CIRCUITS VISUALISATION");
                frame.add(p1);
                frame.add(p2);
                frame.add(m1);
                frame.add(l1);
                frame.add(pa1);
                frame.add(pa2);
                frame.add(pa3);
                frame.add(pa4);
                frame.add(l2);
                frame.add(pa5);
                frame.add(pa6);
                frame.add(l3);
                frame.add(pan1);
                frame.add(pan2);
                frame.add(pan3);
                frame.add(pan4);
                frame.add(pan5);
                frame.add(pan6);
                frame.add(pan7);
                frame.add(pan8);
                
                
                frame.setVisible(true);
    
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet.");
        String s = e.getActionCommand();
        if(s.equals("1"))
        {
            btog bg = new btog();
        }
        else if(s.equals("2"))
        {
            gtob g = new gtob();
        }
        else if(s.equals("3"))
        {
            bcdto7segmentdisplay sd = new bcdto7segmentdisplay();
        }
        else if(s.equals("4"))
        {
            bcdt0excess3 bc = new bcdt0excess3();
        }
        else if(s.equals("5"))
        {
            norlatch nl = new norlatch();
        }
        else if(s.equals("6"))
        {
            nandlatch l = new nandlatch();
        }
        else if(s.equals("11"))
        {
            andic a = new andic();
        }
        else if(s.equals("12"))
        {
             oric a = new oric();
        }
        else if(s.equals("13"))
        {
               
        }
        else if(s.equals("14"))
        {
            nandic a = new nandic();
        }
        else if(s.equals("15"))
        {
            noric a = new noric();
        }
        else if(s.equals("16"))
        {
            xoric a = new xoric();
        }
        else if(s.equals("17"))
        {
            xnoric a = new xnoric();
        }
        else if(s.equals("18"))
        {
            fourbitcomparatoric a = new fourbitcomparatoric();
        }
        
        
    }
    
}
