

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


public class advcircuits implements ActionListener{
    
    public static void main(String arg[])
    {
        advcircuits adv = new advcircuits();
    }
    int sp =0;
    int st =0;
    int c=0;
    String w;
    private String string;
    private JButton top;
    private JButton mid1;
    private JButton mid2;
    private JButton tail;
    private JFrame frame;
   //..........................................................................
    private JButton c1;
    private JButton c2;
    private JButton ip1;
    private JButton ip2;
    private JButton ip3;
    private JButton ip4;
    private JButton ip5;
    
    private JLabel lip1;
    private JLabel lip2;
    private JLabel lip3;
    private JLabel lip4;
    private JLabel lip5;
    
    
    private JButton inp;
    private JButton out;
    private JButton cc;
    private JButton op1;
    private JButton op2;
    private JButton op3;
    private JButton op4;
    private JButton op5;
    
    private JLabel lop1;
    private JLabel lop2;
    private JLabel lop3;
    private JLabel lop4;
    private JLabel lop5;
    
    private JPanel pp1;
    private JPanel pl1;
    
    //..........................................................................
    
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
    private JLabel l1;
    private JLabel l2;
    private JLabel l3;
    private JLabel l4;
    private JLabel l5;
    private JLabel l6;
    private JLabel l7;
    private JLabel l8;
    private JLabel l9;
    private JLabel l10;
    private JLabel l11;
    private JLabel l12;
    private JLabel l13;
    private JLabel l14;
             
    //...........................................................................
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
   
   private JLabel la1;
   private JLabel la2;
    private JLabel la3;
    private JLabel la4;
    private JLabel la5;
    private JLabel la6;
    private JLabel la7;
    private JLabel la8;
    private JLabel la9;
    private JLabel la10;
    private JLabel la11;
    private JLabel la12;
    private JLabel la13;
    private JLabel la14;
   
    //...........................................................................
    private JButton ib1;
   private JButton ib2;
   private JButton ib3;
   private JButton ib4;
   private JButton ib5;
   private JButton ib6;
   private JButton ib7;
   private JButton ib8;
   private JButton ib9;
   private JButton ib10;
   private JButton ib11;
   private JButton ib12;
   private JButton ib13;
   private JButton ib14;
   
   private JLabel lb1;
    private JLabel lb2;
    private JLabel lb3;
    private JLabel lb4;
    private JLabel lb5;
    private JLabel lb6;
    private JLabel lb7;
    private JLabel lb8;
    private JLabel lb9;
    private JLabel lb10;
    private JLabel lb11;
    private JLabel lb12;
    private JLabel lb13;
    private JLabel lb14;
   
   //.............................................................................
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
   
   private JLabel lc1;
    private JLabel lc2;
    private JLabel lc3;
    private JLabel lc4;
    private JLabel lc5;
    private JLabel lc6;
    private JLabel lc7;
    private JLabel lc8;
    private JLabel lc9;
    private JLabel lc10;
    private JLabel lc11;
    private JLabel lc12;
    private JLabel lc13;
    private JLabel lc14;
   
   //.............................................................................
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
   
   private JLabel lf1;
    private JLabel lf2;
    private JLabel lf3;
    private JLabel lf4;
    private JLabel lf5;
    private JLabel lf6;
    private JLabel lf7;
    private JLabel lf8;
    private JLabel lf9;
    private JLabel lf10;
    private JLabel lf11;
    private JLabel lf12;
    private JLabel lf13;
    private JLabel lf14;
   
   //..............................................................................

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
   
   private JLabel lj1;
    private JLabel lj2;
    private JLabel lj3;
    private JLabel lj4;
    private JLabel lj5;
    private JLabel lj6;
    private JLabel lj7;
    private JLabel lj8;
    private JLabel lj9;
    private JLabel lj10;
    private JLabel lj11;
    private JLabel lj12;
    private JLabel lj13;
    private JLabel lj14;
   //...........................................................................
   
   private JButton adds;
   private JButton start;
   
