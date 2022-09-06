import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class traffic_light extends JFrame implements ActionListener{
    String m = "";   
    JRadioButton r,y,g;
    ButtonGroup b;
    Container c;    
    traffic_light(){       
        setLayout(new FlowLayout());
        c = getContentPane();        
        r = new JRadioButton("Red");
        y = new JRadioButton("Yellow");
        g = new JRadioButton("Green");
        b = new ButtonGroup();
        c.add(r);c.add(y);c.add(g);
        b.add(r);b.add(y);b.add(g);
        r.addActionListener(this);
        y.addActionListener(this);
        g.addActionListener(this);
        setSize(220,350);
        setVisible(true);
    }
    public void paint(Graphics gr){
     super.paint(gr);
     gr.setColor(Color.black);
     gr.fillRect(25,90,150,220);
     gr.setColor(Color.white);
     gr.fillOval(70,100,50,50);
     gr.fillOval(70,170,50,50);
     gr.fillOval(70,240,50,50);
    }
    public void actionPerformed(ActionEvent ie){
        m=ie.getActionCommand();
        if (m.equals("Red")){   
            Graphics gr=getGraphics();
            gr.setColor(Color.red);
            gr.fillOval(70,100,50,50);
            gr.setColor(Color.white);
            gr.fillOval(70,240,50,50);
            gr.fillOval(70,170,50,50);
        }
        else if (m.equals("Yellow")){
            Graphics gr=getGraphics();
            gr.setColor(Color.white);
            gr.fillOval(70,100,50,50);
            gr.fillOval(70,240,50,50);
            gr.setColor(Color.yellow);
            gr.fillOval(70,170,50,50);
        }
        else if (m.equals("Green")){      
            Graphics gr=getGraphics();
            gr.setColor(Color.white);
            gr.fillOval(70,100,50,50);
            gr.fillOval(70,170,50,50);
            gr.setColor(Color.green);
            gr.fillOval(70,240,50,50);
        }
    }
    public static void mian(){
        new traffic_light();
    }
}