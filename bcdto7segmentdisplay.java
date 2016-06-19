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
public class bcdto7segmentdisplay implements ActionListener{
        public static void main(String arg[]){
            
            bcdto7segmentdisplay bcd = new bcdto7segmentdisplay();
            
        }
        
        private JButton header;
        private JButton mid;
        private JButton tail;
        private JButton start;
        private JFrame frame;
        private JPanel p1;
        private JPanel p2;
        private JPanel p3;
        private JPanel p4;
        private JButton i1;
        private JButton i2;
        private JButton i3;
        private JButton i4;
        //......................................................................
        private JPanel tt1;
        private JPanel tt2;
        private JButton A;
        private JButton B;
        private JButton C;
        private JButton D;
        private JButton a;
        private JButton b;
        private JButton c;
        private JButton d;
        private JButton e;
        private JButton f;
        private JButton g;
        //......................................................................
        private JPanel ttt1;
        private JPanel ttt2;
        private JButton Aa;
        private JButton Ba;
        private JButton Ca;
        private JButton Da;
        private JButton aa;
        private JButton ba;
        private JButton ca;
        private JButton da;
        private JButton ea;
        private JButton fa;
        private JButton ga;
        //.......................................................................
        private JPanel ttz1;
        private JPanel ttz2;
        private JButton As;
        private JButton Bs;
        private JButton Cs;
        private JButton Ds;
        private JButton as;
        private JButton bs;
        private JButton cs;
        private JButton ds;
        private JButton es;
        private JButton fs;
        private JButton gs;
        
        //.......................................................................
        
        private JPanel ttw1;
        private JPanel ttw2;
        private JButton Ax;
        private JButton Bx;
        private JButton Cx;
        private JButton Dx;
        private JButton ax;
        private JButton bx;
        private JButton cx;
        private JButton dx;
        private JButton ex;
        private JButton fx;
        private JButton gx;
        //..........................................................................
         private JPanel tte1;
        private JPanel tte2;
        private JButton Ad;
        private JButton Bd;
        private JButton Cd;
        private JButton Dd;
        private JButton ad;
        private JButton bd;
        private JButton cd;
        private JButton dd;
        private JButton ed;
        private JButton fd;
        private JButton gd;
        
        
        //.........................................................................
         private JPanel ttr1;
        private JPanel ttr2;
        private JButton Af;
        private JButton Bf;
        private JButton Cf;
        private JButton Df;
        private JButton af;
        private JButton bf;
        private JButton cf;
        private JButton df;
        private JButton ef;
        private JButton ff;
        private JButton gf;
        //.......................................................................
         private JPanel ttq1;
        private JPanel ttq2;
        private JButton Ag;
        private JButton Bg;
        private JButton Cg;
        private JButton Dg;
        private JButton ag;
        private JButton bg;
        private JButton cg;
        private JButton dg;
        private JButton eg;
        private JButton fg;
        private JButton gg;
        //.........................................................................
        private JPanel tty1;
        private JPanel tty2;
        private JButton Ay;
        private JButton By;
        private JButton Cy;
        private JButton Dy;
        private JButton ay;
        private JButton by;
        private JButton cy;
        private JButton dy;
        private JButton ey;
        private JButton fy;
        private JButton gy;
       
        //.........................................................................
        
