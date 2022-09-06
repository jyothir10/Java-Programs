import javax.swing.*;
import java.awt.event.*;
public class calculator implements ActionListener{
    double a,b,result;
    int o;
    JTextField tf;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,ba,bs,bd,bm,beq,bdec,bclr;
    calculator(){
        JFrame j = new JFrame("Calculator");
        tf = new JTextField();      //textfield
        tf.setBounds(70,20,100,22); 
        
        ba = new JButton("+");      //buttons
        ba.setBounds(20,60,40,30);
        bs = new JButton("-");
        bs.setBounds(20,100,40,30);
        bm = new JButton("*");
        bm.setBounds(20,140,40,30);
        bd = new JButton("/");
        bd.setBounds(20,180,40,30);       
        b1 = new JButton("1");
        b1.setBounds(70,60,40,30);
        b2 = new JButton("2");
        b2.setBounds(120,60,40,30);
        b3 = new JButton("3");
        b3.setBounds(170,60,40,30);        
        b4 = new JButton("4");
        b4.setBounds(70,100,40,30);
        b5 = new JButton("5");
        b5.setBounds(120,100,40,30);
        b6 = new JButton("6");
        b6.setBounds(170,100,40,30);        
        b7 = new JButton("7");
        b7.setBounds(70,140,40,30);
        b8 = new JButton("8");
        b8.setBounds(120,140,40,30);
        b9 = new JButton("9");
        b9.setBounds(170,140,40,30);              
        b0 = new JButton("0");
        b0.setBounds(120,180,40,30);
        bdec = new JButton(".");
        bdec.setBounds(70,180,40,30);
        bclr = new JButton("C");
        bclr.setBounds(170,180,40,30);
        beq = new JButton("=");
        beq.setBounds(92,230,40,30);
               
        b1.addActionListener(this);     //listeners
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        ba.addActionListener(this);
        bs.addActionListener(this);
        bm.addActionListener(this);
        bd.addActionListener(this);
        bclr.addActionListener(this);
        bdec.addActionListener(this);
        beq.addActionListener(this);
        
        j.add(tf);j.add(ba);j.add(bs);j.add(bm);j.add(bd);j.add(b1);j.add(b2);j.add(b3);j.add(b4);
        j.add(b5);j.add(b6);j.add(b7);j.add(b8);j.add(b9);j.add(b0);j.add(bdec);j.add(bclr);j.add(beq);
        j.setSize(250,310);
        j.setLayout(null);
        j.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1)
            tf.setText(tf.getText().concat("1"));
        if(e.getSource()==b2)
            tf.setText(tf.getText().concat("2"));
        if(e.getSource()==b3)
            tf.setText(tf.getText().concat("3"));
        if(e.getSource()==b4)
            tf.setText(tf.getText().concat("4"));
        if(e.getSource()==b5)
            tf.setText(tf.getText().concat("5"));
        if(e.getSource()==b6)
            tf.setText(tf.getText().concat("6"));
        if(e.getSource()==b7)
            tf.setText(tf.getText().concat("7"));
        if(e.getSource()==b8)
            tf.setText(tf.getText().concat("8"));
        if(e.getSource()==b9)
            tf.setText(tf.getText().concat("9"));
        if(e.getSource()==b0)
            tf.setText(tf.getText().concat("0"));
        if(e.getSource()==bdec)
            tf.setText(tf.getText().concat("."));
        if(e.getSource()==ba){
            a = Double.parseDouble(tf.getText());
            o = 1;
            tf.setText("");
        }
        if(e.getSource()==bs){
            a = Double.parseDouble(tf.getText());
            o = 2;
            tf.setText("");
        }
        if(e.getSource()==bm){
            a = Double.parseDouble(tf.getText());
            o = 3;
            tf.setText("");
        }
        if(e.getSource()==bd){
            a = Double.parseDouble(tf.getText());
            o = 4;
            tf.setText("");
        }
        if(e.getSource()==beq){
            b = Double.parseDouble(tf.getText());
            switch(o){
                case 1: result = a+b;
                        break;
                case 2: result = a-b;
                        break;
                case 3: result = a*b;
                        break;
                case 4: try{result = a/b;
                        break;
                    }catch(ArithmeticException ex){
                        System.out.println(ex);
                    }
                default: result = 0;;
            }
            tf.setText(""+result);
        }
        if(e.getSource()==bclr){
            tf.setText("");
        }
    }
    public static void main(){
        new calculator();
    }
}