   //...........................................................................
    public advcircuits()
    {
        top = new JButton("CIRCUIT DESIGNING");
        top.setBounds(0,0,1220,30);
        tail = new JButton("CSE01@Batch06");
        tail.setBounds(0,680,1220,20);
        mid1 = new JButton("");
        mid1.setBounds(220,30,10,650);
   //...........................................................................
        
        JLabel iplab = new JLabel("NUMBER OF INPUTS");
        iplab.setBounds(10,40,150,20);
        JLabel oplab = new JLabel("NUMBER OF OUTPUTS");
        oplab.setBounds(10,80,150,20);
        c1 = new JButton("2");
        c1.setActionCommand("num1");
        c1.addActionListener(this);
        c1.setBounds(150,40,50,30);
        c2 = new JButton("2");
        c2.setActionCommand("num2");
        c2.addActionListener(this);
        c2.setBounds(150,80,50,30);
        
        cc = new JButton("continue");
        cc.setBounds(80,120,120,40);
        cc.setActionCommand("cont");
        cc.addActionListener(this);
        JButton bb1 = new JButton("INPUTS");
        ip1 = new JButton(" 1");
        ip1.setActionCommand("ip1");
        ip1.addActionListener(this);
        ip2 = new JButton(" 1");
        ip2.setActionCommand("ip2");
        ip2.addActionListener(this);
        ip3 = new JButton(" 1");
        ip3.setActionCommand("ip3");
        ip3.addActionListener(this);
        ip4 = new JButton(" 1");
        ip4.setActionCommand("ip4");
        ip4.addActionListener(this);
        ip5 = new JButton(" 1");
        ip5.setActionCommand("ip5");
        ip5.addActionListener(this);
        
        lip1 = new JLabel("ip1");
        lip2 = new JLabel("ip2");
        lip3 = new JLabel("ip3");
        lip4 = new JLabel("ip4");
        lip5 = new JLabel("ip5");
        
        
        JButton bb2 = new JButton("OUTPUTS");
        op1 = new JButton(" 1");
        op1.setActionCommand("op1");
        op1.addActionListener(this);
        op2 = new JButton(" 1");
        op2.setActionCommand("op2");
        op2.addActionListener(this);
        op3 = new JButton(" 1");
        op3.setActionCommand("op3");
        op3.addActionListener(this);
        op4 = new JButton(" 1");
        op4.setActionCommand("op4");
        op4.addActionListener(this);
        op5 = new JButton(" 1");
        op5.setActionCommand("op5");
        op5.addActionListener(this);
        
        lop1 = new JLabel("op1");
        lop2 = new JLabel("op2");
        lop3 = new JLabel("op3");
        lop4 = new JLabel("op4");
        lop5 = new JLabel("op5");
        
        pp1 = new JPanel();
        pp1.setBounds(10,190,80,200);
        pp1.add(bb1);
        pp1.add(ip1);
        pp1.add(ip2);
        
        pl1 = new JPanel();
        pl1.setBounds(100,190,100,200);
        pl1.add(bb2);
        pl1.add(op1);
        pl1.add(op2);
        
     //.........................................................................
        
        adds = new JButton("ADD A CONNECTION");
        adds.setBounds(10,450,200,30);
        adds.setActionCommand("add");
        adds.addActionListener(this);
      //........................................................................
        
        start = new JButton("START");
        start.setBounds(80,500,100,30);
        start.setActionCommand("START");
        start.addActionListener(this);
        
      //........................................................................  
        JButton and7408 = new JButton("IC 7408");
        and7408.setBounds(270, 90, 380, 100);
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
       
       
       l1 = new JLabel("i1");
       l2 = new JLabel("i2");
       l3 = new JLabel("i3");
       l4 = new JLabel("i4");
       l5 = new JLabel("i5");
       l6 = new JLabel("i6");
       l7 = new JLabel("i7");
       l8 = new JLabel("i8");
       l9 = new JLabel("i9");
       l10 = new JLabel("i10");
       l11 = new JLabel("i11");
       l12 = new JLabel("i12");
       l13 = new JLabel("i13");
       l14 = new JLabel("i14");
       
       
       
       
       
       
        JPanel pan1 = new JPanel();
        pan1.setBounds(260,190,400,30);
        pan1.add(i1);
        pan1.add(i2);
        pan1.add(i3);
        pan1.add(i4);
        pan1.add(i5);
        pan1.add(i6);
        pan1.add(i7);
        
        JPanel pan2 = new JPanel();
        pan2.setBounds(260,55,400,30);
        pan2.add(i14);
        pan2.add(i13);
        pan2.add(i12);
        pan2.add(i11);
        pan2.add(i10);
        pan2.add(i9);
        pan2.add(i8);
        
        
      //........................................................................
        
        JButton and74081 = new JButton("IC 7408");
        and74081.setBounds(700, 90, 380, 100);
        and74081.setFont(new Font("Serif", Font.BOLD, 20));
        
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
       
       la1 = new JLabel("ia1");
       la2 = new JLabel("ia2");
       la3 = new JLabel("ia3");
       la4 = new JLabel("ia4");
       la5 = new JLabel("ia5");
       la6 = new JLabel("ia6");
       la7 = new JLabel("ia7");
       la8 = new JLabel("ia8");
       la9 = new JLabel("ia9");
       la10 = new JLabel("ia10");
       la11 = new JLabel("ia11");
       la12 = new JLabel("ia12");
       la13 = new JLabel("ia13");
       la14 = new JLabel("ia14");
       
        JPanel pann1 = new JPanel();
        pann1.setBounds(690,190,400,30);
        pann1.add(ia1);
        pann1.add(ia2);
        pann1.add(ia3);
        pann1.add(ia4);
        pann1.add(ia5);
        pann1.add(ia6);
        pann1.add(ia7);
        
        JPanel pann2 = new JPanel();
        pann2.setBounds(690,55,400,30);
        pann2.add(ia14);
        pann2.add(ia13);
        pann2.add(ia12);
        pann2.add(ia11);
        pann2.add(ia10);
        pann2.add(ia9);
        pann2.add(ia8);
      //........................................................................
        
        JButton and74082 = new JButton("IC 7432");
        and74082.setBounds(270, 270, 380, 100);
        and74082.setFont(new Font("Serif", Font.BOLD, 20));
        
       ib1 = new JButton(" 1");
       ib1.setActionCommand("ib1");
       ib1.addActionListener(this);
       ib2 = new JButton(" 2");
       ib2.setActionCommand("ib2");
       ib2.addActionListener(this);
       ib3 = new JButton(" 3");
       ib3.setActionCommand("ib3");
       ib3.addActionListener(this);
       ib4 = new JButton(" 4");
       ib4.setActionCommand("ib4");
       ib4.addActionListener(this);
       ib5 = new JButton(" 5");
       ib5.setActionCommand("ib5");
       ib5.addActionListener(this);
       ib6 = new JButton(" 6");
       ib6.setActionCommand("ib6");
       ib6.addActionListener(this);
       ib7 = new JButton(" 7");
       ib7.setActionCommand("gr2");
       ib7.addActionListener(this);
       ib8 = new JButton(" 8");
       ib8.setActionCommand("ib8");
       ib8.addActionListener(this);
       ib9 = new JButton("9");
       ib9.setActionCommand("ib9");
       ib9.addActionListener(this);
       ib10 = new JButton("10");
       ib10.setActionCommand("ib10");
       ib10.addActionListener(this);
       ib11 = new JButton("11");
       ib11.setActionCommand("ib11");
       ib11.addActionListener(this);
       ib12 = new JButton("12");
       ib12.setActionCommand("ib12");
       ib12.addActionListener(this);
       ib13 = new JButton("13");
       ib13.setActionCommand("ib13");
       ib13.addActionListener(this);
       ib14 = new JButton("14");
       ib14.setActionCommand("vcc2");
       ib14.addActionListener(this);
       
       lb1 = new JLabel("ib1");
       lb2 = new JLabel("ib2");
       lb3 = new JLabel("ib3");
       lb4 = new JLabel("ib4");
       lb5 = new JLabel("ib5");
       lb6 = new JLabel("ib6");
       lb7 = new JLabel("ib7");
       lb8 = new JLabel("ib8");
       lb9 = new JLabel("ib9");
       lb10 = new JLabel("ib10");
       lb11 = new JLabel("ib11");
       lb12 = new JLabel("ib12");
       lb13 = new JLabel("ib13");
       lb14 = new JLabel("ib14");
       
        JPanel pana1 = new JPanel();
        pana1.setBounds(260,370,400,30);
        pana1.add(ib1);
        pana1.add(ib2);
        pana1.add(ib3);
        pana1.add(ib4);
        pana1.add(ib5);
        pana1.add(ib6);
        pana1.add(ib7);
        
        JPanel pana2 = new JPanel();
        pana2.setBounds(260,235,400,30);
        pana2.add(ib14);
        pana2.add(ib13);
        pana2.add(ib12);
        pana2.add(ib11);
        pana2.add(ib10);
        pana2.add(ib9);
        pana2.add(ib8);
        
        
   //...........................................................................
        
         JButton and7404 = new JButton("IC 7404");
        and7404.setBounds(700, 270, 380, 100);
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
       
       lc1 = new JLabel("ic1");
       lc2 = new JLabel("ic2");
       lc3 = new JLabel("ic3");
       lc4 = new JLabel("ic4");
       lc5 = new JLabel("ic5");
       lc6 = new JLabel("ic6");
       lc7 = new JLabel("ic7");
       lc8 = new JLabel("ic8");
       lc9 = new JLabel("ic9");
       lc10 = new JLabel("ic10");
       lc11 = new JLabel("ic11");
       lc12 = new JLabel("ic12");
       lc13 = new JLabel("ic13");
       lc14 = new JLabel("ic14");
       
        JPanel panc1 = new JPanel();
        panc1.setBounds(690,370,400,30);
        panc1.add(ic1);
        panc1.add(ic2);
        panc1.add(ic3);
        panc1.add(ic4);
        panc1.add(ic5);
        panc1.add(ic6);
        panc1.add(ic7);
        
        JPanel panc2 = new JPanel();
        panc2.setBounds(690,235,400,30);
        panc2.add(ic14);
        panc2.add(ic13);
        panc2.add(ic12);
        panc2.add(ic11);
        panc2.add(ic10);
        panc2.add(ic9);
        panc2.add(ic8);
        //.........................................................................
        
         JButton and74085 = new JButton("IC 7400");
        and74085.setBounds(270, 450, 380, 100);
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
       
       lf1 = new JLabel("if1");
       lf2 = new JLabel("if2");
       lf3 = new JLabel("if3");
       lf4 = new JLabel("if4");
       lf5 = new JLabel("if5");
       lf6 = new JLabel("if6");
       lf7 = new JLabel("if7");
       lf8 = new JLabel("if8");
       lf9 = new JLabel("if9");
       lf10 = new JLabel("if10");
       lf11 = new JLabel("if11");
       lf12 = new JLabel("if12");
       lf13 = new JLabel("if13");
       lf14 = new JLabel("if14");
       
        JPanel pand1 = new JPanel();
        pand1.setBounds(260,550,400,30);
        pand1.add(if1);
        pand1.add(if2);
        pand1.add(if3);
        pand1.add(if4);
        pand1.add(if5);
        pand1.add(if6);
        pand1.add(if7);
        
        JPanel pand2 = new JPanel();
        pand2.setBounds(260,415,400,30);
        pand2.add(if14);
        pand2.add(if13);
        pand2.add(if12);
        pand2.add(if11);
        pand2.add(if10);
        pand2.add(if9);
        pand2.add(if8);
        
        //.......................................................................
        
        JButton and74089 = new JButton("IC 7486");
        and74089.setBounds(700, 450, 380, 100);
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
       
       lj1 = new JLabel("ij1");
       lj2 = new JLabel("ij2");
       lj3 = new JLabel("ij3");
       lj4 = new JLabel("ij4");
       lj5 = new JLabel("ij5");
       lj6 = new JLabel("ij6");
       lj7 = new JLabel("ij7");
       lj8 = new JLabel("ij8");
       lj9 = new JLabel("ij9");
       lj10 = new JLabel("ij10");
       lj11 = new JLabel("ij11");
       lj12 = new JLabel("ij12");
       lj13 = new JLabel("ij13");
       lj14 = new JLabel("ij14");
       
        JPanel pans1 = new JPanel();
        pans1.setBounds(690,550,400,30);
        pans1.add(ij1);
        pans1.add(ij2);
        pans1.add(ij3);
        pans1.add(ij4);
        pans1.add(ij5);
        pans1.add(ij6);
        pans1.add(ij7);
        
        JPanel pans2 = new JPanel();
        pans2.setBounds(690,415,400,30);
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
     frame.setSize(new Dimension(1220, 750));
     frame.setLocation(50,50);
     frame.setTitle("DIGITAL CIRCUITS VISUALISATION");
     frame.add(top);
     frame.add(tail);
     frame.add(mid1);
     frame.add(iplab);
     frame.add(oplab);
     frame.add(c1);
     frame.add(c2);
     frame.add(cc);
     frame.add(adds);
     frame.add(start);
     
     
     frame.add(and7408);
     frame.add(pan1);
     frame.add(pan2);
     
     frame.add(and74081);
     frame.add(pann1);
     frame.add(pann2);
     
     frame.add(and74082);
     frame.add(pana1);
     frame.add(pana2);
    
     frame.add(and7404);
     frame.add(panc1);
     frame.add(panc2);
     
     frame.add(and74085);
     frame.add(pand1);
     frame.add(pand2);
     
      frame.add(and74089);
     frame.add(pans1);
     frame.add(pans2);
    frame.setVisible(true);
    
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet.");
        String k = e.getActionCommand();
        String s = e.getActionCommand();
        
        
        //.....................................................................
        if("num1".equals(k))
        {if(cc.getText().equals("continue")){
            if(c1.getText().equals("2"))
            {
                c1.setText("3");
            }
            else if(c1.getText().equals("3"))
            {
                c1.setText("4");
            }
            else if(c1.getText().equals("4"))
            {
                c1.setText("5");
            }
            else 
            {
                c1.setText("2");
            }}
        }
        else if("num2".equals(k))
        {if(cc.getText().equals("continue")){
        if(c2.getText().equals("2"))
            {
                c2.setText("3");
            }
            else if(c2.getText().equals("3"))
            {
                c2.setText("4");
            }
            else if(c2.getText().equals("4"))
            {
                c2.setText("5");
            }
            else 
            {
                c2.setText("2");
            }}
        }
        else if("cont".equals(k))
        {
            if(cc.getText().equals("continue"))
            {
                if(c1.getText().equals("3"))
                {
                
                pp1.add(ip3);
                frame.add(pp1);
                frame.setVisible(true);
                }
                else if(c1.getText().equals("4"))
                { 
                    pp1.add(ip3);
                    pp1.add(ip4);
                frame.add(pp1);
                frame.setVisible(true);
                
                }
                else if(c1.getText().equals("5"))
                { 
                    pp1.add(ip3);
                    pp1.add(ip4);
                    pp1.add(ip5);
                frame.add(pp1);
                frame.setVisible(true);
                }
                else
                {
                    
                frame.add(pp1);
                frame.setVisible(true);
                
                }
                if(c2.getText().equals("3"))
                {
                     
    
        pl1.add(op3);
        
        frame.add(pl1);
            frame.setVisible(true);    
                }
                else if(c2.getText().equals("4"))
                {    pl1.add(op3);
        pl1.add(op4);
    
        frame.add(pl1);
            frame.setVisible(true); 
                
                }
                else if(c2.getText().equals("5"))
                {
                    pl1.add(op3);
        pl1.add(op4);
       pl1.add(op5);
        frame.add(pl1);
            frame.setVisible(true); 
                
                }
                else 
                {
                frame.add(pl1);
            frame.setVisible(true); 
                }
                cc.setText("ok!");
            
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Check your inputs");
            }
        
        }
        if(k.equals("START"))
        {
            if(start.getText().equals("START"))
            {
                start.setText("STOP");
                adds.setText("-----------");
                st=1;
                set();
            
            
            }
            else
            {
            st = 0;
            start.setText("START");
            adds.setText("ADD A CONNECTION");
            l1.setText("i1");
       l2.setText("i2");
       l3.setText("i3");
       l4.setText("i4");
       l5.setText("i5");
       l6.setText("i6");
       l7.setText("i7");
       l8.setText("i8");
       l9.setText("i9");
       l10.setText("i10");
       l11.setText("i11");
       l12.setText("i12");
       l13.setText("i13");
       l14.setText("i14");
       
       la1.setText("ia1");
       la2.setText("ia2");
       la3.setText("ia3");
       la4.setText("ia4");
       la5.setText("ia5");
       la6.setText("ia6");
       la7.setText("ia7");
       la8.setText("ia8");
       la9.setText("ia9");
       la10.setText("ia10");
       la11.setText("ia11");
       la12.setText("ia12");
       la13.setText("ia13");
       la14.setText("ia14");
       
       lb1.setText("ib1");
       lb2.setText("ib2");
       lb3.setText("ib3");
       lb4.setText("ib4");
       lb5.setText("ib5");
       lb6.setText("ib6");
       lb7.setText("ib7");
       lb8.setText("ib8");
       lb9.setText("ib9");
       lb10.setText("ib10");
       lb11.setText("ib11");
       lb12.setText("ib12");
       lb13.setText("ib13");
       lb14.setText("ib14");
       
       lc1.setText("ic1");
       lc2.setText("ic2");
       lc3.setText("ic3");
       lc4.setText("ic4");
       lc5.setText("ic5");
       lc6.setText("ic6");
       lc7.setText("ic7");
       lc8.setText("ic8");
       lc9.setText("ic9");
       lc10.setText("ic10");
       lc11.setText("ic11");
       lc12.setText("ic12");
       lc13.setText("ic13");
       lc14.setText("ic14");
       
       lf1.setText("if1");
       lf2.setText("if2");
       lf3.setText("if3");
       lf4.setText("if4");
       lf5.setText("if5");
       lf6.setText("if6");
       lf7.setText("if7");
       lf8.setText("if8");
       lf9.setText("if9");
       lf10.setText("if10");
       lf11.setText("if11");
       lf12.setText("if12");
       lf13.setText("if13");
       lf14.setText("if14");
       
       lj1.setText("ij1");
       lj2.setText("ij2");
       lj3.setText("ij3");
       lj4.setText("ij4");
       lj5.setText("ij5");
       lj6.setText("ij6");
       lj7.setText("ij7");
       lj8.setText("ij8");
       lj9.setText("ij9");
       lj10.setText("ij10");
       lj11.setText("ij11");
       lj12.setText("ij12");
       lj13.setText("ij13");
       lj14.setText("ij14");
       
       
        JOptionPane.showMessageDialog(null,"U LOST UR CONNECTIONS");
            }
        }
        
        //....................................................................
        if(st==1)
        {
            if(k.equals("ip1"))
            {
            if(ip1.getText().equals(" 1"))
            {
                ip1.setText(" 0");
                string = "ip1";
                change0();
                
            }
            else if(ip1.getText().equals(" 0"))
            {
                ip1.setText(" x");
                string = "ip1";
                changex();
            }
            else 
            {
                ip1.setText(" 1");
                string = "ip1";
                change1();
            
            }
        }
        else if(k.equals("ip2"))
        {
        if(ip2.getText().equals(" 1"))
            {
                ip2.setText(" 0");
                string = "ip2";
                change0();
                
            }
            else if(ip2.getText().equals(" 0"))
            {
                ip2.setText(" x");
                string = "ip2";
                changex();
            }
            else 
            {
                ip2.setText(" 1");
                string = "ip2";
                change1();
            
            }
        }
        else if(k.equals("ip3"))
        {
        if(ip3.getText().equals(" 1"))
            {
                ip3.setText(" 0");
                string = "ip3";
                change0();
            }
            else if(ip3.getText().equals(" 0"))
            {
                ip3.setText(" x");string = "ip3";
                changex();
            }
            else 
            {
                ip3.setText(" 1");
                string = "ip1";
                change1();
            }
        }
        else if(k.equals("ip4"))
        {
        if(ip4.getText().equals(" 1"))
            {
                ip4.setText(" 0");
                string = "ip4";
                change0();
                
            }
            else if(ip4.getText().equals(" 0"))
            {
                ip4.setText(" x");
                string = "ip4";
                changex();
            }
            else 
            {
                ip4.setText(" 1");
                string = "ip4";
                change1();
            
            }
        
        }
        else if(k.equals("ip5"))
        {
        if(ip5.getText().equals(" 1"))
            {
                ip5.setText(" 0");
                string = "ip5";
                change0();
                
            }
            else if(ip5.getText().equals(" 0"))
            {
                ip5.setText(" x");
                string = "ip5";
                changex();
            }
            else 
            {
                ip5.setText(" 1");
                string = "ip5";
                change1();
            
            }
        
        }
         if(l1.getText().equals("i1"))
            {if(k.equals("i1")){
            if(i1.getText().equals(" x"))
            {
                i1.setText(" 1");i3.setText(" x");
            }
            else if(i1.getText().equals(" 1"))
            {
                i1.setText(" 0");i3.setText(" x");
            }
            else
            {
                i1.setText(" x");i3.setText(" x");
            
            }}
            }
            else
            {
                if(l1.getText().equals("ip1"))
                {
                   String h = ip1.getText();
                   i1.setText(h);
                }
                else if(l1.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   i1.setText(h);
                }
                else if(l1.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   i1.setText(h);
                }
                else if(l1.getText().equals("ip3"))
                {
                    String h = ip3.getText();
                   i1.setText(h);
                }
                else if(l1.getText().equals("ip4"))
                {
                    String h = ip4.getText();
                   i1.setText(h);
                }
                else if(l1.getText().equals("ip5"))
                {
                    String h = ip5.getText();
                   i1.setText(h);
                }
                else if(l1.getText().equals("i3"))
                {
                    String h = i3.getText();
                   i1.setText(h);
                }
                else if(l1.getText().equals("i6"))
                {
                    String h = i6.getText();
                   i1.setText(h);
                }
                else if(l1.getText().equals("i8"))
                {
                    String h = i8.getText();
                   i1.setText(h);
                }
                else if(l1.getText().equals("i11"))
                {
                    String h = i11.getText();
                   i1.setText(h);
                }
                and11op();
            }
         
         
         
            if(l2.getText().equals("i2"))
            {if(k.equals(i2)){
            if(i2.getText().equals(" x"))
            {
                i2.setText(" 1");i3.setText(" x");
            }
            else if(i2.getText().equals(" 1"))
            {
                i2.setText(" 0");i3.setText(" x");
            }
            else
            {
                i2.setText(" x");i3.setText(" x");
            
            }}
            }
            else
            {
                if(l2.getText().equals("ip1"))
                {
                   String h = ip1.getText();
                   i2.setText(h);
                }
                else if(l2.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   i2.setText(h);
                }
                else if(l2.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   i2.setText(h);
                }
                else if(l2.getText().equals("ip3"))
                {
                    String h = ip3.getText();
                   i2.setText(h);
                }
                else if(l2.getText().equals("ip4"))
                {
                    String h = ip4.getText();
                   i2.setText(h);
                }
                else if(l2.getText().equals("ip5"))
                {
                    String h = ip5.getText();
                   i2.setText(h);
                }
                else if(l2.getText().equals("i3"))
                {
                    String h = i3.getText();
                   i2.setText(h);
                }
                else if(l2.getText().equals("i6"))
                {
                    String h = i6.getText();
                   i2.setText(h);
                }
                else if(l2.getText().equals("i8"))
                {
                    String h = i8.getText();
                   i2.setText(h);
                }
                else if(l2.getText().equals("i11"))
                {
                    String h = i11.getText();
                   i2.setText(h);
                }
                and11op();
                
            }
            if(i1.getText().equals(" 1")&&i2.getText().equals(" 1"))
            {
                i3.setText(" 1");
                string = "i3";
                change1();
            
                }
                else if(i1.getText().equals(" x")||i2.getText().equals(" x"))
                {
        
            i3.setText(" x");string = "i3";
                changex();
            }
                else
                {
                i3.setText(" 0");string = "i3";
                change0();
                }
            if(l4.getText().equals("i4"))
            {if(k.equals("i4")){
            if(i4.getText().equals(" x"))
            {
                i4.setText(" 1");i6.setText(" x");
            }
            else if(i4.getText().equals(" 1"))
            {
                i4.setText(" 0");i6.setText(" x");
            }
            else
            {
                i4.setText(" x");i6.setText(" x");
            
            }}
            }
            else
            {
                if(l4.getText().equals("ip1"))
                {
                   String h = ip1.getText();
                   i4.setText(h);
                }
                else if(l4.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   i4.setText(h);
                }
                else if(l4.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   i4.setText(h);
                }
                else if(l4.getText().equals("ip3"))
                {
                    String h = ip3.getText();
                   i4.setText(h);
                }
                else if(l4.getText().equals("ip4"))
                {
                    String h = ip4.getText();
                   i4.setText(h);
                }
                else if(l4.getText().equals("ip5"))
                {
                    String h = ip5.getText();
                   i4.setText(h);
                }
                else if(l4.getText().equals("i3"))
                {
                    String h = i6.getText();
                   i4.setText(h);
                }
                else if(l4.getText().equals("i6"))
                {
                    String h = i6.getText();
                   i4.setText(h);
                }
                else if(l4.getText().equals("i8"))
                {
                    String h = i8.getText();
                   i4.setText(h);
                }
                else if(l4.getText().equals("i11"))
                {
                    String h = i11.getText();
                   i4.setText(h);
                }
                and12op();
            }
            
            if(l5.getText().equals("i5"))
            {if(k.equals("i5")){
            if(i5.getText().equals(" x"))
            {
                i5.setText(" 1");i6.setText(" x");
            }
            else if(i5.getText().equals(" 1"))
            {
                i5.setText(" 0");i6.setText(" x");
            }
            else
            {
                i5.setText(" x");i6.setText(" x");
            
            }}
            }
            else
            {
                if(l5.getText().equals("ip1"))
                {
                   String h = ip1.getText();
                   i5.setText(h);
                }
                else if(l5.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   i5.setText(h);
                }
                else if(l5.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   i5.setText(h);
                }
                else if(l5.getText().equals("ip3"))
                {
                    String h = ip3.getText();
                   i5.setText(h);
                }
                else if(l5.getText().equals("ip4"))
                {
                    String h = ip4.getText();
                   i5.setText(h);
                }
                else if(l5.getText().equals("ip5"))
                {
                    String h = ip5.getText();
                   i5.setText(h);
                }
                else if(l5.getText().equals("i3"))
                {
                    String h = i6.getText();
                   i5.setText(h);
                }
                else if(l5.getText().equals("i6"))
                {
                    String h = i6.getText();
                   i5.setText(h);
                }
                else if(l5.getText().equals("i8"))
                {
                    String h = i8.getText();
                   i5.setText(h);
                }
                else if(l5.getText().equals("i11"))
                {
                    String h = i11.getText();
                   i5.setText(h);
                }
              
                
                and12op();
                if(i4.getText().equals(" 1")&&i5.getText().equals(" 1"))
        {
                i6.setText(" 1");string = "i6";
                change1();
            
        }
        else if(i4.getText().equals(" x")||i5.getText().equals(" x"))
        {
        
            i6.setText(" x");string = "i6";
                changex();
        }
        else
        {
                i6.setText(" 0");string = "i6";
                change0();
        }
       
            }
            if(l9.getText().equals("i9"))
            {
                if(k.equals("i9")){
            if(i9.getText().equals(" x"))
            {
                i9.setText(" 1");i8.setText(" x");
            }
            else if(i9.getText().equals(" 1"))
            {
                i9.setText(" 0");i8.setText(" x");
            }
            else
            {
                i9.setText(" x");i8.setText(" x");
            
            }}
            }
            else
            {
                if(l9.getText().equals("ip1"))
                {
                   String h = ip1.getText();
                   i9.setText(h);
                }
                else if(l9.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   i9.setText(h);
                }
                else if(l9.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   i9.setText(h);
                }
                else if(l9.getText().equals("ip3"))
                {
                    String h = ip3.getText();
                   i9.setText(h);
                }
                else if(l9.getText().equals("ip4"))
                {
                    String h = ip4.getText();
                   i9.setText(h);
                }
                else if(l9.getText().equals("ip5"))
                {
                    String h = ip5.getText();
                   i9.setText(h);
                }
                else if(l9.getText().equals("i3"))
                {
                    String h = i6.getText();
                   i9.setText(h);
                }
                else if(l9.getText().equals("i6"))
                {
                    String h = i6.getText();
                   i9.setText(h);
                }
                else if(l9.getText().equals("i8"))
                {
                    String h = i8.getText();
                   i9.setText(h);
                }
                else if(l9.getText().equals("i11"))
                {
                    String h = i11.getText();
                   i9.setText(h);
                }
                and13op();
            }
            if(l10.getText().equals("i10"))
            {
		if(k.equals("i10")){
            if(i10.getText().equals(" x"))
            {
                i10.setText(" 1");i8.setText(" x");
            }
            else if(i10.getText().equals(" 1"))
            {
                i10.setText(" 0");i8.setText(" x");
            }
            else
            {
                i10.setText(" x");i8.setText(" x");
            
            }}
            }
            else
            {
                if(l10.getText().equals("ip1"))
                {
                   String h = ip1.getText();
                   i10.setText(h);
                }
                else if(l10.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   i10.setText(h);
                }
                else if(l10.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   i10.setText(h);
                }
                else if(l10.getText().equals("ip3"))
                {
                    String h = ip3.getText();
                   i10.setText(h);
                }
                else if(l10.getText().equals("ip4"))
                {
                    String h = ip4.getText();
                   i10.setText(h);
                }
                else if(l10.getText().equals("ip5"))
                {
                    String h = ip5.getText();
                   i10.setText(h);
                }
                else if(l10.getText().equals("i3"))
                {
                    String h = i6.getText();
                   i10.setText(h);
                }
                else if(l10.getText().equals("i6"))
                {
                    String h = i6.getText();
                   i10.setText(h);
                }
                else if(l10.getText().equals("i8"))
                {
                    String h = i8.getText();
                   i10.setText(h);
                }
                else if(l10.getText().equals("i11"))
                {
                    String h = i11.getText();
                   i10.setText(h);
                }
                and13op();
            }
             if(i9.getText().equals(" 1")&&i10.getText().equals(" 1"))
        {
                i8.setText(" 1");string = "i8";
                change1();
            
        }
        else if(i9.getText().equals(" x")||i10.getText().equals(" x"))
        {
        
            i8.setText(" x");string = "i8";
                changex();
        }
        else
        {
                i8.setText(" 0");string = "i8";
                change0();
        }
            
            if(l12.getText().equals("i12"))
            {
		if(k.equals("i12")){
            if(i12.getText().equals(" x"))
            {
                i12.setText(" 1");i11.setText(" x");
            }
            else if(i12.getText().equals(" 1"))
            {
                i12.setText(" 0");i11.setText(" x");
            }
            else
            {
                i12.setText(" x");i11.setText(" x");
            
            }}
            }
            else
            {
                if(l12.getText().equals("ip1"))
                {
                   String h = ip1.getText();
                   i12.setText(h);
                }
                else if(l12.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   i12.setText(h);
                }
                else if(l12.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   i12.setText(h);
                }
                else if(l12.getText().equals("ip3"))
                {
                    String h = ip3.getText();
                   i12.setText(h);
                }
                else if(l12.getText().equals("ip4"))
                {
                    String h = ip4.getText();
                   i12.setText(h);
                }
                else if(l12.getText().equals("ip5"))
                {
                    String h = ip5.getText();
                   i12.setText(h);
                }
                else if(l12.getText().equals("i3"))
                {
                    String h = i6.getText();
                   i12.setText(h);
                }
                else if(l12.getText().equals("i6"))
                {
                    String h = i6.getText();
                   i12.setText(h);
                }
                else if(l12.getText().equals("i8"))
                {
                    String h = i8.getText();
                   i12.setText(h);
                }
                else if(l12.getText().equals("i11"))
                {
                    String h = i11.getText();
                   i12.setText(h);
                }
                and14op();
            }
            if(l13.getText().equals("i13"))
            {
		if(k.equals("i13")){
            if(i13.getText().equals(" x"))
            {
                i13.setText(" 1");i11.setText(" x");
            }
            else if(i13.getText().equals(" 1"))
            {
                i13.setText(" 0");i11.setText(" x");
            }
            else
            {
                i13.setText(" x");i11.setText(" x");
            
            }}
            }
            else
            {
                if(l13.getText().equals("ip1"))
                {
                   String h = ip1.getText();
                   i13.setText(h);
                }
                else if(l13.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   i13.setText(h);
                }
                else if(l13.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   i13.setText(h);
                }
                else if(l13.getText().equals("ip3"))
                {
                    String h = ip3.getText();
                   i13.setText(h);
                }
                else if(l13.getText().equals("ip4"))
                {
                    String h = ip4.getText();
                   i13.setText(h);
                }
                else if(l13.getText().equals("ip5"))
                {
                    String h = ip5.getText();
                   i13.setText(h);
                }
                else if(l13.getText().equals("i3"))
                {
                    String h = i6.getText();
                   i13.setText(h);
                }
                else if(l13.getText().equals("i6"))
                {
                    String h = i6.getText();
                   i13.setText(h);
                }
                else if(l13.getText().equals("i8"))
                {
                    String h = i8.getText();
                   i13.setText(h);
                }
                else if(l13.getText().equals("i11"))
                {
                    String h = i11.getText();
                   i13.setText(h);
                }
                and14op();
            }
            if(i13.getText().equals(" 1")&&i12.getText().equals(" 1"))
        {
                i11.setText(" 1");string = "i11";
                change1();
            
        }
        else if(i13.getText().equals(" x")||i12.getText().equals(" x"))
        {
        
            i11.setText(" x");string = "i11";
                changex();
        }
        else
        {
                i11.setText(" 0");
                string = "i11";
                change0();
        }
         
if(la1.getText().equals("ia1"))
            {if(k.equals("ia1")){
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
            
            }}
            }
            else
            {
                if(la1.getText().equals("ip1"))
                {
                   String h = ip1.getText();
                   ia1.setText(h);
                }
                else if(la1.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   ia1.setText(h);
                }
                else if(la1.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   ia1.setText(h);
                }
                else if(la1.getText().equals("ip3"))
                {
                    String h = ip3.getText();
                   ia1.setText(h);
                }
                else if(la1.getText().equals("ip4"))
                {
                    String h = ip4.getText();
                   ia1.setText(h);
                }
                else if(la1.getText().equals("ip5"))
                {
                    String h = ip5.getText();
                   ia1.setText(h);
                }
                else if(la1.getText().equals("ia3"))
                {
                    String h = ia3.getText();
                   ia1.setText(h);
                }
                else if(la1.getText().equals("ia6"))
                {
                    String h = ia6.getText();
                   ia1.setText(h);
                }
                else if(la1.getText().equals("ia8"))
                {
                    String h = ia8.getText();
                   ia1.setText(h);
                }
                else if(la1.getText().equals("ia11"))
                {
                    String h = ia11.getText();
                   ia1.setText(h);
                }
                and21op();
            }
         
         
         
            if(la2.getText().equals("ia2"))
            {if(k.equals(ia2)){
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
            
            }}
            }
            else
            {
                if(la2.getText().equals("ip1"))
                {
                   String h = ip1.getText();
                   ia2.setText(h);
                }
                else if(la2.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   ia2.setText(h);
                }
                else if(la2.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   ia2.setText(h);
                }
                else if(la2.getText().equals("ip3"))
                {
                    String h = ip3.getText();
                   ia2.setText(h);
                }
                else if(la2.getText().equals("ip4"))
                {
                    String h = ip4.getText();
                   ia2.setText(h);
                }
                else if(la2.getText().equals("ip5"))
                {
                    String h = ip5.getText();
                   ia2.setText(h);
                }
                else if(la2.getText().equals("ia3"))
                {
                    String h = ia3.getText();
                   ia2.setText(h);
                }
                else if(la2.getText().equals("ia6"))
                {
                    String h = ia6.getText();
                   ia2.setText(h);
                }
                else if(la2.getText().equals("ia8"))
                {
                    String h = ia8.getText();
                   ia2.setText(h);
                }
                else if(la2.getText().equals("ia11"))
                {
                    String h = ia11.getText();
                   ia2.setText(h);
                }
                and21op();
                
            }
            if(ia1.getText().equals(" 1")&&ia2.getText().equals(" 1"))
            {
                ia3.setText(" 1");
                string = "ia3";
                change1();
            
                }
                else if(ia1.getText().equals(" x")||ia2.getText().equals(" x"))
                {
        
            ia3.setText(" x");string = "ia3";
                changex();
            }
                else
                {
                ia3.setText(" 0");string = "ia3";
                change0();
                }
            if(la4.getText().equals("ia4"))
            {if(k.equals("ia4")){
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
            
            }}
            }
            else
            {
                if(la4.getText().equals("ip1"))
                {
                   String h = ip1.getText();
                   ia4.setText(h);
                }
                else if(la4.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   ia4.setText(h);
                }
                else if(la4.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   ia4.setText(h);
                }
                else if(la4.getText().equals("ip3"))
                {
                    String h = ip3.getText();
                   ia4.setText(h);
                }
                else if(la4.getText().equals("ip4"))
                {
                    String h = ip4.getText();
                   ia4.setText(h);
                }
                else if(la4.getText().equals("ip5"))
                {
                    String h = ip5.getText();
                   ia4.setText(h);
                }
                else if(la4.getText().equals("ia3"))
                {
                    String h = ia6.getText();
                   ia4.setText(h);
                }
                else if(la4.getText().equals("ia6"))
                {
                    String h = ia6.getText();
                   ia4.setText(h);
                }
                else if(la4.getText().equals("ia8"))
                {
                    String h = ia8.getText();
                   ia4.setText(h);
                }
                else if(la4.getText().equals("ia11"))
                {
                    String h = ia11.getText();
                   ia4.setText(h);
                }
                and22op();
            }
            
            if(la5.getText().equals("ia5"))
            {if(k.equals("ia5")){
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
            
            }}
            }
            else
            {
                if(la5.getText().equals("ip1"))
                {
                   String h = ip1.getText();
                   ia5.setText(h);
                }
                else if(la5.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   ia5.setText(h);
                }
                else if(la5.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   ia5.setText(h);
                }
                else if(la5.getText().equals("ip3"))
                {
                    String h = ip3.getText();
                   ia5.setText(h);
                }
                else if(la5.getText().equals("ip4"))
                {
                    String h = ip4.getText();
                   ia5.setText(h);
                }
                else if(la5.getText().equals("ip5"))
                {
                    String h = ip5.getText();
                   ia5.setText(h);
                }
                else if(la5.getText().equals("ia3"))
                {
                    String h = ia6.getText();
                   ia5.setText(h);
                }
                else if(la5.getText().equals("ia6"))
                {
                    String h = ia6.getText();
                   ia5.setText(h);
                }
                else if(la5.getText().equals("ia8"))
                {
                    String h = ia8.getText();
                   ia5.setText(h);
                }
                else if(la5.getText().equals("ia11"))
                {
                    String h = ia11.getText();
                   ia5.setText(h);
                }
              
                
                and22op();
                if(ia4.getText().equals(" 1")&&ia5.getText().equals(" 1"))
        {
                ia6.setText(" 1");string = "ia6";
                change1();
            
        }
        else if(ia4.getText().equals(" x")||ia5.getText().equals(" x"))
        {
        
            ia6.setText(" x");string = "ia6";
                changex();
        }
        else
        {
                ia6.setText(" 0");string = "ia6";
                change0();
        }
       
            }
            if(la9.getText().equals("ia9"))
            {
                if(k.equals("ia9")){
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
            
            }}
            }
            else
            {
                if(la9.getText().equals("ip1"))
                {
                   String h = ip1.getText();
                   ia9.setText(h);
                }
                else if(la9.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   ia9.setText(h);
                }
                else if(la9.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   ia9.setText(h);
                }
                else if(la9.getText().equals("ip3"))
                {
                    String h = ip3.getText();
                   ia9.setText(h);
                }
                else if(la9.getText().equals("ip4"))
                {
                    String h = ip4.getText();
                   ia9.setText(h);
                }
                else if(la9.getText().equals("ip5"))
                {
                    String h = ip5.getText();
                   ia9.setText(h);
                }
                else if(la9.getText().equals("ia3"))
                {
                    String h = ia6.getText();
                   ia9.setText(h);
                }
                else if(la9.getText().equals("ia6"))
                {
                    String h = ia6.getText();
                   ia9.setText(h);
                }
                else if(la9.getText().equals("ia8"))
                {
                    String h = ia8.getText();
                   ia9.setText(h);
                }
                else if(la9.getText().equals("ia11"))
                {
                    String h = ia11.getText();
                   ia9.setText(h);
                }
                and23op();
            }
            if(la10.getText().equals("ia10"))
            {
		if(k.equals("ia10")){
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
            
            }}
            }
            else
            {
                if(la10.getText().equals("ip1"))
                {
                   String h = ip1.getText();
                   ia10.setText(h);
                }
                else if(la10.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   ia10.setText(h);
                }
                else if(la10.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   ia10.setText(h);
                }
                else if(la10.getText().equals("ip3"))
                {
                    String h = ip3.getText();
                   ia10.setText(h);
                }
                else if(la10.getText().equals("ip4"))
                {
                    String h = ip4.getText();
                   ia10.setText(h);
                }
                else if(la10.getText().equals("ip5"))
                {
                    String h = ip5.getText();
                   ia10.setText(h);
                }
                else if(la10.getText().equals("ia3"))
                {
                    String h = ia6.getText();
                   ia10.setText(h);
                }
                else if(la10.getText().equals("ia6"))
                {
                    String h = ia6.getText();
                   ia10.setText(h);
                }
                else if(la10.getText().equals("ia8"))
                {
                    String h = ia8.getText();
                   ia10.setText(h);
                }
                else if(la10.getText().equals("ia11"))
                {
                    String h = ia11.getText();
                   ia10.setText(h);
                }
                and23op();
            }
             if(ia9.getText().equals(" 1")&&ia10.getText().equals(" 1"))
        {
                ia8.setText(" 1");string = "ia8";
                change1();
            
        }
        else if(ia9.getText().equals(" x")||ia10.getText().equals(" x"))
        {
        
            ia8.setText(" x");string = "ia8";
                changex();
        }
        else
        {
                ia8.setText(" 0");string = "ia8";
                change0();
        }
            
            if(la12.getText().equals("ia12"))
            {
		if(k.equals("ia12")){
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
            
            }}
            }
            else
            {
                if(la12.getText().equals("ip1"))
                {
                   String h = ip1.getText();
                   ia12.setText(h);
                }
                else if(la12.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   ia12.setText(h);
                }
                else if(la12.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   ia12.setText(h);
                }
                else if(la12.getText().equals("ip3"))
                {
                    String h = ip3.getText();
                   ia12.setText(h);
                }
                else if(la12.getText().equals("ip4"))
                {
                    String h = ip4.getText();
                   ia12.setText(h);
                }
                else if(la12.getText().equals("ip5"))
                {
                    String h = ip5.getText();
                   ia12.setText(h);
                }
                else if(la12.getText().equals("ia3"))
                {
                    String h = ia6.getText();
                   ia12.setText(h);
                }
                else if(la12.getText().equals("ia6"))
                {
                    String h = ia6.getText();
                   ia12.setText(h);
                }
                else if(la12.getText().equals("ia8"))
                {
                    String h = ia8.getText();
                   ia12.setText(h);
                }
                else if(la12.getText().equals("ia11"))
                {
                    String h = ia11.getText();
                   ia12.setText(h);
                }
                and24op();
            }
            if(la13.getText().equals("ia13"))
            {
		if(k.equals("ia13")){
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
            
            }}
            }
            else
            {
                if(la13.getText().equals("ip1"))
                {
                   String h = ip1.getText();
                   ia13.setText(h);
                }
                else if(la13.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   ia13.setText(h);
                }
                else if(la13.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   ia13.setText(h);
                }
                else if(la13.getText().equals("ip3"))
                {
                    String h = ip3.getText();
                   ia13.setText(h);
                }
                else if(la13.getText().equals("ip4"))
                {
                    String h = ip4.getText();
                   ia13.setText(h);
                }
                else if(la13.getText().equals("ip5"))
                {
                    String h = ip5.getText();
                   ia13.setText(h);
                }
                else if(la13.getText().equals("ia3"))
                {
                    String h = ia6.getText();
                   ia13.setText(h);
                }
                else if(la13.getText().equals("ia6"))
                {
                    String h = ia6.getText();
                   ia13.setText(h);
                }
                else if(la13.getText().equals("ia8"))
                {
                    String h = ia8.getText();
                   ia13.setText(h);
                }
                else if(la13.getText().equals("ia11"))
                {
                    String h = ia11.getText();
                   ia13.setText(h);
                }
                and24op();
            }
            if(ia13.getText().equals(" 1")&&ia12.getText().equals(" 1"))
        {
                ia11.setText(" 1");string = "ia11";
                change1();
            
        }
        else if(ia13.getText().equals(" x")||ia12.getText().equals(" x"))
        {
        
            ia11.setText(" x");string = "ia11";
                changex();
        }
        else
        {
                ia11.setText(" 0");
                string = "ia11";
                change0();
        }
          