        private JPanel ttu1;
        private JPanel ttu2;
        private JButton Au;
        private JButton Bu;
        private JButton Cu;
        private JButton Du;
        private JButton au;
        private JButton bu;
        private JButton cu;
        private JButton du;
        private JButton eu;
        private JButton fu;
        private JButton gu;
        //..........................................................................
        private JPanel tth1;
        private JPanel tth2;
        private JButton Ah;
        private JButton Bh;
        private JButton Ch;
        private JButton Dh;
        private JButton ah;
        private JButton bh;
        private JButton ch;
        private JButton dh;
        private JButton eh;
        private JButton fh;
        private JButton gh;
        //..........................................................................
        private JPanel tti1;
        private JPanel tti2;
        private JButton Ai;
        private JButton Bi;
        private JButton Ci;
        private JButton Di;
        private JButton ai;
        private JButton bi;
        private JButton ci;
        private JButton di;
        private JButton ei;
        private JButton fi;
        private JButton gi;
        //........................................................................
        private JButton d1;
        private JButton d2;
        private JButton d3;
        private JButton d4;
        private JButton d5;
        private JButton d6;
        private JButton d7;
        //.........................................................................
        public bcdto7segmentdisplay()
        {
        header = new JButton("BCD to 7-Segment Display");
    header.setFont(new Font("Serif", Font.BOLD, 10));
    header.setBounds(0,0,880,25);
    tail = new JButton("CSE01@Batch06");
    tail.setBounds(0,560,880,20);
    mid = new JButton("");
     mid.setBounds(525, 25, 10, 535);
        //...........................label...........................................
     JLabel label =  new JLabel("BCD INPUTS");
      header.setFont(new Font("Serif", Font.BOLD, 25));
      label.setBounds(20,40,100,20);
      start = new JButton("START");
      start.setActionCommand("START");
      start.addActionListener(this);
      start.setBounds(350,35,80,30);
      
    //................................inputs.......................................... 
     p1 = new JPanel();
     p1.setBounds(10,70,220,50);
     JLabel lable1 = new JLabel("Input 1(A)");
     i1 = new JButton("0");
     i1.setActionCommand("one");
     i1.addActionListener(this);
     p1.add(lable1);
     p1.add(i1);
     
     p2 = new JPanel();
     p2.setBounds(10,120,220,50);
     JLabel lable2 = new JLabel("Input 2(B)");
     i2 = new JButton("0");
     i2.setActionCommand("two");
      i2.addActionListener(this);
     p2.add(lable2);
     p2.add(i2);
     
     p3 = new JPanel();
     p3.setBounds(180,70,220,50);
     JLabel lable3 = new JLabel("Input 3(C)");
     i3 = new JButton("0");
     i3.setActionCommand("three");
      i3.addActionListener(this);
     p3.add(lable3);
     p3.add(i3);
     
     p4 = new JPanel();
     p4.setBounds(180,120,220,50);
     JLabel lable4 = new JLabel("Input 4(D)");
     i4 = new JButton("0");
     i4.setActionCommand("four");
      i4.addActionListener(this);
     p4.add(lable4);
     p4.add(i4);
     
     //.........................................................................
     
     JLabel truth = new JLabel("TRUTH TABLE");
    truth.setFont(new Font("Serif", Font.BOLD, 16)); 
    truth.setBounds(190,155,150,50);
     
    JButton t1 = new JButton("INPUTS");
    t1.setBounds(5,195,190,20);
     JButton t2 = new JButton("OUTPUTS");
     t2.setBounds(200,195,325,20);
     
     tt1 = new JPanel();
     tt1.setBounds(0,215,200,30);
     
     tt2 = new JPanel();
     tt2.setBounds(185,215,350,30);
     
     A = new JButton("A");
     B = new JButton("B");
     C = new JButton("C");
     D = new JButton("D");
     
     a = new JButton("a");
     b = new JButton("b");
     c = new JButton("c");
     d = new JButton("d");
     e = new JButton("e");
     f = new JButton("f");
     g = new JButton("g");
     
     tt1.add(A);tt1.add(B);tt1.add(C);tt1.add(D);
     tt2.add(a);tt2.add(b);tt2.add(c);tt2.add(d);tt2.add(e);tt2.add(f);tt2.add(g);
     //........................................................................
     
     ttt1 = new JPanel();
     ttt1.setBounds(0,245,200,30);
     
     ttt2 = new JPanel();
     ttt2.setBounds(187,245,350,30);
     
     Aa = new JButton("0");
     Aa.setBackground(Color.white);
     Ba = new JButton("0");
     Ba.setBackground(Color.white);
     Ca = new JButton("0");
     Ca.setBackground(Color.white);
     Da = new JButton("0");
     Da.setBackground(Color.white);
     
     aa = new JButton("1");
     aa.setBackground(Color.white);
     ba = new JButton("1");
     ba.setBackground(Color.white);
     ca = new JButton("1");
     ca.setBackground(Color.white);
     da = new JButton("1");
     da.setBackground(Color.white);
     ea = new JButton("1");
     ea.setBackground(Color.white);
     fa = new JButton("1");
     fa.setBackground(Color.white);
     ga = new JButton("0");
     ga.setBackground(Color.white);
     ttt1.add(Aa);ttt1.add(Ba);ttt1.add(Ca);ttt1.add(Da);
     ttt2.add(aa);ttt2.add(ba);ttt2.add(ca);ttt2.add(da);ttt2.add(ea);ttt2.add(fa);ttt2.add(ga);
     //...............................................................................
     
     ttz1 = new JPanel();
     ttz1.setBounds(0,275,200,30);
     
     ttz2 = new JPanel();
     ttz2.setBounds(187,275,350,30);
     
     As = new JButton("0");
     As.setBackground(Color.white);
     Bs = new JButton("0");
     Bs.setBackground(Color.white);
     Cs = new JButton("0");
     Cs.setBackground(Color.white);
     Ds = new JButton("1");
     Ds.setBackground(Color.white);
     
     as = new JButton("0");
     as.setBackground(Color.white);
     bs = new JButton("1");
     bs.setBackground(Color.white);
     cs = new JButton("1");
     cs.setBackground(Color.white);
     ds = new JButton("0");
     ds.setBackground(Color.white);
     es = new JButton("0");
     es.setBackground(Color.white);
     fs = new JButton("0");
     fs.setBackground(Color.white);
     gs = new JButton("0");
     gs.setBackground(Color.white);
     ttz1.add(As);ttz1.add(Bs);ttz1.add(Cs);ttz1.add(Ds);
     ttz2.add(as);ttz2.add(bs);ttz2.add(cs);ttz2.add(ds);ttz2.add(es);ttz2.add(fs);ttz2.add(gs);
     //.......................................................................
      ttw1 = new JPanel();
      ttw1.setBounds(0,305,200,30);
     
     ttw2 = new JPanel();
     ttw2.setBounds(187,305,350,30);
     
     Ax = new JButton("0");
     Ax.setBackground(Color.white);
     Bx = new JButton("0");
     Bx.setBackground(Color.white);
     Cx = new JButton("1");
     Cx.setBackground(Color.white);
     Dx = new JButton("0");
     Dx.setBackground(Color.white);
     
     ax = new JButton("1");
     ax.setBackground(Color.white);
     bx = new JButton("1");
     bx.setBackground(Color.white);
     cx = new JButton("0");
     cx.setBackground(Color.white);
     dx = new JButton("1");
     dx.setBackground(Color.white);
     ex = new JButton("1");
     ex.setBackground(Color.white);
     fx = new JButton("0");
     fx.setBackground(Color.white);
     gx = new JButton("1");
     gx.setBackground(Color.white);
     ttw1.add(Ax);ttw1.add(Bx);ttw1.add(Cx);ttw1.add(Dx);
     ttw2.add(ax);ttw2.add(bx);ttw2.add(cx);ttw2.add(dx);ttw2.add(ex);ttw2.add(fx);ttw2.add(gx);
     
     
     //..........................................................................
     
      tte1 = new JPanel();
      tte1.setBounds(0,335,200,30);
     
     tte2 = new JPanel();
     tte2.setBounds(187,335,350,30);
     
     Ad = new JButton("0");
     Ad.setBackground(Color.white);
     Bd = new JButton("0");
     Bd.setBackground(Color.white);
     Cd = new JButton("1");
     Cd.setBackground(Color.white);
     Dd = new JButton("1");
     Dd.setBackground(Color.white);
    
     ad = new JButton("1");
     ad.setBackground(Color.white);
     bd = new JButton("1");
     bd.setBackground(Color.white);
     cd = new JButton("1");
     cd.setBackground(Color.white);
     dd = new JButton("1");
     dd.setBackground(Color.white);
     ed = new JButton("0");
     ed.setBackground(Color.white);
     fd = new JButton("0");
     fd.setBackground(Color.white);
     gd = new JButton("1");
     gd.setBackground(Color.white);
     tte1.add(Ad);tte1.add(Bd);tte1.add(Cd);tte1.add(Dd);
     tte2.add(ad);tte2.add(bd);tte2.add(cd);tte2.add(dd);tte2.add(ed);tte2.add(fd);tte2.add(gd);
     
     
     //...........................................................................
      ttr1 = new JPanel();
      ttr1.setBounds(0,365,200,30);
     
     ttr2 = new JPanel();
     ttr2.setBounds(187,365,350,30);
     
     Af = new JButton("0");
     Af.setBackground(Color.white);
     Bf = new JButton("1");
     Bf.setBackground(Color.white);
     Cf = new JButton("0");
     Cf.setBackground(Color.white);
     Df = new JButton("0");
     Df.setBackground(Color.white);
     
     af = new JButton("0");
     af.setBackground(Color.white);
     bf = new JButton("1");
     bf.setBackground(Color.white);
     cf = new JButton("1");
     cf.setBackground(Color.white);
     df = new JButton("0");
     df.setBackground(Color.white);
     ef = new JButton("0");
     ef.setBackground(Color.white);
     ff = new JButton("1");
     ff.setBackground(Color.white);
     gf = new JButton("1");
     gf.setBackground(Color.white);
     ttr1.add(Af);ttr1.add(Bf);ttr1.add(Cf);ttr1.add(Df);
     ttr2.add(af);ttr2.add(bf);ttr2.add(cf);ttr2.add(df);ttr2.add(ef);ttr2.add(ff);ttr2.add(gf);
     
     //...........................................................................
      ttq1 = new JPanel();
      ttq1.setBounds(0,395,200,30);
     
     ttq2 = new JPanel();
     ttq2.setBounds(187,395,350,30);
     
     Ag = new JButton("0");
     Ag.setBackground(Color.white);
     Bg = new JButton("1");
     Bg.setBackground(Color.white);
     Cg = new JButton("0");
     Cg.setBackground(Color.white);
     Dg = new JButton("1");
     Dg.setBackground(Color.white);
     
     ag = new JButton("1");
     ag.setBackground(Color.white);
     bg = new JButton("0");
     bg.setBackground(Color.white);
     cg = new JButton("1");
     cg.setBackground(Color.white);
     dg = new JButton("1");
     dg.setBackground(Color.white);
     eg = new JButton("0");
     eg.setBackground(Color.white);
     fg = new JButton("1");
     fg.setBackground(Color.white);
     gg = new JButton("1");
     gg.setBackground(Color.white);
     ttq1.add(Ag);ttq1.add(Bg);ttq1.add(Cg);ttq1.add(Dg);
     ttq2.add(ag);ttq2.add(bg);ttq2.add(cg);ttq2.add(dg);ttq2.add(eg);ttq2.add(fg);ttq2.add(gg);
     //...............................................................................
      tty1 = new JPanel();
      tty1.setBounds(0,425,200,30);
     
     tty2 = new JPanel();
     tty2.setBounds(187,425,350,30);
     
     Ay = new JButton("0");
     Ay.setBackground(Color.white);
     By = new JButton("1");
     By.setBackground(Color.white);
     Cy = new JButton("1");
     Cy.setBackground(Color.white);
     Dy = new JButton("0");
     Dy.setBackground(Color.white);
    
     ay = new JButton("1");
     ay.setBackground(Color.white);
     by = new JButton("0");
     by.setBackground(Color.white);
     cy = new JButton("1");
     cy.setBackground(Color.white);
     dy = new JButton("1");
     dy.setBackground(Color.white);
     ey = new JButton("1");
     ey.setBackground(Color.white);
     fy = new JButton("1");
     fy.setBackground(Color.white);
     gy = new JButton("1");
     gy.setBackground(Color.white);
     tty1.add(Ay);
     tty1.add(By);
     tty1.add(Cy);
     tty1.add(Dy);
     tty2.add(ay);
     tty2.add(by);
     tty2.add(cy);
     tty2.add(dy);
     tty2.add(ey);
     tty2.add(fy);
     tty2.add(gy);
     
     //.........................................................................
         ttu1 = new JPanel();
      ttu1.setBounds(0,455,200,30);
     
     ttu2 = new JPanel();
     ttu2.setBounds(187,455,350,30);
     
     Au = new JButton("0");
     Au.setBackground(Color.white);
     Bu = new JButton("1");
     Bu.setBackground(Color.white);
     Cu = new JButton("1");
     Cu.setBackground(Color.white);
     Du = new JButton("1");
     Du.setBackground(Color.white);
    
     au = new JButton("1");
     au.setBackground(Color.white);
     bu = new JButton("1");
     bu.setBackground(Color.white);
     cu = new JButton("1");
     cu.setBackground(Color.white);
     du = new JButton("0");
     du.setBackground(Color.white);
     eu = new JButton("0");
     eu.setBackground(Color.white);
     fu = new JButton("0");
     fu.setBackground(Color.white);
     gu = new JButton("0");
     gu.setBackground(Color.white);
     ttu1.add(Au);
     ttu1.add(Bu);
     ttu1.add(Cu);
     ttu1.add(Du);
     ttu2.add(au);
     ttu2.add(bu);
     ttu2.add(cu);
     ttu2.add(du);
     ttu2.add(eu);
     ttu2.add(fu);
     ttu2.add(gu);
     
     //..........................................................................
         tth1 = new JPanel();
      tth1.setBounds(0,485,200,30);
     
     tth2 = new JPanel();
     tth2.setBounds(187,485,350,30);
     
     Ah = new JButton("1");
     Ah.setBackground(Color.white);
     Bh = new JButton("0");
     Bh.setBackground(Color.white);
     Ch = new JButton("0");
     Ch.setBackground(Color.white);
     Dh = new JButton("0");
     Dh.setBackground(Color.white);
   
     ah = new JButton("1");
     ah.setBackground(Color.white);
     bh = new JButton("1");
     bh.setBackground(Color.white);
     ch = new JButton("1");
     ch.setBackground(Color.white);
     dh = new JButton("1");
     dh.setBackground(Color.white);
     eh = new JButton("1");
     eh.setBackground(Color.white);
     fh = new JButton("1");
     fh.setBackground(Color.white);
     gh = new JButton("1");
     gh.setBackground(Color.white);
     tth1.add(Ah);
     tth1.add(Bh);
     tth1.add(Ch);
     tth1.add(Dh);
     tth2.add(ah);
     tth2.add(bh);
     tth2.add(ch);
     tth2.add(dh);
     tth2.add(eh);
     tth2.add(fh);
     tth2.add(gh);
     //.........................................................................
      tti1 = new JPanel();
      tti1.setBounds(0,515,200,30);
     
     tti2 = new JPanel();
     tti2.setBounds(187,515,350,30);
     
     Ai = new JButton("1");
     Ai.setBackground(Color.white);
     Bi = new JButton("0");
     Bi.setBackground(Color.white);
     Ci = new JButton("0");
     Ci.setBackground(Color.white);
     Di = new JButton("1");
     Di.setBackground(Color.white);
   
     ai = new JButton("1");
     ai.setBackground(Color.white);
     bi = new JButton("1");
     bi.setBackground(Color.white);
     ci = new JButton("1");
     ci.setBackground(Color.white);
     di = new JButton("0");
     di.setBackground(Color.white);
     ei = new JButton("0");
     ei.setBackground(Color.white);
     fi = new JButton("1");
     fi.setBackground(Color.white);
     gi = new JButton("1");
     gi.setBackground(Color.white);
     tti1.add(Ai);
     tti1.add(Bi);
     tti1.add(Ci);
     tti1.add(Di);
     tti2.add(ai);
     tti2.add(bi);
     tti2.add(ci);
     tti2.add(di);
     tti2.add(ei);
     tti2.add(fi);
     tti2.add(gi);
     //........................................................................
     
     JLabel seg = new JLabel("7-SEGMENT DISPLAY");
     seg.setFont(new Font("Serif", Font.BOLD, 16));
     seg.setBounds(610,30,250,30);
     
     d1 = new JButton("");
     d2 = new JButton("");
     d3 = new JButton("");
     d4 = new JButton("");
     d5 = new JButton("");
     d6 = new JButton("");
     d7 = new JButton("");
     
     d1.setBounds(600,80,200,20);
     d2.setBounds(800,100,20,190);
     d6.setBounds(580,100,20,190);
     d3.setBounds(800,310,20,190);
     d5.setBounds(580,310,20,190);
     d7.setBounds(600,290,200,20);
     d4.setBounds(600,500,200,20);
     
     //........................................................................
     frame = new JFrame();
     frame.setLayout(null);
     frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
     frame.setSize(new Dimension(880, 620));
     frame.setLocation(50,50);
     frame.setTitle("DIGITAL CIRCUITS VISUALISATION");
     frame.add(header);
     frame.add(mid);
     frame.add(tail);
     frame.add(label);
     frame.add(start);
     //frame.add(p1);
     //frame.add(p2);
     //frame.add(p3);
    // frame.add(p4);
     frame.add(truth);
     frame.add(t1);
     frame.add(t2);
     frame.add(tt1);
     frame.add(tt2);
     frame.add(ttt1);
     frame.add(ttt2);
     frame.add(ttz1);
     frame.add(ttz2);
     frame.add(ttw1);
     frame.add(ttw2);
     frame.add(tte1);
     frame.add(tte2);
     frame.add(ttr1);
     frame.add(ttr2);
     frame.add(ttq1);
     frame.add(ttq2);
     frame.add(tty1);
     frame.add(tty2);
     frame.add(ttu1);
     frame.add(ttu2);
     frame.add(tth1);
     frame.add(tth2);
     frame.add(tti1);
     frame.add(tti2);
     frame.add(seg);
     frame.add(d1);
     frame.add(d2);
     frame.add(d3);
     frame.add(d4);
     frame.add(d5);
     frame.add(d6);
     frame.add(d7);
     
     frame.setVisible(true);
        }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet.");
        
