import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.PortUnreachableException;

public class Peach2 extends JFrame {
    private Panel panel;
    private JButton b;
    private Color color= Color.WHITE;

    public Peach2(){
        super("the title");
        panel= new Panel();
        panel.setBackground(color);

        b= new JButton("choose a color");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //1 position, 2 title of te color choosser
                //3 the initial color that selected
                color= JColorChooser.showDialog(null,"pich ur color",color);
                if (color==null){
                    color=(Color.WHITE);
                }
                panel.setBackground(color);
            }
        });
        add(panel,BorderLayout.CENTER);
        add(b, BorderLayout.SOUTH);
        setSize(500,500);
        setVisible(true);
    }
}
