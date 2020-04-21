import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui extends JFrame {
    private JButton b1;
    private JButton b2;

    public Gui(){
        super("the title");
        setLayout(new FlowLayout());

        b1= new JButton("reg Button");
        add(b1);
        Icon b= new ImageIcon(getClass().getResource("1.png"));
        Icon x= new ImageIcon(getClass().getResource("2.png"));

        b2= new JButton("custom",b );
        b2.setRolloverIcon(x);
        add(b2);

        Handler handler= new Handler();

        b1.addActionListener(handler);
        b2.addActionListener(handler);
    }
    private  class Handler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if(e.getSource()==b1){
                JOptionPane.showMessageDialog(null,String.format("b1 %s", e.getActionCommand()));
            }else if (e.getSource()==b2){
                JOptionPane.showMessageDialog(null,String.format("b2 %s", e.getActionCommand()));

            }
        }
    }
}