        String s = e.getActionCommand();
        if("START".equals(s))
        {
            frame.add(p1);
            frame.add(p2);
            frame.add(p3);
            frame.add(p4);
            frame.setVisible(true);
            if(start.getText().equals("ok!"))
            {
            JOptionPane.showMessageDialog(null,"Check Your Inputs");
            }
            start.setText("ok!");
        }
       else if("one".equals(s))
        {
            if(i1.getText().equals("0"))
            {
                if(i2.getText().equals("0")&&i3.getText().equals("0"))
                {
                    i1.setText("1");
                }
                else
                {
                     JOptionPane.showMessageDialog(null,"BCD range exceeded");
                }
            }
            else
            {
                i1.setText("0");
            }
            
        }
        else if("two".equals(s))
        {
            if(i2.getText().equals("0"))
            {
                if(i1.getText().equals("0"))
                        {
                            i2.setText("1");
                        }
                else
                {
                 JOptionPane.showMessageDialog(null,"BCD range exceeded");
                }
            
            }
            else
            {
                i2.setText("0");
            }
            
            
        }
        else if("three".equals(s))
        {    if(i3.getText().equals("0"))
            {
                if(i1.getText().equals("0"))
                        {
                            i3.setText("1");
                        }
                else
                {
                 JOptionPane.showMessageDialog(null,"BCD range exceeded");
                }
            
            }
        else
        {
                i3.setText("0");
        }
            
        }
        else if("four".equals(s))
        {
            
            if(i4.getText().equals("0"))
            {i4.setText("1");}
            else
             {i4.setText("0");}
        }
        