if(lb1.getText().equals("ib1"))
            {if(k.equals("ib1")){
            if(ib1.getText().equals(" x"))
            {
                ib1.setText(" 1");ib3.setText(" x");
            }
            else if(ib1.getText().equals(" 1"))
            {
                ib1.setText(" 0");ib3.setText(" x");
            }
            else
            {
                ib1.setText(" x");ib3.setText(" x");
            
            }}
            }
            else
            {
                if(lb1.getText().equals("ip1"))
                {
                   String h = ip1.getText();
                   ib1.setText(h);
                }
                else if(lb1.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   ib1.setText(h);
                }
                else if(lb1.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   ib1.setText(h);
                }
                else if(lb1.getText().equals("ip3"))
                {
                    String h = ip3.getText();
                   ib1.setText(h);
                }
                else if(lb1.getText().equals("ip4"))
                {
                    String h = ip4.getText();
                   ib1.setText(h);
                }
                else if(lb1.getText().equals("ip5"))
                {
                    String h = ip5.getText();
                   ib1.setText(h);
                }
                else if(lb1.getText().equals("ib3"))
                {
                    String h = ib3.getText();
                   ib1.setText(h);
                }
                else if(lb1.getText().equals("ib6"))
                {
                    String h = ib6.getText();
                   ib1.setText(h);
                }
                else if(lb1.getText().equals("ib8"))
                {
                    String h = ib8.getText();
                   ib1.setText(h);
                }
                else if(lb1.getText().equals("ib11"))
                {
                    String h = ib11.getText();
                   ib1.setText(h);
                }
                or11op();
            }
         
         
         
            if(lb2.getText().equals("ib2"))
            {if(k.equals(ib2)){
            if(ib2.getText().equals(" x"))
            {
                ib2.setText(" 1");ib3.setText(" x");
            }
            else if(ib2.getText().equals(" 1"))
            {
                ib2.setText(" 0");ib3.setText(" x");
            }
            else
            {
                ib2.setText(" x");ib3.setText(" x");
            
            }}
            }
            else
            {
                if(lb2.getText().equals("ip1"))
                {
                   String h = ip1.getText();
                   ib2.setText(h);
                }
                else if(lb2.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   ib2.setText(h);
                }
                else if(lb2.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   ib2.setText(h);
                }
                else if(lb2.getText().equals("ip3"))
                {
                    String h = ip3.getText();
                   ib2.setText(h);
                }
                else if(lb2.getText().equals("ip4"))
                {
                    String h = ip4.getText();
                   ib2.setText(h);
                }
                else if(lb2.getText().equals("ip5"))
                {
                    String h = ip5.getText();
                   ib2.setText(h);
                }
                else if(lb2.getText().equals("ib3"))
                {
                    String h = ib3.getText();
                   ib2.setText(h);
                }
                else if(lb2.getText().equals("ib6"))
                {
                    String h = ib6.getText();
                   ib2.setText(h);
                }
                else if(lb2.getText().equals("ib8"))
                {
                    String h = ib8.getText();
                   ib2.setText(h);
                }
                else if(lb2.getText().equals("ib11"))
                {
                    String h = ib11.getText();
                   ib2.setText(h);
                }
                or11op();
                
            }
            if(ib1.getText().equals(" 1")&&ib2.getText().equals(" 1"))
            {
                ib3.setText(" 1");
                string = "ib3";
                change1();
            
                }
                else if(ib1.getText().equals(" x")||ib2.getText().equals(" x"))
                {
        
            ib3.setText(" x");string = "ib3";
                changex();
            }
                else
                {
                ib3.setText(" 0");string = "ib3";
                change0();
                }
            if(lb4.getText().equals("ib4"))
            {if(k.equals("ib4")){
            if(ib4.getText().equals(" x"))
            {
                ib4.setText(" 1");ib6.setText(" x");
            }
            else if(ib4.getText().equals(" 1"))
            {
                ib4.setText(" 0");ib6.setText(" x");
            }
            else
            {
                ib4.setText(" x");ib6.setText(" x");
            
            }}
            }
            else
            {
                if(lb4.getText().equals("ip1"))
                {
                   String h = ip1.getText();
                   ib4.setText(h);
                }
                else if(lb4.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   ib4.setText(h);
                }
                else if(lb4.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   ib4.setText(h);
                }
                else if(lb4.getText().equals("ip3"))
                {
                    String h = ip3.getText();
                   ib4.setText(h);
                }
                else if(lb4.getText().equals("ip4"))
                {
                    String h = ip4.getText();
                   ib4.setText(h);
                }
                else if(lb4.getText().equals("ip5"))
                {
                    String h = ip5.getText();
                   ib4.setText(h);
                }
                else if(lb4.getText().equals("ib3"))
                {
                    String h = ib6.getText();
                   ib4.setText(h);
                }
                else if(lb4.getText().equals("ib6"))
                {
                    String h = ib6.getText();
                   ib4.setText(h);
                }
                else if(lb4.getText().equals("ib8"))
                {
                    String h = ib8.getText();
                   ib4.setText(h);
                }
                else if(lb4.getText().equals("ib11"))
                {
                    String h = ib11.getText();
                   ib4.setText(h);
                }
                or12op();
            }
            
            if(lb5.getText().equals("ib5"))
            {if(k.equals("ib5")){
            if(ib5.getText().equals(" x"))
            {
                ib5.setText(" 1");ib6.setText(" x");
            }
            else if(ib5.getText().equals(" 1"))
            {
                ib5.setText(" 0");ib6.setText(" x");
            }
            else
            {
                ib5.setText(" x");ib6.setText(" x");
            
            }}
            }
            else
            {
                if(lb5.getText().equals("ip1"))
                {
                   String h = ip1.getText();
                   ib5.setText(h);
                }
                else if(lb5.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   ib5.setText(h);
                }
                else if(lb5.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   ib5.setText(h);
                }
                else if(lb5.getText().equals("ip3"))
                {
                    String h = ip3.getText();
                   ib5.setText(h);
                }
                else if(lb5.getText().equals("ip4"))
                {
                    String h = ip4.getText();
                   ib5.setText(h);
                }
                else if(lb5.getText().equals("ip5"))
                {
                    String h = ip5.getText();
                   ib5.setText(h);
                }
                else if(lb5.getText().equals("ib3"))
                {
                    String h = ib6.getText();
                   ib5.setText(h);
                }
                else if(lb5.getText().equals("ib6"))
                {
                    String h = ib6.getText();
                   ib5.setText(h);
                }
                else if(lb5.getText().equals("ib8"))
                {
                    String h = ib8.getText();
                   ib5.setText(h);
                }
                else if(lb5.getText().equals("ib11"))
                {
                    String h = ib11.getText();
                   ib5.setText(h);
                }
              
                
                or12op();
                if(ib4.getText().equals(" 1")&&ib5.getText().equals(" 1"))
        {
                ib6.setText(" 1");string = "ib6";
                change1();
            
        }
        else if(ib4.getText().equals(" x")||ib5.getText().equals(" x"))
        {
        
            ib6.setText(" x");string = "ib6";
                changex();
        }
        else
        {
                ib6.setText(" 0");string = "ib6";
                change0();
        }
       
            }
            if(lb9.getText().equals("ib9"))
            {
                if(k.equals("ib9")){
            if(ib9.getText().equals(" x"))
            {
                ib9.setText(" 1");ib8.setText(" x");
            }
            else if(ib9.getText().equals(" 1"))
            {
                ib9.setText(" 0");ib8.setText(" x");
            }
            else
            {
                ib9.setText(" x");ib8.setText(" x");
            
            }}
            }
            else
            {
                if(lb9.getText().equals("ip1"))
                {
                   String h = ip1.getText();
                   ib9.setText(h);
                }
                else if(lb9.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   ib9.setText(h);
                }
                else if(lb9.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   ib9.setText(h);
                }
                else if(lb9.getText().equals("ip3"))
                {
                    String h = ip3.getText();
                   ib9.setText(h);
                }
                else if(lb9.getText().equals("ip4"))
                {
                    String h = ip4.getText();
                   ib9.setText(h);
                }
                else if(lb9.getText().equals("ip5"))
                {
                    String h = ip5.getText();
                   ib9.setText(h);
                }
                else if(lb9.getText().equals("ib3"))
                {
                    String h = ib6.getText();
                   ib9.setText(h);
                }
                else if(lb9.getText().equals("ib6"))
                {
                    String h = ib6.getText();
                   ib9.setText(h);
                }
                else if(lb9.getText().equals("ib8"))
                {
                    String h = ib8.getText();
                   ib9.setText(h);
                }
                else if(lb9.getText().equals("ib11"))
                {
                    String h = ib11.getText();
                   ib9.setText(h);
                }
                or13op();
            }
            if(lb10.getText().equals("ib10"))
            {
		if(k.equals("ib10")){
            if(ib10.getText().equals(" x"))
            {
                ib10.setText(" 1");ib8.setText(" x");
            }
            else if(ib10.getText().equals(" 1"))
            {
                ib10.setText(" 0");ib8.setText(" x");
            }
            else
            {
                ib10.setText(" x");ib8.setText(" x");
            
            }}
            }
            else
            {
                if(lb10.getText().equals("ip1"))
                {
                   String h = ip1.getText();
                   ib10.setText(h);
                }
                else if(lb10.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   ib10.setText(h);
                }
                else if(lb10.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   ib10.setText(h);
                }
                else if(lb10.getText().equals("ip3"))
                {
                    String h = ip3.getText();
                   ib10.setText(h);
                }
                else if(lb10.getText().equals("ip4"))
                {
                    String h = ip4.getText();
                   ib10.setText(h);
                }
                else if(lb10.getText().equals("ip5"))
                {
                    String h = ip5.getText();
                   ib10.setText(h);
                }
                else if(lb10.getText().equals("ib3"))
                {
                    String h = ib6.getText();
                   ib10.setText(h);
                }
                else if(lb10.getText().equals("ib6"))
                {
                    String h = ib6.getText();
                   ib10.setText(h);
                }
                else if(lb10.getText().equals("ib8"))
                {
                    String h = ib8.getText();
                   ib10.setText(h);
                }
                else if(lb10.getText().equals("ib11"))
                {
                    String h = ib11.getText();
                   ib10.setText(h);
                }
                or13op();
            }
             if(ib9.getText().equals(" 1")&&ib10.getText().equals(" 1"))
        {
                ib8.setText(" 1");string = "ib8";
                change1();
            
        }
        else if(ib9.getText().equals(" x")||ib10.getText().equals(" x"))
        {
        
            ib8.setText(" x");string = "ib8";
                changex();
        }
        else
        {
                ib8.setText(" 0");string = "ib8";
                change0();
        }
            
            if(lb12.getText().equals("ib12"))
            {
		if(k.equals("ib12")){
            if(ib12.getText().equals(" x"))
            {
                ib12.setText(" 1");ib11.setText(" x");
            }
            else if(ib12.getText().equals(" 1"))
            {
                ib12.setText(" 0");ib11.setText(" x");
            }
            else
            {
                ib12.setText(" x");ib11.setText(" x");
            
            }}
            }
            else
            {
                if(lb12.getText().equals("ip1"))
                {
                   String h = ip1.getText();
                   ib12.setText(h);
                }
                else if(lb12.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   ib12.setText(h);
                }
                else if(lb12.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   ib12.setText(h);
                }
                else if(lb12.getText().equals("ip3"))
                {
                    String h = ip3.getText();
                   ib12.setText(h);
                }
                else if(lb12.getText().equals("ip4"))
                {
                    String h = ip4.getText();
                   ib12.setText(h);
                }
                else if(lb12.getText().equals("ip5"))
                {
                    String h = ip5.getText();
                   ib12.setText(h);
                }
                else if(lb12.getText().equals("ib3"))
                {
                    String h = ib6.getText();
                   ib12.setText(h);
                }
                else if(lb12.getText().equals("ib6"))
                {
                    String h = ib6.getText();
                   ib12.setText(h);
                }
                else if(lb12.getText().equals("ib8"))
                {
                    String h = ib8.getText();
                   ib12.setText(h);
                }
                else if(lb12.getText().equals("ib11"))
                {
                    String h = ib11.getText();
                   ib12.setText(h);
                }
                or14op();
            }
            if(lb13.getText().equals("ib13"))
            {
		if(k.equals("ib13")){
            if(ib13.getText().equals(" x"))
            {
                ib13.setText(" 1");ib11.setText(" x");
            }
            else if(ib13.getText().equals(" 1"))
            {
                ib13.setText(" 0");ib11.setText(" x");
            }
            else
            {
                ib13.setText(" x");ib11.setText(" x");
            
            }}
            }
            else
            {
                if(lb13.getText().equals("ip1"))
                {
                   String h = ip1.getText();
                   ib13.setText(h);
                }
                else if(lb13.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   ib13.setText(h);
                }
                else if(lb13.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   ib13.setText(h);
                }
                else if(lb13.getText().equals("ip3"))
                {
                    String h = ip3.getText();
                   ib13.setText(h);
                }
                else if(lb13.getText().equals("ip4"))
                {
                    String h = ip4.getText();
                   ib13.setText(h);
                }
                else if(lb13.getText().equals("ip5"))
                {
                    String h = ip5.getText();
                   ib13.setText(h);
                }
                else if(lb13.getText().equals("ib3"))
                {
                    String h = ib6.getText();
                   ib13.setText(h);
                }
                else if(lb13.getText().equals("ib6"))
                {
                    String h = ib6.getText();
                   ib13.setText(h);
                }
                else if(lb13.getText().equals("ib8"))
                {
                    String h = ib8.getText();
                   ib13.setText(h);
                }
                else if(lb13.getText().equals("ib11"))
                {
                    String h = ib11.getText();
                   ib13.setText(h);
                }
                or14op();
            }
            if(ib13.getText().equals(" 1")&&ib12.getText().equals(" 1"))
        {
                ib11.setText(" 1");string = "ib11";
                change1();
            
        }
        else if(ib13.getText().equals(" x")||ib12.getText().equals(" x"))
        {
        
            ib11.setText(" x");string = "ib11";
                changex();
        }
        else
        {
                ib11.setText(" 0");
                string = "ib11";
                change0();
        }
          
