
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class graphics extends JFrame implements ActionListener{
    JRadioButton r,o,l;
    JButton c;
    String m = "";   
    graphics(){   
        r = new JRadioButton("Rectangle");
        o = new JRadioButton("Oval");
        l = new JRadioButton("Line");
        c = new JButton("Clear");
        add(r);
        add(o);
        add(l);
        add(c);
        r.addActionListener(this);
        o.addActionListener(this);
        l.addActionListener(this);
        c.addActionListener(this);   
        setLayout(new FlowLayout());
        setSize(300,250);
        setVisible(true);      
    }
    public void paint(Graphics g){
        super.paint(g);        
        g.setColor(Color.white);
        g.fillRect(0,70,280,250);
    }
    public void actionPerformed(ActionEvent ie){
         m=ie.getActionCommand();
         if(m=="Rectangle"){
             Graphics g=getGraphics();
             g.setColor(Color.blue);
             g.fillRect(20,100,70,50);
             
             g.setColor(Color.white);
             g.fillOval(100,100,60,50);
         }
         else if(m=="Oval"){
             Graphics g=getGraphics();
             g.setColor(Color.red);
             g.fillOval(100,100,60,50);
         
             g.setColor(Color.white);
             g.fillRect(20,100,70,50);
         }
         else if(m=="Line"){
             Graphics g=getGraphics();
             g.setColor(Color.black);
             g.drawLine(220,125,180,125);
             
             g.setColor(Color.white);
             g.fillOval(100,100,60,50);      
             g.setColor(Color.white);
             g.fillRect(20,100,70,50);
         }
         else if(m=="Clear"){
            Graphics g=getGraphics();
            g.setColor(Color.white);
            g.fillRect(0,70,280,250);
         }
    }
    public static void main(String args[]){
        new graphics();
    }
}