        colour();
        
        if(i1.getText().equals("0")&&i2.getText().equals("0")&&i3.getText().equals("0")&i4.getText().equals("0"))
        {
             Aa.setBackground(Color.magenta);

     Ba.setBackground(Color.magenta);

     Ca.setBackground(Color.magenta);
  
     Da.setBackground(Color.magenta);
            aa.setBackground(Color.magenta);

     ba.setBackground(Color.magenta);

     ca.setBackground(Color.magenta);

     da.setBackground(Color.magenta);

     ea.setBackground(Color.magenta);

     fa.setBackground(Color.magenta);

     ga.setBackground(Color.magenta);
     
     d1.setBackground(Color.magenta);
        d2.setBackground(Color.magenta);
        d3.setBackground(Color.magenta);
        d4.setBackground(Color.magenta);
        d5.setBackground(Color.magenta);
        d6.setBackground(Color.magenta);
        d7.setBackground(Color.LIGHT_GRAY);
     
     
        }
        else if(i1.getText().equals("0")&&i2.getText().equals("0")&&i3.getText().equals("0")&i4.getText().equals("1"))
        {
         As.setBackground(Color.green);

     Bs.setBackground(Color.green);

     Cs.setBackground(Color.green);
  
     Ds.setBackground(Color.green);
     
     as.setBackground(Color.green);

     bs.setBackground(Color.green);
     
     cs.setBackground(Color.green);
  
     ds.setBackground(Color.green);
 
     es.setBackground(Color.green);
  
     fs.setBackground(Color.green);
   
     gs.setBackground(Color.green);
     
d1.setBackground(Color.LIGHT_GRAY);
        d2.setBackground(Color.green);
        d3.setBackground(Color.green);
        d4.setBackground(Color.LIGHT_GRAY);
        d5.setBackground(Color.LIGHT_GRAY);
        d6.setBackground(Color.LIGHT_GRAY);
        d7.setBackground(Color.LIGHT_GRAY);
        
        }
        else if(i1.getText().equals("0")&&i2.getText().equals("0")&&i3.getText().equals("1")&i4.getText().equals("0"))
        {
         Ax.setBackground(Color.orange);

     Bx.setBackground(Color.orange);

     Cx.setBackground(Color.orange);
  
     Dx.setBackground(Color.orange);
     
     ax.setBackground(Color.orange);
 
     bx.setBackground(Color.orange);
   
     cx.setBackground(Color.orange);
 
     dx.setBackground(Color.orange);
 
     ex.setBackground(Color.orange);
   
     fx.setBackground(Color.orange);
   
	gx.setBackground(Color.orange);
d1.setBackground(Color.orange);
        d2.setBackground(Color.orange);
        d3.setBackground(Color.LIGHT_GRAY);
        d4.setBackground(Color.orange);
        d5.setBackground(Color.orange);
        d6.setBackground(Color.LIGHT_GRAY);
        d7.setBackground(Color.orange);
            
        }
        else if(i1.getText().equals("0")&&i2.getText().equals("0")&&i3.getText().equals("1")&i4.getText().equals("1"))
        {
             Ad.setBackground(Color.BLUE);

     Bd.setBackground(Color.BLUE);

     Cd.setBackground(Color.BLUE);
  
     Dd.setBackground(Color.BLUE);
            
            ad.setBackground(Color.BLUE);
   
     bd.setBackground(Color.BLUE);
   
     cd.setBackground(Color.BLUE);
   
     dd.setBackground(Color.BLUE);
   
     ed.setBackground(Color.BLUE);
    
     fd.setBackground(Color.BLUE);
  
     gd.setBackground(Color.BLUE);

        d1.setBackground(Color.BLUE);
        d2.setBackground(Color.BLUE);
        d3.setBackground(Color.BLUE);
        d4.setBackground(Color.BLUE);
        d5.setBackground(Color.LIGHT_GRAY);
        d6.setBackground(Color.LIGHT_GRAY);
        d7.setBackground(Color.BLUE);
        }
        else if(i1.getText().equals("0")&&i2.getText().equals("1")&&i3.getText().equals("0")&i4.getText().equals("0"))
        {
        
             Af.setBackground(Color.red);

     Bf.setBackground(Color.red);

     Cf.setBackground(Color.red);
  
     Df.setBackground(Color.red);
     
            af.setBackground(Color.red);

     bf.setBackground(Color.red);

     cf.setBackground(Color.red);
 
     df.setBackground(Color.red);

     ef.setBackground(Color.red);

     ff.setBackground(Color.red);

     gf.setBackground(Color.red);
     
     d1.setBackground(Color.LIGHT_GRAY);
        d2.setBackground(Color.red);
        d3.setBackground(Color.red);
        d4.setBackground(Color.LIGHT_GRAY);
        d5.setBackground(Color.LIGHT_GRAY);
        d6.setBackground(Color.red);
        d7.setBackground(Color.red);
        
        }
        else if(i1.getText().equals("0")&&i2.getText().equals("1")&&i3.getText().equals("0")&i4.getText().equals("1"))
        {
            
            
	Ag.setBackground(Color.CYAN);

     Bg.setBackground(Color.CYAN);

     Cg.setBackground(Color.CYAN);
  
     Dg.setBackground(Color.CYAN);
     
     ag.setBackground(Color.CYAN);

     bg.setBackground(Color.CYAN);

     cg.setBackground(Color.CYAN);

     dg.setBackground(Color.CYAN);

     eg.setBackground(Color.CYAN);

     fg.setBackground(Color.CYAN);

     gg.setBackground(Color.CYAN);
     
     d1.setBackground(Color.cyan);
        d2.setBackground(Color.LIGHT_GRAY);
        d3.setBackground(Color.cyan);
        d4.setBackground(Color.cyan);
        d5.setBackground(Color.LIGHT_GRAY);
        d6.setBackground(Color.cyan);
        d7.setBackground(Color.cyan);
        
        }
        else if(i1.getText().equals("0")&&i2.getText().equals("1")&&i3.getText().equals("1")&i4.getText().equals("0"))
        {
        
              Ay.setBackground(Color.MAGENTA);

     By.setBackground(Color.MAGENTA);

     Cy.setBackground(Color.MAGENTA);
  
     Dy.setBackground(Color.MAGENTA);
     
             ay.setBackground(Color.MAGENTA);

     by.setBackground(Color.MAGENTA);
    
     cy.setBackground(Color.MAGENTA);

     dy.setBackground(Color.MAGENTA);

     ey.setBackground(Color.MAGENTA);

     fy.setBackground(Color.MAGENTA);

     gy.setBackground(Color.MAGENTA);
     
     d1.setBackground(Color.MAGENTA);
        d2.setBackground(Color.LIGHT_GRAY);
        d3.setBackground(Color.MAGENTA);
        d4.setBackground(Color.MAGENTA);
        d5.setBackground(Color.MAGENTA);
        d6.setBackground(Color.MAGENTA);
        d7.setBackground(Color.MAGENTA);

        }
        else if(i1.getText().equals("0")&&i2.getText().equals("1")&&i3.getText().equals("1")&i4.getText().equals("1"))
        {
            Au.setBackground(Color.yellow);

     Bu.setBackground(Color.yellow);

     Cu.setBackground(Color.yellow);
  
     Du.setBackground(Color.yellow);
  au.setBackground(Color.yellow);
  
     bu.setBackground(Color.yellow);
  
     cu.setBackground(Color.yellow);
 
     du.setBackground(Color.yellow);
  
     eu.setBackground(Color.yellow);
   
     fu.setBackground(Color.yellow);
 
     gu.setBackground(Color.yellow);
     
     d1.setBackground(Color.yellow);
        d2.setBackground(Color.yellow);
        d3.setBackground(Color.yellow);
        d4.setBackground(Color.LIGHT_GRAY);
        d5.setBackground(Color.LIGHT_GRAY);
        d6.setBackground(Color.LIGHT_GRAY);
        d7.setBackground(Color.LIGHT_GRAY);
        
        }
        else if(i1.getText().equals("1")&&i2.getText().equals("0")&&i3.getText().equals("0")&i4.getText().equals("0"))
        {
              Ah.setBackground(Color.gray);

     Bh.setBackground(Color.gray);

     Ch.setBackground(Color.gray);
  
     Dh.setBackground(Color.gray);
            
        ah.setBackground(Color.gray);
    
     bh.setBackground(Color.gray);

     ch.setBackground(Color.gray);

     dh.setBackground(Color.gray);

     eh.setBackground(Color.gray);

     fh.setBackground(Color.gray);

     gh.setBackground(Color.gray);
     
     d1.setBackground(Color.black);
        d2.setBackground(Color.black);
        d3.setBackground(Color.black);
        d4.setBackground(Color.black);
        d5.setBackground(Color.black);
        d6.setBackground(Color.black);
        d7.setBackground(Color.black);
     
        }
        else if(i1.getText().equals("1")&&i2.getText().equals("0")&&i3.getText().equals("0")&i4.getText().equals("1"))
        {
              Ai.setBackground(Color.blue);

     Bi.setBackground(Color.blue);

     Ci.setBackground(Color.blue);
  
     Di.setBackground(Color.blue);
        ai.setBackground(Color.blue);
  
     bi.setBackground(Color.blue);

     ci.setBackground(Color.blue);

     di.setBackground(Color.blue);

     ei.setBackground(Color.blue);

     fi.setBackground(Color.blue);
 
     gi.setBackground(Color.blue);
     
     d1.setBackground(Color.blue);
        d2.setBackground(Color.blue);
        d3.setBackground(Color.blue);
        d4.setBackground(Color.blue);
        d5.setBackground(Color.LIGHT_GRAY);
        d6.setBackground(Color.blue);
        d7.setBackground(Color.blue);
     
        }
        
    }
    /**
     *
     */
    public void colour()
    {
        
        d1.setBackground(null);
        d2.setBackground(null);
        d3.setBackground(null);
        d4.setBackground(null);
        d5.setBackground(null);
        d6.setBackground(null);
        d7.setBackground(null);
        
        Aa.setBackground(Color.white);

     Ba.setBackground(Color.white);

     Ca.setBackground(Color.white);
  
     Da.setBackground(Color.white);

     As.setBackground(Color.white);

     Bs.setBackground(Color.white);

     Cs.setBackground(Color.white);
  
     Ds.setBackground(Color.white);
     Ax.setBackground(Color.white);

     Bx.setBackground(Color.white);

     Cx.setBackground(Color.white);
  
     Dx.setBackground(Color.white);

    
     Ad.setBackground(Color.white);

     Bd.setBackground(Color.white);

     Cd.setBackground(Color.white);
  
     Dd.setBackground(Color.white);

     Af.setBackground(Color.white);

     Bf.setBackground(Color.white);

     Cf.setBackground(Color.white);
  
     Df.setBackground(Color.white);
     

	Ag.setBackground(Color.white);

     Bg.setBackground(Color.white);

     Cg.setBackground(Color.white);
  
     Dg.setBackground(Color.white);

     Ay.setBackground(Color.white);

     By.setBackground(Color.white);

     Cy.setBackground(Color.white);
  
     Dy.setBackground(Color.white);
Au.setBackground(Color.white);

     Bu.setBackground(Color.white);

     Cu.setBackground(Color.white);
  
     Du.setBackground(Color.white);

     Ah.setBackground(Color.white);

     Bh.setBackground(Color.white);

     Ch.setBackground(Color.white);
  
     Dh.setBackground(Color.white);

    Ai.setBackground(Color.white);

     Bi.setBackground(Color.white);

     Ci.setBackground(Color.white);
  
     Di.setBackground(Color.white);
        
        
                 aa.setBackground(Color.white);

     ba.setBackground(Color.white);

     ca.setBackground(Color.white);

     da.setBackground(Color.white);

     ea.setBackground(Color.white);

     fa.setBackground(Color.white);

     ga.setBackground(Color.white);


	as.setBackground(Color.white);

     bs.setBackground(Color.white);
     
     cs.setBackground(Color.white);
  
     ds.setBackground(Color.white);
 
     es.setBackground(Color.white);
  
     fs.setBackground(Color.white);
   
     gs.setBackground(Color.white);
	
	ax.setBackground(Color.white);
 
     bx.setBackground(Color.white);
   
     cx.setBackground(Color.white);
 
     dx.setBackground(Color.white);
 
     ex.setBackground(Color.white);
   
     fx.setBackground(Color.white);
   
	gx.setBackground(Color.white);

ad.setBackground(Color.white);
   
     bd.setBackground(Color.white);
   
     cd.setBackground(Color.white);
   
     dd.setBackground(Color.white);
   
     ed.setBackground(Color.white);
    
     fd.setBackground(Color.white);
  
     gd.setBackground(Color.white);

     af.setBackground(Color.white);

     bf.setBackground(Color.white);

     cf.setBackground(Color.white);
 
     df.setBackground(Color.white);

     ef.setBackground(Color.white);

     ff.setBackground(Color.white);

     gf.setBackground(Color.white);


     ag.setBackground(Color.white);

     bg.setBackground(Color.white);

     cg.setBackground(Color.white);

     dg.setBackground(Color.white);

     eg.setBackground(Color.white);

     fg.setBackground(Color.white);

     gg.setBackground(Color.white);


     ay.setBackground(Color.white);

     by.setBackground(Color.white);
    
     cy.setBackground(Color.white);

     dy.setBackground(Color.white);

     ey.setBackground(Color.white);

     fy.setBackground(Color.white);

     gy.setBackground(Color.white);

 
     au.setBackground(Color.white);
  
     bu.setBackground(Color.white);
  
     cu.setBackground(Color.white);
 
     du.setBackground(Color.white);
  
     eu.setBackground(Color.white);
   
     fu.setBackground(Color.white);
 
     gu.setBackground(Color.white);

ah.setBackground(Color.white);
    
     bh.setBackground(Color.white);

     ch.setBackground(Color.white);

     dh.setBackground(Color.white);

     eh.setBackground(Color.white);

     fh.setBackground(Color.white);

     gh.setBackground(Color.white);

ai.setBackground(Color.white);
  
     bi.setBackground(Color.white);

     ci.setBackground(Color.white);

     di.setBackground(Color.white);

     ei.setBackground(Color.white);

     fi.setBackground(Color.white);
 
     gi.setBackground(Color.white);
    }
        
}