if(lf1.getText().equals("if1"))
            {if(k.equals("if1")){
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
            
            }}
            }
            else
            {
                if(lf1.getText().equals("ip1"))
                {
                   String h = ip1.getText();
                   if1.setText(h);
                }
                else if(lf1.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   if1.setText(h);
                }
                else if(lf1.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   if1.setText(h);
                }
                else if(lf1.getText().equals("ip3"))
                {
                    String h = ip3.getText();
                   if1.setText(h);
                }
                else if(lf1.getText().equals("ip4"))
                {
                    String h = ip4.getText();
                   if1.setText(h);
                }
                else if(lf1.getText().equals("ip5"))
                {
                    String h = ip5.getText();
                   if1.setText(h);
                }
                else if(lf1.getText().equals("if3"))
                {
                    String h = if3.getText();
                   if1.setText(h);
                }
                else if(lf1.getText().equals("if6"))
                {
                    String h = if6.getText();
                   if1.setText(h);
                }
                else if(lf1.getText().equals("if8"))
                {
                    String h = if8.getText();
                   if1.setText(h);
                }
                else if(lf1.getText().equals("if11"))
                {
                    String h = if11.getText();
                   if1.setText(h);
                }
                nand11op();
            }
         
         
         
            if(lf2.getText().equals("if2"))
            {if(k.equals(if2)){
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
            
            }}
            }
            else
            {
                if(lf2.getText().equals("ip1"))
                {
                   String h = ip1.getText();
                   if2.setText(h);
                }
                else if(lf2.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   if2.setText(h);
                }
                else if(lf2.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   if2.setText(h);
                }
                else if(lf2.getText().equals("ip3"))
                {
                    String h = ip3.getText();
                   if2.setText(h);
                }
                else if(lf2.getText().equals("ip4"))
                {
                    String h = ip4.getText();
                   if2.setText(h);
                }
                else if(lf2.getText().equals("ip5"))
                {
                    String h = ip5.getText();
                   if2.setText(h);
                }
                else if(lf2.getText().equals("if3"))
                {
                    String h = if3.getText();
                   if2.setText(h);
                }
                else if(lf2.getText().equals("if6"))
                {
                    String h = if6.getText();
                   if2.setText(h);
                }
                else if(lf2.getText().equals("if8"))
                {
                    String h = if8.getText();
                   if2.setText(h);
                }
                else if(lf2.getText().equals("if11"))
                {
                    String h = if11.getText();
                   if2.setText(h);
                }
                nand11op();
                
            }
            if(if1.getText().equals(" 1")&&if2.getText().equals(" 1"))
            {
                if3.setText(" 1");
                string = "if3";
                change1();
            
                }
                else if(if1.getText().equals(" x")||if2.getText().equals(" x"))
                {
        
            if3.setText(" x");string = "if3";
                changex();
            }
                else
                {
                if3.setText(" 0");string = "if3";
                change0();
                }
            if(lf4.getText().equals("if4"))
            {if(k.equals("if4")){
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
            
            }}
            }
            else
            {
                if(lf4.getText().equals("ip1"))
                {
                   String h = ip1.getText();
                   if4.setText(h);
                }
                else if(lf4.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   if4.setText(h);
                }
                else if(lf4.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   if4.setText(h);
                }
                else if(lf4.getText().equals("ip3"))
                {
                    String h = ip3.getText();
                   if4.setText(h);
                }
                else if(lf4.getText().equals("ip4"))
                {
                    String h = ip4.getText();
                   if4.setText(h);
                }
                else if(lf4.getText().equals("ip5"))
                {
                    String h = ip5.getText();
                   if4.setText(h);
                }
                else if(lf4.getText().equals("if3"))
                {
                    String h = if6.getText();
                   if4.setText(h);
                }
                else if(lf4.getText().equals("if6"))
                {
                    String h = if6.getText();
                   if4.setText(h);
                }
                else if(lf4.getText().equals("if8"))
                {
                    String h = if8.getText();
                   if4.setText(h);
                }
                else if(lf4.getText().equals("if11"))
                {
                    String h = if11.getText();
                   if4.setText(h);
                }
                nand12op();
            }
            
            if(lf5.getText().equals("if5"))
            {if(k.equals("if5")){
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
            
            }}
            }
            else
            {
                if(lf5.getText().equals("ip1"))
                {
                   String h = ip1.getText();
                   if5.setText(h);
                }
                else if(lf5.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   if5.setText(h);
                }
                else if(lf5.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   if5.setText(h);
                }
                else if(lf5.getText().equals("ip3"))
                {
                    String h = ip3.getText();
                   if5.setText(h);
                }
                else if(lf5.getText().equals("ip4"))
                {
                    String h = ip4.getText();
                   if5.setText(h);
                }
                else if(lf5.getText().equals("ip5"))
                {
                    String h = ip5.getText();
                   if5.setText(h);
                }
                else if(lf5.getText().equals("if3"))
                {
                    String h = if6.getText();
                   if5.setText(h);
                }
                else if(lf5.getText().equals("if6"))
                {
                    String h = if6.getText();
                   if5.setText(h);
                }
                else if(lf5.getText().equals("if8"))
                {
                    String h = if8.getText();
                   if5.setText(h);
                }
                else if(lf5.getText().equals("if11"))
                {
                    String h = if11.getText();
                   if5.setText(h);
                }
              
                
                nand12op();
                if(if4.getText().equals(" 1")&&if5.getText().equals(" 1"))
        {
                if6.setText(" 1");string = "if6";
                change1();
            
        }
        else if(if4.getText().equals(" x")||if5.getText().equals(" x"))
        {
        
            if6.setText(" x");string = "if6";
                changex();
        }
        else
        {
                if6.setText(" 0");string = "if6";
                change0();
        }
       
            }
            if(lf9.getText().equals("if9"))
            {
                if(k.equals("if9")){
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
            
            }}
            }
            else
            {
                if(lf9.getText().equals("ip1"))
                {
                   String h = ip1.getText();
                   if9.setText(h);
                }
                else if(lf9.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   if9.setText(h);
                }
                else if(lf9.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   if9.setText(h);
                }
                else if(lf9.getText().equals("ip3"))
                {
                    String h = ip3.getText();
                   if9.setText(h);
                }
                else if(lf9.getText().equals("ip4"))
                {
                    String h = ip4.getText();
                   if9.setText(h);
                }
                else if(lf9.getText().equals("ip5"))
                {
                    String h = ip5.getText();
                   if9.setText(h);
                }
                else if(lf9.getText().equals("if3"))
                {
                    String h = if6.getText();
                   if9.setText(h);
                }
                else if(lf9.getText().equals("if6"))
                {
                    String h = if6.getText();
                   if9.setText(h);
                }
                else if(lf9.getText().equals("if8"))
                {
                    String h = if8.getText();
                   if9.setText(h);
                }
                else if(lf9.getText().equals("if11"))
                {
                    String h = if11.getText();
                   if9.setText(h);
                }
                nand13op();
            }
            if(lf10.getText().equals("if10"))
            {
		if(k.equals("if10")){
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
            
            }}
            }
            else
            {
                if(lf10.getText().equals("ip1"))
                {
                   String h = ip1.getText();
                   if10.setText(h);
                }
                else if(lf10.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   if10.setText(h);
                }
                else if(lf10.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   if10.setText(h);
                }
                else if(lf10.getText().equals("ip3"))
                {
                    String h = ip3.getText();
                   if10.setText(h);
                }
                else if(lf10.getText().equals("ip4"))
                {
                    String h = ip4.getText();
                   if10.setText(h);
                }
                else if(lf10.getText().equals("ip5"))
                {
                    String h = ip5.getText();
                   if10.setText(h);
                }
                else if(lf10.getText().equals("if3"))
                {
                    String h = if6.getText();
                   if10.setText(h);
                }
                else if(lf10.getText().equals("if6"))
                {
                    String h = if6.getText();
                   if10.setText(h);
                }
                else if(lf10.getText().equals("if8"))
                {
                    String h = if8.getText();
                   if10.setText(h);
                }
                else if(lf10.getText().equals("if11"))
                {
                    String h = if11.getText();
                   if10.setText(h);
                }
                nand13op();
            }
             if(if9.getText().equals(" 1")&&if10.getText().equals(" 1"))
        {
                if8.setText(" 1");string = "if8";
                change1();
            
        }
        else if(if9.getText().equals(" x")||if10.getText().equals(" x"))
        {
        
            if8.setText(" x");string = "if8";
                changex();
        }
        else
        {
                if8.setText(" 0");string = "if8";
                change0();
        }
            
            if(lf12.getText().equals("if12"))
            {
		if(k.equals("if12")){
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
            
            }}
            }
            else
            {
                if(lf12.getText().equals("ip1"))
                {
                   String h = ip1.getText();
                   if12.setText(h);
                }
                else if(lf12.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   if12.setText(h);
                }
                else if(lf12.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   if12.setText(h);
                }
                else if(lf12.getText().equals("ip3"))
                {
                    String h = ip3.getText();
                   if12.setText(h);
                }
                else if(lf12.getText().equals("ip4"))
                {
                    String h = ip4.getText();
                   if12.setText(h);
                }
                else if(lf12.getText().equals("ip5"))
                {
                    String h = ip5.getText();
                   if12.setText(h);
                }
                else if(lf12.getText().equals("if3"))
                {
                    String h = if6.getText();
                   if12.setText(h);
                }
                else if(lf12.getText().equals("if6"))
                {
                    String h = if6.getText();
                   if12.setText(h);
                }
                else if(lf12.getText().equals("if8"))
                {
                    String h = if8.getText();
                   if12.setText(h);
                }
                else if(lf12.getText().equals("if11"))
                {
                    String h = if11.getText();
                   if12.setText(h);
                }
                nand14op();
            }
            if(lf13.getText().equals("if13"))
            {
		if(k.equals("if13")){
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
            
            }}
            }
            else
            {
                if(lf13.getText().equals("ip1"))
                {
                   String h = ip1.getText();
                   if13.setText(h);
                }
                else if(lf13.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   if13.setText(h);
                }
                else if(lf13.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   if13.setText(h);
                }
                else if(lf13.getText().equals("ip3"))
                {
                    String h = ip3.getText();
                   if13.setText(h);
                }
                else if(lf13.getText().equals("ip4"))
                {
                    String h = ip4.getText();
                   if13.setText(h);
                }
                else if(lf13.getText().equals("ip5"))
                {
                    String h = ip5.getText();
                   if13.setText(h);
                }
                else if(lf13.getText().equals("if3"))
                {
                    String h = if6.getText();
                   if13.setText(h);
                }
                else if(lf13.getText().equals("if6"))
                {
                    String h = if6.getText();
                   if13.setText(h);
                }
                else if(lf13.getText().equals("if8"))
                {
                    String h = if8.getText();
                   if13.setText(h);
                }
                else if(lf13.getText().equals("if11"))
                {
                    String h = if11.getText();
                   if13.setText(h);
                }
                nand14op();
            }
            if(if13.getText().equals(" 1")&&if12.getText().equals(" 1"))
        {
                if11.setText(" 1");string = "if11";
                change1();
            
        }
        else if(if13.getText().equals(" x")||if12.getText().equals(" x"))
        {
        
            if11.setText(" x");string = "if11";
                changex();
        }
        else
        {
                if11.setText(" 0");
                string = "if11";
                change0();
        }
          



