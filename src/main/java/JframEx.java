import javax.swing.*;
import java.awt.*;

public class JframEx extends JFrame {
    private JLabel item;

    public JframEx(){
        // inherit the window, add a title to ur window
        super("this window");
        // give a defult layout
        setLayout(new FlowLayout());
        item= new JLabel("ur text on the screen");

        item.setToolTipText("what to show when hover over it");

        add(item);
    }
}
