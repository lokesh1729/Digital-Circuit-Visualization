/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vamsi
 */



import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

class or extends Canvas implements ActionListener {
    
    public static void main(String arg[]){
    
          or g = new or();
          //and f = new and();
          
    }
    private JButton p1;
    private JButton p2;
    private JButton p3;
    private JButton b1;
    private JPanel pi1;
    private JButton image;
    private JPanel pim1;
    private JPanel pim2;
    private JButton im1;
    private JButton im2;
    private JPanel pi2;
    private JPanel pima1;
    private JPanel pima2;
    private JPanel pima3;
    private JButton image1;
    private JButton ima1;
    private JButton ima2;
    private JButton ima3;
    private JPanel pi3;
    private JPanel pimag1;
    private JPanel pimag2;
    private JPanel pimag3;
    private JPanel pimag4;
    private JButton image2;
    private JButton imag1;
    private JButton imag2;
    private JButton imag3;
    private JButton imag4;
    private JPanel pout;
    private JPanel pout1;
    private JPanel pout2;
    private JButton out;
    private JButton out1;
    private JButton out2;
    private JButton cont;
    private JButton i1;
    private JButton i2;
    private JButton i3;
    private JButton i4;
    private JButton start;
    private JButton compute;
    private JPanel panel;
    private JPanel pan1;
    private JPanel pan2;
    private JPanel pan3;
    private JPanel pan4;
    private JLabel ila1;
    private JLabel ila2;
    private JLabel ila3;
    private JLabel ila4;
    private JLabel ila5;
    private JPanel tru;
    private JPanel tru1;
    private JPanel tru2;
    private JPanel tru3;
    private JFrame frame;
    private JButton A;
    private JButton AA;
    private JButton AAA;
    private JButton B;
    private JButton BB;
    private JButton BBB;
    private JButton AB;
    private JButton C;
    private JButton CC;
    private JButton CCC;
    private JButton D;
    private JButton ABC;
    private JButton ABCD;
    private JButton A1;private JButton A2;private JButton A3;private JButton A4;private JButton AB1;private JButton AB2;private JButton AB3;private JButton AB4;
    private JButton B1;private JButton B2;private JButton B3;private JButton B4;private JButton B5;private JButton B6;private JButton B7;private JButton B8;
    private JButton C1;private JButton C2;private JButton C3;private JButton C4;private JButton C5;private JButton C6;private JButton C7;private JButton C8;
    private JButton D1;private JButton D2;private JButton D3;private JButton D4;private JButton D5;private JButton D6;private JButton D7;private JButton D8;
    
    
    public or(){
    p1 = new JButton("BEHAVIOR OF OR");
    p1.setFont(new Font("Serif", Font.BOLD, 16));
    p1.setBounds(0,0,800,25);
    p2 = new JButton("CSE01@Batch06");
    p2.setBounds(0,430,800,20);
    p3 = new JButton("");
     p3.setBounds(350, 25, 10, 405);
     //.........................................................................
     pi1 = new JPanel();
     pi2 = new JPanel();
     pi2.setBounds(420, 40, 270, 180);
     pi3 = new JPanel();
     pi3.setBounds(420, 40, 270, 180);
     pi1.setBounds(420,40,270,180);
     image = new JButton();
     image.setIcon(new ImageIcon("a.gif"));
     image.setBounds(420, 40, 270, 180);
     image.setActionCommand("ip");
     image.addActionListener(this);
     pi1.add(image);
     pim1 = new JPanel();
     pim1.setBounds(370,80,50,40);
     pim2 = new JPanel();
     pim2.setBounds(370,135,50,40);
     im1 = new JButton("1");
     im1.setActionCommand("ip");
     im1.addActionListener(this);
     im1.setBounds(370,80,50,40);
     pim1.add(im1);
     im2 = new JButton("1");
     im2.addActionListener(this);
     im2.setActionCommand("ip1");
     im2.setBounds(370,135,50,40);
     pim2.add(im2);
     image1 = new JButton();
     image1.setIcon(new ImageIcon("b.gif"));
     image1.setBounds(420, 40, 270, 180);
     pi2.add(image1);
     //..........................................................................
     pima1 = new JPanel();
     pima1.setBounds(370,70,50,30);
     pima2 = new JPanel();
     pima2.setBounds(370,110,50,30);
     pima3 = new JPanel();
     pima3.setBounds(370,150,50,30);
     ima1 = new JButton("1");
     ima1.setBounds(370,70,50,30);
     ima2 = new JButton("1");
     ima2.setBounds(370,110,50,30);
     ima3 = new JButton("1");
     ima3.setBounds(370,150,50,30);
     pima1.add(ima1);
     pima2.add(ima2);
     pima3.add(ima3);
     //.......................................................................
     image2 = new JButton();
     image2.setIcon(new ImageIcon("c.gif"));
     image2.setBounds(420, 40, 270, 180);
     pi3.add(image2);
     pimag1 = new JPanel();
     pimag1.setBounds(370, 73, 50, 30);
     pimag2 = new JPanel();
     pimag2.setBounds(370, 108, 50, 30);
     pimag3 = new JPanel();
     pimag3.setBounds(370, 143, 50, 30);
     pimag4 = new JPanel();
     pimag4.setBounds(370, 178, 50, 30);
     imag1 = new JButton("1");
     imag1.setBounds(370, 73, 50, 30);
     pimag1.add(imag1);
     imag2 = new JButton("1");
     imag2.setBounds(370, 108, 50, 30);
     pimag2.add(imag2);
     imag3 = new JButton("1");
     imag3.setBounds(370, 143, 50, 30);
     pimag3.add(imag3);
     imag4 = new JButton("1");
    imag4.setBounds(370, 178, 50, 30);
    pimag4.add(imag4);
     pout = new JPanel();
     pout.setBounds(690,108,50,40);
     out = new JButton("x");
     out.setActionCommand("op");
     out.addActionListener(this);
     out.setBounds(690,108,50,40);
     pout.add(out);
     pout1 = new JPanel();
     pout1.setBounds(690,104,50,40);
     out1 = new JButton("x");
     out1.setBounds(690,104,50,40);
     pout1.add(out1);
     pout2 = new JPanel();
     pout2.setBounds(690,105,50,40);
     out2 = new JButton("x");
     out2.setBounds(690,105,50,40);
     pout2.add(out2);
     //.........................................................................
     panel = new JPanel();
    JLabel label = new JLabel("NUMBER OF INPUTS       ");
    label.setFont(new Font("Serif", Font.BOLD, 13));
    b1 = new JButton("2");
    b1.setActionCommand("number");
    b1.addActionListener(this);
    cont =  new JButton("CONTINUE");
    cont.setActionCommand("continue");
    cont.addActionListener(this);
    panel.add(label);
    panel.add(b1);panel.add(cont);
     panel.setBounds(5, 30, 340, 60);
     //..........................................................................
     
        pan1 = new JPanel();
     ila1 = new JLabel("INPUT 1(A)            ");
     i1 = new JButton("1");
     i1.setActionCommand("i1");
     i1.addActionListener(this);
     pan1.add(ila1);pan1.add(i1);
      pan1.setBounds(5, 90, 300, 40);
      pan2 = new JPanel();
     ila2 = new JLabel("INPUT 2(B)            ");
     i2 = new JButton("1");
     i2.setActionCommand("i2");
     i2.addActionListener(this);
     pan2.add(ila2);pan2.add(i2);
     pan2.setBounds(5,130,300,40);
     pan3 = new JPanel();
     ila3 = new JLabel("INPUT 3(C)            ");
     i3 = new JButton("1");
     i3.setActionCommand("i3");
     i3.addActionListener(this);
     pan3.add(ila3);pan3.add(i3);
      pan3.setBounds(5,170,300,40);
      pan4 = new JPanel();
     ila4 = new JLabel("INPUT 4(D)            ");
     i4 = new JButton("1");
     i4.setActionCommand("i4");
     i4.addActionListener(this);
     pan4.add(ila4);pan4.add(i4);
     start = new JButton("start");
     start.setBounds(20,290,100,40);
     start.setActionCommand("start");
     start.addActionListener(this);
     compute = new JButton("CHECK");
     compute.setBounds(200,290,100,40);
     compute.setActionCommand("compute");
     compute.addActionListener(this);
      pan4.setBounds(5,210,300,40);
      
    //........................TRUTH TABLE.......................................
     
     tru = new JPanel();
     tru.setBounds(420,230,200,25);
     tru1 = new JPanel();
     tru1.setBounds(420,255,190,200);
     tru2 = new JPanel();
     tru2.setBounds(380,255,250,100);
     tru3 = new JPanel();
     tru3.setBounds(380,255,310,100);
     JLabel labelt = new JLabel("TRUTH TABLE");
     labelt.setFont(new Font("Serif", Font.BOLD, 16));
     tru.add(labelt);
     A= new JButton("1a");
     AA= new JButton("1a");
     AAA= new JButton("1a");
     B= new JButton("2B");
     BB= new JButton("2B");
     BBB= new JButton("2B");
     C= new JButton("3C");
     CC= new JButton("3C");
     CCC= new JButton("3C");
     D= new JButton("4D");
     A1= new JButton(" 0 ");
     A1.setBackground(Color.white);
     A2= new JButton(" 0 ");
     A2.setBackground(Color.white);
     A3= new JButton(" 1 ");
     A3.setBackground(Color.white);
     A4= new JButton(" 1 ");
     A4.setBackground(Color.white);
     B1= new JButton(" 0 ");
     B1.setBackground(Color.white);
     B2= new JButton(" 1 ");
     B2.setBackground(Color.white);
     B3= new JButton(" 0 ");
     B3.setBackground(Color.white);
     B4= new JButton(" 1 ");
     B4.setBackground(Color.white);
     C1= new JButton(" # ");
      C1.setBackground(Color.white);
     C2= new JButton(" # ");
      C2.setBackground(Color.white);
     C3= new JButton(" # ");
      C3.setBackground(Color.white);
     C4= new JButton("  #  ");
      C4.setBackground(Color.white);
      D1= new JButton(" # ");
      D1.setBackground(Color.white);
     D2= new JButton(" # ");
      D2.setBackground(Color.white);
     D3= new JButton(" # ");
      D3.setBackground(Color.white);
     D4= new JButton("  # ");
      D4.setBackground(Color.white);
      D5= new JButton("  #    ");
      D5.setBackground(Color.white);
     AB= new JButton("OP");
     AB1= new JButton(" 0 ");
     AB1.setBackground(Color.white);
     AB2= new JButton(" 1 ");
     AB2.setBackground(Color.white);
     AB3= new JButton(" 1 ");
     AB3.setBackground(Color.white);
     AB4= new JButton(" 1 ");
     AB4.setBackground(Color.white);
     ABC= new JButton("  OP  ");
     ABCD= new JButton("  OP  ");
     tru1.add(A);
     tru1.add(B);
     tru1.add(AB);
     tru1.add(A1);
     tru1.add(B1);
     tru1.add(AB1);
     tru1.add(A2);
     tru1.add(B2);
     tru1.add(AB2);
     tru1.add(A3);
     tru1.add(B3);
     tru1.add(AB3);
     tru1.add(A4);
     tru1.add(B4);
     tru1.add(AB4);
     tru2.add(AA);
     tru2.add(BB);
     tru2.add(CC);
     tru2.add(ABC);
     tru2.add(C1);
     tru2.add(C2);
     tru2.add(C3);
     tru2.add(C4);
     tru3.add(AAA);
     tru3.add(BBB);
     tru3.add(CCC);
     tru3.add(D);
     tru3.add(ABCD);
     tru3.add(D1);
     tru3.add(D2);
     tru3.add(D3);
     tru3.add(D4);
     tru3.add(D5);
     
     
     //.........................................................................
     frame = new JFrame();
     frame.setLayout(null);
     frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
     frame.setSize(new Dimension(800, 500));
     frame.setLocation(50,50);
     frame.setTitle("DIGITAL CIRCUITS VISUALISATION");
     frame.add(p1);
     frame.add(p2);
     frame.add(p3);
     /*frame.add(pi2);
     frame.add(ima1);
     frame.add(ima2);
     frame.add(ima3);*/
     //frame.add(imag1);
     //frame.add(imag2);
     // frame.add(imag3);
      //frame.add(imag4);
  //  frame.add(out2);
     //frame.add(tru);
     //frame.add(tru1);
     //frame.add(tru2);
     //frame.add(tru3);
     //frame.add(pan1);
     //frame.add(pan2);
     //frame.add(pan3);
     //frame.add(pan4);
     frame.add(start);
     frame.add(compute);
     frame.add(panel);
    // frame.add(b1);
     frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        //throw new UnsupportedOperationException("Not supported yet.");
        
         String k=e.getActionCommand();
        if(("number".equals(k))&&(cont.getText().equals("CONTINUE")))
        {
            String s = b1.getText();
            if(s.equals("2")){b1.setText("3");}
            else if(s.equals("3")) {
                b1.setText("4");
            }
            else {
                b1.setText("2");
            }
        
        }
        else if("start".equals(k))
        {
               or g = new or();
        
        
       }
        else if("continue".equals(k))
        {System.out.println("it is running");
            if(cont.getText().equals("CONTINUE"))
            {
                if(b1.getText().equals("2"))
                   {   
                    frame.add(pi1);
                    
                    frame.add(pim1);
                    frame.add(pim2);
                    frame.add(pout);
                    frame.add(pan1);
                    frame.add(pan2);
                    frame.add(compute);
                    frame.setVisible(true);
                    System.out.println("yes it is running");
                    
          
                }
                else if(b1.getText().equals("3"))
                {   frame.add(pi2);
                    frame.add(pima1);
                    frame.add(pima2);
                    frame.add(pima3);
                    frame.add(pout1);
                    frame.add(pan1);
                    frame.add(pan2);
                    frame.add(pan3);
                    //frame.add(compute);
                    frame.setVisible(true);
                }
                else {
                    frame.add(pi3);
                    frame.add(pimag1);
                    frame.add(pimag2);
                    frame.add(pimag3);
                    frame.add(pimag4);
                    frame.add(pout2);
                    frame.add(pan1);
                    frame.add(pan2);
                    frame.add(pan3);
                    frame.add(pan4);
                    frame.setVisible(true);
                    }
                }
                else
                {JOptionPane.showMessageDialog(null,"Check your inputs");
					}
                cont.setText("OK!");
            
        }
        else if("compute".equals(k))
        {
        
            if(cont.getText().equals("CONTINUE"))
            {
                JOptionPane.showMessageDialog(null,"first give the inputs");
            
            }
            else
            {
                if(b1.getText().equals("2"))
                {
                        frame.add(tru);
                        frame.add(tru1);
                        frame.setVisible(true);
                        A1.setBackground(Color.white);
                              B1.setBackground(Color.white);
                              AB1.setBackground(Color.white);
                        A2.setBackground(Color.white);
                              B2.setBackground(Color.white);
                              AB2.setBackground(Color.white);
                        A3.setBackground(Color.white);
                              B3.setBackground(Color.white);
                              AB3.setBackground(Color.white);
                         A4.setBackground(Color.white);
                              B4.setBackground(Color.white);
                              AB4.setBackground(Color.white);
                        if(i1.getText().equals("0")&&i2.getText().equals("0"))
                        {
                            out.setText("0");
                        }
                        else
                        {
                            out.setText("1");
                        }
                        if(i1.getText().equals("1")&&i2.getText().equals("1"))
                        {
                              A4.setBackground(Color.yellow);
                              B4.setBackground(Color.yellow);
                              AB4.setBackground(Color.yellow);
                        }
                        else if(i1.getText().equals("0")&&i2.getText().equals("1"))
                        {
                            A2.setBackground(Color.pink);
                              B2.setBackground(Color.pink);
                              AB2.setBackground(Color.pink);
                        }
                        else if(i1.getText().equals("1")&&i2.getText().equals("0"))
                        {
                             A3.setBackground(Color.green);
                              B3.setBackground(Color.green);
                              AB3.setBackground(Color.green);
                        }
                        else
                        {
                             A1.setBackground(Color.red);
                              B1.setBackground(Color.red);
                              AB1.setBackground(Color.red);
                        }
                        
                }
                else if(b1.getText().equals("3"))
                {
                        frame.add(tru);
                        frame.add(tru2);
                        frame.setVisible(true);
                        int a,b,c;
                        if(i1.getText().equals("1")){
                            a=1;
                        }
                        else {a=0;}
                        if(i2.getText().equals("1"))
                        {b=1;}
                        else {b=0;}
                        if(i3.getText().equals("1"))
                        {c=1;}
                        else {c=0;}
                        C1.setText(" "+a+"  ");
                        C2.setText(" "+b+"  ");
                        C3.setText(" "+c+"  ");
                        if(a==0&&b==0&&c==0)
                        {
                                C4.setText("  0 ");out1.setText("0");
                        }
                        else {C4.setText("  1 ");out1.setText("1");}
                        if(a==1&&b==1)
                        {
                        C1.setBackground(Color.pink);
                        C2.setBackground(Color.pink);
                        C3.setBackground(Color.pink);
                        C4.setBackground(Color.pink);
                        }
                        else if(a==1&&b==0)
                        {C1.setBackground(Color.yellow);
                        C2.setBackground(Color.yellow);
                        C3.setBackground(Color.yellow);
                        C4.setBackground(Color.yellow);
                        
                        }
                        else if(a==0&&b==1)
                        {
                            C1.setBackground(Color.red);
                        C2.setBackground(Color.red);
                        C3.setBackground(Color.red);
                        C4.setBackground(Color.red);
                        
                        }
                        else
                        {
                            C1.setBackground(Color.green);
                        C2.setBackground(Color.green);
                        C3.setBackground(Color.green);
                        C4.setBackground(Color.green);
                        
                        }
                }
                else 
                {
                    frame.add(tru);
                        frame.add(tru3);
                        frame.setVisible(true);
                        int a,b,c,d;
                        if(i1.getText().equals("1")){
                            a=1;
                        }
                        else {a=0;}
                        if(i2.getText().equals("1"))
                        {b=1;}
                        else {b=0;}
                        if(i3.getText().equals("1"))
                        {c=1;}
                        else {c=0;}
                        if(i4.getText().equals("1")){
                            d=1;
                        }
                        else {d=0;}
                        D1.setText(" "+a+"  ");
                        D2.setText(" "+b+"  ");
                        D3.setText(" "+c+"  ");
                        D4.setText(" "+d+"  ");
                        if(a==0&&b==0&&c==0&&d==0)
                        {
                                D5.setText("  0  ");out2.setText("0");
                        }
                        else {D5.setText("  1  ");out2.setText("1");}
                        if(a==1&&b==1)
                        {
                        D1.setBackground(Color.pink);
                        D2.setBackground(Color.pink);
                        D3.setBackground(Color.pink);
                        D4.setBackground(Color.pink);
                        D5.setBackground(Color.pink);
                        }
                        else if(a==1&&b==0)
                        {D1.setBackground(Color.yellow);
                        D2.setBackground(Color.yellow);
                        D3.setBackground(Color.yellow);
                        D4.setBackground(Color.yellow);
                        D5.setBackground(Color.yellow);
                        
                        }
                        else if(a==0&&b==1)
                        {
                            D1.setBackground(Color.red);
                        D2.setBackground(Color.red);
                        D3.setBackground(Color.red);
                        D4.setBackground(Color.red);
                        D5.setBackground(Color.red);
                        
                        }
                        else
                        {
                            D1.setBackground(Color.green);
                        D2.setBackground(Color.green);
                        D3.setBackground(Color.green);
                        D4.setBackground(Color.green);
                        D5.setBackground(Color.green);
                        
                        }
                
                }
            
            }
            
        }
        else if("i1".equals(k))
        {
        if (i1.getText().equals("1"))
            {
            
            i1.setText("0");im1.setText("0");ima1.setText("0");imag1.setText("0");
            out.setText("x");out1.setText("x");out2.setText("x");
            }
        else {i1.setText("1");im1.setText("1");ima1.setText("1");imag1.setText("1");out.setText("x");out1.setText("x");out2.setText("x");}
        }
        else if("i2".equals(k))
        {
            if (i2.getText().equals("1"))
            {
            
            i2.setText("0");im2.setText("0");ima2.setText("0");imag2.setText("0");
            out.setText("x");out1.setText("x");out2.setText("x");
            }
        else {i2.setText("1");im2.setText("1");ima2.setText("1");imag2.setText("1");
            out.setText("x");out1.setText("x");out2.setText("x");}
        
        
        }
        else if("i3".equals(k))
        {
        if (i3.getText().equals("1"))
            {
            
            i3.setText("0");ima3.setText("0");imag3.setText("0");
            out.setText("x");out1.setText("x");out2.setText("x");
            }
        else {i3.setText("1");ima3.setText("1");imag3.setText("1");
        out.setText("x");out1.setText("x");out2.setText("x");}
        
        }
        else if("i4".equals(k))
        {
        if (i4.getText().equals("1"))
            {
            
            i4.setText("0");imag4.setText("0");out.setText("x");out1.setText("x");out2.setText("x");
            }
        else {i4.setText("1");imag4.setText("1");
        out.setText("x");out1.setText("x");out2.setText("x");}
        
        }
        
    }
}
    
   
    