if(lj1.getText().equals("ij1"))
            {if(k.equals("ij1")){
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
            
            }}
            }
            else
            {
                if(lj1.getText().equals("ip1"))
                {
                   String h = ip1.getText();
                   ij1.setText(h);
                }
                else if(lj1.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   ij1.setText(h);
                }
                else if(lj1.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   ij1.setText(h);
                }
                else if(lj1.getText().equals("ip3"))
                {
                    String h = ip3.getText();
                   ij1.setText(h);
                }
                else if(lj1.getText().equals("ip4"))
                {
                    String h = ip4.getText();
                   ij1.setText(h);
                }
                else if(lj1.getText().equals("ip5"))
                {
                    String h = ip5.getText();
                   ij1.setText(h);
                }
                else if(lj1.getText().equals("ij3"))
                {
                    String h = ij3.getText();
                   ij1.setText(h);
                }
                else if(lj1.getText().equals("ij6"))
                {
                    String h = ij6.getText();
                   ij1.setText(h);
                }
                else if(lj1.getText().equals("ij8"))
                {
                    String h = ij8.getText();
                   ij1.setText(h);
                }
                else if(lj1.getText().equals("ij11"))
                {
                    String h = ij11.getText();
                   ij1.setText(h);
                }
                xor11op();
            }
         
         
         
            if(lj2.getText().equals("ij2"))
            {if(k.equals(ij2)){
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
            
            }}
            }
            else
            {
                if(lj2.getText().equals("ip1"))
                {
                   String h = ip1.getText();
                   ij2.setText(h);
                }
                else if(lj2.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   ij2.setText(h);
                }
                else if(lj2.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   ij2.setText(h);
                }
                else if(lj2.getText().equals("ip3"))
                {
                    String h = ip3.getText();
                   ij2.setText(h);
                }
                else if(lj2.getText().equals("ip4"))
                {
                    String h = ip4.getText();
                   ij2.setText(h);
                }
                else if(lj2.getText().equals("ip5"))
                {
                    String h = ip5.getText();
                   ij2.setText(h);
                }
                else if(lj2.getText().equals("ij3"))
                {
                    String h = ij3.getText();
                   ij2.setText(h);
                }
                else if(lj2.getText().equals("ij6"))
                {
                    String h = ij6.getText();
                   ij2.setText(h);
                }
                else if(lj2.getText().equals("ij8"))
                {
                    String h = ij8.getText();
                   ij2.setText(h);
                }
                else if(lj2.getText().equals("ij11"))
                {
                    String h = ij11.getText();
                   ij2.setText(h);
                }
                xor11op();
                
            }
            if(ij1.getText().equals(" 1")&&ij2.getText().equals(" 1"))
            {
                ij3.setText(" 1");
                string = "ij3";
                change1();
            
                }
                else if(ij1.getText().equals(" x")||ij2.getText().equals(" x"))
                {
        
            ij3.setText(" x");string = "ij3";
                changex();
            }
                else
                {
                ij3.setText(" 0");string = "ij3";
                change0();
                }
            if(lj4.getText().equals("ij4"))
            {if(k.equals("ij4")){
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
            
            }}
            }
            else
            {
                if(lj4.getText().equals("ip1"))
                {
                   String h = ip1.getText();
                   ij4.setText(h);
                }
                else if(lj4.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   ij4.setText(h);
                }
                else if(lj4.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   ij4.setText(h);
                }
                else if(lj4.getText().equals("ip3"))
                {
                    String h = ip3.getText();
                   ij4.setText(h);
                }
                else if(lj4.getText().equals("ip4"))
                {
                    String h = ip4.getText();
                   ij4.setText(h);
                }
                else if(lj4.getText().equals("ip5"))
                {
                    String h = ip5.getText();
                   ij4.setText(h);
                }
                else if(lj4.getText().equals("ij3"))
                {
                    String h = ij6.getText();
                   ij4.setText(h);
                }
                else if(lj4.getText().equals("ij6"))
                {
                    String h = ij6.getText();
                   ij4.setText(h);
                }
                else if(lj4.getText().equals("ij8"))
                {
                    String h = ij8.getText();
                   ij4.setText(h);
                }
                else if(lj4.getText().equals("ij11"))
                {
                    String h = ij11.getText();
                   ij4.setText(h);
                }
                xor12op();
            }
            
            if(lj5.getText().equals("ij5"))
            {if(k.equals("ij5")){
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
            
            }}
            }
            else
            {
                if(lj5.getText().equals("ip1"))
                {
                   String h = ip1.getText();
                   ij5.setText(h);
                }
                else if(lj5.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   ij5.setText(h);
                }
                else if(lj5.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   ij5.setText(h);
                }
                else if(lj5.getText().equals("ip3"))
                {
                    String h = ip3.getText();
                   ij5.setText(h);
                }
                else if(lj5.getText().equals("ip4"))
                {
                    String h = ip4.getText();
                   ij5.setText(h);
                }
                else if(lj5.getText().equals("ip5"))
                {
                    String h = ip5.getText();
                   ij5.setText(h);
                }
                else if(lj5.getText().equals("ij3"))
                {
                    String h = ij6.getText();
                   ij5.setText(h);
                }
                else if(lj5.getText().equals("ij6"))
                {
                    String h = ij6.getText();
                   ij5.setText(h);
                }
                else if(lj5.getText().equals("ij8"))
                {
                    String h = ij8.getText();
                   ij5.setText(h);
                }
                else if(lj5.getText().equals("ij11"))
                {
                    String h = ij11.getText();
                   ij5.setText(h);
                }
              
                
                xor12op();
                if(ij4.getText().equals(" 1")&&ij5.getText().equals(" 1"))
        {
                ij6.setText(" 1");string = "ij6";
                change1();
            
        }
        else if(ij4.getText().equals(" x")||ij5.getText().equals(" x"))
        {
        
            ij6.setText(" x");string = "ij6";
                changex();
        }
        else
        {
                ij6.setText(" 0");string = "ij6";
                change0();
        }
       
            }
            if(lj9.getText().equals("ij9"))
            {
                if(k.equals("ij9")){
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
            
            }}
            }
            else
            {
                if(lj9.getText().equals("ip1"))
                {
                   String h = ip1.getText();
                   ij9.setText(h);
                }
                else if(lj9.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   ij9.setText(h);
                }
                else if(lj9.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   ij9.setText(h);
                }
                else if(lj9.getText().equals("ip3"))
                {
                    String h = ip3.getText();
                   ij9.setText(h);
                }
                else if(lj9.getText().equals("ip4"))
                {
                    String h = ip4.getText();
                   ij9.setText(h);
                }
                else if(lj9.getText().equals("ip5"))
                {
                    String h = ip5.getText();
                   ij9.setText(h);
                }
                else if(lj9.getText().equals("ij3"))
                {
                    String h = ij6.getText();
                   ij9.setText(h);
                }
                else if(lj9.getText().equals("ij6"))
                {
                    String h = ij6.getText();
                   ij9.setText(h);
                }
                else if(lj9.getText().equals("ij8"))
                {
                    String h = ij8.getText();
                   ij9.setText(h);
                }
                else if(lj9.getText().equals("ij11"))
                {
                    String h = ij11.getText();
                   ij9.setText(h);
                }
                xor13op();
            }
            if(lj10.getText().equals("ij10"))
            {
		if(k.equals("ij10")){
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
            
            }}
            }
            else
            {
                if(lj10.getText().equals("ip1"))
                {
                   String h = ip1.getText();
                   ij10.setText(h);
                }
                else if(lj10.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   ij10.setText(h);
                }
                else if(lj10.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   ij10.setText(h);
                }
                else if(lj10.getText().equals("ip3"))
                {
                    String h = ip3.getText();
                   ij10.setText(h);
                }
                else if(lj10.getText().equals("ip4"))
                {
                    String h = ip4.getText();
                   ij10.setText(h);
                }
                else if(lj10.getText().equals("ip5"))
                {
                    String h = ip5.getText();
                   ij10.setText(h);
                }
                else if(lj10.getText().equals("ij3"))
                {
                    String h = ij6.getText();
                   ij10.setText(h);
                }
                else if(lj10.getText().equals("ij6"))
                {
                    String h = ij6.getText();
                   ij10.setText(h);
                }
                else if(lj10.getText().equals("ij8"))
                {
                    String h = ij8.getText();
                   ij10.setText(h);
                }
                else if(lj10.getText().equals("ij11"))
                {
                    String h = ij11.getText();
                   ij10.setText(h);
                }
                xor13op();
            }
             if(ij9.getText().equals(" 1")&&ij10.getText().equals(" 1"))
        {
                ij8.setText(" 1");string = "ij8";
                change1();
            
        }
        else if(ij9.getText().equals(" x")||ij10.getText().equals(" x"))
        {
        
            ij8.setText(" x");string = "ij8";
                changex();
        }
        else
        {
                ij8.setText(" 0");string = "ij8";
                change0();
        }
            
            if(lj12.getText().equals("ij12"))
            {
		if(k.equals("ij12")){
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
            
            }}
            }
            else
            {
                if(lj12.getText().equals("ip1"))
                {
                   String h = ip1.getText();
                   ij12.setText(h);
                }
                else if(lj12.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   ij12.setText(h);
                }
                else if(lj12.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   ij12.setText(h);
                }
                else if(lj12.getText().equals("ip3"))
                {
                    String h = ip3.getText();
                   ij12.setText(h);
                }
                else if(lj12.getText().equals("ip4"))
                {
                    String h = ip4.getText();
                   ij12.setText(h);
                }
                else if(lj12.getText().equals("ip5"))
                {
                    String h = ip5.getText();
                   ij12.setText(h);
                }
                else if(lj12.getText().equals("ij3"))
                {
                    String h = ij6.getText();
                   ij12.setText(h);
                }
                else if(lj12.getText().equals("ij6"))
                {
                    String h = ij6.getText();
                   ij12.setText(h);
                }
                else if(lj12.getText().equals("ij8"))
                {
                    String h = ij8.getText();
                   ij12.setText(h);
                }
                else if(lj12.getText().equals("ij11"))
                {
                    String h = ij11.getText();
                   ij12.setText(h);
                }
                xor14op();
            }
            if(lj13.getText().equals("ij13"))
            {
		if(k.equals("ij13")){
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
            
            }}
            }
            else
            {
                if(lj13.getText().equals("ip1"))
                {
                   String h = ip1.getText();
                   ij13.setText(h);
                }
                else if(lj13.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   ij13.setText(h);
                }
                else if(lj13.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   ij13.setText(h);
                }
                else if(lj13.getText().equals("ip3"))
                {
                    String h = ip3.getText();
                   ij13.setText(h);
                }
                else if(lj13.getText().equals("ip4"))
                {
                    String h = ip4.getText();
                   ij13.setText(h);
                }
                else if(lj13.getText().equals("ip5"))
                {
                    String h = ip5.getText();
                   ij13.setText(h);
                }
                else if(lj13.getText().equals("ij3"))
                {
                    String h = ij6.getText();
                   ij13.setText(h);
                }
                else if(lj13.getText().equals("ij6"))
                {
                    String h = ij6.getText();
                   ij13.setText(h);
                }
                else if(lj13.getText().equals("ij8"))
                {
                    String h = ij8.getText();
                   ij13.setText(h);
                }
                else if(lj13.getText().equals("ij11"))
                {
                    String h = ij11.getText();
                   ij13.setText(h);
                }
                xor14op();
            }
            if(ij13.getText().equals(" 1")&&ij12.getText().equals(" 1"))
        {
                ij11.setText(" 1");string = "ij11";
                change1();
            
        }
        else if(ij13.getText().equals(" x")||ij12.getText().equals(" x"))
        {
        
            ij11.setText(" x");string = "ij11";
                changex();
        }
        else
        {
                ij11.setText(" 0");
                string = "ij11";
                change0();
        }
          


if(lc1.getText().equals("ic1"))
            {if(k.equals("ic1")){
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
            
            }}
            }
            else
            {
                if(lc1.getText().equals("ip1"))
                {
                   String h = ip1.getText();
                   ic1.setText(h);
                }
                else if(lc1.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   ic1.setText(h);
                }
                else if(lc1.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   ic1.setText(h);
                }
                else if(lc1.getText().equals("ip3"))
                {
                    String h = ip3.getText();
                   ic1.setText(h);
                }
                else if(lc1.getText().equals("ip4"))
                {
                    String h = ip4.getText();
                   ic1.setText(h);
                }
                else if(lc1.getText().equals("ip5"))
                {
                    String h = ip5.getText();
                   ic1.setText(h);
                }
                else if(lc1.getText().equals("ic2"))
                {
                    String h = ic2.getText();
                   ic1.setText(h);
                }
                else if(lc1.getText().equals("ic4"))
                {
                    String h = ic4.getText();
                   ic1.setText(h);
                }
                else if(lc1.getText().equals("ic6"))
                {
                    String h = ic6.getText();
                   ic1.setText(h);
                }
                else if(lc1.getText().equals("ic8"))
                {
                    String h = ic8.getText();
                   ic1.setText(h);
                }
		else if(lc1.getText().equals("ic10"))
                {
                    String h = ic10.getText();
                   ic1.setText(h);
                }
		else if(lc1.getText().equals("ic12"))
                {
                    String h = ic12.getText();
                   ic1.setText(h);
                }
                not11op();
            }


if(lc3.getText().equals("ic3"))
            {if(k.equals("ic3")){
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
            
            }}
            }
            else
            {
                if(lc3.getText().equals("ip1"))
                {
                   String h = ip1.getText();
                   ic3.setText(h);
                }
                else if(lc3.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   ic3.setText(h);
                }
                else if(lc3.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   ic3.setText(h);
                }
                else if(lc3.getText().equals("ip3"))
                {
                    String h = ip3.getText();
                   ic3.setText(h);
                }
                else if(lc3.getText().equals("ip4"))
                {
                    String h = ip4.getText();
                   ic3.setText(h);
                }
                else if(lc3.getText().equals("ip5"))
                {
                    String h = ip5.getText();
                   ic3.setText(h);
                }
                else if(lc3.getText().equals("ic2"))
                {
                    String h = ic2.getText();
                   ic3.setText(h);
                }
                else if(lc3.getText().equals("ic4"))
                {
                    String h = ic4.getText();
                   ic3.setText(h);
                }
                else if(lc3.getText().equals("ic6"))
                {
                    String h = ic6.getText();
                   ic3.setText(h);
                }
                else if(lc3.getText().equals("ic8"))
                {
                    String h = ic8.getText();
                   ic3.setText(h);
                }
		else if(lc3.getText().equals("ic10"))
                {
                    String h = ic10.getText();
                   ic3.setText(h);
                }
		else if(lc3.getText().equals("ic12"))
                {
                    String h = ic12.getText();
                   ic3.setText(h);
                }
                not12op();
            }


if(lc5.getText().equals("ic5"))
            {if(k.equals("ic5")){
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
            
            }}
            }
            else
            {
                if(lc5.getText().equals("ip1"))
                {
                   String h = ip1.getText();
                   ic5.setText(h);
                }
                else if(lc5.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   ic5.setText(h);
                }
                else if(lc5.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   ic5.setText(h);
                }
                else if(lc5.getText().equals("ip3"))
                {
                    String h = ip3.getText();
                   ic5.setText(h);
                }
                else if(lc5.getText().equals("ip4"))
                {
                    String h = ip4.getText();
                   ic5.setText(h);
                }
                else if(lc5.getText().equals("ip5"))
                {
                    String h = ip5.getText();
                   ic5.setText(h);
                }
                else if(lc5.getText().equals("ic2"))
                {
                    String h = ic2.getText();
                   ic5.setText(h);
                }
                else if(lc5.getText().equals("ic6"))
                {
                    String h = ic6.getText();
                   ic5.setText(h);
                }
                else if(lc5.getText().equals("ic6"))
                {
                    String h = ic6.getText();
                   ic5.setText(h);
                }
                else if(lc5.getText().equals("ic8"))
                {
                    String h = ic8.getText();
                   ic5.setText(h);
                }
		else if(lc5.getText().equals("ic10"))
                {
                    String h = ic10.getText();
                   ic5.setText(h);
                }
		else if(lc5.getText().equals("ic12"))
                {
                    String h = ic12.getText();
                   ic5.setText(h);
                }
                not13op();
            }


if(lc9.getText().equals("ic9"))
            {if(k.equals("ic9")){
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
            
            }}
            }
            else
            {
                if(lc9.getText().equals("ip1"))
                {
                   String h = ip1.getText();
                   ic9.setText(h);
                }
                else if(lc9.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   ic9.setText(h);
                }
                else if(lc9.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   ic9.setText(h);
                }
                else if(lc9.getText().equals("ip3"))
                {
                    String h = ip3.getText();
                   ic9.setText(h);
                }
                else if(lc9.getText().equals("ip4"))
                {
                    String h = ip4.getText();
                   ic9.setText(h);
                }
                else if(lc9.getText().equals("ip5"))
                {
                    String h = ip5.getText();
                   ic9.setText(h);
                }
                else if(lc9.getText().equals("ic2"))
                {
                    String h = ic2.getText();
                   ic9.setText(h);
                }
                else if(lc9.getText().equals("ic8"))
                {
                    String h = ic8.getText();
                   ic9.setText(h);
                }
                else if(lc9.getText().equals("ic8"))
                {
                    String h = ic8.getText();
                   ic9.setText(h);
                }
                else if(lc9.getText().equals("ic8"))
                {
                    String h = ic8.getText();
                   ic9.setText(h);
                }
		else if(lc9.getText().equals("ic10"))
                {
                    String h = ic10.getText();
                   ic9.setText(h);
                }
		else if(lc9.getText().equals("ic12"))
                {
                    String h = ic12.getText();
                   ic9.setText(h);
                }
                not14op();
            }




if(lc11.getText().equals("ic11"))
            {if(k.equals("ic11")){
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
            
            }}
            }
            else
            {
                if(lc11.getText().equals("ip1"))
                {
                   String h = ip1.getText();
                   ic11.setText(h);
                }
                else if(lc11.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   ic11.setText(h);
                }
                else if(lc11.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   ic11.setText(h);
                }
                else if(lc11.getText().equals("ip3"))
                {
                    String h = ip3.getText();
                   ic11.setText(h);
                }
                else if(lc11.getText().equals("ip4"))
                {
                    String h = ip4.getText();
                   ic11.setText(h);
                }
                else if(lc11.getText().equals("ip5"))
                {
                    String h = ip5.getText();
                   ic11.setText(h);
                }
                else if(lc11.getText().equals("ic2"))
                {
                    String h = ic2.getText();
                   ic11.setText(h);
                }
                else if(lc11.getText().equals("ic10"))
                {
                    String h = ic10.getText();
                   ic11.setText(h);
                }
                else if(lc11.getText().equals("ic10"))
                {
                    String h = ic10.getText();
                   ic11.setText(h);
                }
                else if(lc11.getText().equals("ic10"))
                {
                    String h = ic10.getText();
                   ic11.setText(h);
                }
		else if(lc11.getText().equals("ic10"))
                {
                    String h = ic10.getText();
                   ic11.setText(h);
                }
		else if(lc11.getText().equals("ic12"))
                {
                    String h = ic12.getText();
                   ic11.setText(h);
                }
                not15op();
            }




