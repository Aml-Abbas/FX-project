import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Layout extends JFrame {
    private JButton b1;
    private JButton b2;
    private JButton b3;
    private FlowLayout layout;
    private Container container;

    public Layout() {
        // all in the below creating a window
        super("title");
        layout = new FlowLayout();
        container = getContentPane();
        setLayout(layout);

        //here adding stuff to the window
        b1 = new JButton("left");
        add(b1);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                layout.setAlignment(FlowLayout.LEFT);
                //rearange all of this to the new info above
                layout.layoutContainer(container);
            }
        });
        b2 = new JButton("Center");
        add(b2);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                layout.setAlignment(FlowLayout.CENTER);
                //rearange all of this to the new info above
                layout.layoutContainer(container);
            }
        });
        b3 = new JButton("Right");
        add(b3);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                layout.setAlignment(FlowLayout.RIGHT);
                //rearange all of this to the new info above
                layout.layoutContainer(container);
            }
        });
    }
}
