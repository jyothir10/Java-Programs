import javax.swing.*;
import java.awt.*;
class alphabets {
    JButton a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z;
    alphabets(){
        JFrame jf = new JFrame("Alphabets");
        a = new JButton("A");
        b = new JButton("B");
        c = new JButton("C");
        d = new JButton("D");
        e = new JButton("E");
        f = new JButton("F");
        g = new JButton("G");
        h = new JButton("H");
        i = new JButton("I");
        j = new JButton("J");
        k = new JButton("K");
        l = new JButton("L");
        m = new JButton("M");
        n = new JButton("N");
        o = new JButton("O");
        p = new JButton("P");
        q = new JButton("Q");
        r = new JButton("R");
        s = new JButton("S");
        t = new JButton("T");
        u = new JButton("U");
        v = new JButton("V");
        w = new JButton("W");
        x = new JButton("X");
        y = new JButton("Y");
        z = new JButton("Z");
        jf.add(a);jf.add(b);jf.add(c);jf.add(d);jf.add(e);jf.add(f);jf.add(g);jf.add(h);jf.add(i);jf.add(j);jf.add(k);jf.add(l);
        jf.add(m);jf.add(n);jf.add(o);jf.add(p);jf.add(q);jf.add(r);jf.add(s);jf.add(t);jf.add(u);jf.add(v);jf.add(w);jf.add(x);
        jf.add(y);jf.add(z);
        jf.setLayout(new GridLayout(4,7));
        jf.setSize(500,350);
        jf.setVisible(true);
    }
    public static void main(){
        new alphabets();
    }
}