if(lc13.getText().equals("ic13"))
            {if(k.equals("ic13")){
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
            
            }}
            }
            else
            {
                if(lc13.getText().equals("ip1"))
                {
                   String h = ip1.getText();
                   ic13.setText(h);
                }
                else if(lc13.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   ic13.setText(h);
                }
                else if(lc13.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   ic13.setText(h);
                }
                else if(lc13.getText().equals("ip3"))
                {
                    String h = ip3.getText();
                   ic13.setText(h);
                }
                else if(lc13.getText().equals("ip4"))
                {
                    String h = ip4.getText();
                   ic13.setText(h);
                }
                else if(lc13.getText().equals("ip5"))
                {
                    String h = ip5.getText();
                   ic13.setText(h);
                }
                else if(lc13.getText().equals("ic2"))
                {
                    String h = ic2.getText();
                   ic13.setText(h);
                }
                else if(lc13.getText().equals("ic12"))
                {
                    String h = ic12.getText();
                   ic13.setText(h);
                }
                else if(lc13.getText().equals("ic12"))
                {
                    String h = ic12.getText();
                   ic13.setText(h);
                }
                else if(lc13.getText().equals("ic12"))
                {
                    String h = ic12.getText();
                   ic13.setText(h);
                }
		else if(lc13.getText().equals("ic12"))
                {
                    String h = ic12.getText();
                   ic13.setText(h);
                }
		else if(lc13.getText().equals("ic13"))
                {
                    String h = ic13.getText();
                   ic13.setText(h);
                }
                not16op();
            }








   
            
        }
        else if(st==0)
        {
        if(k.equals("add")&&(cc.getText().equals("ok!")))
        {
            if(i14.getText().equals(" v")&&i7.getText().equals("G")&&ia14.getText().equals(" v")&&ia7.getText().equals("G")&&ib14.getText().equals(" v")&&ib7.getText().equals("G")&&ic14.getText().equals(" v")&&ic7.getText().equals("G")&&if14.getText().equals(" v")&&if7.getText().equals("G")&&ij14.getText().equals(" v")&&ij7.getText().equals("G"))
            {
            if(c==0)
            {
            c=1;sp=1;
            ip1.setBackground(Color.PINK);
            ip2.setBackground(Color.PINK);
            ip3.setBackground(Color.PINK);
            ip4.setBackground(Color.PINK);
            ip5.setBackground(Color.PINK);
            i3.setBackground(Color.PINK);
            i6.setBackground(Color.PINK);
            i8.setBackground(Color.PINK);
            i11.setBackground(Color.PINK);
            ia3.setBackground(Color.PINK);
            ia6.setBackground(Color.PINK);
            ia8.setBackground(Color.PINK);
            ia11.setBackground(Color.PINK);
            ib3.setBackground(Color.PINK);
            ib6.setBackground(Color.PINK);
            ib8.setBackground(Color.PINK);
            ib11.setBackground(Color.PINK);
            if3.setBackground(Color.PINK);
            if6.setBackground(Color.PINK);
            if8.setBackground(Color.PINK);
            if11.setBackground(Color.PINK);
            ij3.setBackground(Color.PINK);
            ij6.setBackground(Color.PINK);
            ij8.setBackground(Color.PINK);
            ij11.setBackground(Color.PINK);
            ic2.setBackground(Color.PINK);
            ic4.setBackground(Color.PINK);
            ic6.setBackground(Color.PINK);
            ic8.setBackground(Color.PINK);
            ic10.setBackground(Color.PINK);
            ic12.setBackground(Color.PINK);
          
            
            JOptionPane.showMessageDialog(null,"Click any one of these");
            
            }
            }
            else
            {
            
            JOptionPane.showMessageDialog(null,"Connect  14 pin to vcc and 7 pin to Ground of each IC");
            }
       
        
        
        }
        else if(k.equals("add")&&(cc.getText().equals("continue")))
            {
             JOptionPane.showMessageDialog(null,"Click continue");
            
            }
        //.......................................................................
        else if(c==1)
        {
            if(k.equals("ip1")||k.equals("ip2")||k.equals("ip3")||k.equals("ip4")||k.equals("ip5")||k.equals("i3")||k.equals("i6")||k.equals("i8")||k.equals("i11")||k.equals("ia3")||k.equals("ia6")||k.equals("ia8")||k.equals("ia11")||k.equals("ib3")||k.equals("ib6")||k.equals("ib8")||k.equals("ib11")||k.equals("if3")||k.equals("if6")||k.equals("if8")||k.equals("if11")||k.equals("ij3")||k.equals("ij6")||k.equals("ij8")||k.equals("ij11")||k.equals("ic2")||k.equals("ic4")||k.equals("ic6")||k.equals("ic8")||k.equals("ic10")||k.equals("ic12"))
            {
                set();
            
                if(k.equals("ip1"))
                {
                w = lip1.getText();
                ip1.setBackground(Color.green);
                
                }
                else if(k.equals("ip2"))
                {
                    w = lip2.getText();
                ip2.setBackground(Color.green);
               
                
                }
                else if(k.equals("ip3"))
                {
                    w = lip3.getText();
                ip3.setBackground(Color.green);
               
                
                
                }
                else if(k.equals("ip4"))
                {
                    w = lip4.getText();
                ip4.setBackground(Color.green);
                
                
                }
                else if(k.equals("ip5"))
                {
                w = lip5.getText();
                ip5.setBackground(Color.green);
                
                }
                else if(k.equals("i3"))
                {w = l3.getText();
                i3.setBackground(Color.green);
               
                
                }
                else if(k.equals("i6"))
                {
                w = l6.getText();
                i6.setBackground(Color.green);
               
                }
                else if(k.equals("i8"))
                {
                 w = l8.getText();
                i8.setBackground(Color.green);
               
                }
                else if(k.equals("i11"))
                {
                 w = l11.getText();
                i11.setBackground(Color.green);
               
                }
                else if(k.equals("ia3"))
                {
                w = la3.getText();
                ia3.setBackground(Color.green);
               
                }
                else if(k.equals("ia6"))
                {
                  w = la6.getText();
                ia6.setBackground(Color.green);
                  
                
                }
                else if(k.equals("ia8"))
                {
                     w = la8.getText();
                ia8.setBackground(Color.green);
               
                
                }
                else if(k.equals("ia11"))
                {
                 w = la11.getText();
                ia11.setBackground(Color.green);
                
                }
                else if(k.equals("ib3"))
                {
                w = lb3.getText();
                ib3.setBackground(Color.green);
               
                }
                else if(k.equals("ib6"))
                {
                 w = lb6.getText();
                ib6.setBackground(Color.green);
               
                }
                else if(k.equals("ib8"))
                {
                 w = lb8.getText();
                ib8.setBackground(Color.green);
              
                }
                else if(k.equals("ib11"))
                {
                 w = lb11.getText();
                ib11.setBackground(Color.green);
               
                }
                else if(k.equals("ic2"))
                {
                w = lc2.getText();
                ic2.setBackground(Color.green);
               
                }
                else if(k.equals("ic6"))
                {
                 w = lc6.getText();
                ic6.setBackground(Color.green);
             
                }
                else if(k.equals("ic8"))
                {
                 w = lc8.getText();
               
                }
                else if(k.equals("ic4"))
                {
                 w = lc4.getText();
              
                }
                else if(k.equals("ic10"))
                {
                 w = lc10.getText();
                ic10.setBackground(Color.green);
              
                }
                else if(k.equals("ic12"))
                {
                 w = lc12.getText();
                ic4.setBackground(Color.green);
                
                }
                else if(k.equals("if3"))
                {
                w = lf3.getText();
                if3.setBackground(Color.green);
               
                }
                else if(k.equals("if6"))
                {
                 w = lf6.getText();
                if6.setBackground(Color.green);
              
                }
                else if(k.equals("if8"))
                {
                 w = lf8.getText();
                if8.setBackground(Color.green);
               
                }
                else if(k.equals("if11"))
                {
                 w = lf11.getText();
                if11.setBackground(Color.green);
              
                }
                else if(k.equals("ij3"))
                {
                w = lj3.getText();
                ij3.setBackground(Color.green);
               
                }
                else if(k.equals("ij6"))
                { w = lj6.getText();
                ij6.setBackground(Color.green);
              
                
                }
                else if(k.equals("ij8"))
                {
                 w = lj8.getText();
                ij8.setBackground(Color.green);
             
                }
                else if(k.equals("ij11"))
                {
                 w = lj11.getText();
                ij11.setBackground(Color.green);
               
                }
                c=2;
                op1.setBackground(Color.PINK);
            op2.setBackground(Color.PINK);
            op3.setBackground(Color.PINK);
            op4.setBackground(Color.PINK);
            op5.setBackground(Color.PINK);
            
            i1.setBackground(Color.PINK);
            i2.setBackground(Color.PINK);
            i4.setBackground(Color.PINK);
            i5.setBackground(Color.PINK);
            i10.setBackground(Color.PINK);
            i9.setBackground(Color.PINK);
            i13.setBackground(Color.PINK);
            i12.setBackground(Color.PINK);
            
            ia1.setBackground(Color.PINK);
            ia2.setBackground(Color.PINK);
            ia4.setBackground(Color.PINK);
            ia5.setBackground(Color.PINK);
            ia10.setBackground(Color.PINK);
            ia9.setBackground(Color.PINK);
            ia13.setBackground(Color.PINK);
            ia12.setBackground(Color.PINK);
            
            ib1.setBackground(Color.PINK);
            ib2.setBackground(Color.PINK);
            ib4.setBackground(Color.PINK);
            ib5.setBackground(Color.PINK);
            ib10.setBackground(Color.PINK);
            ib9.setBackground(Color.PINK);
            ib13.setBackground(Color.PINK);
            ib12.setBackground(Color.PINK);
            
            if1.setBackground(Color.PINK);
            if2.setBackground(Color.PINK);
            if4.setBackground(Color.PINK);
            if5.setBackground(Color.PINK);
            if10.setBackground(Color.PINK);
            if9.setBackground(Color.PINK);
            if13.setBackground(Color.PINK);
            if12.setBackground(Color.PINK);
            
            ij1.setBackground(Color.PINK);
            ij2.setBackground(Color.PINK);
            ij4.setBackground(Color.PINK);
            ij5.setBackground(Color.PINK);
            ij10.setBackground(Color.PINK);
            ij9.setBackground(Color.PINK);
            ij13.setBackground(Color.PINK);
            ij12.setBackground(Color.PINK);
            
            ic1.setBackground(Color.PINK);
            ic3.setBackground(Color.PINK);
            ic5.setBackground(Color.PINK);
            ic9.setBackground(Color.PINK);
            ic11.setBackground(Color.PINK);
            ic13.setBackground(Color.PINK);
            
            JOptionPane.showMessageDialog(null,"Click on highlighted button");
            }
            else
            {
            
            JOptionPane.showMessageDialog(null,"Click any one of these");
            }
        }
        else if(c==2)
        {
            if(k.equals("ip1")||k.equals("ip2")||k.equals("ip3")||k.equals("ip4")||k.equals("ip5")||k.equals("i3")||k.equals("i6")||k.equals("i8")||k.equals("i11")||k.equals("ia3")||k.equals("ia6")||k.equals("ia8")||k.equals("ia11")||k.equals("ib3")||k.equals("ib6")||k.equals("ib8")||k.equals("ib11")||k.equals("if3")||k.equals("if6")||k.equals("if8")||k.equals("if11")||k.equals("ij3")||k.equals("ij6")||k.equals("ij8")||k.equals("ij11")||k.equals("ic2")||k.equals("ic4")||k.equals("ic6")||k.equals("ic8")||k.equals("ic10")||k.equals("ic12"))
            {
            JOptionPane.showMessageDialog(null,"Click on highlighted button");
            }
            else
            {
               set();
            
            if(k.equals("op1"))
            {
            op1.setBackground(Color.green);
            lop1.setText(w);
            }
            else if(k.equals("op2"))
            {
            op2.setBackground(Color.green);
            lop2.setText(w);
            }
            else if(k.equals("op3"))
            {
            op3.setBackground(Color.green);
            lop3.setText(w);
            }
            else if(k.equals("op4"))
            {
            op4.setBackground(Color.green);
            lop4.setText(w);
            
            }
            else if(k.equals("op5"))
            {
            op5.setBackground(Color.green);
            lop5.setText(w);
            }
            else if(k.equals("i1"))
            {
            
            i1.setBackground(Color.green);
            l1.setText(w);
            }
            else if(k.equals("i2"))
            {
            i2.setBackground(Color.green);
            l2.setText(w);
            }
            else if(k.equals("i4"))
            {
            i4.setBackground(Color.green);
            l4.setText(w);
            }
            else if(k.equals("i5"))
            {
            i5.setBackground(Color.green);
            l5.setText(w);
            }
            else if(k.equals("i13"))
            {
            i13.setBackground(Color.green);
            l13.setText(w);
            }
            else if(k.equals("i12"))
            {
            i12.setBackground(Color.green);
            l12.setText(w);
            }
            else if(k.equals("i10"))
            {
            i10.setBackground(Color.green);
            l10.setText(w);
            }
            else if(k.equals("i9"))
            {
            i9.setBackground(Color.green);
            l9.setText(w);
            }
            else if(k.equals("ia1"))
            {
            ia1.setBackground(Color.green);
            la1.setText(w);
            }
            else if(k.equals("ia2"))
            {
            ia2.setBackground(Color.green);
            la2.setText(w);
            }
            else if(k.equals("ia4"))
            {
            ia4.setBackground(Color.green);
            la4.setText(w);
            }
            else if(k.equals("ia5"))
            {
            ia5.setBackground(Color.green);
            la5.setText(w);
            }
            else if(k.equals("ia13"))
            {
           ia13.setBackground(Color.green); 
           la13.setText(w);
            }
            else if(k.equals("ia12"))
            {
            ia12.setBackground(Color.green);
            la12.setText(w);
            }
            else if(k.equals("ia10"))
            {
            ia10.setBackground(Color.green);
            la10.setText(w);
            }
            else if(k.equals("ia9"))
            {
            ia9.setBackground(Color.green);
            la9.setText(w);
            }
            else if(k.equals("ib1"))
            {
            ib1.setBackground(Color.green);
            lb1.setText(w);
            }
            else if(k.equals("ib2"))
            {
            ib2.setBackground(Color.green);
            lb2.setText(w);
            }
            else if(k.equals("ib4"))
            {
            ib4.setBackground(Color.green);
            lb4.setText(w);
            }
            else if(k.equals("ib5"))
            {
            ib5.setBackground(Color.green);
            lb5.setText(w);
            }
            else if(k.equals("ib13"))
            {
            ib13.setBackground(Color.green);
            lb13.setText(w);
            }
            else if(k.equals("ib12"))
            {
            ib12.setBackground(Color.green);
            lb12.setText(w);
            }
            else if(k.equals("ib10"))
            {
            ib10.setBackground(Color.green);
            lb10.setText(w);
            }
            else if(k.equals("ib9"))
            {
            ib9.setBackground(Color.green);
            lb9.setText(w);
            }
            else if(k.equals("if1"))
            {
            if1.setBackground(Color.green);
            lf1.setText(w);
            }
            else if(k.equals("if2"))
            {
            if2.setBackground(Color.green);
            lf2.setText(w);
            }
            else if(k.equals("if4"))
            {
            if4.setBackground(Color.green);
            lf4.setText(w);
            }
            else if(k.equals("if5"))
            {
            if5.setBackground(Color.green);
            lf5.setText(w);
            }
            else if(k.equals("if13"))
            {
           if13.setBackground(Color.green); 
           lf13.setText(w);
            }
            else if(k.equals("if12"))
            {
            if12.setBackground(Color.green);
            lf12.setText(w);
            }
            else if(k.equals("if10"))
            {
            if10.setBackground(Color.green);
            lf10.setText(w);
            }
            else if(k.equals("if9"))
            {
            if9.setBackground(Color.green);
            lf9.setText(w);
            }
            else if(k.equals("ij1"))
            {
            ij1.setBackground(Color.green);
            lj1.setText(w);
            
            }
            else if(k.equals("ij2"))
            {
            ij2.setBackground(Color.green);
            lj2.setText(w);
            }
            else if(k.equals("ij4"))
            {
            ij4.setBackground(Color.green);
            lj4.setText(w);
            }
            else if(k.equals("ij5"))
            {
           ij5.setBackground(Color.green); 
           lj5.setText(w);
            }
            else if(k.equals("ij13"))
            {
            ij13.setBackground(Color.green);
            lj13.setText(w);
            }
            else if(k.equals("ij12"))
            {
            ij12.setBackground(Color.green);
            lj12.setText(w);
            }
            else if(k.equals("ij10"))
            {
            ij10.setBackground(Color.green);
            lj10.setText(w);
            }
            else if(k.equals("ij9"))
            {
            ij9.setBackground(Color.green);
            lj9.setText(w);
            }
            else if(k.equals("ic1"))
            {
            ic1.setBackground(Color.green);
            lc1.setText(w);
            }
            else if(k.equals("ic3"))
            {
            ic3.setBackground(Color.green);
            lc3.setText(w);
            }
            else if(k.equals("ic5"))
            {
            ic5.setBackground(Color.green);
            lc5.setText(w);
            }
            else if(k.equals("ic13"))
            {
            ic13.setBackground(Color.green);
            lc13.setText(w);
            }
            else if(k.equals("ic11"))
            {
            ic11.setBackground(Color.green);
            lc11.setText(w);
            }
            c=0;
            }
        }
        else
        {
            
        if(k.equals("ip1"))
        {
            if(ip1.getText().equals(" 1"))
            {
                ip1.setText(" 0");
                
            }
            else if(ip1.getText().equals(" 0"))
            {
                ip1.setText(" x");
            }
            else 
            {
                ip1.setText(" 1");
            
            }
        }
        else if(k.equals("ip2"))
        {
        if(ip2.getText().equals(" 1"))
            {
                ip2.setText(" 0");
                
            }
            else if(ip2.getText().equals(" 0"))
            {
                ip2.setText(" x");
            }
            else 
            {
                ip2.setText(" 1");
            
            }
        }
        else if(k.equals("ip3"))
        {
        if(ip3.getText().equals(" 1"))
            {
                ip3.setText(" 0");
                
            }
            else if(ip3.getText().equals(" 0"))
            {
                ip3.setText(" x");
            }
            else 
            {
                ip3.setText(" 1");
            
            }
        }
        else if(k.equals("ip4"))
        {
        if(ip4.getText().equals(" 1"))
            {
                ip4.setText(" 0");
                
            }
            else if(ip4.getText().equals(" 0"))
            {
                ip4.setText(" x");
            }
            else 
            {
                ip4.setText(" 1");
            
            }
        
        }
        else if(k.equals("ip5"))
        {
        if(ip5.getText().equals(" 1"))
            {
                ip5.setText(" 0");
                
            }
            else if(ip5.getText().equals(" 0"))
            {
                ip5.setText(" x");
            }
            else 
            {
                ip5.setText(" 1");
            
            }
        
        }
        else if(k.equals("op1"))
        {
        if(op1.getText().equals(" 1"))
            {
                op1.setText(" 0");
                
            }
            else if(op1.getText().equals(" 0"))
            {
                op1.setText(" x");
            }
            else 
            {
                op1.setText(" 1");
            
            }
        
        }
        else if(k.equals("op2"))
        {
            if(op2.getText().equals(" 1"))
            {
                op2.setText(" 0");
                
            }
            else if(op2.getText().equals(" 0"))
            {
                op2.setText(" x");
            }
            else 
            {
                op2.setText(" 1");
            
            }
        
        }
        else if(k.equals("op3"))
        {
            if(op3.getText().equals(" 1"))
            {
                op3.setText(" 0");
                
            }
            else if(op3.getText().equals(" 0"))
            {
                op3.setText(" x");
            }
            else 
            {
                op3.setText(" 1");
            
            }
        }
        else if(k.equals("op4"))
        {
        
        if(op4.getText().equals(" 1"))
            {
                op4.setText(" 0");
                
            }
            else if(op4.getText().equals(" 0"))
            {
                op4.setText(" x");
            }
            else 
            {
                op4.setText(" 1");
            
            }
        }
        else if(k.equals("op5"))
        {
        if(op5.getText().equals(" 1"))
            {
                op5.setText(" 0");
                
            }
            else if(op5.getText().equals(" 0"))
            {
                op5.setText(" x");
            }
            else 
            {
                op5.setText(" 1");
            
            }
        
        }
        
        //.......................................................................
        
        if(s.equals("VCC"))
        {
            if(i14.getText().equals("14"))
            {
                i14.setText(" v");
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
            if(i14.getText().equals(" v")&&i7.getText().equals("G"))
            {
                i1.setText(" x");
                i2.setText(" x");
                i3.setText(" x");
                i4.setText(" x");
                i5.setText(" x");
                i6.setText(" x");
                i8.setText(" x");
                i9.setText(" x");
                i10.setText(" x");
                i11.setText(" x");
                i12.setText(" x");
                i13.setText(" x");
                
            
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
            if(i14.getText().equals(" v")&&i7.getText().equals("G"))
            {
                i1.setText(" x");
                i2.setText(" x");
                i3.setText(" x");
                i4.setText(" x");
                i5.setText(" x");
                i6.setText(" x");
                i8.setText(" x");
                i9.setText(" x");
                i10.setText(" x");
                i11.setText(" x");
                i12.setText(" x");
                i13.setText(" x");
                
            
            }
        
        
        }
        else if(s.equals("i1"))
        {
        if(i14.getText().equals(" v")&&i7.getText().equals("G"))
        {   if(l1.getText().equals("i1"))
            {
            if(i1.getText().equals(" x"))
            {
                i1.setText(" 1");i3.setText(" x");
            }
            else if(i1.getText().equals(" 1"))
            {
                i1.setText(" 0");i3.setText(" x");
            }
            else
            {
                i1.setText(" x");i3.setText(" x");
            
            }
            }
            else
            {
                if(l1.getText().equals("ip1"))
                {
                   String h = ip1.getText();
                   i1.setText(h);
                }
                else if(l1.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   i1.setText(h);
                }
                else if(l1.getText().equals("ip2"))
                {
                    String h = ip2.getText();
                   i1.setText(h);
                }
                else if(l1.getText().equals("ip3"))
                {
                    String h = ip3.getText();
                   i1.setText(h);
                }
                else if(l1.getText().equals("ip4"))
                {
                    String h = ip4.getText();
                   i1.setText(h);
                }
                else if(l1.getText().equals("ip5"))
                {
                    String h = ip5.getText();
                   i1.setText(h);
                }
                else if(l1.getText().equals("i3"))
                {
                    String h = i3.getText();
                   i1.setText(h);
                }
                else if(l1.getText().equals("i6"))
                {
                    String h = i6.getText();
                   i1.setText(h);
                }
                else if(l1.getText().equals("i8"))
                {
                    String h = i8.getText();
                   i1.setText(h);
                }
                else if(l1.getText().equals("i11"))
                {
                    String h = i11.getText();
                   i1.setText(h);
                }
            }
            
        }
        else
        {
            connect();
        }
        }
        else if(s.equals("i2"))
        {
            if(i14.getText().equals(" v")&&i7.getText().equals("G"))
        {
        if(i2.getText().equals(" x"))
            {
                i2.setText(" 1");i3.setText(" x");
            }
            else if(i2.getText().equals(" 1"))
            {
                i2.setText(" 0");i3.setText(" x");
            }
            else
            {
                i2.setText(" x");i3.setText(" x");
            
            }
        }
        else
        {
            connect();
        }
        
        }
        else if(s.equals("i4"))
        {
        if(i14.getText().equals(" v")&&i7.getText().equals("G"))
        {
        if(i4.getText().equals(" x"))
            {
                i4.setText(" 1");i6.setText(" x");
            }
            else if(i4.getText().equals(" 1"))
            {
                i4.setText(" 0");i6.setText(" x");
            }
            else
            {
                i4.setText(" x");i6.setText(" x");
            
            }
        }
        else
        {
            connect();
        }
        }
        else if(s.equals("i5"))
        {
        if(i14.getText().equals(" v")&&i7.getText().equals("G"))
        {
            if(i5.getText().equals(" x"))
            {
                i5.setText(" 1");i6.setText(" x");
            }
            else if(i5.getText().equals(" 1"))
            {
                i5.setText(" 0");i6.setText(" x");
            }
            else
            {
                i5.setText(" x");i6.setText(" x");
            
            }
        
        }
        else
        {
            connect();
        }
        }
        else if(s.equals("i9"))
        {
        if(i14.getText().equals(" v")&&i7.getText().equals("G"))
        {
            if(i9.getText().equals(" x"))
            {
                i9.setText(" 1");i8.setText(" x");
            }
            else if(i9.getText().equals(" 1"))
            {
                i9.setText(" 0");i8.setText(" x");
            }
            else
            {
                i9.setText(" x");i8.setText(" x");
            
            }
        }
        else
        {
            connect();
        }
        }
        else if(s.equals("i10"))
        {
        if(i14.getText().equals(" v")&&i7.getText().equals("G"))
        {
            if(i10.getText().equals(" x"))
            {
                i10.setText(" 1");i8.setText(" x");
            }
            else if(i10.getText().equals(" 1"))
            {
                i10.setText(" 0");i8.setText(" x");
            }
            else
            {
                i10.setText(" x");i8.setText(" x");
            
            }
        
        }
        else
        {
            connect();
        }
        }
        else if(s.equals("i12"))
        {
        if(i14.getText().equals(" v")&&i7.getText().equals("G"))
        {
        if(i12.getText().equals(" x"))
            {
                i12.setText(" 1");i11.setText(" x");
            }
            else if(i12.getText().equals(" 1"))
            {
                i12.setText(" 0");i11.setText(" x");
            }
            else
            {
                i12.setText(" x");i11.setText(" x");
            
            }
        }
        else
        {
            connect();
        }
        }
        else if(s.equals("i13"))
        {
        if(i14.getText().equals(" v")&&i7.getText().equals("G"))
        {
            if(i13.getText().equals(" x"))
            {
                i13.setText(" 1");i11.setText(" x");
            }
            else if(i13.getText().equals(" 1"))
            {
                i13.setText(" 0");i11.setText(" x");
            }
            else
            {
                i13.setText(" x");i11.setText(" x");
            
            }
        
        }
        else
        {
            connect();
        }
        }
        if(i14.getText().equals(" v")&&i7.getText().equals("G"))
        {
        if(i1.getText().equals(" 1")&&i2.getText().equals(" 1"))
        {
                i3.setText(" 1");
            
        }
        else if(i1.getText().equals(" x")||i2.getText().equals(" x"))
        {
        
            i3.setText(" x");
        }
        else
        {
                i3.setText(" 0");
        }
        if(i4.getText().equals(" 1")&&i5.getText().equals(" 1"))
        {
                i6.setText(" 1");
            
        }
        else if(i4.getText().equals(" x")||i5.getText().equals(" x"))
        {
        
            i6.setText(" x");
        }
        else
        {
                i6.setText(" 0");
        }
        if(i9.getText().equals(" 1")&&i10.getText().equals(" 1"))
        {
                i8.setText(" 1");
            
        }
        else if(i9.getText().equals(" x")||i10.getText().equals(" x"))
        {
        
            i8.setText(" x");
        }
        else
        {
                i8.setText(" 0");
        }
        if(i13.getText().equals(" 1")&&i12.getText().equals(" 1"))
        {
                i11.setText(" 1");
            
        }
        else if(i13.getText().equals(" x")||i12.getText().equals(" x"))
        {
        
            i11.setText(" x");
        }
        else
        {
                i11.setText(" 0");
        }
        }
        
        //.............................................................................
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
            connect1();
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
            connect1();
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
            connect1();
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
            connect1();
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
            connect1();
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
            connect1();
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
            connect1();
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
            connect1();
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
        //......................................................................
        if(s.equals("vcc2"))
        {
            if(ib14.getText().equals("14"))
            {
                ib14.setText(" v");
                ib14.setBackground(Color.red);
            }
            else
            {
             ib14.setText("14");
                ib14.setBackground(null);
                ib1.setText(" 1");
                ib2.setText(" 2");
                ib3.setText(" 3");
                ib4.setText(" 4");
                ib5.setText(" 5");
                ib6.setText(" 6");
                ib8.setText(" 8");
                ib9.setText(" 9");
                ib10.setText("10");
                ib11.setText("11");
                ib12.setText("12");
                ib13.setText("13");
            
            }
            if(ib14.getText().equals(" v")&&ib7.getText().equals("G"))
            {
                ib1.setText(" x");
                ib2.setText(" x");
                ib3.setText(" x");
                ib4.setText(" x");
                ib5.setText(" x");
                ib6.setText(" x");
                ib8.setText(" x");
                ib9.setText(" x");
                ib10.setText(" x");
                ib11.setText(" x");
                ib12.setText(" x");
                ib13.setText(" x");
                
            
            }
        }
        else if(s.equals("gr2"))
        {
            if(ib7.getText().equals(" 7"))
            {
                ib7.setText("G");
                ib7.setBackground(Color.GRAY);
            }
            else
            {
             ib7.setText(" 7");
                ib7.setBackground(null);
            ib1.setText(" 1");
                ib2.setText(" 2");
                ib3.setText(" 3");
                ib4.setText(" 4");
                ib5.setText(" 5");
                ib6.setText(" 6");
                ib8.setText(" 8");
                ib9.setText(" 9");
                ib10.setText("10");
                ib11.setText("11");
                ib12.setText("12");
                ib13.setText("13");
            }
            if(ib14.getText().equals(" v")&&ib7.getText().equals("G"))
            {
                ib1.setText(" x");
                ib2.setText(" x");
                ib3.setText(" x");
                ib4.setText(" x");
                ib5.setText(" x");
                ib6.setText(" x");
                ib8.setText(" x");
                ib9.setText(" x");
                ib10.setText(" x");
                ib11.setText(" x");
                ib12.setText(" x");
                ib13.setText(" x");
                
            
            }
        
        
        }
        else if(s.equals("ib1"))
        {
        if(ib14.getText().equals(" v")&&ib7.getText().equals("G"))
        {
            if(ib1.getText().equals(" x"))
            {
                ib1.setText(" 1");ib3.setText(" x");
            }
            else if(ib1.getText().equals(" 1"))
            {
                ib1.setText(" 0");ib3.setText(" x");
            }
            else
            {
                ib1.setText(" x");ib3.setText(" x");
            
            }
            
        }
        else
        {
            connect2();
        }
        }
        else if(s.equals("ib2"))
        {
            if(ib14.getText().equals(" v")&&ib7.getText().equals("G"))
        {
        if(ib2.getText().equals(" x"))
            {
                ib2.setText(" 1");ib3.setText(" x");
            }
            else if(ib2.getText().equals(" 1"))
            {
                ib2.setText(" 0");ib3.setText(" x");
            }
            else
            {
                ib2.setText(" x");ib3.setText(" x");
            
            }
        }
        else
        {
            connect2();
        }
        
        }
        else if(s.equals("ib4"))
        {
        if(ib14.getText().equals(" v")&&ib7.getText().equals("G"))
        {
        if(ib4.getText().equals(" x"))
            {
                ib4.setText(" 1");ib6.setText(" x");
            }
            else if(ib4.getText().equals(" 1"))
            {
                ib4.setText(" 0");ib6.setText(" x");
            }
            else
            {
                ib4.setText(" x");ib6.setText(" x");
            
            }
        }
        else
        {
            connect2();
        }
        }
        else if(s.equals("ib5"))
        {
        if(ib14.getText().equals(" v")&&ib7.getText().equals("G"))
        {
            if(ib5.getText().equals(" x"))
            {
                ib5.setText(" 1");ib6.setText(" x");
            }
            else if(ib5.getText().equals(" 1"))
            {
                ib5.setText(" 0");ib6.setText(" x");
            }
            else
            {
                ib5.setText(" x");ib6.setText(" x");
            
            }
        
        }
        else
        {
            connect2();
        }
        }
        else if(s.equals("ib9"))
        {
        if(ib14.getText().equals(" v")&&ib7.getText().equals("G"))
        {
            if(ib9.getText().equals(" x"))
            {
                ib9.setText(" 1");ib8.setText(" x");
            }
            else if(ib9.getText().equals(" 1"))
            {
                ib9.setText(" 0");ib8.setText(" x");
            }
            else
            {
                ib9.setText(" x");ib8.setText(" x");
            
            }
        }
        else
        {
            connect2();
        }
        }
        else if(s.equals("ib10"))
        {
        if(ib14.getText().equals(" v")&&ib7.getText().equals("G"))
        {
            if(ib10.getText().equals(" x"))
            {
                ib10.setText(" 1");ib8.setText(" x");
            }
            else if(ib10.getText().equals(" 1"))
            {
                ib10.setText(" 0");ib8.setText(" x");
            }
            else
            {
                ib10.setText(" x");ib8.setText(" x");
            
            }
        
        }
        else
        {
            connect2();
        }
        }
        else if(s.equals("ib12"))
        {
        if(ib14.getText().equals(" v")&&ib7.getText().equals("G"))
        {
        if(ib12.getText().equals(" x"))
            {
                ib12.setText(" 1");ib11.setText(" x");
            }
            else if(ib12.getText().equals(" 1"))
            {
                ib12.setText(" 0");ib11.setText(" x");
            }
            else
            {
                ib12.setText(" x");ib11.setText(" x");
            
            }
        }
        else
        {
            connect2();
        }
        }
        else if(s.equals("ib13"))
        {
        if(ib14.getText().equals(" v")&&ib7.getText().equals("G"))
        {
            if(ib13.getText().equals(" x"))
            {
                ib13.setText(" 1");ib11.setText(" x");
            }
            else if(ib13.getText().equals(" 1"))
            {
                ib13.setText(" 0");ib11.setText(" x");
            }
            else
            {
                ib13.setText(" x");ib11.setText(" x");
            
            }
        
        }
        else
        {
            connect2();
        }
        }
        if(ib14.getText().equals(" v")&&ib7.getText().equals("G"))
        {
        if(ib1.getText().equals(" 0")&&ib2.getText().equals(" 0"))
        {
                ib3.setText(" 0");
            
        }
        else if(ib1.getText().equals(" x")||ib2.getText().equals(" x"))
        {
        
            ib3.setText(" x");
        }
        else
        {
                ib3.setText(" 1");
        }
        if(ib4.getText().equals(" 0")&&ib5.getText().equals(" 0"))
        {
                ib6.setText(" 0");
            
        }
        else if(ib4.getText().equals(" x")||ib5.getText().equals(" x"))
        {
        
            ib6.setText(" x");
        }
        else
        {
                ib6.setText(" 1");
        }
        if(ib9.getText().equals(" 0")&&ib10.getText().equals(" 0"))
        {
                ib8.setText(" 0");
            
        }
        else if(ib9.getText().equals(" x")||ib10.getText().equals(" x"))
        {
        
            ib8.setText(" x");
        }
        else
        {
                ib8.setText(" 1");
        }
        if(ib13.getText().equals(" 0")&&ib12.getText().equals(" 0"))
        {
                ib11.setText(" 0");
            
        }
        else if(ib13.getText().equals(" x")||ib12.getText().equals(" x"))
        {
        
            ib11.setText(" x");
        }
        else
        {
                ib11.setText(" 1");
        }
        }
        //...........................................................................
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
        //..................................................................................
        
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
        //...............................................................................
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
        }
        //...............................................................................
    }
    public void connect()
    {
    if(i14.getText().equals(" v")&&!"G".equals(i7.getText()))
            {
        JOptionPane.showMessageDialog(null,"connect 7 to Ground");
            }
            else if(!" v".equals(i14.getText())&&i7.getText().equals("G"))
            {
             JOptionPane.showMessageDialog(null,"connect 14 to Vcc");
            }
            else
            {
             JOptionPane.showMessageDialog(null,"connect 14 to Vcc and 7 to Ground");
            }
    
    }
    public void connect1()
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
    public void connect2()
    {
    if(ib14.getText().equals(" v")&&!"G".equals(ib7.getText()))
            {
        JOptionPane.showMessageDialog(null,"connect 7 to Ground");
            }
            else if(!" v".equals(ib14.getText())&&ib7.getText().equals("G"))
            {
             JOptionPane.showMessageDialog(null,"connect 14 to Vcc");
            }
            else
            {
             JOptionPane.showMessageDialog(null,"connect 14 to Vcc and 7 to Ground");
            }
    }
     public void connect3()
    {
    if(ic14.getText().equals(" v")&&!"G".equals(ic7.getText()))
            {
        JOptionPane.showMessageDialog(null,"connect 7 to Ground");
            }
            else if(!" v".equals(ic14.getText())&&ic7.getText().equals("G"))
            {
             JOptionPane.showMessageDialog(null,"connect 14 to Vcc");
            }
            else
            {
             JOptionPane.showMessageDialog(null,"connect 14 to Vcc and 7 to Ground");
            }
    }
      public void connect4()
    {
    if(if14.getText().equals(" v")&&!"G".equals(if7.getText()))
            {
        JOptionPane.showMessageDialog(null,"connect 7 to Ground");
            }
            else if(!" v".equals(if14.getText())&&if7.getText().equals("G"))
            {
             JOptionPane.showMessageDialog(null,"connect 14 to Vcc");
            }
            else
            {
             JOptionPane.showMessageDialog(null,"connect 14 to Vcc and 7 to Ground");
            }
    }
       public void connect5()
    {
    if(ij14.getText().equals(" v")&&!"G".equals(ij7.getText()))
            {
        JOptionPane.showMessageDialog(null,"connect 7 to Ground");
            }
            else if(!" v".equals(ij14.getText())&&ij7.getText().equals("G"))
            {
             JOptionPane.showMessageDialog(null,"connect 14 to Vcc");
            }
            else
            {
             JOptionPane.showMessageDialog(null,"connect 14 to Vcc and 7 to Ground");
            }
    }
       
       public void change1()
       {
           String st = string;
           if(l1.getText().equals(st))
           {
               i1.setText(" 1");and11op();
           }
           if(l2.getText().equals(st))
           {
               i2.setText(" 1");and11op();
           }
           if(l4.getText().equals(st))
           {
               i4.setText(" 1");and12op();
           }
           if(l5.getText().equals(st))
           {
               i5.setText(" 1");and12op();
           }
           if(l10.getText().equals(st))
           {
               i10.setText(" 1");and13op();
           }
           if(l9.getText().equals(st))
           {
               i9.setText(" 1");and13op();
           }
           if(l13.getText().equals(st))
           {
               i13.setText(" 1");and14op();
           }
           if(l12.getText().equals(st))
           {
               i12.setText(" 1");and14op();
           }

	if(la1.getText().equals(st))
           {
               ia1.setText(" 1");and21op();
           }
           if(la2.getText().equals(st))
           {
               ia2.setText(" 1");and21op();
           }
           if(la4.getText().equals(st))
           {
               ia4.setText(" 1");and22op();
           }
           if(la5.getText().equals(st))
           {
               ia5.setText(" 1");and22op();
           }
           if(la10.getText().equals(st))
           {
               ia10.setText(" 1");and23op();
           }
           if(la9.getText().equals(st))
           {
               ia9.setText(" 1");and23op();
           }
           if(la13.getText().equals(st))
           {
               ia13.setText(" 1");and24op();
           }
           if(la12.getText().equals(st))
           {
               ia12.setText(" 1");and24op();
           }


if(lb1.getText().equals(st))
           {
               ib1.setText(" 1");or11op();
           }
           if(lb2.getText().equals(st))
           {
               ib2.setText(" 1");or11op();
           }
           if(lb4.getText().equals(st))
           {
               ib4.setText(" 1");or12op();
           }
           if(lb5.getText().equals(st))
           {
               ib5.setText(" 1");or12op();
           }
           if(lb10.getText().equals(st))
           {
               ib10.setText(" 1");or13op();
           }
           if(lb9.getText().equals(st))
           {
               ib9.setText(" 1");or13op();
           }
           if(lb13.getText().equals(st))
           {
               ib13.setText(" 1");or14op();
           }
           if(lb12.getText().equals(st))
           {
               ib12.setText(" 1");or14op();
           }




if(lf1.getText().equals(st))
           {
               if1.setText(" 1");nand11op();
           }
           if(lf2.getText().equals(st))
           {
               if2.setText(" 1");nand11op();
           }
           if(lf4.getText().equals(st))
           {
               if4.setText(" 1");nand12op();
           }
           if(lf5.getText().equals(st))
           {
               if5.setText(" 1");nand12op();
           }
           if(lf10.getText().equals(st))
           {
               if10.setText(" 1");nand13op();
           }
           if(lf9.getText().equals(st))
           {
               if9.setText(" 1");nand13op();
           }
           if(lf13.getText().equals(st))
           {
               if13.setText(" 1");nand14op();
           }
           if(lf12.getText().equals(st))
           {
               if12.setText(" 1");nand14op();
           }




if(lj1.getText().equals(st))
           {
               ij1.setText(" 1");xor11op();
           }
           if(lj2.getText().equals(st))
           {
               ij2.setText(" 1");xor11op();
           }
           if(lj4.getText().equals(st))
           {
               ij4.setText(" 1");xor12op();
           }
           if(lj5.getText().equals(st))
           {
               ij5.setText(" 1");xor12op();
           }
           if(lj10.getText().equals(st))
           {
               ij10.setText(" 1");xor13op();
           }
           if(lj9.getText().equals(st))
           {
               ij9.setText(" 1");xor13op();
           }
           if(lj13.getText().equals(st))
           {
               ij13.setText(" 1");xor14op();
           }
           if(lj12.getText().equals(st))
           {
               ij12.setText(" 1");xor14op();
           }


if(lc1.getText().equals(st))
           {
               ic1.setText(" 1");not11op();
           }
           if(lc2.getText().equals(st))
           {
               ic3.setText(" 1");not12op();
           }
           if(lc4.getText().equals(st))
           {
               ic5.setText(" 1");not13op();
           }
           if(lc5.getText().equals(st))
           {
               ic9.setText(" 1");not14op();
           }
           if(lc10.getText().equals(st))
           {
               ic11.setText(" 1");not15op();
           }
           if(lc9.getText().equals(st))
           {
               ic13.setText(" 1");not16op();
           }
         



       
       }
       public void change0()
       {
           String st = string;
           if(l1.getText().equals(st))
           {
               i1.setText(" 0");and11op();
           }
           if(l2.getText().equals(st))
           {
               i2.setText(" 0");and11op();
           }
           if(l4.getText().equals(st))
           {
               i4.setText(" 0");and12op();
           }
           if(l5.getText().equals(st))
           {
               i5.setText(" 0");and12op();
           }
           if(l10.getText().equals(st))
           {
               i10.setText(" 0");and13op();
           }
           if(l9.getText().equals(st))
           {
               i9.setText(" 0");and13op();
           }
           if(l13.getText().equals(st))
           {
               i13.setText(" 0");and14op();
           }
           if(l12.getText().equals(st))
           {
               i12.setText(" 0");and14op();
           }
           if(la1.getText().equals(st))
           {
               ia1.setText(" 0");and21op();
           }
           if(la2.getText().equals(st))
           {
               ia2.setText(" 0");and21op();
           }
           if(la4.getText().equals(st))
           {
               ia4.setText(" 0");and22op();
           }
           if(la5.getText().equals(st))
           {
               ia5.setText(" 0");and22op();
           }
           if(la10.getText().equals(st))
           {
               ia10.setText(" 0");and23op();
           }
           if(la9.getText().equals(st))
           {
               ia9.setText(" 0");and23op();
           }
           if(la13.getText().equals(st))
           {
               ia13.setText(" 0");and24op();
           }
           if(la12.getText().equals(st))
           {
               ia12.setText(" 0");and24op();
           }
           if(lb1.getText().equals(st))
           {
               ib1.setText(" 0");or11op();
           }
           if(lb2.getText().equals(st))
           {
               ib2.setText(" 0");or11op();
           }
           if(lb4.getText().equals(st))
           {
               ib4.setText(" 0");or12op();
           }
           if(lb5.getText().equals(st))
           {
               ib5.setText(" 0");or12op();
           }
           if(lb10.getText().equals(st))
           {
               ib10.setText(" 0");or13op();
           }
           if(lb9.getText().equals(st))
           {
               ib9.setText(" 0");or13op();
           }
           if(lb13.getText().equals(st))
           {
               ib13.setText(" 0");or14op();
           }
           if(lb12.getText().equals(st))
           {
               ib12.setText(" 0");or14op();
           }




           if(lf1.getText().equals(st))
           {
               if1.setText(" 0");nand11op();
           }
           if(lf2.getText().equals(st))
           {
               if2.setText(" 0");nand11op();
           }
           if(lf4.getText().equals(st))
           {
               if4.setText(" 0");nand12op();
           }
           if(lf5.getText().equals(st))
           {
               if5.setText(" 0");nand12op();
           }
           if(lf10.getText().equals(st))
           {
               if10.setText(" 0");nand13op();
           }
           if(lf9.getText().equals(st))
           {
               if9.setText(" 0");nand13op();
           }
           if(lf13.getText().equals(st))
           {
               if13.setText(" 0");nand14op();
           }
           if(lf12.getText().equals(st))
           {
               if12.setText(" 0");nand14op();
           }




if(lj1.getText().equals(st))
           {
               ij1.setText(" 0");xor11op();
           }
           if(lj2.getText().equals(st))
           {
               ij2.setText(" 0");xor11op();
           }
           if(lj4.getText().equals(st))
           {
               ij4.setText(" 0");xor12op();
           }
           if(lj5.getText().equals(st))
           {
               ij5.setText(" 0");xor12op();
           }
           if(lj10.getText().equals(st))
           {
               ij10.setText(" 0");xor13op();
           }
           if(lj9.getText().equals(st))
           {
               ij9.setText(" 0");xor13op();
           }
           if(lj13.getText().equals(st))
           {
               ij13.setText(" 0");xor14op();
           }
           if(lj12.getText().equals(st))
           {
               ij12.setText(" 0");xor14op();
           }


            if(lc1.getText().equals(st))
           {
               ic1.setText(" 0");not11op();
           }
           if(lc2.getText().equals(st))
           {
               ic3.setText(" 0");not12op();
           }
           if(lc4.getText().equals(st))
           {
               ic5.setText(" 0");not13op();
           }
           if(lc5.getText().equals(st))
           {
               ic9.setText(" 0");not14op();
           }
           if(lc10.getText().equals(st))
           {
               ic11.setText(" 0");not15op();
           }
           if(lc9.getText().equals(st))
           {
               ic13.setText(" 0");not16op();
           }
                


       
       }
       public void changex()
       {
           String st = string;
           if(l1.getText().equals(st))
           {
               i1.setText(" x");and11op();
           }
           if(l2.getText().equals(st))
           {
               i2.setText(" x");and11op();
           }
           if(l4.getText().equals(st))
           {
               i4.setText(" x");and12op();
           }
           if(l5.getText().equals(st))
           {
               i5.setText(" x");and12op();
           }
           if(l10.getText().equals(st))
           {
               i10.setText(" x");and13op();
           }
           if(l9.getText().equals(st))
           {
               i9.setText(" x");and13op();
           }
           if(l13.getText().equals(st))
           {
               i13.setText(" x");and14op();
           }
           if(l12.getText().equals(st))
           {
               i12.setText(" x");and14op();
           }
		if(la1.getText().equals(st))
           {
               ia1.setText(" x");and21op();
           }
           if(la2.getText().equals(st))
           {
               ia2.setText(" x");and21op();
           }
           if(la4.getText().equals(st))
           {
               ia4.setText(" x");and22op();
           }
           if(la5.getText().equals(st))
           {
               ia5.setText(" x");and22op();
           }
           if(la10.getText().equals(st))
           {
               ia10.setText(" x");and23op();
           }
           if(la9.getText().equals(st))
           {
               ia9.setText(" x");and23op();
           }
           if(la13.getText().equals(st))
           {
               ia13.setText(" x");and24op();
           }
           if(la12.getText().equals(st))
           {
               ia12.setText(" x");and24op();
           }


if(lb1.getText().equals(st))
           {
               ib1.setText(" x");or11op();
           }
           if(lb2.getText().equals(st))
           {
               ib2.setText(" x");or11op();
           }
           if(lb4.getText().equals(st))
           {
               ib4.setText(" x");or12op();
           }
           if(lb5.getText().equals(st))
           {
               ib5.setText(" x");or12op();
           }
           if(lb10.getText().equals(st))
           {
               ib10.setText(" x");or13op();
           }
           if(lb9.getText().equals(st))
           {
               ib9.setText(" x");or13op();
           }
           if(lb13.getText().equals(st))
           {
               ib13.setText(" x");or14op();
           }
           if(lb12.getText().equals(st))
           {
               ib12.setText(" x");or14op();
           }




if(lf1.getText().equals(st))
           {
               if1.setText(" x");nand11op();
           }
           if(lf2.getText().equals(st))
           {
               if2.setText(" x");nand11op();
           }
           if(lf4.getText().equals(st))
           {
               if4.setText(" x");nand12op();
           }
           if(lf5.getText().equals(st))
           {
               if5.setText(" x");nand12op();
           }
           if(lf10.getText().equals(st))
           {
               if10.setText(" x");nand13op();
           }
           if(lf9.getText().equals(st))
           {
               if9.setText(" x");nand13op();
           }
           if(lf13.getText().equals(st))
           {
               if13.setText(" x");nand14op();
           }
           if(lf12.getText().equals(st))
           {
               if12.setText(" x");nand14op();
           }




if(lj1.getText().equals(st))
           {
               ij1.setText(" x");xor11op();
           }
           if(lj2.getText().equals(st))
           {
               ij2.setText(" x");xor11op();
           }
           if(lj4.getText().equals(st))
           {
               ij4.setText(" x");xor12op();
           }
           if(lj5.getText().equals(st))
           {
               ij5.setText(" x");xor12op();
           }
           if(lj10.getText().equals(st))
           {
               ij10.setText(" x");xor13op();
           }
           if(lj9.getText().equals(st))
           {
               ij9.setText(" x");xor13op();
           }
           if(lj13.getText().equals(st))
           {
               ij13.setText(" x");xor14op();
           }
           if(lj12.getText().equals(st))
           {
               ij12.setText(" x");xor14op();
           }


if(lc1.getText().equals(st))
           {
               ic1.setText(" x");not11op();
           }
           if(lc2.getText().equals(st))
           {
               ic3.setText(" x");not12op();
           }
           if(lc4.getText().equals(st))
           {
               ic5.setText(" x");not13op();
           }
           if(lc5.getText().equals(st))
           {
               ic9.setText(" x");not14op();
           }
           if(lc10.getText().equals(st))
           {
               ic11.setText(" x");not15op();
           }
           if(lc9.getText().equals(st))
           {
               ic13.setText(" x");not16op();
           }
         }

        public void and11op()
       {
           if(i1.getText().equals(" 1")&&i2.getText().equals(" 1"))
            {
                i3.setText(" 1");string = "i3";change1();
            
                }
                else if(i1.getText().equals(" x")||i2.getText().equals(" x"))
                {
        
            i3.setText(" x");string = "i3";changex();
            }
                else
                {
                i3.setText(" 0");string = "i3";change0();
                }
       
       }
       public void and14op()
       {
        if(i13.getText().equals(" 1")&&i12.getText().equals(" 1"))
        {
                i11.setText(" 1");string = "i11";change1();
            
        }
        else if(i13.getText().equals(" x")||i12.getText().equals(" x"))
        {
        
            i11.setText(" x");string = "i11";changex();
        }
        else
        {
                i11.setText(" 0");string = "i11";change0();
        }
            
       
       }
       public void and12op()
       {
         if(i4.getText().equals(" 1")&&i5.getText().equals(" 1"))
        {
                i6.setText(" 1");string = "i6";change1();
            
        }
        else if(i4.getText().equals(" x")||i5.getText().equals(" x"))
        {
        
            i6.setText(" x");string = "i6";changex();
        }
        else
        {
                i6.setText(" 0");string = "i6";change0();
        }
       
       }
       
       public void and13op()
       {
         if(i9.getText().equals(" 1")&&i10.getText().equals(" 1"))
        {
                i8.setText(" 1");string = "i8";change1();
            
        }
        else if(i9.getText().equals(" x")||i10.getText().equals(" x"))
        {
        
            i8.setText(" x");string = "i8";changex();
        }
        else
        {
                i8.setText(" 0");string = "i8";change0();
        }
       }

       
       public void set()
       {
       op1.setBackground(null);
            op2.setBackground(null);
            op3.setBackground(null);
            op4.setBackground(null);
            op5.setBackground(null);
            
            i1.setBackground(null);
            i2.setBackground(null);
            i4.setBackground(null);
            i5.setBackground(null);
            i10.setBackground(null);
            i9.setBackground(null);
            i13.setBackground(null);
            i12.setBackground(null);
            
            ia1.setBackground(null);
            ia2.setBackground(null);
            ia4.setBackground(null);
            ia5.setBackground(null);
            ia10.setBackground(null);
            ia9.setBackground(null);
            ia13.setBackground(null);
            ia12.setBackground(null);
            
            ib1.setBackground(null);
            ib2.setBackground(null);
            ib4.setBackground(null);
            ib5.setBackground(null);
            ib10.setBackground(null);
            ib9.setBackground(null);
            ib13.setBackground(null);
            ib12.setBackground(null);
            
            if1.setBackground(null);
            if2.setBackground(null);
            if4.setBackground(null);
            if5.setBackground(null);
            if10.setBackground(null);
            if9.setBackground(null);
            if13.setBackground(null);
            if12.setBackground(null);
            
            ij1.setBackground(null);
            ij2.setBackground(null);
            ij4.setBackground(null);
            ij5.setBackground(null);
            ij10.setBackground(null);
            ij9.setBackground(null);
            ij13.setBackground(null);
            ij12.setBackground(null);
            
            ic1.setBackground(null);
            ic3.setBackground(null);
            ic5.setBackground(null);
            ic9.setBackground(null);
            ic11.setBackground(null);
            ic13.setBackground(null);
            ip1.setBackground(null);
                ip2.setBackground(null);ip3.setBackground(null);ip4.setBackground(null);ip5.setBackground(null);
                i3.setBackground(null);i6.setBackground(null);i8.setBackground(null);i11.setBackground(null);
                ia3.setBackground(null);ia6.setBackground(null);ia8.setBackground(null);ia11.setBackground(null);
                ib3.setBackground(null);ib6.setBackground(null);ib8.setBackground(null);ib11.setBackground(null);
                ic2.setBackground(null);ic4.setBackground(null);ic6.setBackground(null);ic8.setBackground(null);ic10.setBackground(null);ic12.setBackground(null);
                if3.setBackground(null);if6.setBackground(null);if8.setBackground(null);if11.setBackground(null);
                ij3.setBackground(null);ij6.setBackground(null);ij8.setBackground(null);ij11.setBackground(null);
       
       }
       
      public void and21op()
       {
           if(ia1.getText().equals(" 1")&&ia2.getText().equals(" 1"))
            {
                ia3.setText(" 1");string = "ia3";change1();
            
                }
                else if(ia1.getText().equals(" x")||ia2.getText().equals(" x"))
                {
        
            ia3.setText(" x");string = "ia3";changex();
            }
                else
                {
                ia3.setText(" 0");string = "ia3";change0();
                }
       
       }
       public void and24op()
       {
        if(ia13.getText().equals(" 1")&&ia12.getText().equals(" 1"))
        {
                ia11.setText(" 1");string = "ia11";change1();
            
        }
        else if(ia13.getText().equals(" x")||ia12.getText().equals(" x"))
        {
        
            ia11.setText(" x");string = "ia11";changex();
        }
        else
        {
                ia11.setText(" 0");string = "ia11";change0();
        }
            
       
       }
       public void and22op()
       {
         if(ia4.getText().equals(" 1")&&ia5.getText().equals(" 1"))
        {
                ia6.setText(" 1");string = "ia6";change1();
            
        }
        else if(ia4.getText().equals(" x")||ia5.getText().equals(" x"))
        {
        
            ia6.setText(" x");string = "ia6";changex();
        }
        else
        {
                ia6.setText(" 0");string = "ia6";change0();
        }
       
       }
       
       public void and23op()
       {
         if(ia9.getText().equals(" 1")&&ia10.getText().equals(" 1"))
        {
                ia8.setText(" 1");string = "ia8";change1();
            
        }
        else if(ia9.getText().equals(" x")||ia10.getText().equals(" x"))
        {
        
            ia8.setText(" x");string = "ia8";changex();
        }
        else
        {
                ia8.setText(" 0");string = "ia8";change0();
        }
       }
       public void or11op()
       {
           if(ib1.getText().equals(" 0")&&ib2.getText().equals(" 0"))
            {
                ib3.setText(" 0");string = "ib3";change1();
            
                }
                else if(ib1.getText().equals(" x")||ib2.getText().equals(" x"))
                {
        
            ib3.setText(" x");string = "ib3";changex();
            }
                else
                {
                ib3.setText(" 1");string = "ib3";change0();
                }
       
       }
       public void or14op()
       {
        if(ib13.getText().equals(" 0")&&ib12.getText().equals(" 0"))
        {
                ib11.setText(" 0");string = "ib11";change1();
            
        }
        else if(ib13.getText().equals(" x")||ib12.getText().equals(" x"))
        {
        
            ib11.setText(" x");string = "ib11";changex();
        }
        else
        {
                ib11.setText(" 1");string = "ib11";change0();
        }
            
       
       }
       public void or12op()
       {
         if(ib4.getText().equals(" 0")&&ib5.getText().equals(" 0"))
        {
                ib6.setText(" 0");string = "ib6";change1();
            
        }
        else if(ib4.getText().equals(" x")||ib5.getText().equals(" x"))
        {
        
            ib6.setText(" x");string = "ib6";changex();
        }
        else
        {
                ib6.setText(" 1");string = "ib6";change0();
        }
       
       }
       
       public void or13op()
       {
         if(ib9.getText().equals(" 0")&&ib10.getText().equals(" 0"))
        {
                ib8.setText(" 0");string = "ib8";change1();
            
        }
        else if(ib9.getText().equals(" x")||ib10.getText().equals(" x"))
        {
        
            ib8.setText(" x");string = "ib8";changex();
        }
        else
        {
                ib8.setText(" 1");string = "ib8";change0();
        }
       }
       public void not11op()
       {
           if(ic1.getText().equals(" 0"))
        {
                ic2.setText(" 1");
            string = "ic2";change1();
        }
        else if(ic1.getText().equals(" x"))
        {
        
            ic2.setText(" x");string = "ic2";changex();
        }
        else
        {
                ic2.setText(" 0");string = "ic2";change0();
        }
       
       
        
        
       
       
       }
       public void not12op()
       {
        if(ic3.getText().equals(" 0"))
        {
                ic4.setText(" 1");string = "ic4";change1();
            
        }
        else if(ic3.getText().equals(" x"))
        {
        
            ic4.setText(" x");string = "ic4";changex();
        }
        else
        {
                ic4.setText(" 0");string = "ic4";change0();
        }
       }
       public void not13op()
       {
        if(ic5.getText().equals(" 0"))
        {
                ic6.setText(" 1");string = "ic6";change1();
            
        }
        else if(ic5.getText().equals(" x"))
        {
        
            ic6.setText(" x");string = "ic6";changex();
        }
        else
        {
                ic6.setText(" 0");string = "ic6";change0();
        }
       }
       public void not14op()
       {
       if(ic9.getText().equals(" 0"))
        {
                ic8.setText(" 1");string = "ic8";change1();
            
        }
        else if(ic9.getText().equals(" x"))
        {
        
            ic8.setText(" x");string = "ic8";changex();
        }
        else
        {
                ic8.setText(" 0");string = "ic8";change0();
        }
       }
       public void not15op()
       {
       if(ic11.getText().equals(" 0"))
        {
                ic10.setText(" 1");string = "ic10";change1();
            
        }
        else if(ic11.getText().equals(" x"))
        {
        
            ic10.setText(" x");string = "ic10";changex();
        }
        else
        {
                ic10.setText(" 0");string = "ic10";change0();
        }
       }
       public void not16op()
       {
            if(ic13.getText().equals(" 0"))
        {
                ic12.setText(" 1");string = "ic12";change1();
            
        }
        else if(ic13.getText().equals(" x"))
        {
        
            ic12.setText(" x");string = "ic12";changex();
        }
        else
        {
                ic12.setText(" 0");string = "ic12";change0();
        }
       
       }
       
       public void nand11op()
       {
           if(if1.getText().equals(" 1")&&if2.getText().equals(" 1"))
            {
                if3.setText(" 0");string = "if3";change1();
            
                }
                else if(if1.getText().equals(" x")||if2.getText().equals(" x"))
                {
        
            if3.setText(" x");string = "if3";changex();
            }
                else
                {
                if3.setText(" 1");string = "if3";change0();
                }
       
       }
       public void nand14op()
       {
        if(if13.getText().equals(" 1")&&if12.getText().equals(" 1"))
        {
                if11.setText(" 0");string = "if11";change1();
            
        }
        else if(if13.getText().equals(" x")||if12.getText().equals(" x"))
        {
        
            if11.setText(" x");string = "if11";changex();
        }
        else
        {
                if11.setText(" 1");string = "if11";change0();
        }
            
       
       }
       public void nand12op()
       {
         if(if4.getText().equals(" 1")&&if5.getText().equals(" 1"))
        {
                if6.setText(" 0");string = "if6";change1();
            
        }
        else if(if4.getText().equals(" x")||if5.getText().equals(" x"))
        {
        
            if6.setText(" x");string = "if6";changex();
        }
        else
        {
                if6.setText(" 1");string = "if6";change0();
        }
       
       }
       
       public void nand13op()
       {
         if(if9.getText().equals(" 1")&&if10.getText().equals(" 1"))
        {
                if8.setText(" 0");string = "if8";change1();
            
        }
        else if(if9.getText().equals(" x")||if10.getText().equals(" x"))
        {
        
            if8.setText(" x");string = "if8";changex();
        }
        else
        {
                if8.setText(" 1");string = "if8";change0();
        }
       }
       public void xor11op()
       {
           if((ij1.getText().equals(" 0")&&ij2.getText().equals(" 1"))||(ij1.getText().equals(" 1")&&ij2.getText().equals(" 0")))
            {
                ij3.setText(" 1");string = "ij3";change1();
            
                }
                else if(ij1.getText().equals(" x")||ij2.getText().equals(" x"))
                {
        
            ij3.setText(" x");string = "ij3";changex();
            }
                else
                {
                ij3.setText(" 0");string = "ij3";change0();
                }
       
       }
       public void xor14op()
       {
        if(ij13.getText().equals(" 0")&&ij12.getText().equals(" 1")||ij13.getText().equals(" 0")&&ij12.getText().equals(" 1"))
        {
                ij11.setText(" 1");string = "ij11";change1();
            
        }
        else if(ij13.getText().equals(" x")||ij12.getText().equals(" x"))
        {
        
            ij11.setText(" x");string = "ij11";changex();
        }
        else
        {
                ij11.setText(" 0");string = "ij11";change0();
        }
            
       
       }
       public void xor12op()
       {
         if(ij4.getText().equals(" 1")&&ij5.getText().equals(" 1"))
        {
                ij6.setText(" 1");string = "ij6";change1();
            
        }
        else if(ij4.getText().equals(" x")||ij5.getText().equals(" x"))
        {
        
            ij6.setText(" x");string = "ij6";changex();
        }
        else
        {
                ij6.setText(" 0");string = "ij6";change0();
        }
       
       }
       
       public void xor13op()
       {
         if(ij9.getText().equals(" 1")&&ij10.getText().equals(" 1"))
        {
                ij8.setText(" 1");string = "ij8";change1();
            
        }
        else if(ij9.getText().equals(" x")||ij10.getText().equals(" x"))
        {
        
            ij8.setText(" x");string = "ij8";changex();
        }
        else
        {
                ij8.setText(" 0");string = "ij8";change0();
        }
       }



}
