import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Gui2 extends JFrame {

    private JTextField tf;
    private Font font1;
    private Font font2;
    private Font font3;
    private Font font4;
    private JRadioButton b1;
    private JRadioButton b2;
    private JRadioButton b3;
    private JRadioButton b4;
    private ButtonGroup group;

    public Gui2(){

        super("my Window Title");
        setLayout(new FlowLayout());
        tf= new JTextField("I am beautiful", 20);
        add(tf);
        b1= new JRadioButton("plain",true);
        b2= new JRadioButton("bold",false);
        b3= new JRadioButton("italic",false);
        b4= new JRadioButton("bold and italic",false);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        group= new ButtonGroup();
        group.add(b1);
        group.add(b2);
        group.add(b3);
        group.add(b4);
        font1= new Font("Serif",Font.PLAIN,14);
        font2= new Font("Serif",Font.BOLD,14);
        font3= new Font("Serif",Font.ITALIC,14);
        font4= new Font("Serif",Font.BOLD+Font.ITALIC,14);
        tf.setFont(font1);

        b1.addItemListener(new HandlerClass(font1));
        b2.addItemListener(new HandlerClass(font2));
        b3.addItemListener(new HandlerClass(font3));
        b4.addItemListener(new HandlerClass(font4));
    }

    private class HandlerClass implements ItemListener {

        private Font f;

        public HandlerClass(Font f){
            this.f=f;
        }
        @Override
        public void itemStateChanged(ItemEvent e) {
            tf.setFont(f);
        }
    }
}
